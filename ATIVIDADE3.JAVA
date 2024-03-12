import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String rname = "usuario";
        String rpassword = "senha123";

        System.out.printf("nome de usuário:");
        String name = scr.next();
        System.out.printf("Senha:");
        String password = scr.next();

        if (name.equals(rname) && (password.equals(rpassword))){
            System.out.println("Login bem-sucedido!");
        }else{
            System.out.printf("Nome de usuário ou senha incorretos!");
        }
    }
}
