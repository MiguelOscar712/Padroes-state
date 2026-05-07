public class Main {

    public static void main(String[] args) {

        System.out.println("TESTE DO MERCADINHO");

        Compra compra = new Compra();

        compra.mostrarSituacao();

        compra.avancarCompra();
        compra.mostrarSituacao();

        compra.avancarCompra();
        compra.mostrarSituacao();

        compra.avancarCompra();
        compra.mostrarSituacao();

        compra.avancarCompra();
    }
}