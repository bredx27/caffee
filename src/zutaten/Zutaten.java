package zutaten;

/**
 * Created by E6410 on 08.09.2017.
 */
public abstract class Zutaten {
    private int count ;
    private double price;

    public Zutaten(int count, double price) {
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void addCount() {
        this.count++;
    }
    public double getPrice() {
        return price*count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
