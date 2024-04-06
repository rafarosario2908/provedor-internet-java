import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {

        //entrada
        //processamento
        //saida
        
        Scanner scanner = new Scanner(System.in);

        //texto
        System.out.print("informe seu nome: ");
        String nome = scanner.next();

        //caracter
        System.out.print("escolha uma cor: (azul, verde, amarelo ) ");
        char cor = scanner.next().charAt(0);
        
        // numeros
        System.out.print("informe sua idade: ");
        int idade = scanner.nextInt();

         // numeros quebrados
         System.out.print("informe sua altura: ");
         double altura = scanner.nextDouble();

         //processamento

         nome = nome.toUpperCase();

         //saida
         System.out.println(nome);
         System.out.println(idade);
         System.out.println(altura);
         System.out.println(cor);
         
         scanner.close();




    }
    
}
