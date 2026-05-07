public class Finalizado implements EstadoCompra {

    @Override
    public void avancarEstado(Compra compra) {
        System.out.println("A compra já foi finalizada!");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Compra finalizada");
    }
}