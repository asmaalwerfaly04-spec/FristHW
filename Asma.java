
package com.mycompany.asma;

public class Asma {

    public static void main(String[] args) {
    Food<Number> f1 = new Food<>("Pizza", 15.5);
    Food<Number> f2 = new Food<>("Burger", 10);

    Show.showPrice(f1);
    Show.showPrice(f2);    
    }
}
class Food<T> { String name; T price;
public Food(String name, T price) {
    this.name = name;
    this.price = price;
}

public void display() {
    System.out.println("Food: " + name);
    System.out.println("Price: " + price);}}
 class Show {
public static void showPrice(Food<? super Number> food) {
    food.display();
}
}
           
                
                
                
                
                
                
     
                   

