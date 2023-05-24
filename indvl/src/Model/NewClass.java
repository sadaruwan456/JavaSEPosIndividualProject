/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dilanka
 */
public class NewClass {
    public static void main(String[] args) {
       
        MobileValidate("0712944854");
    }
    
 public static boolean MobileValidate(String in){
    boolean Mobile_status = false;

    
        
    if(in.length()==10){
        System.out.println("1");
        if(in.charAt(0)=='0' && in.charAt(1)=='7'){
            System.out.println("2");
        if(in.charAt(2)=='1' || in.charAt(2)=='2' || in.charAt(2)=='5' || in.charAt(2)=='6' || in.charAt(2)=='7' || in.charAt(2)=='8'){
            System.out.println("3");
        
            Mobile_status=true;
            System.out.println("valide");
        }
        }
    }else{
    Mobile_status=false;
    }
    return Mobile_status;
    }
    
}
