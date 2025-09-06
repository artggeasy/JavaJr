import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        var verify = true;
        while (verify) {
            System.out.println("Digite outro numero: ");
            var numero2 = sc.nextInt();
            if (numero2<numero) {
                System.out.println("Digite outro numero maior! ");
                continue;}
            verify = numero2%numero==0;
        }
    }
}