/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar090323;

/**
 *
 * @author LAB-MM
 */
public class kondisiOperator {
    
    public static void main(String[] args ){
        
        String status = "";
        int grade = 80;
        
        // mendaptkan status belajar
        status = (grade >= 60)?"Passed":"Fail";
        
        // print status
        System.out.println(status);
        
    }
    
}
