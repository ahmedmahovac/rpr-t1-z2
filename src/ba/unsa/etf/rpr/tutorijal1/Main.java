package ba.unsa.etf.rpr.tutorijal1;
import java.util.Scanner;

public class Main {

  public static int sumaCifara(int x) {
      int suma = 0;
      while(x!=0) {
          suma += x%10;
          x/=10;
      }
      return suma;
  }



    public static void main(String[] args) {
     //  System.out.println(sumaCifara(23));
      Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = 0;
      n =  ulaz.nextInt();

         for(int i=1; i<n; i++) {
            if(i % sumaCifara(i) == 0)
                System.out.println(i + " ");
        }




    }

}
