import java.util.Scanner;

public class Exc1_4_10{


    public static int bsearch(int[] a, int key) {
      int lo = 0, hi = a.length - 1;
      while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
          hi = mid - 1;
        } else if (key > a[mid]) {
          lo = mid + 1;
        } else if (mid == 0 || a[mid - 1] != key) {
          //a[mid -1] != key ...
          //tjekker at den til venstre ikke er "key"
          //Altså det "mindste index"
          //hvis den er kører vi en ny "binær søgning
          //----
          //mid == 0
          //Sikrer at vi ikke kan komme længere til venstre
          return mid;
        } else {
          hi = mid - 1;
        }
      }
      return -1;
    }

    public static void main(String[] args) {
      int[] a = {1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4};
      System.out.printf("index :%d\n", bsearch(a, 1)); // 0
      System.out.printf("index :%d\n", bsearch(a, 2)); // 4
    }
}
