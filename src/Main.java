import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        //if else dongu kullanilmadan yapilmasi istenmektedir.

        double mesafe, km = 2.20, tutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafe bilgisi giriniz = ");

        mesafe = inp.nextDouble();

        tutar = mesafe * km;

        boolean control = tutar<20;

        String str = control ? "Taksimetre tutari = 20" : "Taksimetre tutari = "+tutar;

        System.out.println(str);


    }

}
