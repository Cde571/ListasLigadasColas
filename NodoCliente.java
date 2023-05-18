public class NodoCliente {
    private Cliente cliente;//este es el info
    private NodoCliente liga;//esta es la liga
    public NodoCliente()
    {
        cliente=null;
        liga=null;
    }
    public NodoCliente(String codigo, char sexo, float valorCompra) {
        cliente = new Cliente(codigo,sexo,valorCompra);
        liga = null;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLiga(NodoCliente liga) {
        this.liga = liga;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public NodoCliente getLiga() {
        return liga;
    }
}