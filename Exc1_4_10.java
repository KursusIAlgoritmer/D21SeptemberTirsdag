public class Exc1_4_10{

  public static void main(){

      Scanner s     = new Scanner(System.in);

      int n         = s.nenextInt();
      int[] list    = new int[n];

      for(int i=0; i < list.length ; i ++){
        list[i] = s.nextInt();
      }

  }


  public static int getSmallestIndexBinarySearch(int[] list, int valueTofind){

    int low = 0;
    int high = list.length;

    int guessIndex = (high - low)/2;

    while(high > low){
      if(list[guessIndex] == valueTofind){
          getSmallestIndexBinarySearch(, valueTofind)
      }

    }

  }

}
