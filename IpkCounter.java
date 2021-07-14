import java.util.*;
// import java.util.Scanner;

public class IpkCounter {
    public static void main(String args[]) {
     Scanner input_text = new Scanner(System.in);
     double ipk=0.0;
     
     double jml_sks = 0;
     double mutu = 0;
     int nilai_angka = 0;
     
     
     
     System.out.print("Banyak mata kuliah: ");
     int mata_kuliah = input_text.nextInt();
     
     String[][] tableResult = new String[mata_kuliah][6];
     
    //  mata kuliah
    // a=4;b=3;c=2;d=1;e=0
     
     for (int i = 0; i < mata_kuliah; i++) {
         
         System.out.print("Mata kuliah: ");
         String nama_mata_kuliah = input_text.next();
         
         System.out.print("Jumlah SKS: ");
         int sks = input_text.nextInt();
         
         System.out.print("Nilai Mata Kuliah: ");
         String nilai_huruf = input_text.next();
         
         nilai_angka = ((nilai_huruf.equals("a")) ? 4 : (nilai_huruf.equals("b")) ? 3 : (nilai_huruf.equals("c")) ? 2 : (nilai_huruf.equals("d")) ? 1 : 0);
         
        //  if (nilai_huruf.equals("a")) {
        //      nilai_angka = 4;
        //  } 
        //  else if (new String(nilai_huruf).equals('b')) {
        //      nilai_angka = 3;
        //  } else if (new String(nilai_huruf).equals('c')) {
        //      nilai_angka = 2;
        //  } else if (new String(nilai_huruf).equals('d')) {
        //      nilai_angka = 1;
        //  } else {
        //      nilai_angka = 0;
        //  }
         
         jml_sks = jml_sks+sks;
         mutu = mutu + (sks * nilai_angka);
         
         tableResult[i][0] = String.valueOf(i);
         tableResult[i][1] = nama_mata_kuliah;
         tableResult[i][2] = String.valueOf(sks);
         tableResult[i][3] = nilai_huruf;
         tableResult[i][4] = String.valueOf(nilai_angka);
         tableResult[i][5] = String.valueOf(sks * nilai_angka);
     }
     ipk = mutu / jml_sks;
     System.out.println("-----------------------------------------------------------------");
     System.out.printf("%-3s%-20s%-8s%-15s%-10s%-7s\n","No","Makul","SKS","a/b/c/d/e","Nilai","Mutu");
     System.out.println("-----------------------------------------------------------------");
     
     for (int a=0; a < tableResult.length; a++) {
         
            //  System.out.println(j);
            System.out.printf("%-3s", tableResult[a][0]);
            System.out.printf("%-20s", tableResult[a][1]);
            System.out.printf("%-8s", tableResult[a][2]);
            System.out.printf("%-15s", tableResult[a][3]);
            System.out.printf("%-10s", tableResult[a][4]);
            System.out.printf("%-7s\n", tableResult[a][5]);
         
     }
      System.out.println("-----------------------------------------------------------------");
      System.out.printf("%-23s%-33s%-3s\n","Jumlah", String.valueOf(jml_sks), String.valueOf(mutu));
      System.out.println("-----------------------------------------------------------------");
      System.out.println("IP = "+ String.format("%.2f", ipk));
    }
}