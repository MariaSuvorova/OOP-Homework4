package Homework4;

public abstract class Fruit<F extends Fruit<F>>{

    protected final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public int compareTo(F other) {
        if (this.weight == other.getWeight()) {
            return 0;
        } else if (this.weight < other.getWeight()) {
            return -1;
        } else {
            return 1;
    }
}}

