public class Exc1_4_12{

  public static void main(String[] args){

      int[] list1    = {1,2,3,4,5,6,7,8,9,10};//new int[n];
      int[] list2    = {1,2,3,4,5,6,7,8,9,10};

      for(int i: list1){
        if(i == binarySearch(list, i)){
          System.out.println(i);
        }
      }

      //1. Opret i1 = 0 og i2 = 0
      //2. Sammenlign list1[I1] > list2[i2]
      //  3. Hvis ja : udskriv list[i1] og i1++, hvis i1 < n
      //  4. Hvis nej : udskriv list[i2] og i2++, hvis i2 < n
      //5. Hvis i1 < n eller i2 < n gentag fra 2...

      //Tid 2*n ??

  }

  public static int binarySearch(int[] list, int valueTofind){

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
