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
public class menucontroller {
    private StudentControl st_contrl;
    private menuview mnview;

    public menucontroller() {
    }

    public menucontroller(StudentControl st_contrl) {
        this.st_contrl = st_contrl;
    }

    public menucontroller(StudentControl st_contrl, menuview mnview) {
        this.st_contrl = st_contrl;
        this.mnview = mnview;
    }
    
    
    
    public void lua_chon_menu(){
        int kq = mnview.hien_thi_menu();
        switch(kq){
            case 1: 
                st_contrl.nhap_danh_sach_sinh_vien();
                break;
            case 2:
                st_contrl.tim_kiem_sv_theo_sdt();
                break;
                
        }
    }
    
    
}