import java.util.Scanner;
import java.util.Locale;
   
class hitungLuasLingkaran {
  public static void main(String args[]){
            
    try (Scanner input = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("##  Program Java Menghitung Luas Lingkaran  ##");
        System.out.println("==============================================");
        System.out.println();
          
        double r, luas;
  
        System.out.print("Input jari-jari lingkaran: ");
        r = input.nextDouble();
   
        luas = 3.14 * r * r;
    }
       
    System.out.println("Luas lingkaran: "+luas);
  
  }
}