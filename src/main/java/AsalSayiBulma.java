import java.util.Scanner;

public class AsalSayiBulma {

    //Sayının asal sayı olup olmadığını kontrol eder
    public static boolean AsalSayi(int sayi,int bolen) {
        if (sayi < 2){
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0){
            return false;
        }
        return AsalSayi(sayi, bolen - 1);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan sayı alma
        System.out.print("Sayı giriniz : ");
        int sayi = scanner.nextInt();

        if (AsalSayi(sayi, sayi / 2)) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }

        scanner.close();
    }
}
