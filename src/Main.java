import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int kilo;
        double boy,vki;
        System.out.print("kilonuzu giriniz=");
        kilo=input.nextInt();
        System.out.print("boyunuzu m olarak giriniz=");
        boy=input.nextDouble();
        vki=kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz="+vki);
    }
}