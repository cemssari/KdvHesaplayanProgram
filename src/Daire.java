import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r ;
        double pi =3.14, a, daireDilimi;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez Açısının Ölçüsünü Giriniz : ");
        a = input.nextDouble();

        daireDilimi = (pi*(r*r)*a)/360;
        System.out.print("Daire Dilimi Alanı :" + daireDilimi );





    }
}
