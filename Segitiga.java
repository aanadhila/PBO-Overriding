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
public class Segitiga {
    private int sudut;
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA - sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
    double keliling = Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
    return keliling; 
    }
    
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("totalSudut pertama: " + s.totalSudut(45));
        System.out.println("totalSudut kedua: "+s.totalSudut(45, 45));
        System.out.println("Keliling pertama: "+ s.keliling(3, 4, 5));
        System.out.println("Keliling kedua: "+ s.keliling(3, 4));
    }
}
