/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author LENOVO
 */
public class Fish {
    public static void main(String[] args) {
        ikan a = new ikan();
        ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}
class ikan{
    public void swim(){
        System.out.println("Ikan bisa berenang");
    }
}
class Piranha extends ikan{
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
}

