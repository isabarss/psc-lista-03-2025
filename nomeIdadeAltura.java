import java.util.Scanner;

public class nomeIdadeAltura {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        double altura;
        String nome;

       System.out.println("Qual seu nome? ");
       nome = scanner.nextLine();
    
       System.out.println("Qual sua idade? ");
       idade = scanner.nextInt();
        
       System.out.print("Qual sua altura? ");
       altura = Double.parseDouble(scanner.next().replace(",", "."));

       System.out.println("Seu nome é " + nome + " sua idade è " + idade + " e sua altura é " + altura + ".");

       scanner.close(); 

    }
}
