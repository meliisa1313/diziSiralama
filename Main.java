import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
// Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

        Scanner input=new Scanner(System.in);
        System.out.println("dizinin boyutunu girin ");
        int boyut=input.nextInt();
        int [] dizi=new int [boyut];
        for(int i=0;i<boyut;i++){
            System.out.println("dizinin elemanlarini giriniz");" "
            int eleman= input.nextInt();
            System.out.println(i+".elaman:"+eleman);
            dizi[i]=eleman;
        }
        Arrays.sort(dizi);
        System.out.println("dizinin siralanmasi:+Arrays.toString(dizi));


    }
}


