/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.abstractfactoryPatterndemo.implement;

import com.demo.abstractfactoryPatterndemo.color.Color;
import com.demo.abstractfactoryPatterndemo.shape.Shape;

/**
 *
 * @author Raju
 */
public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape);
    
}
