public class Professor extends Pessoa {
    private String nome;
    private int idade, matricula;

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

    @Override
    public void emitirSom() {

    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
