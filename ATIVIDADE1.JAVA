import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.printf("Idade:");
        int age = scr.nextInt();
        if (age >= 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade");
        }

        scr.close();

    }
}
