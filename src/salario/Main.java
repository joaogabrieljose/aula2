package salario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Funcionario trabalhador1, trabalhador2;

        trabalhador1 = new Funcionario("João Gabriel José", 3050, 10);
        System.out.println("Salário: " + trabalhador1.salario());
        System.out.println(trabalhador1.toString());

        trabalhador2 = new Funcionario("Pedro Zua Pereira", 15000, 8);
        System.out.println("Salário: " + trabalhador2.salario());
        System.out.println(trabalhador2.toString());

       double total =  trabalhador1.salario() + trabalhador2.salario();

        System.out.printf("total éh: "+total);

    }
}


