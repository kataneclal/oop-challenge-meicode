package gpk.andrew.oopchallenge;

public class Eye extends Organ {
    private String side;
    private String color;

    public Eye(String name, String medicalCondition, String side, String color) {
        super(name, medicalCondition);
        this.side = side;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
