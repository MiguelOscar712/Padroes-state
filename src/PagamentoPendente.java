public class PagamentoPendente implements EstadoCompra {

    @Override
    public void avancarEstado(Compra compra) {
        compra.setEstado(new Pago());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Pagamento pendente");
    }
}