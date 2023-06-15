package Homework4;

import java.util.ArrayList;

public class Box <F extends Fruit<F>> implements Comparable<Box<F>> {

    private ArrayList<F> fruits;
    private int amount;

    public Box(ArrayList<F> fruits) {
        this.fruits = fruits;
        this.amount = fruits.size();
    }

    public void addFruits(ArrayList newFruits){
        if ((newFruits.get(0) instanceof Apple & this.getFruits().get(0) instanceof Apple) | (newFruits.get(0) instanceof Orange & this.getFruits().get(0) instanceof Orange)){
        System.out.println(this.toString());
        fruits.addAll(newFruits);
        this.amount = fruits.size();
        System.out.println("После добавления " + newFruits.size() + " стало " + this.toString());}
        else System.out.println("Нельзя добавить разные фрукты в коробку");
    }
    
    public void compare(Box someFruits) {
        if (this.compareTo(someFruits) == 0) System.out.println("Коробки равны по весу\n");
        else System.out.println("Коробки с разным весом\n");
    }

    public void changeBox(Box someFruits) {
        if ((someFruits.getFruits().get(0) instanceof Apple & this.getFruits().get(0) instanceof Apple) | (someFruits.getFruits().get(0) instanceof Orange & this.getFruits().get(0) instanceof Orange)){
        fruits.addAll(someFruits.getFruits());
        this.amount = fruits.size();
        someFruits.getFruits().clear();
        someFruits.amount = someFruits.getFruits().size();
        }
        else System.out.println("Нельзя добавить разные фрукты в коробку");
        }

    public float getBoxWeight(ArrayList<F> fruits) {
        float weight = fruits.get(0).getWeight();
        return fruits.size() * weight;
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        if (fruits.size() == 0) return String.format("Коробка пустая\n");
        else return String.format("Box [fruits " + fruits.get(0).getClass().getSimpleName() + ", amount " + amount + ", вес "+getBoxWeight(fruits)+"]");
    }

    public void setFruits(ArrayList<F> fruits) {
        this.fruits = fruits;
    }
    @Override
    public int compareTo(Box<F> anotherBox){
        float weightBox1 = this.getBoxWeight(this.getFruits());
        float weightBox2 = anotherBox.getBoxWeight(anotherBox.getFruits());
        if (weightBox1 == weightBox2) {
            return 0;
        } else if (weightBox1 < weightBox2) {
            return -1;
        } else {
            return 1;
        }
    }}

