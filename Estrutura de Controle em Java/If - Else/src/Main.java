import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var nome = sc.nextLine();
        System.out.println("Digite o sua idade: ");
        var age = sc.nextInt();
        System.out.println("Informe se você é emancipado: (s/n)");
        var isEmancipado = sc.next().equalsIgnoreCase("s");

        var result = (age>=18 || (age>=16 && isEmancipado));
        var message="";
        if (result) {
            message = nome + " you can drive!\n";
        }else{
            message = nome + " you can't drive!\n";
        }
        System.out.println(message);
        System.out.println("End to Program");

        /*
        other form the if / else using elves operator

        var message = result? result == true, execute the first line, If not the second
            nome + " you can drive!\n" :
            nome + " you can't drive!\n";

        operator very most simple for verify the expression boolean, if is true or false;
         */

    }
}