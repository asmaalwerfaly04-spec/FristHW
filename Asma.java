
package com.mycompany.asma;

public class Asma {

    public static void main(String[] args) {
    Food<Number> f1 = new Food<>("Pizza", 15.5);
    Food<Number> f2 = new Food<>("Burger", 10);
Fruit<Number> item1 = new Fruit<>("Apple", 3.5);
        Drink<Number> item2 = new Drink<>("Juice", 5.0);
        Electronics<Number> item3 = new Electronics<>("Mouse", 25.99);
        
    Show.showPrice(f1);   
        Show.showPrice(f2);
        
        Show.showPrice(item1);
        Show.showPrice(item2);
        Show.showPrice(item3);

    
        
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
   class Fruit<T> extends Food<T> {
    public Fruit(String name, T price) {
        super(name, price);
    }
}
 class Drink<T> extends Food<T> {
    public Drink(String name, T price) {
        super(name, price);
    }  
 }
   class Electronics<T> extends Food<T> { // 
    public Electronics(String name, T price) {
        super(name, price);
  
}
           
                
                
                
                
                
                
     
                   

