public class Cliente {
    private String codigo;
    private char sexo;
    private float valorCompra;

    public Cliente (String codigo,char sexo,float valorCompra)
    {
        this.codigo=codigo;
        this.sexo=sexo;
        this.valorCompra=valorCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
}
