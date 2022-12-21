import java.util.Scanner;

public class tamBolunenOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, ortalama = 0, adet = 0, sayi = 0;
        System.out.print("Bir sayı giriniz : ");
        k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            if (i % 12 == 0) {

                if (i == 0) {
                    continue;
                }
                System.out.println(i);
                adet += i;
                sayi++;
            }
        }
        ortalama = adet / sayi;
        System.out.println("Sayıların ortalaması : " + ortalama);

    }
}
