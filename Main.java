import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int r;
        do {
            System.out.println("Aperte 1: soma, Aperte 2: subtração, Aperte 3, multiplicação, Aperte 4: divisão");

            System.out.println("Informe o primeiro número: ");
            double n1 = sc.nextDouble();

            System.out.println("Informe o segundo número: ");
            double n2 = sc.nextDouble();

            int x = sc.nextInt();
            switch (x) {
                case 1:
                    c.soma();
                    break;
                case 2:
                    c.subtracao();
                    break;
                case 3:
                    c.multiplicacao();
                    break;
                case 4:
                    c.divisao();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
        } while (r == 0);
    }
}
