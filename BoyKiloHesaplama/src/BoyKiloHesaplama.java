import java.util.Scanner;

public class BoyKiloHesaplama {
    public static void main(String[] args) {
        double boy,bmi,kilo;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Girin: ");
        boy=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Girin: ");
        kilo=input.nextDouble();
        bmi=kilo/(boy*boy);
        System.out.print("Beden Kitle İndeksiniz: "+bmi);
    }
}
