/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.abstractfactoryPatterndemo.color.impl;

import com.demo.abstractfactoryPatterndemo.color.Color;

/**
 *
 * @author Raju
 */
public class Blue implements Color{

    @Override
    public void fill() {
          System.out.println("Inside Blue:: fill() method.");
    }
    
}
