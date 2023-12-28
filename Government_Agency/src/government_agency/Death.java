/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package government_agency;
import java.util.Scanner;
class Death {
    String deceasedName;
    String deathDate;
    String causeOfDeath;
    
    public void create(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter deceased person's name: ");
        deceasedName = scan.nextLine();
        System.out.println("Enter death Date: ");
        deathDate = scan.nextLine();
        System.out.println("Enter cause of death: ");
        causeOfDeath = scan.nextLine();
    }
}
