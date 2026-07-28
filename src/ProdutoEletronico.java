public class ProdutoEletronico extends Produto implements Descontavel {

    public ProdutoEletronico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double aplicarDesconto() {
        return getPrecoBase() * 0.9;
    }
}
