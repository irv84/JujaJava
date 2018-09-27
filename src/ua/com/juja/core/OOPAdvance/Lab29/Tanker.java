package ua.com.juja.core.OOPAdvance.Lab29;

public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume=volume;
    }

    @Override
    public float calculatePayment() {
        return volume*DEFAULT_RENTAL;
    }

    public float calculatePayment(float rent) {
        if (rent<=0)return volume*DEFAULT_RENTAL;
        return rent*volume;
    }

}
