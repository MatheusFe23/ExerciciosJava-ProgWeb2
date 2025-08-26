public class Avo extends Pessoa {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    
    @Override
    protected String getTipoVoz() {
        return "Voz rouca e mais fraca";
    }
}
