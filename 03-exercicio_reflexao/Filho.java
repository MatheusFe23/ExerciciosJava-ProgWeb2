public class Filho  extends Pessoa{
     private String CorDoOlho;
     
     public void setCorDoOlho(String corDoOlho) {
         CorDoOlho = corDoOlho;
     }

     public String getCorDoOlho() {
         return CorDoOlho;
     }

     
    @Override
    protected String getTipoVoz() {
        return "Voz aguda e fina";
    }
}
