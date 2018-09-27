package ua.com.juja.core.OOPAdvance.Lab31;



abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }

    public float getLength(){
        return length;
    }

    public float getWidth(){
        return width;
    }

    public float getDisplacement(){
        return displacement;
    }


}



