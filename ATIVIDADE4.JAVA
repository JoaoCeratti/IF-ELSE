import java.util.Scanner;
public class Nova {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.printf("Digite um número:");
        int n1 = scr.nextInt();
        System.out.printf("Digite outro número:");
        int n2 = scr.nextInt();

        if(n1 > n2 ){
            System.out.println(n1);
        }else{
            System.out.println(n2);
        }
    scr.close();
    }
}
