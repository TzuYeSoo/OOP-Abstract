/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runquad;

import java.util.*;

public class RunQuad {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        while(true){
            
            System.out.print("Press R for Rectangle or S for Square: ");
            char RorS  = scn.next().toUpperCase().charAt(0);
            
        switch(RorS){
            
            case 'S':
                Square s = new Square();
                s.showDescription();
                break;
            case 'R':
                Rectangle r = new Rectangle();
                r.showDescription();
                break;
            default:
                System.out.println("Invalid letter");
            }
        
            System.out.println("Do you want go for another"
                    + "\n[1] Yes"
                    + "\n[2] No");
            int YN = scn.nextInt();
            
            if(YN == 2){
                break;
            }
        }
    }
    
}
