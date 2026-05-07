public class Aberto implements EstadoCompra {

    @Override
    public void avancarEstado(Compra compra) {
        compra.setEstado(new PagamentoPendente());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Compra aberta");
    }
}