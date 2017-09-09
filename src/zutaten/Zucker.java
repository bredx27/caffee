package zutaten;

/**
 * Created by E6410 on 08.09.2017.
 */
public class Zucker extends Zutaten{

    public Zucker(int count, double price) {
        super(count, price);
    }
    public Zucker() {
        super(1, 0.3);
    }
}
