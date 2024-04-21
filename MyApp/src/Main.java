import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // variables
        String name = "";
        String email = "";
        String whatsapp = "";

        // questions
        String[] questions = {
                "Qual seu nome?",
                "Qual seu email?",
                "Qual seu whatsapp?"
        };

        // play
        System.out.print(questions[0]);
        Scanner scanner1 = new Scanner(System.in);
        name = scanner1.nextLine();

        System.out.print(questions[1]);
        Scanner scanner2 = new Scanner(System.in);
        email = scanner2.nextLine();

        System.out.print(questions[2]);
        Scanner scanner3 = new Scanner(System.in);
        whatsapp = scanner3.nextLine();

        System.out.println(
                "Seu nome é: " + name
                + "\nSeu email é: " + email
                + "\nSeu Whatsapp é: " + whatsapp
        );






    }
}