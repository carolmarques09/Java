public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public CategoriaProduto categoria;

    public Produto(String nome, double preco, int quantidade, CategoriaProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double calcularImposto() {
        return preco * 0.09;
    }

    public double calcularLucro() {
        return preco * 0.02;
    }

    public double calcularJuros() {
        return preco * 0.5;
    }

    public double calcularTaxaManuseio() {
        return preco * 0.100;
    }

    public double calcularDesconto() {
        return preco - 10;
    }

    public double calcularPrecoFinal() {
        return (preco + calcularLucro() + calcularJuros() + calcularDesconto());
    }

    public double calcularTotal() {
        return quantidade * preco;
    }

}
