import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pogodi zamisljeni broj");
        System.out.println("----------------------");
        var random = new Random();
        var scanner = new Scanner(System.in);

        int pokusajKorisnika = 0;
        int zamisljeniBroj = random.nextInt(9) + 1;
        int brojac = 1;

        while (zamisljeniBroj != pokusajKorisnika) {
            System.out.println("Unesite vas pokusaj: ");
            pokusajKorisnika = scanner.nextInt();
            if (zamisljeniBroj < pokusajKorisnika) {
                System.out.println("Zamisljen broj je manji");
                brojac++;
            } else if (zamisljeniBroj > pokusajKorisnika) {
                System.out.println("Zamisljen broj je veci");
                brojac++;
            } else {
                System.out.print("Bravo mile pogodio si! Trazeni broj je " + zamisljeniBroj);
                System.out.println(". Pogodio si iz " + brojac + " puta");
            }
        }
    }
}