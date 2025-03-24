import java.util.Scanner;
public class operadores {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1,num2,resultado;
        char operador;
      
        System.out.println("Digite o primeiro numero: ");
        num1 = Double.parseDouble(scanner.next().replace(",", "."));
      
        System.out.println("Digite o caracter: ");
        operador = scanner.next().charAt(0);
      
        System.out.println("Digite o segundo numero: ");
         num2 = Double.parseDouble(scanner.next().replace(",", "."));

        if (operador =='+') {
            resultado = num1 + num2;
            System.out.println("O resultado da operação é: " + resultado);
        }
        else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("O resultado da operação é: " + resultado);
        }
        else if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("O resultado da operação é: " + resultado);
        }
        else if (operador == '/') {
            resultado = num1 /num2;
            System.out.println("O resultado da operação é: " + resultado);
        }
        else if (operador == '^') {
            resultado = Math.pow(num1, num2);
            System.out.println("O resultado da operação é: " + resultado);
        }
        else {
            System.out.println("Operador Inválido. ");
        }

     
        scanner.close();

}
}
