/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

/**
 *
 * @author MyPC
 */
public class StudentMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentControl sc = new StudentControl(new Studentview());
        sc.nhap_du_lieu_sinh_vien();
        sc.hien_thi_sinh_vien();
    }
    
}