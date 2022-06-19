import java.util.Scanner;
public class VucutIndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz : ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vucut Kitle İndeksiniz : " + indeks);

        if (indeks < 25){
            System.out.println("Zayifsiniz");
        }else if (indeks < 45){
            System.out.println("Hafif tombiksiniz");
        }else{
            System.out.println("Şekeri yagi kesin");
        }

    }
}
