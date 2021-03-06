/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class StudentControl {
    private Student student;
    private ArrayList<Student> students;
    private Studentview view;

    public StudentControl() {
    }

    public StudentControl(Studentview view) {
        this.view = view;
    }
    

    public StudentControl(Student student) {
        this.student = student;
    }
    
//    public void nhap_du_lieu_sinh_vien(StudentView view){
//        this.student = view.them_du_lieu_sinh_vien();
//    }
    
    public void nhap_du_lieu_sinh_vien(){
        this.student = this.view.them_du_lieu_sinh_vien();
    }
    
    public void hien_thi_sinh_vien(){
        this.view.hien_thi_mot_sinh_vien(this.student);
    }

    void nhap_danh_sach_sinh_vien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void tim_kiem_sv_theo_sdt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   