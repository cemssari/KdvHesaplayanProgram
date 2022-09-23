import java.util.Scanner;

public class kdvtütarihesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvOran=0.18, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        boolean kdvliTutar1=(0<tutar)&&(1000>tutar);
        kdvOran=kdvliTutar1?0.18:0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv Orani:"+kdvOran);
        System.out.println("Kdv'si:"+kdvTutar);
        System.out.println("Kdv'li Tutar:"+kdvliTutar);






    }
}
