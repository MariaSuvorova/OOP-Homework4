package Homework4;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    static  Random random = new Random();

    static ArrayList<Apple> generateListOfApples(){
        int a = random.nextInt(20, 60);
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < a; i++) apples.add(new Apple());
        return apples;
    }
    static ArrayList<Orange> generateListOfOranges(){
        int a = random.nextInt(20, 60);
        ArrayList<Orange> oranges = new ArrayList<>();
        for (int i = 0; i < a; i++) oranges.add(new Orange());
        return oranges;
    }
        
    public static void main(String[] args) {
        
        ArrayList<Apple> apples = generateListOfApples();
        ArrayList<Orange> oranges = generateListOfOranges();
        
        System.out.println("\nНаполняем коробки и считаем вес\n");
        Box<Apple> box1 = new Box<>(apples);
        Box<Orange> box2 = new Box<>(oranges);
        System.out.println(box1.getBoxWeight(apples));
        System.out.println(box2.getBoxWeight(oranges));
        System.out.println(box1);
        System.out.println(box2);
        
        System.out.println("\nДобавляем фрукты\n");
        ArrayList<Apple> applesAdd = generateListOfApples();
        box1.addFruits(applesAdd);
        ArrayList<Orange> orangesAdd = generateListOfOranges();
        box2.addFruits(orangesAdd);
        box1.addFruits(orangesAdd);
        
        System.out.println("\nСравниваем коробки\n");
        System.out.println(box2);
        Box<Orange> box3 = new Box<>(orangesAdd);
        System.out.println(box3);
        box2.compare(box3);
        System.out.println(box1);
        System.out.println(box2);
        box1.compare(box2);

        System.out.println("\nПерекладываем фрукты\n");
        System.out.println(box3);
        System.out.println(box2+"\n");
        box3.changeBox(box2);
        System.out.println(box3);
        System.out.println(box2);

        System.out.println(box1);
        System.out.println(box3);
        box1.changeBox(box3);

    }

}