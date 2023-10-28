/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gameitems;

/**
 *
 * @author Cameron
 */
public class GameItem {
    private String name;
    private String description;
    
    public GameItem(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
    
//    public static void main(String[] args){
//        
//    }
}
