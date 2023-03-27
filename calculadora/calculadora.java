package calculadora;
import java.util.Scanner;
public class calculadora {
   public static void main(String[] args) {
    float num;
    Scanner valor = new Scanner(System.in);
    System.out.println("digite um numero");
    while (!valor.hasNextFloat()){
        System.out.println("caracter invalido digite outro numero");
        valor.next();
    }
    num = valor.nextFloat();
    System.out.println("O numero digitado é "+num);
    valor.close();
   } 
}
