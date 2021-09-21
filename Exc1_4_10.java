import java.util.Scanner;

public class Exc1_4_10{

  public static void main(String[] args){

      int[] list    = {1,2,3,4,5,6,7,8,9,10};//new int[n];
      int findValue = 6;

      System.out.println("SVARET ER :" + getSmallestIndexBinarySearch(list, findValue));

  }


  public static int getSmallestIndexBinarySearch(int[] list, int valueTofind){

    int low         = 0;
    int high        = list.length;

    int guessIndex  = (high - low)/2;

    while(high > low){
      if(list[guessIndex] == valueTofind){ //afprøv
        return guessIndex;
      }
      if(list[guessIndex] < valueTofind){
        low = guessIndex;
      }
      if(list[guessIndex] > valueTofind){
        high = guessIndex;
      }
    }

    return -1;

  }

}
