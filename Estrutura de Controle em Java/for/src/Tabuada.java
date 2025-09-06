import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        for(int j=0;j<=10;j++){
            var soma  = numero + j;
            System.out.printf("\n%d + %d = %d",numero,j,soma);
        }
    }
}
