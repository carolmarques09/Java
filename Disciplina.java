public class Disciplina {
    private String nome;
    private String aluno;
    private String professor;

    public Disciplina() {

    }

    public Disciplina(String nome, Aluno aluno, Professor professor) {
        this.nome = nome;
        this.aluno = String.valueOf(aluno);
        this.professor = String.valueOf(professor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void cadastrarAluno(Aluno aluno) {
        this.aluno = String.valueOf(aluno);
    }

    public void ministrarDisciplina(Professor professor) {
        this.professor = String.valueOf(professor);
    }
}
