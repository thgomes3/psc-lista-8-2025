public class CalculaImposto {
    public static double somaImposto(double taxaImposto, double custo) {
        custo = custo + (custo * taxaImposto / 100);
        return custo;
    }

    public static void main(String[] args) {
        double taxa = 8.5; 
        double preco = 100.0;
        double precoComImposto = somaImposto(taxa, preco);
        System.out.println("Preço com imposto: " + precoComImposto);
    }
}
