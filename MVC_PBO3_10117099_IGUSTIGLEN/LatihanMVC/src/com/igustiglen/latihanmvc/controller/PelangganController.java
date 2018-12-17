/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igustiglen.latihanmvc.controller;
import com.igustiglen.latihanmvc.model.PelangganModel;
import com.igustiglen.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen
//NIM   :10117099    
//KELAS :IF-3
 */
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getjTextFieldNama().getText();
        String email = view.getjTextFieldEmail().getText();
        String notelp = view.getjTextFieldNotelp().getText();
        
        if(nama.equals("") && email.equals("") && notelp.equals("")){
            
        }else{
            
            model.resetForm();
        }
        
    }
    
    public void submitFrom(PelangganView view){
        
        String nama = view.getjTextFieldNama().getText();
        String email = view.getjTextFieldEmail().getText();
        String notelp = view.getjTextFieldNotelp().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        }else if(notelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Notelp Masih Kosong");
        }else {
            model.simpanForm();
        }
    }   
}
