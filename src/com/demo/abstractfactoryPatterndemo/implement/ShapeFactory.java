/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.abstractfactoryPatterndemo.implement;

import com.demo.abstractfactoryPatterndemo.color.Color;
import com.demo.abstractfactoryPatterndemo.shape.Shape;
import com.demo.abstractfactoryPatterndemo.shape.impl.Circle;
import com.demo.abstractfactoryPatterndemo.shape.impl.Rectangle;
import com.demo.abstractfactoryPatterndemo.shape.impl.Square;

/**
 *
 * @author Raju
 */
public class ShapeFactory extends AbstractFactory{

   @Override
   public Shape getShape(String shapeType){
   
      if(shapeType == null){
         return null;
      }		
      
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
    
}
