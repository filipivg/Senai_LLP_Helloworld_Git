import java.util.Scanner;

public class HelloWorldInteracao {
    public static void main(String [] args){

        System.out.print("Infrome seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Hello World " + nome);
    }
}
