import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Znaky znak = new Znaky();

        znak.pozdrav();

        System.out.println(znak.vypisSlovo());

        znak.vypisCislo(13);

        znak.nasobCislo5();

        znak.zjistiZdaJePrvocislo();

        znak.ZjistiJakyJeMaxAJakyJeMin();

        znak.vypisJmeno();

        znak.vypisCislaVIntervalu();




    }
}