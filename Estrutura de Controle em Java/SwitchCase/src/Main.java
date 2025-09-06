import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 - 7: ");
        int num = sc.nextInt();
        var message = switch (num){
            case 1, 7 -> {
                var day  = num == 1? "domingo" : "sabádo";
                yield String.format("Hoje é %s fim de semana uhuhu",day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Erro!";
        };
        System.out.println(message);
    }
}