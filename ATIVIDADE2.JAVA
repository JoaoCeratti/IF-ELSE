import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.printf("Informe um número:");
        int num = scr.nextInt();
        if (num % 2 == 0) {
            System.out.printf(num + " é um número par.");
        }else{
            System.out.printf(num + " é um número impar.");
        }
        scr.close();
    }
}
