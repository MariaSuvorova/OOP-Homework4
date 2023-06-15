package Homework4;

public final class Apple extends Fruit<Apple> {
    
    public Apple() {
        super(1.0f);
    }
    public float getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Apple";
    }

}
