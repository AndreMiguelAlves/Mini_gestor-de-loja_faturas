import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Produto> inventario = new HashMap<>();
        inventario.put("P101", new ProdutoEletronico("Telemóvel", 300.0));
        inventario.put("P102", new ProdutoAlimentar("Leite", 1.20, 3));
        System.out.println("Bem-vindo ao sistema de inventário!");
        System.out.println("Digita o código de barras do produto:");
        String codigo = scanner.nextLine();

        // 1. Procurar o produto no HashMap
        Produto p = inventario.get(codigo);

// 2. Validar se encontrou algo
        if (p != null) {
            System.out.println("Produto encontrado: " + p.getNome());
            System.out.println("Preço base: " + p.getPrecoBase());
            System.out.println("Preço final: " + p.aplicarDesconto());
        }
            else{
                System.out.println("Produto não encontrado.");
            }

    }
}
