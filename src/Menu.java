import java.util.Scanner;
import java.util.Set;

public class Menu extends Usuario{
    public short or;
    Scanner Scanner = new Scanner();
    public void MENU{
        System.out.println("1- Login");
        System.out.println("2- Cadastro");
        System.out.println("3- Bibliotecária");
        or = Scanner.nextShort();
    }
    switch(or){
        case 1: break;

        case 2: break;
        System.out.println("Informe Seu nome: ");
        setNome(Scanner.nextLine());
        System.out.println("Informe sua senha: ");
        setSenha(Scanner.nextLine());
        System.out.println("Usuario novo cadastrado.");

        case 3: break;
    }
}