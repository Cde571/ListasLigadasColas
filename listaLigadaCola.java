public class listaLigadaCola {
    private NodoCliente cab, ult, x;
    private float acumValorCompra;
    private int contMujeres, contHombres;

    public listaLigadaCola() {
        cab = new NodoCliente();
        ult = x = cab;
        acumValorCompra = 0.0f;
        contMujeres = contHombres = 0;
    }

    public float getAcumValorCompra() {
        return acumValorCompra;
    }

    public int getContMujeres() {
        return contMujeres;
    }

    public int getContHombres() {
        return contHombres;
    }

    public boolean colaVacia() {
        return (cab.getLiga() == null);
    }

    public void encolar(String codigo, char sexo, float valorCompra) {
        NodoCliente p = new NodoCliente( codigo, sexo,valorCompra);
        ult.setLiga(p);
        ult = p;


    }
    public Cliente desencolar() {
        Cliente clienteDesencolado;
        NodoCliente p = cab.getLiga();
        clienteDesencolado = p.getCliente();
        acumValorCompra += clienteDesencolado.getValorCompra();
        if (clienteDesencolado.getSexo() == 'f') {
            ++contMujeres;
        } else {
            ++contHombres;
        }
        cab.setLiga(p.getLiga());
        if (cab.getLiga() == null) {
            ult = cab;

        }
        return clienteDesencolado;


    }
    public Cliente mostrarCola() {
        x=x.getLiga();
        if(x==null)
        {
            x=cab;
        }
        return x.getCliente();
    }


}