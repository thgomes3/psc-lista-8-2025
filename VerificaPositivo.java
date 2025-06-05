public class VerificaPositivo {
    public static char verifica(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        int valor = 10;
        char resultado = verifica(valor);
        System.out.println("Resultado: " + resultado);
    }
}
