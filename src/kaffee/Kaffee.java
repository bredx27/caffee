package kaffee;

import zutaten.Zutaten;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E6410 on 08.09.2017.
 */
public abstract class Kaffee {
    private double price;
    private final List<Zutaten> zutaten = new ArrayList<>();
    public Kaffee(double price) {
        this.price = price;
    }

    public double getPrice() {
        return zutaten.stream().mapToDouble(Zutaten::getPrice).sum() + price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void addZutaten(Zutaten zutaten) {
        this.zutaten.add(zutaten);
    }

    public List<Zutaten> getZutaten() {
        return zutaten;
    }
}
