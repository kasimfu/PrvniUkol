import java.util.Scanner;

public class Znaky {

    Scanner sc = new Scanner(System.in);

    public void pozdrav() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " Ahoj svete");
        }
    }

    public String vypisSlovo() {
        String slovo = sc.nextLine();
        return slovo;
    }

    public void vypisCislo(int cislo) {

        if (cislo < 0) {
            System.out.println("Bylo zadano zaporne cislo");
        }
        else if (cislo > 12) {
            System.out.println("Cislo je moc velke");
        }
        else if (cislo == 0) {
            System.out.println("0");
        }
        else if (cislo ==1) {
            System.out.println("jedna");
        }
        else if (cislo ==2) {
            System.out.println("dva");
        }
        else if (cislo ==3) {
            System.out.println("tri");
        }
        else if (cislo == 4) {
            System.out.println("ctyri");
        }
        else if (cislo == 5) {
            System.out.println("pet");
        }
        else if (cislo == 6) {
            System.out.println("sest");
        }
        else if (cislo == 7) {
            System.out.println("sedm");
        }
        else if (cislo == 8) {
            System.out.println("osm");
        }
        else if (cislo == 9) {
            System.out.println("devet");
        }
        else if (cislo == 10) {
            System.out.println("deset");
        }
        else if (cislo == 11) {
            System.out.println("jedenact");
        }
        else if (cislo == 12) {
            System.out.println("dvanact");
        }

    }

    public void nasobCislo5(){
        for (int i=1;i<=20;i++){
            System.out.println(5*i);
        }
    }

    public void zjistiZdaJePrvocislo(){
        int cislo= sc.nextInt();
        int pocetDeleitelu=0;
        for (int i=1;i<=cislo;i++){
            if (cislo%i==0){
                pocetDeleitelu++;
            }
        }
        if (pocetDeleitelu==2){
            System.out.println("Je to prvočíslo");
        }
        else {
            System.out.println("není prvočíslo");
        }

    }

    public void ZjistiJakyJeMaxAJakyJeMin(){
        int cislo1= sc.nextInt();
        int cislo2= sc.nextInt();
        int cislo3= sc.nextInt();
        sc.nextLine();


        System.out.println("Min:");
        System.out.println(Math.min(cislo1,Math.min(cislo2,cislo3)));
        System.out.println("Max:");
        System.out.println(Math.max(cislo1,Math.max(cislo2,cislo3)));
        int max =Math.max(cislo1,Math.max(cislo2,cislo3));
        int min=Math.min(cislo1,Math.min(cislo2,cislo3));
        System.out.println("Zbytek dělení min a max je: "+max%min);

    }

    public void vypisJmeno(){
        System.out.println("Jaké je tvoje krestni jmeno");
        String krestniJmeno= sc.nextLine();
        System.out.println("Jake je tvoje primeni");
        String prijmeni = sc.nextLine();

        System.out.println("Tve jmeno je "+krestniJmeno+" "+prijmeni);
    }

    public void vypisCislaVIntervalu(){
        int N=sc.nextInt();
        sc.nextLine();
        while(N<0){
            System.out.println("Zadej kladne cislo");
            N = sc.nextInt();
            sc.nextLine();
        }
        for (int i=0;i<=N;N--){
            System.out.println(N);
        }
    }




}
