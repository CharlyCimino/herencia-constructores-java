package herenciaconstructores;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Auto a = new Auto(true, "MarcaFalsa", "XYZ", "ABC123");
        a.acelerar();
        System.out.println(a);
        new Object();
    }

}
