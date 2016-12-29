/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.abstractfactoryPatterndemo.implement;

import com.demo.abstractfactoryPatterndemo.color.Color;
import com.demo.abstractfactoryPatterndemo.color.impl.Blue;
import com.demo.abstractfactoryPatterndemo.color.impl.Green;
import com.demo.abstractfactoryPatterndemo.color.impl.Red;
import com.demo.abstractfactoryPatterndemo.shape.Shape;

/**
 *
 * @author Raju
 */
public class ColorFactory extends AbstractFactory{

       @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
   
      if(color == null){
         return null;
      }		
      
      if(color.equalsIgnoreCase("RED")){
         return new Red();
         
      }else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
         
      }else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      
      return null;
   }
    
}
