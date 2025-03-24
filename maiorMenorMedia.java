import java.util.Scanner;

public class maiorMenorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1,num2,num3,maior,menor,media;

        System.out.println("Digite um numero:");
        num1 = scanner.nextInt();
 
        System.out.println("Digite um numero:");
        num2= scanner.nextInt();

        System.out.println("Digite um numero:");
        num3= scanner.nextInt();


        maior = num1;

        if (num2 > maior) {
            maior = num2;
        System.out.println("O maior numero é: " + num2);
        }
         if (num3 > maior) {
            maior = num3;
            System.out.println("O maior numero é: " + num3);
        }

        menor = num1;
        
        if (num2 < menor) {
        menor = num2;
        System.out.println("O menor numero é: " + num2);
        }

         if (num3 < menor) {
            menor = num3;
            System.out.println("O menor numero é: " + num3);
        }

       
      
        media =( (num1 + num2 + num3) / 3); 
        System.out.println("A média é: " + media);
    
    }
}
