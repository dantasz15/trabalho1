import java.util.ArrayList;
import java.util.List;

public class Exercicio5Main_NovoCenario {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        ProdutoPerecivel iogurte = new ProdutoPerecivel();
        iogurte.setNome("Iogurte Natural");
        iogurte.setPrecoBase(3.50);
        iogurte.setCategoria("Laticínios");
        iogurte.setCodigoBarras("9988776655443");
        iogurte.setDataValidade("2025-09-15");
        produtos.add(iogurte);

        ProdutoImportado cafeGourmet = new ProdutoImportado();
        cafeGourmet.setNome("Café Gourmet Etiópia");
        cafeGourmet.setPrecoBase(45.00);
        cafeGourmet.setCategoria("Bebidas");
        cafeGourmet.setCodigoBarras("1122334455667");
        cafeGourmet.setPaisOrigem("Etiópia");
        produtos.add(cafeGourmet);

        ProdutoNacional sabaoPo = new ProdutoNacional();
        sabaoPo.setNome("Sabão em Pó Brilhante");
        sabaoPo.setPrecoBase(12.80);
        sabaoPo.setCategoria("Limpeza");
        sabaoPo.setCodigoBarras("0011223344556");
        sabaoPo.setFabricante("Limpa Tudo S.A.");
        produtos.add(sabaoPo);

        System.out.println("\n***  Sistema de Produtos em um Supermercado ***");
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome() +
                               ", Categoria: " + p.getCategoria() +
                               ", Preço Final: R$ " + String.format("%.2f", p.calcularPrecoFinal()));
        }
    }
}

