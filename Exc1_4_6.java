import java.util.Scanner;

public class Exc1_4_6{

  public static void main(String[] args){

    Scanner s = new Scanner(System.in);

    int n = s.nextInt();

    //opgave A
    int sum = 0;

    for(int k = n ; k > 0 ; k /=2 ){   //1. denne linje kører 1 gang

      for(int i = 0 ; i < k ; i ++ ){  //2. denne linje kører "ln(n) + 1" gange, k halveres i forrige loop
                                       //k=32 16 8 4 2 1

        sum++;                        //3. kører ... 32 + 16 + 8 + 4 + 2 + 1 = (2^antal - 1)
      }
    }

    System.out.println("OPGAVE A");

    System.out.println("Sum:  " + sum);

    int ydreLoopCount   = (int)Math.floor(  1.0+ Math.log(n)/Math.log(2)  );
    int indreLoopCount  = (int)(Math.pow(2, ydreLoopCount) - 1);
  //  System.out.println("Model ydre loop: " + ydreLoopCount);
    System.out.println("Model indre loop:" + indreLoopCount);

    //opgave B

    sum = 0;

    for(int i = 1 ; i < n ; i *=2 ){   //1. denne linje kører 1 gang

      for(int j = 0 ; j < i ; j ++ ){  //2. denne linje kører "ln(n) + 1" gange, k halveres i forrige loop
                                       //k=32 16 8 4 2 1

        sum++;                        //3. kører (hvis N=32) ... 16 + 8 + 4 + 2 + 1 = (2^(antal-1) - 1)
      }
    }

    System.out.println("OPGAVE B");

    System.out.println("Sum:  " + sum);

    ydreLoopCount   = (int)Math.floor(  1.0+ Math.log(n)/Math.log(2)  );
    indreLoopCount  = (int)(Math.pow(2, (ydreLoopCount-1)) - 1);
  //  System.out.println("Model ydre loop: " + ydreLoopCount);
    System.out.println("Model indre loop:" + indreLoopCount);

  //Opgave C


      sum = 0;

      for(int i = 1 ; i < n ; i *=2 ){   //1. denne linje kører 1 gang

        for(int j = 0 ; j < n ; j ++ ){  //2. denne linje kører "ln(n) + 1" gange, k halveres i forrige loop
                                         //k=32 16 8 4 2 1

          sum++;                        //3. kører (hvis N=32) ... 32 + 32 +  32 + 32 ... (antal gange)
        }
      }

      System.out.println("OPGAVE C");

      System.out.println("Sum:  " + sum);

      ydreLoopCount   = (int)Math.floor(  1.0+ Math.log(n)/Math.log(2)  );
      indreLoopCount  = n*ydreLoopCount;
    //  System.out.println("Model ydre loop: " + ydreLoopCount);
      System.out.println("Model indre loop:" + indreLoopCount);





  }

}
