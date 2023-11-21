/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monday;

import java.time.LocalTime;
import java.util.Scanner;

public class Monday extends Weekday {

    private static String AlarmTime;
    
    public static void setAlarm(String time){
        AlarmTime = time;
    }


    public  static void showAlarm(){
        LocalTime now = LocalTime.now();
        
        
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter alarm in this Format (HH:MM): ");
        AlarmTime = scn.next();
        
        LocalTime Alarm = LocalTime.parse(AlarmTime);
        
        if (Alarm.isAfter(now)){
            
            System.out.println("i'll wake you up later");
            
        }else if(Alarm.isBefore(now)){
            
            System.out.println("i'll wake you up tommorow");
            
        }
      
    }
       
    public static void main(String[] args) {
        
        showAlarm();  
    }
}
