public class Calculadora {
    double soma, subtracao, multiplicacao, divisao;
    double n1, n2;
    double total;

    public void soma() {
        total = n1 + n2;
        System.out.println(total);
    }

    public void subtracao() {
        total = n1 - n2;
        System.out.println(total);
    }

    public void multiplicacao() {
        total = n1 * n2;
        System.out.println(total);
    }

    public void divisao() {
        total = n1 / n2;
        System.out.println(total);
    }

}
