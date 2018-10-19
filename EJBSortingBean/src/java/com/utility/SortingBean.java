/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utility;

import javax.ejb.Stateless;

/**
 *
 * @author Ohana7
 */
@Stateless
public class SortingBean implements SortingBeanRemote, SortingBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    //Attributes
    private int[] element;
    public int temp = 0;
    
    //Constructor
    public SortingBean(){
        
    }
    
    //Accessor method for element
    @Override
    public int[] getElement(){
        return element;
    }
    
    //Mutator method for element
    @Override
    public void setElement(int[] element){
        this.element = element;
    }
    
    @Override
    public int[] selectionSort(int[] element){
        for (int i = 0; i < element.length-1; i++){
            int smallPos = i;
            for (int j = i+1; j < element.length; j++){
                if (element[smallPos] > element[j]){
                    smallPos = j;
                }
            }
            if (smallPos != i){
                int temp = element[i];
                element[i] = element[smallPos];
                element[smallPos] = temp;
            }
        }
        return element;
    }
    
    @Override
    public int[] bubbleSort(){
        for (int i = 0; i <= element.length - 1; i++){
            for (int j = 1; j < element.length - i; j++){
                if (element[j-1] < element[j]){
                    int temp = element[j-1];
                    element[j-1] = element[j];
                    element[j] = temp;
                }
            }
        }
        return element;
    }
}
