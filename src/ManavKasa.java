import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00,  toplam,
                a, e, d, m, p;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        a = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        e = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        d = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        m = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        p = input.nextDouble();


        toplam= (armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);

        System.out.println("Toplam Tutar : " + toplam +  " TL ");


    }
}
