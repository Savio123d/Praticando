import java.util.Scanner;

public class Livro {
    public String[] genero;
    public int verL;
    Scanner Scanner = new Scanner(System.in);
    public String[] nomeL = new String[20];

    public  void Clivro(){
     System.out.println("Informe nome do livro quer cadastrar: ");
     nomeL[0] = Scanner.next();
   }
}
