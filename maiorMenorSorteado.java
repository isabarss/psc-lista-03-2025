import java.util.Random;
import java.util.Scanner;

public class maiorMenor {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    int num1,num2,maior,menor,sorteio;

    System.out.println("Digite um numero:");
    num1 = scanner.nextInt();
    System.out.println("Digite um numero: ");
    num2 = scanner.nextInt();
     
    if (num1 > num2) {
        maior = num1;
        menor = num2;
    }
    else {
        maior = num2;
        menor = num1;
    }

    sorteio = random.nextInt(maior - menor + 1) + menor;
    System.out.println("O numero sorteado foi: " + (sorteio));

    if (sorteio % 2 == 0 ) {
        System.out.println("O numero sorteado é PAR.");
    }
    else {
        System.out.println("O numero sorteado é ímpar.");
    }

    scanner.close();
}
}
