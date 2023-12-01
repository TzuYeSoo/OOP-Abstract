
package game_text_base;


public class Player extends Elements{
    
    private String P1Name;
    private String typemagic;
    private static int magic;
    private static int P1Level;
    
    private static int health1 = 20;
    private static int health2 = 40;
    private static int health3 = 60;
    private static int health4 = 80;
    private static int health5 = 100;
    
    private static int physical1 = 5;
    private static int physical2 = 10;
    private static int physical3 = 15;
    private static int physical4 = 20;
    private static int physical5 = 25;
    
    private static int mana1 = 5;
    private static int mana2 = 10;
    private static int mana3 = 13;
    private static int mana4 = 20;
    private static int mana5 = 25;
    
    
    public void setPlayerLevel(int P1Level){
        this.P1Level = P1Level;
    }
    public int getPlayerLevel(){
        return P1Level;
    }
    
    public void setP1Name(String name){
        this.P1Name = name;
    }
    public String getP1Name(){
        return P1Name;
    }
    public void setTypeMagic(String Magic){
        this.typemagic = Magic;
    }
    public String getTypeMagic(){
        return typemagic;
    }
    //Health Changer per level
    public void sethealth1(int Health1){
        
        this.health1 = Health1;
        
    }   
    public int gethealth1(){ 
        
        return health1;
        
    }
    public void sethealth2(int Health2){
        
        this.health2 = Health2;
        
    }   
    public int gethealth2(){ 
        
        return health2;
        
    }
    public void sethealth3(int Health3){
        
        this.health3 = Health3;
    }   
    public int gethealth3(){ 
        
        return health3;
        
    }
    public void sethealth4(int Health4){
        
        this.health4 = Health4;
    }   
    public int gethealth4(){ 
        
        return health4;        
        
    }
    public void sethealth5(int Health5){
        
        this.health5 = Health5;
    }   
    public int gethealth5(){ 
        
        return health5;
    }
    
    
    
    // Mana Changer per leve;
    
    public void setMana1(int mana1){
        this.mana1 = mana1;
    }
    public int getMana1(){
        return mana1;
    }
    public void setMana2(int mana2){
        this.mana2 = mana2;
    }
    public int getMana2(){
        return mana2;
    }
    public void setMana3(int mana3){
        this.mana3 = mana3;
    }
    public int getMana3(){
        return mana3;
    }public void setMana4(int mana4){
        this.mana4 = mana4;
    }
    public int getMana4(){
        return mana4;
    }
    public void setMana5(int mana5){
        this.mana5 = mana5;
    }
    public int getMana5(){
        return mana5;
    }
    
    
    //Physical per level
    public int getPhysical1(){
        return physical1;
    }   
     public int getPhysical2(){
        return physical2;
    }   
   
     public int getPhysical3(){
        return physical3;
    }   
   
     public int getPhysical4(){
        return physical4;
    }   
    
     public int getPhysical5(){
        return physical5;
    }   
  
    

    public int getmagic(){
        
        if(typemagic.equalsIgnoreCase("wind")){
            
            if(P1Level == 1){
              magic = wind1;  
            }
            if(P1Level == 2){
              magic = wind2;  
            }
            if(P1Level == 3){
              magic = wind3;  
            }
            if(P1Level == 4){
              magic = wind4;  
            }
            if(P1Level == 5){
              magic = wind5;  
            }
             
        }
        else if(typemagic.equalsIgnoreCase("water")){
            
            if(P1Level == 1){
              magic = water1;  
            }
            if(P1Level == 2){
              magic = water2;  
            }
            if(P1Level == 3){
              magic = water3;  
            }
            if(P1Level == 4){
              magic = water4;  
            }
            if(P1Level == 5){
              magic = water5;  
            }
        }
        else if(typemagic.equalsIgnoreCase("fire")){
           
            if(P1Level == 1){
              magic = fire1;  
            }
            if(P1Level == 2){
              magic = fire2;  
            }
            if(P1Level == 3){
              magic = fire3;  
            }
            if(P1Level == 4){
              magic = fire4;  
            }
            if(P1Level == 5){
              magic = fire5;  
            }
        }
        else if(typemagic.equalsIgnoreCase("earth")){
            
            if(P1Level == 1){
              magic = earth1;  
            }
            if(P1Level == 2){
              magic = earth2;  
            }
            if(P1Level == 3){
              magic = earth3;  
            }
            if(P1Level == 4){
              magic = earth4;  
            }
            if(P1Level == 5){
              magic = earth5;  
            }
        }
        
        return magic;
    // constant health    
    }
    public int getPhealth1(){
        return phealth1;
    }
    public int getPhealth2(){
        return phealth2;
    }
    public int getPhealth3(){
        return phealth3;
    }public int getPhealth4(){
        return phealth4;
    }
    public int getPhealth5(){
        return phealth5;
    }
    // constant mana
    public int getPmana1(){
        return pmana1;
    }
    public int getPmana2(){
        return pmana2;
    }
    public int getPmana3(){
        return pmana3;
    }
    public int getPmana4(){
        return pmana4;
    }
    public int getPmana5(){
        return pmana5;
    }
    
    
    
    
  
    
}
