

package game_text_base;
import java.util.Random;

public class Enemy_Attack extends Map{
    static Random rn = new Random();
    private int Phys;
    private int magic;
    
    
    public void level1Yuno(){
        int En_att = rn.nextInt(4) + 1;

                if(En_att == 1 && En_att == 4){
                    magic = HighDMG1;
                  System.out.println("Yuno used Wind Lance");
                }else{
                    magic = HighDMG1;
                    System.out.println("Yuno used Wind Sword");
                }
    }
    public void level1Shinsui(){
        int En_att = rn.nextInt(4) + 1;
            
            if(En_att == 1 && En_att == 4){
                magic = HighDMG1;
                System.out.println("Shinsui used Sakura Tornado");
            }else{
                magic = HighDMG1;
                System.out.println("Shinsui used Sakura Slash");
            }
            
        }
    public void level1Luffy(){
        int En_att = rn.nextInt(4) + 1;

                if(En_att == 1 && En_att == 4){
                    Phys = HighDMG2;
                  System.out.println("Luffy use gum gum Bazooka");
                }else{
                    Phys = HighDMG2;
                    System.out.println("Luffy use gatling gun");
                }
    }
    public void level1Pica(){
        int En_att = rn.nextInt(4) + 1;
            
            if(En_att == 1 && En_att == 4){
                Phys = HighDMG2;
                System.out.println("Rock Punch");
            }else{
                Phys = HighDMG2;
                System.out.println("Mega Rock Punch");
            }
            
        }
        public void level1Wendy(){
        int En_att = rn.nextInt(4) + 1;
            
            if(En_att == 1 && En_att == 4){
                magic = HighDMG3;
                System.out.println("Water Dragon");
            }else{
                magic = HighDMG3;
                System.out.println("Water Slash");
            }
        }
            
        public void level1Ace(){
        int En_att = rn.nextInt(4) + 1;
            
            if(En_att == 1 && En_att == 4){
                magic = HighDMG3;
                System.out.println("Fire Punch");
            }else{
                magic = HighDMG3;
                System.out.println("Meteor");
            }
        }
        
        public void level1Neptune(){
        int En_att = rn.nextInt(4) + 1;
            
            if(En_att == 1){
                magic = HighDMG4 + LowDMG2;
                System.out.println("Water Spirit");
            }else{
                magic = HighDMG4;
                System.out.println("Water Dragon");
            }
        }
            
        public void level1Saitama(){
        int En_att = rn.nextInt(4) + 1;
            
            if(En_att == 1 && En_att == 4){
                Phys = HighDMG4;
                System.out.println("Consecutive Serious Punches");
            }else{
                Phys = HighDMG4;
                System.out.println("Serious Pucnh");
            }
        }  
        public void level1Sailor(){
        int En_att = rn.nextInt(10) + 1;
            
            if(En_att == 1){
                magic = HighDMG5;
                System.out.println("Goddess Magic");
            }else{
                magic = HighDMG5;
                System.out.println("Rainbow Luck");
            }
        }
            
        public void level1Rimuru(){
        int En_att = rn.nextInt(10) + 1;
            
            if(En_att == 1){
                Phys = HighDMG5;
                System.out.println("Beelzebub");
            }else{
                Phys = HighDMG5;
                System.out.println("Megido");
            }
        }

    public int getPhys(){
        return Phys;
    }
    public int getMag(){
        return magic;
    }
}
