import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("Yelena", "897.456.765-34");
        Produto produto1 = new Produto("Deck Senhor dos Anéis", 800.00, 1, CategoriaProduto.ELETRONICO);
        Produto produto2 = new Produto("O Hobbit", 41.00, 1, CategoriaProduto.PAPELARIA);
        Produto produto3 = new Produto("Speak Now (Taylor's Version) - Deluxe Vinyl", 200.00, 2, CategoriaProduto.ELETRONICO );
        NotaFiscal notaFiscal = new NotaFiscal();

        notaFiscal.adicionaCliente(cliente);
        notaFiscal.adicionaProduto1(produto1);
        notaFiscal.adicionaProduto2(produto2);
        notaFiscal.adicionaProduto3(produto3);

        produto1.calcularPrecoFinal();
        produto2.calcularPrecoFinal();
        produto3.calcularPrecoFinal();

        notaFiscal.emitirNota();

    }
}