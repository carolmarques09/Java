public class Aluno extends Pessoa {
    private String nome;
    private int idade, media, matricula;

    private double nota1, nota2;

    public Aluno(String nome, int idade, double matricula) {
        super(nome, idade, matricula);
    }

    public Aluno() {
        super();
    }

    public double calcularMedia() {
        return (nota1 + nota2 / 2);
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

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
