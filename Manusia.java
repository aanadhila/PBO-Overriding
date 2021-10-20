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
public class Manusia {
    public void bernafas(){
        System.out.println("Manusia bisa bernapas");
    }
    public void makan(){
        System.out.println("Manusia bisa makan");
    }
}
class Dosen{
    public void makan(){
        System.out.println("Dosen juga makan seperti manusia biasa");
    }
    public void lembur(){
        System.out.println("Dosen bekerja lembur");
    }
}
class Mahasiswa{
    public void makan(){
        System.out.println("Mahasiswa juga makan seperti manusia biasa");
    }
    public void tidur(){
        System.out.println("Mahasiswa tidur teratur");
    }
}