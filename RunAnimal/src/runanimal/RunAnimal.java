/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runanimal;

import java.util.Scanner;
public class RunAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        Bird birds = new Bird();
        Cat cats = new Cat();
        Dog dogs = new Dog();
        boolean loop = true;
        do{
        System.out.print("Enter [B] for Birds, [D] for Dog and [C] for Cat: ");
        String Animal = scn.nextLine();
      
        if(Animal.equalsIgnoreCase("B")){
            birds.eat();
            birds.sleep();
            birds.makesound();
            break;
        }
        else if(Animal.equalsIgnoreCase("C")){
            cats.eat();
            cats.sleep();
            cats.makesound();
            break;
        }
        else if(Animal.equalsIgnoreCase("D")){
            dogs.eat();
            dogs.sleep();
            dogs.makesound();
            break;
        }else{
            System.out.println("Invalid input");
            
        }
        }while(loop == true);
    }
}
