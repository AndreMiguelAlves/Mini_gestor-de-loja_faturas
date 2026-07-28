public class ProdutoAlimentar extends Produto implements Descontavel{
    private int diasParaValidade;

    public ProdutoAlimentar(String nome, double precoBase, int diasParaValidade) {
        super(nome, precoBase);
        this.diasParaValidade = diasParaValidade;
    }

    @Override
    public double aplicarDesconto() {
        if (diasParaValidade <= 5) {
            return getPrecoBase() * 0.80;
        }
        return getPrecoBase();
    }
}
