
package game_text_base;

public class Element_Attack extends Elements implements Element_Skills{
    
    
    
    private static int P1level;
    private static int health = 5;
    
    public void setPlayerLevel(int PlayerLevel){
        this.P1level = PlayerLevel;
        
    }
    public int getPlayerLevel(){
        return P1level;
    }
     public  void waterElement(){
        
        if(P1level == 1){
            System.out.println("1. Punch            2. Bubble"
                           + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 2){
            
             System.out.println("1. Punch            3. Water Slash"
                           + "\n2. Rest             4. Heal " + health);
        }
        else if(P1level == 3){
            
            System.out.println("1. Punch             2. Water Lance"
                           + "\n3. Rest           4. Heal " + health);
        }
        else if(P1level == 4){
            System.out.println("1. Punch             2. Rain Storm"
                           + "\n3. Rest              4. Heal " + health);
        }
        else if(P1level == 5){
            System.out.println("1. Punch             2. Tsunami"
                           + "\n2. Rest          4. Heal " + health);
        }   
     }
      public  void FireElement(){
        
        if(P1level == 1){
            
            System.out.println("1. Punch            2. Fire Ball"
                           + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 2){
            
             System.out.println("1. Punch            2. Fire Slash"
                            + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 3){
            
            System.out.println("1. Punch             2. Fire Lance"
                           + "\n3. Rest           4. Heal " + health);
        }
        else if(P1level == 4){
            System.out.println("1. Punch             2. Lava Storm"
                           + "\n3. Rest           4. Heal " + health);
        }
        else if(P1level == 5){
            System.out.println("1. Punch             2. Hell Flare"
                           + "\n3. Rest              4. Heal " + health);
        }  
     }
       public  void windElement(){
        
        if(P1level == 1){
            
            System.out.println("1. Punch            2. Wind Blow"
                           + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 2){
            
             System.out.println("1. Punch            2. Wind Slash"
                            + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 3){
            
            System.out.println("1. Punch             2. Wind Lance"
                            + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 4){
            System.out.println("1. Punch             2. Wind Storm"
                           + "\n3. Rest              4. Heal " + health);
        }
        else if(P1level == 5){
            System.out.println("1. Punch             2. Wind Domain"
                           + "\n3. Rest              4. Heal " + health);
        }
     }
       public  void earthElement(){
        
        if(P1level == 1){
            
            System.out.println("1. Punch            2. Earth throw"
                           + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 2){
            
             System.out.println("1. Punch            2. Earth Spike"
                            + "\n3. Rest             4. Heal " + health);
        }
        else if(P1level == 3){
            
            System.out.println("1. Punch             2. Earth Lance"
                           + "\n3. Rest              4. Heal " + health);
        }
        else if(P1level == 4){
            System.out.println("1. Punch             2. Earthquake"
                           + "\n3. Rest              4. Heal " + health);
        }
        else if(P1level == 5){
            System.out.println("1. Punch             2. Meteor Shower"
                            + "\n3. Rest             4. Heal " + health);
        }
     }
   public void setheal(int heal) {
       this.health = heal;
   }
    public int getheal(){
        return health;
    }
}
