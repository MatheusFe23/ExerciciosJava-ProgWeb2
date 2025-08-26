public abstract class Pessoa {
    
    private int peso;

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    abstract protected String getTipoVoz();
}
