public class Pai extends Pessoa {
    private String CorDoCabelo;

    public void setCorDoCabelo(String corDoCabelo) {
        CorDoCabelo = corDoCabelo;
    }
    public String getCorDoCabelo() {
        return CorDoCabelo;
    }

    
    @Override
    protected String getTipoVoz() {
        return "Voz firme e mais forte";
    }
}
