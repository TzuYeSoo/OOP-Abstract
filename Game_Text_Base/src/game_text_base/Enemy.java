/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game_text_base;

/**
 *
 * @author Josie
 */
public class Enemy extends Elements implements Enemy_Name{
    
    private static int Playerlvl;

    private String E1 = "Water";
    private String E2 = "Earth";
    private String E3 = "Fire";
    private String E4 = "Wind";
    
    private static int Health1 = 20;
    private static int Health2 = 40;
    private static int Health3 = 60;
    private static int Health4 = 80;
    private static int Health5 = 120;
    

     
    
    public void setPlayerEn(int Playerlvl){
        this.Playerlvl = Playerlvl;
    }
    public int getPlayerlvlEn(){
        return Playerlvl;
    }
    public void setHealth1(int health){
           this.Health1 = health;     
   }
   public int getHealth1(){
       return Health1;
   }
   public void setHealth2(int health2){
           this.Health2 = health2;     
   }
   public int getHealth2(){
       return Health2;
   }
   public void setHealth3(int health3){
           this.Health3 = health3;     
   }
   public int getHealth3(){
       return Health3;
   }
   public void setHealth4(int health4){
           this.Health4 = health4;     
   }
   public int getHealth4(){
       return Health4;
   }
   public void setHealth5(int health5){
           this.Health5 = health5;     
   }
   public int getHealth5(){
       return Health5;
   }
   
    
   
    public void Shinsui(){
 
        System.out.println("Shinsui"
                + "\nHealth: " + Health1 + "            Element: " + E4
                + "\nPhysical: " + LowDMG1 + "           Magic: " + HighDMG1);
        
    } public void Pica(){

        System.out.println("Pica"
                + "\nHealth: " + Health2 + "            Element: " + E2
                + "\nPhysical: " + HighDMG2 + "          Magic: " + LowDMG2);
        
    } 
    public void Wendy(){
        System.out.println("Wendy"
                + "\nHealth: " + Health3 + "             Element: " + E4
                + "\nPhysical: " + LowDMG1 + "           Magic: " + HighDMG3 );
        
    }
    public void Ace(){
        System.out.println("Ace"
                + "\nHealth: " + Health3 + "             Element: " + E3
                + "\nPhysical: " + HighDMG3 + "           Magic: " + HighDMG3);
        
    }
   public void Sailor(){
        System.out.println("Sailor Mercury"
                + "\nHealth: " + Health5 + "          Element: " + E1 + " + "  + E2 + " + "  + E3 + " + "  + E4
                + "\nPhysical: " + LowDMG5 + "        Magic: " + HighDMG5);
        
   //Enemy set 2
   }
   public void Yuno(){
        System.out.println("Yuno"
                + "\nHealth: " + Health1 + "          Element: " + E4
                + "\nPhysical: " + LowDMG1 + "         Magic: " + HighDMG1 );
        
    } public void Luffy(){
        System.out.println("Luffy"
                + "\nHealth: " + Health2 + "           Element: N/A"
                + "\nPhysical: " + HighDMG2 + "         Magic: N/A");
        
    } 
    public void Saitama(){
        System.out.println("Saitama"
                + "\nHealth: " + Health4 + "            Element: N/A"
                + "\nPhysical: " + HighDMG4 + "         Magic: N/A" );
        
    }
    public void Sailor_Neptune(){
        System.out.println("Sailor Neptune"
                + "\nHealth: " + Health4 + "             Element: " + E1
                + "\nPhysical: " + LowDMG4 + "           Magic: " + HighDMG4);
        
    }
   public void Rimuru(){
        System.out.println("Rimuru Tempest"
                + "\nHealth: " + Health5 + "             Element: Wind"
                + "\nPhysical: " + HighDMG5 + "          Magic: " + HighDMG5 );
        
    }
  

    
}
