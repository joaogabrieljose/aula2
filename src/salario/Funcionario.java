package salario;

public class Funcionario {
    private String nome;
    private double valor;
    private int horas;

    public Funcionario(String nome, double valor, int horas){
        this.nome = nome;
        this.valor = valor;
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double salario() {
        double valorTotal = horas * valor;
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", horas=" + horas +
                '}';
    }

}
