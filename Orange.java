package Homework4;

public final class Orange extends Fruit<Orange> {

    public Orange() {
        super(1.5f);
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
