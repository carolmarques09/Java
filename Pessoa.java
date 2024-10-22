public class Pessoa {
    protected String nome;
    protected int idade;
    protected double matricula;

    public Pessoa(String nome, int idade, double matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}
