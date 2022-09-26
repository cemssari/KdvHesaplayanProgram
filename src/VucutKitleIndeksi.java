import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        bodyMassIndex = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : " + bodyMassIndex);





    }

}
