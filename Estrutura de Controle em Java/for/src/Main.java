import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        for (;;){// repeat infinity times
            System.out.println("Digite o seu nome: ");
            var nome = sc.next();
            if(nome.equalsIgnoreCase("exit")){break;};
            System.out.println(nome);
        }
        for (var i=1;i<=100;i++){
            if(i%2==0)continue;// quando for numero par no caso da condição ele
            //vai ignorar e vai diretamente para o for dnv,quando for impar que n entra
            //na condição, ele vai printar na tela!
            System.out.println(i);
        }
        for (var arg: args){
            System.out.println(arg);
        }
        for (var i=1;i<= args.length;i++){
            System.out.println(i+" - "+args[i]);
        }
    }
}

