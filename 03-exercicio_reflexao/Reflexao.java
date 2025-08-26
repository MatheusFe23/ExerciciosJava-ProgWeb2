import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    
    private static void listarAtributos(Class<?> clazz) {
        if (clazz == null || clazz == Object.class) return;

        for (Field f : clazz.getDeclaredFields()) {
            System.out.println("Atributo: " + f.getName() + " | Tipo: " + f.getType().getSimpleName());
        }
        listarAtributos(clazz.getSuperclass());
    }

  
    private static void listarMetodos(Class<?> clazz) {
        if (clazz == null || clazz == Object.class) return;

        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println("Método: " + m.getName() + " | Retorno: " + m.getReturnType().getSimpleName());
        }

  
        listarMetodos(clazz.getSuperclass());
    }

 
    public static void inspecionarObjeto(Object obj) {
        Class<?> clazz = obj.getClass();
        System.out.println("=== Inspecionando: " + clazz.getSimpleName() + " ===");

        listarAtributos(clazz);
        listarMetodos(clazz);
    }


    public static void main(String[] args) {

        Filho f = new Filho();
        f.setPeso(50);
        f.setCorDoOlho("Azul");


        inspecionarObjeto(f);

        System.out.println("Tipo de voz: " + f.getTipoVoz());
    }
}