import kaffee.Expresso;
import kaffee.Hausmarke;
import zutaten.Sahne;
import zutaten.Streusel;
import zutaten.Zucker;

/**
 * Created by E6410 on 08.09.2017.
 */
public class KaffeeStarter {
    public static void main(String[] args) {
        Hausmarke kaffee = new Hausmarke();
        Streusel streusel = new Streusel();
        streusel.addCount();
        kaffee.getZutaten().add(streusel);
        kaffee.getZutaten().add(new Sahne());
        kaffee.getZutaten().add(new Zucker());
        System.out.println(kaffee.getPrice());
    }
}
