package salario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Funcionario trabalhador = new Funcionario("João Gabriel José", 3050, 10);

        System.out.println("Salário: " + trabalhador.salario());
        System.out.println(trabalhador.toString());

        Funcionario trabalhador2 = new Funcionario("Pedro Zua Pereira", 15000, 8);
        System.out.println("Salário: " + trabalhador2.salario());
        System.out.println(trabalhador2.toString());

    }
}


