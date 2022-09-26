import java.util.Scanner;

public class DikUcgendeHipotenusBulaProgram {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("A Kenarını Giriniz : ");
        a= input.nextInt();
        System.out.print("B Kenarını Giriniz : ");
        b=input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : "+ c);


    }
}
