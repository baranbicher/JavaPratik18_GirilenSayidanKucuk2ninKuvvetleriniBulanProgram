import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 1;
        System.out.print("Sınır Sayısını Girin: ");
        n = input.nextInt();
        System.out.println("4'ün Kuvvetleri");

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        System.out.println("5'in Kuvvetleri");

        for (int j = 1; j<=n;j*=5){
            System.out.println(j);
        }

    }
}