public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

        public void adicionaCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        public void adicionaProduto1 (Produto produto) {
            this.produto1 = produto;
        }

        public void adicionaProduto2 (Produto produto) {
            this.produto2 = produto;
        }

        public void adicionaProduto3 (Produto produto) {
            this.produto3 = produto;
        }

        public void emitirNota() {
            System.out.println("--------Nota Fiscal--------");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());

            System.out.println("\nProduto(s): ");
            System.out.println("Nome: " + produto1.getNome());
            System.out.println("Nome: " + produto2.getNome());
            System.out.println("Nome: " + produto3.getNome());

            System.out.println("Preço: " + produto1.getPreco());
            System.out.println("Preço: " + produto2.getPreco());
            System.out.println("Preço: " + produto3.getPreco());

            System.out.println("Quantidade: " + produto1.getQuantidade());
            System.out.println("Quantidade: " + produto2.getQuantidade());
            System.out.println("Quantidade: " + produto3.getQuantidade());

            System.out.println("Categoria: ");
            System.out.println("---------------------------");
            System.out.println("Imposto: " + produto1.calcularImposto());
            System.out.println("Juros: " + produto1.calcularJuros());
            System.out.println("Lucro: " + produto1.calcularLucro());
            System.out.println("Taxa de manuseio: " + produto1.calcularTaxaManuseio());
            System.out.println("Valor Total da Nota: ");
        }
}
