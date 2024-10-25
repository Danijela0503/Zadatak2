import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Korisnik je uneo broj: ");
        int broj1 = scanner.nextInt();

        int broj2 = 2;
        int modulo = broj1%broj2;
        boolean y = modulo == 0;

        System.out.println("Korisnik je uneo paran broj: ");
        System.out.println(y);

    }
}