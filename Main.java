import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        Disciplina d = new Disciplina();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // Cadastro do professor

        System.out.println("Digite seu nome completo: ");
        p.setNome(sc.next());

        System.out.println("Digite sua idade: ");
        p.setIdade(sc.nextInt());

        System.out.println("Digite sua matrícula: ");
        p.setMatricula(sc.nextDouble());

        // Cadastro do aluno

        System.out.println("Digite seu nome completo: ");
        a.setNome(sc.next());

        System.out.println("Digite sua idade: ");
        a.setIdade(sc.nextInt());

        System.out.println("Digite sua matrícula: ");
        a.setMatricula(sc.nextDouble());

        // Cadastro da disciplina

        System.out.println("Digite o nome da disciplina: ");
        d.setNome(sc.next());

        d.cadastrarAluno(aluno);
        d.ministrarDisciplina(professor);

        // exibição pelo toString

        System.out.println("Informações do Professor:");
        System.out.println(p);

        System.out.println("Informações do Aluno:");
        System.out.println(a);

        System.out.println("\nInformações da disciplina: ");
        System.out.println(d);
    }
}