package gpk.andrew.oopchallenge;

public class Stomach extends Organ {
    private String state;

    public Stomach(String name, String medicalCondition, String state) {
        super(name, medicalCondition);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
