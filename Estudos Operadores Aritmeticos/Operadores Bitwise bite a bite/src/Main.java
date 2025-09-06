import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.printf("\nDigite um numero: ");
        var n1 = sc.nextInt();
        System.out.printf("\nDigite um numero: ");
        var n2 = sc.nextInt();
        var bin1 = Integer.toBinaryString(n1);
        var bin2 = Integer.toBinaryString(n2);
        var result = n1 | n2; //  n1 ou n2
        //sempre colocar em operador logico inteiro, não o binário!
        //seria tipo n1 = 2, n2 = 3
        //comparação: 10
        //            11
        //           =11
        System.out.println(n1+" | "+n2+" = "+result);
        System.out.println(n1+" = "+bin1);
        System.out.println(n2+" = "+bin2);
        System.out.println("  = "+Integer.toBinaryString(result));
    }
}