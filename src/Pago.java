public class Pago implements EstadoCompra {

    @Override
    public void avancarEstado(Compra compra) {
        compra.setEstado(new Finalizado());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Compra paga");
    }
}