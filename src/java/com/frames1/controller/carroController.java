/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.controller;

import com.frames1.model.CarrroModel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author karinna
 */
@ManagedBean
@ViewScoped
public class carroController {
   private CarrroModel carroModel;
   
   public CarroModel(){
       this.carroModel=new CarroModel();
   }
        
    public void salvar(){
        System.out.println("Marca:"+this.carroModel + " - Modelo:"+this.carroModel.getModelo());
    }

    public CarrroModel getCarroModel() {
        return carroModel;
    }

    public void setCarroModel(CarrroModel carroModel) {
        this.carroModel = carroModel;
    }

   
}
