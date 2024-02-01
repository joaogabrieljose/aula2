package salario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.printf("digite o nome: ");
        String nome1 = scanner.next();

        System.out.printf("Quanto quanto ganha por hora: ");
        double valor1 = scanner.nextDouble();

        System.out.printf("quantas hora trabalha: ");
        int hora1 = scanner.nextInt();

        System.out.printf("digite o nome: ");
        String nome2 = scanner.next();

        System.out.printf("Quanto quanto ganha por hora: ");
        double valor2 = scanner.nextDouble();

        System.out.printf("quantas hora trabalha: ");
        int hora2 = scanner.nextInt();

        int ordenado1 = (int) valor1 * hora1;
        int ordenado2 = (int) valor2 * hora2;
        int valorTota = ordenado1 + ordenado2;

        System.out.println("o srª"+nome1+" ganha "+ordenado1);
        System.out.println("o srª"+nome2+" ganha "+ordenado2);

        System.out.printf("o total por mensal dos trabalhadores éh " + valorTota);
    }
}