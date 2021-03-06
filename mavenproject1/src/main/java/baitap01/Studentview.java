/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Studentview {

    public Studentview() {
    }
    
    public void hien_thi_mot_sinh_vien(Student x){
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("++++ " + x.toString() + " ++++");
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
    
    public Student them_du_lieu_sinh_vien(){
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Fullname: ");
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        System.out.println("Age: ");
        float age = Float.parseFloat(sc.nextLine());
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        Student sv = new Student(fullname, age, phone);
        System.out.println("Finished");
        System.out.println("++++++++++++++++++++++++++++++++++");
        return sv;
    }
    
}