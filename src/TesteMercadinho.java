public class TesteMercadinho {

    public static void main(String[] args) {

        System.out.println("TESTE DO MERCADINHO");

        Compra compra = new Compra();

        System.out.println("\nTESTE 1 - Estado Inicial");
        compra.mostrarSituacao();

        System.out.println("\nTESTE 2 - Avançando para Pagamento Pendente");
        compra.avancarCompra();
        compra.mostrarSituacao();

        System.out.println("\nTESTE 3 - Avançando para Pago");
        compra.avancarCompra();
        compra.mostrarSituacao();

        System.out.println("\nTESTE 4 - Avançando para Finalizado");
        compra.avancarCompra();
        compra.mostrarSituacao();

        System.out.println("\nTESTE 5 - Tentando avançar após finalizado");
        compra.avancarCompra();

        System.out.println("\nFIM DOS TESTES");
    }
}