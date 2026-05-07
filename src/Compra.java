public class Compra {

    private EstadoCompra estado;

    public Compra() {
        this.estado = new Aberto();
    }

    public void setEstado(EstadoCompra estado) {
        this.estado = estado;
    }

    public void avancarCompra() {
        estado.avancarEstado(this);
    }

    public void mostrarSituacao() {
        estado.mostrarEstado();
    }
}