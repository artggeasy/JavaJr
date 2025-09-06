import java.util.Scanner;
/*
PROGRAM CALCULATE OLD SIMPLE
 */
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome = sc.nextLine();
        System.out.println("Digite sua data de Nascimento : ");
        System.out.printf("\nDia: ");
        var dia = sc.nextInt();
        System.out.printf("Mês: ");
        var mes = sc.nextInt();
        System.out.printf("Ano: ");
        var ano = sc.nextInt();

        var anos = (739397-(dia + (mes*30) + (ano*365)))/365;
        System.out.println("Olá "+nome+" você tem "+anos+" anos");
    }
}