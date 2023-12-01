package game_text_base;

import java.util.*;
public class Game_Text_Base extends Enemy{
    
    static Player P1 = new Player();
    static Map map = new Map();
    static Element_Attack magicatt = new Element_Attack();
    static Enemy enm = new Enemy();
    static Enemy_Attack EnemyD = new Enemy_Attack();
    static Scanner scn = new Scanner(System.in);
    static int Playerlevel = 1;
    static char play;
    
    public static void main(String[] args) {
       
        
        
        
        System.out.print("Enter Your Name: ");
        String P1name = scn.next();
        P1.setP1Name(P1name);
        magicatt.setPlayerLevel(1);
        P1.setPlayerLevel(1);

        
        System.out.println("Press 1-4 to choose your Element: "
                + "\n1-fire"
                + "\n2-earth"
                + "\n3-water"
                + "\n4-wind");
        int MagicType = scn.nextInt();
        
        if(MagicType == 1){
            P1.setTypeMagic("fire");
        }
        else if(MagicType == 2){
            P1.setTypeMagic("earth");
        }
        else if(MagicType == 3){
            P1.setTypeMagic("water");  
        }
        else if(MagicType == 4){
            P1.setTypeMagic("wind");   
        }       
        
        System.out.println("Press 1-2 to select your game mode"
                + "\n1-Story"
                + "\n2-Survival : ");
        int gmode = scn.nextInt();
        
        if(gmode == 1){
            System.out.println(P1.getP1Name() + " is wondering around and find a creepy looking dungeon"
                    + "\nhe enters the creepy looking dungeon and got face with two doors"
                    + "\nhe tries to escape but fail to do so because a magical forces field is blocking the door"
                    + "\nNow he got stuck in this dungeon, can you help him escape. ");
            
        }else if(gmode == 2){
        
            do{
        System.out.print("Press P to start playing, " + P1.getP1Name() + ". ");
        play = scn.next().toUpperCase().charAt(0);
        
       
          
            }while(play != 'P');
        
                System.out.println("You have now Enter the Dungeon of Anime Verse"
                + "\nIn front of you is two mytical door."
                + "\nEach door have some unique enemy for you to fight."
                + "\nChoose wisely on what door you want to open.");
        
        Dooropt();
        
        while(true){
            
            if(P1.gethealth1() != 0 && enm.getHealth1() != 0){
            map.door1();
            System.out.println("------------------------------------------");
            PlayerStats1();
            System.out.println("------------------------------------------");
            PlayerAttack();
            System.out.println("------------------------------------------");
            attack1();
            En_att();
            System.out.println("------------------------------------------");
            }else if(P1.gethealth1() <= 0){
                System.out.println(P1.getP1Name() + " Lost the game");
                System.exit(0);
            }else if(enm.getHealth1() <= 0 ){
                System.out.println(P1.getP1Name() + " deffeted the first level");
                break;
            }  
        }
        Playerlevel++;
        magicatt.setPlayerLevel(2);
        P1.setPlayerLevel(2);
        enm.setPlayerEn(2);
        
        
        System.out.println("You've enter the second level of the dungeon you "
                + "\nagain have two doors in front of you");
        
        Dooropt();
        
         while(true){
            
            if(P1.gethealth2() != 0 && enm.getHealth2() != 0){
            map.door2();
            System.out.println("------------------------------------------");
            PlayerStats2();
            System.out.println("------------------------------------------");
            PlayerAttack();
            System.out.println("------------------------------------------");
            attack2();
            En_att();
            System.out.println("------------------------------------------");
            }else if(P1.gethealth2() <= 0){
                System.out.println(P1.getP1Name() + " Lost the game");
                System.exit(0);
            }else if(enm.getHealth2() <= 0){
                System.out.println(P1.getP1Name() + " deffeted the second level");
                break;
            }
         }
         
        Playerlevel++;
        magicatt.setPlayerLevel(3);
        P1.setPlayerLevel(3);
        enm.setPlayerEn(3);
        
         System.out.println("You've enter the third level of the dungeon you "
                + "\nagain have two doors in front of you");
        
        Dooropt();
        
        while(true){
            
            if(P1.gethealth3() != 0 && enm.getHealth3() != 0){
            map.door3();
            System.out.println("------------------------------------------");
            PlayerStats3();
            System.out.println("------------------------------------------");
            PlayerAttack();
            System.out.println("------------------------------------------");
            attack3();
            En_att();
            System.out.println("------------------------------------------");
            }else if(P1.gethealth3() <= 0){
                System.out.println(P1.getP1Name() + " Lost the game");
                System.exit(0);
            }else if(enm.getHealth3() <= 0){
                System.out.println(P1.getP1Name() + " deffeted the third level");
                break;
            }
         }
        
        Playerlevel++;
        magicatt.setPlayerLevel(4);
        P1.setPlayerLevel(4);
        enm.setPlayerEn(4);
        
         System.out.println("You've enter the fourth level of the dungeon you "
                + "\nagain have two doors in front of you");
        
        Dooropt();
        
        while(true){
            
            
            
            if(P1.gethealth4() != 0 && enm.getHealth4() != 0){
            map.door4();
            System.out.println("------------------------------------------");
            PlayerStats4();
            System.out.println("------------------------------------------");
            PlayerAttack();
            System.out.println("------------------------------------------");
            attack4();
            En_att();
            System.out.println("------------------------------------------");
            
            if(P1.gethealth4() <= 0){
                
                System.out.println(P1.getP1Name() + " Lost the game");
                System.exit(0);
            }else if(enm.getHealth4() <= 0){
                System.out.println(P1.getP1Name() + " deffeted the Fourth level");
                break;
                }    
            }
         }
        
        Playerlevel++;
        magicatt.setPlayerLevel(5);
        P1.setPlayerLevel(5);
        enm.setPlayerEn(5);
        
         System.out.println("You've enter the Last level of the dungeon you "
                + "\nagain have two doors in front of you");
        
        Dooropt();
        
        while(true){
            
            
            if(P1.gethealth5() <= 0){
                System.out.println(P1.getP1Name() + " Lost the game");
                System.exit(0);
            }else if(enm.getHealth5() <= 0){
                System.out.println(P1.getP1Name() + " deffeted the Fifth level");
                System.out.println("------------------------------------------");
                System.out.println("You Have won the Game and Gain a trophy");
                break;
            }
            
            if(P1.gethealth5() > 0 && enm.getHealth5() > 0){
            map.door5();
            System.out.println("------------------------------------------");
            PlayerStats5();
            System.out.println("------------------------------------------");
            PlayerAttack();
            System.out.println("------------------------------------------");
            attack5();
            En_att();
            System.out.println("------------------------------------------");
            
         }
        
            }
        }
    }
    public static void Dooropt(){
        
        if(P1.getPlayerLevel() == 1){
        
            System.out.println("------------------------------------------");
            System.out.print("Press 1-2 to open a door: ");
            int LorR1 = scn.nextInt();
            map.setMap1(LorR1);
            System.out.println("Player " + P1.getP1Name() + " choose door " + map.getMap1());
            System.out.println("------------------------------------------");
        }
        else if(P1.getPlayerLevel() == 2){
            
            System.out.println("------------------------------------------");
            System.out.print("Press 1-2 to open a door: ");
            int LorR2 = scn.nextInt();
            map.setMap2(LorR2);
            System.out.println("Player " + P1.getP1Name() + " choose door " + map.getMap2());
            System.out.println("------------------------------------------");
        }
        else if(P1.getPlayerLevel() == 3){
            System.out.println("------------------------------------------");
            System.out.print("Press 1-2 to open a door: ");
            int LorR3 = scn.nextInt();
            map.setMap3(LorR3);
            System.out.println("Player " + P1.getP1Name() + " choose door " + map.getMap3());
            System.out.println("------------------------------------------");
        }
        else if(P1.getPlayerLevel() == 4){
        
            System.out.println("------------------------------------------");
            System.out.print("Press 1-2 to open a door: ");
            int LorR4 = scn.nextInt();
            map.setMap4(LorR4);
            System.out.println("Player " + P1.getP1Name() + " choose door " + map.getMap4());
            System.out.println("------------------------------------------");
        
        }
        else if(P1.getPlayerLevel() == 5){
            
            System.out.println("------------------------------------------");
            System.out.print("Press 1-2 to open a door: ");
            int LorR5 = scn.nextInt();
            map.setMap5(LorR5);
            System.out.println("Player " + P1.getP1Name() + " choose door " + map.getMap5());
            System.out.println("------------------------------------------");
        }
    }
    public static void PlayerStats1(){
         
              System.out.println(P1.getP1Name() + " Stats:"
                + "\nHealth: " + P1.gethealth1()
                + "\nMana: " + P1.getMana1() + "          Element: " + P1.getTypeMagic()
                + "\nPhysical: " + P1.getPhysical1() + "          Magic: " + P1.getmagic());  
                 
        }
    public static void PlayerStats2(){
         
              System.out.println(P1.getP1Name() + " Stats:"
                + "\nHealth: " + P1.gethealth2()
                + "\nMana: " + P1.getMana2() + "          Element: " + P1.getTypeMagic()
                + "\nPhysical: " + P1.getPhysical2() + "          Magic: " + P1.getmagic());  
                 
    }
    public static void PlayerStats3(){
         
              System.out.println(P1.getP1Name() + " Stats:"
                + "\nHealth: " + P1.gethealth3()
                + "\nMana: " + P1.getMana3() + "          Element: " + P1.getTypeMagic()
                + "\nPhysical: " + P1.getPhysical3() + "          Magic: " + P1.getmagic());  
                 
    } 
    public static void PlayerStats4(){
         
              System.out.println(P1.getP1Name() + " Stats:"
                + "\nHealth: " + P1.gethealth4()
                + "\nMana: " + P1.getMana4() + "          Element: " + P1.getTypeMagic()
                + "\nPhysical: " + P1.getPhysical4() + "          Magic: " + P1.getmagic());  
                 
    }
    public static void PlayerStats5(){
         
              System.out.println(P1.getP1Name() + " Stats:"
                + "\nHealth: " + P1.gethealth5()
                + "\nMana: " + P1.getMana5() + "          Element: " + P1.getTypeMagic()
                + "\nPhysical: " + P1.getPhysical5() + "          Magic: " + P1.getmagic());  
                 
    }
    public static void attack1(){
         
        System.out.print("Choose Your Attack: ");
         int Attop1 = scn.nextInt();
        
         if(Attop1 == 1){
             System.out.println(P1.getP1Name() + " use punch");
             enm.setHealth1(enm.getHealth1() - P1.getPhysical1());
         }else if(Attop1 == 2){
             
             if(P1.getMana1() != 0){
                if(P1.getTypeMagic().equalsIgnoreCase("water")){
                    
                    P1.setMana1(P1.getMana1() - 1);
                    System.out.println("use " + P1.getTypeMagic() + " attaack");
                    System.out.println("Effective Attack");
                    
                    enm.setHealth1(enm.getHealth1() - (P1.getmagic() * 2));
                }else if(P1.getTypeMagic().equals("earth")){
                    
                    P1.setMana1(P1.getMana1() - 1);
                    System.out.println("use " + P1.getTypeMagic() + " attaack");
                    System.out.println("Uneffective Attack");
                    
                    enm.setHealth1(enm.getHealth1() - (P1.getmagic() / 2));
                }else{
                    
                    P1.setMana1(P1.getMana1() - 1);
                    System.out.println("use " + P1.getTypeMagic() + " attaack");
                    
                    enm.setHealth1(enm.getHealth1() - P1.getmagic());
                    }
                }else{
                 System.out.println("Out of Mana you lose a turn");
             }
             
         }else if(Attop1 == 3){
             
             System.out.println(P1.getP1Name() + "use rest and recover mana");
             if(P1.getMana1() != 0 && P1.getMana1() < 5){
                 
                 int mana = (P1.getMana1() + 5) - P1.getPmana1();
                 P1.setMana1(P1.getMana1() + 5 - mana); 
             }else{
                 System.out.println(P1.getP1Name() + "Mana is already full, lose a turn. ");
             }
         }else if(Attop1 == 4){
             
             System.out.println(P1.getP1Name() + "use heal and recover health");
            
             if(P1.gethealth1() != 0 && P1.gethealth1() < 20){
                 
                 magicatt.setheal(magicatt.getheal() - 1);
                 int heal = (P1.gethealth1() + 10) - P1.getPhealth1();
                 P1.sethealth1(P1.gethealth1() + 10 - heal); 
                 
             }else{
                 System.out.println(P1.getP1Name() + "Health is already full, lose a turn. ");
             }
             
         }   
    }
    public static void attack2(){
        magicatt.setheal(5); 
        System.out.print("Choose Your Attack: ");
         int Attop1 = scn.nextInt();
         
        
         if(Attop1 == 1){
             System.out.println(P1.getP1Name() + " use punch");
             enm.setHealth1(enm.getHealth2() - P1.getPhysical2());
         }else if(Attop1 == 2){
             
             if(P1.getMana2() != 0){
                if(P1.getTypeMagic().equalsIgnoreCase("water")){
                    
                    P1.setMana2(P1.getMana2() - 2);
                    System.out.println("use " + P1.getTypeMagic() + " attaack");
                    System.out.println("Effective Attack");
                    
                    enm.setHealth2(enm.getHealth2() - (P1.getmagic() * 2));
                }else if(P1.getTypeMagic().equals("earth")){
                    
                    P1.setMana2(P1.getMana1() - 2);
                    System.out.println("use " + P1.getTypeMagic() + " attaack");
                    System.out.println("Enemy have earth resistance");
                    System.out.println(P1.getP1Name() + " did 0 damage");
                    
                }else{
                    
                    P1.setMana2(P1.getMana2() - 1);
                    System.out.println("use " + P1.getTypeMagic() + " attaack");
                    
                    enm.setHealth2(enm.getHealth2() - P1.getmagic());
                    }
                }else{
                 System.out.println("Out of Mana you lose a turn");
             }
             
         }else if(Attop1 == 3){
             
             System.out.println(P1.getP1Name() + "use rest and recover mana");
             if(P1.getMana2() != 0 && P1.getMana2() < 10){
                 
                 int mana = (P1.getMana2() + 10) - P1.getPmana2();
                 P1.setMana2(P1.getMana2() + 10 - mana); 
             }else{
                 System.out.println(P1.getP1Name() + "Mana is already full, lose a turn. ");
             }
         }else if(Attop1 == 4){
             
             System.out.println(P1.getP1Name() + "use heal and recover health");
             magicatt.setheal(magicatt.getheal() - 1);
             if(P1.gethealth2() != 0 && P1.gethealth2() < 40){
                 
                 int heal = (P1.gethealth2() + 15) - P1.getPhealth2();
                 P1.sethealth2(P1.gethealth2() + 15 - heal); 
             }else{
                 System.out.println(P1.getP1Name() + "Health is already full, lose a turn. ");
             }
             
         }
     }
    public static void attack3(){
        magicatt.setheal(5); 
        System.out.print("Choose Your Attack: ");
         int Attop1 = scn.nextInt();
         
        
         if(Attop1 == 1){
             
             if(map.getMap3() == 1){
                 
                System.out.println(P1.getP1Name() + " use punch");
                enm.setHealth3(enm.getHealth3() - P1.getPhysical3());
             }else if(map.getMap3() == 2){
                 System.out.println(P1.getP1Name() + " use puch"
                         + "\ndid 0 damage (Can't use physial on a logia user)");
                 
             }
         }else if(Attop1 == 2){
             if(map.getMap3() == 1){

                if(P1.getMana3() != 0){
                    if(P1.getTypeMagic().equalsIgnoreCase("water")){
                    
                    
                        System.out.println("use " + P1.getTypeMagic() + " attaack");
                        System.out.println("did 0 damage");
                    
                    }else if(P1.getTypeMagic().equals("earth")){
                    
                        P1.setMana3(P1.getMana3() - 2);
                        System.out.println("use " + P1.getTypeMagic() + " attaack");
                        System.out.println("Effective attack");
                        enm.setHealth3(enm.getHealth3() - (P1.getmagic() * 2));;
                    
                    }else{
                    
                        P1.setMana3(P1.getMana3() - 2);
                        System.out.println("use " + P1.getTypeMagic() + " attack");
                    
                        enm.setHealth3(enm.getHealth3() - P1.getmagic());
                    }
                }else{
                 System.out.println("Out of Mana you lose a turn");
                }
             }else if(map.getMap3() == 2){
                  if(P1.getMana3() != 0){
                    if(P1.getTypeMagic().equalsIgnoreCase("water")){
                    
                    
                        System.out.println("use " + P1.getTypeMagic() + " attack");
                        System.out.println("Effective Attack");
                        enm.setHealth3(enm.getHealth3() - (P1.getmagic() * 2));
                    }else if(P1.getTypeMagic().equals("fire")){
                    
                        System.out.println(P1.getP1Name() + " did 0 damange");
                    
                    }else{
                    
                        P1.setMana3(P1.getMana2() - 2);
                        System.out.println("use " + P1.getTypeMagic() + " attack");
                    
                        enm.setHealth3(enm.getHealth3() - P1.getmagic());
                    }
                }else{
                 System.out.println("Out of Mana you lose a turn");
                }
             }
         }else if(Attop1 == 3){
             
             System.out.println(P1.getP1Name() + "use rest and recover mana");
             if(P1.getMana3() != 0 && P1.getMana3() < 13){
                 
                 int mana = (P1.getMana3() + 13) - P1.getPmana3();
                 P1.setMana3(P1.getMana3() + 13 - mana); 
             }else{
                 System.out.println(P1.getP1Name() + "Mana is already full, lose a turn. ");
             }
         }else if(Attop1 == 4){
             
             System.out.println(P1.getP1Name() + "use heal and recover health");
             magicatt.setheal(magicatt.getheal() - 1);
             if(P1.gethealth3() != 0 && P1.gethealth3() < 60){
                 
                 int heal = (P1.gethealth3() + 20) - P1.getPhealth3();
                 P1.sethealth3(P1.gethealth3() + 20 - heal); 
             }else{
                 System.out.println(P1.getP1Name() + "Health is already full, lose a turn. ");
             }
             
         }
     }
    public static void attack4(){
        magicatt.setheal(5); 
        System.out.print("Choose Your Attack: ");
        int Attop1 = scn.nextInt();
         
        
         if(Attop1 == 1){
             
             if(map.getMap4() == 1){
                 
                System.out.println(P1.getP1Name() + " use punch");
                enm.setHealth4(enm.getHealth4() - P1.getPhysical4());
             }else if(map.getMap4() == 2){
                 System.out.println(P1.getP1Name() + " use puch did 0 damage");
                 
             }
         }else if(Attop1 == 2){
             if(map.getMap4() == 1){

                if(P1.getMana4() != 0){
                    
                        P1.setMana4(P1.getMana4() - 4);
                        if(P1.getTypeMagic().equalsIgnoreCase("water")){
                    
                        System.out.println("use " + P1.getTypeMagic() + " attaack");
                        System.out.println("did 0 damage");
                    
                    }else if(P1.getTypeMagic().equals("earth")){
                    
                        P1.setMana4(P1.getMana4() - 4);
                        System.out.println("use " + P1.getTypeMagic() + " attack");
                        System.out.println("Effective attack");
                        enm.setHealth4(enm.getHealth4() - (P1.getmagic() * 2));;
                    
                    }else{
                    
                        P1.setMana4(P1.getMana4() - 4);
                        System.out.println("use " + P1.getTypeMagic() + " attack");
                    
                        enm.setHealth4(enm.getHealth4() - P1.getmagic());
                    }
                }else{
                 System.out.println("Out of Mana you lose a turn");
                }
             }else if(map.getMap4() == 2){
                 
                 enm.setHealth4(enm.getHealth4() - P1.getmagic());
             }
         }else if(Attop1 == 3){
             
             System.out.println(P1.getP1Name() + "use rest and recover mana");
             if(P1.getMana4() != 0 && P1.getMana4() < 20){
                 
                 int mana = (P1.getMana4() + 20) - P1.getPmana4();
                 P1.setMana4(P1.getMana4() + 20 - mana); 
             }else{
                 System.out.println(P1.getP1Name() + "Mana is already full, lose a turn. ");
             }
         }else if(Attop1 == 4){
             
             System.out.println(P1.getP1Name() + "use heal and recover health");
             magicatt.setheal(magicatt.getheal() - 1);
             if(P1.gethealth4() != 0 && P1.gethealth4() < 80){
                 
                 int heal = (P1.gethealth4() + 80) - P1.getPhealth4();
                 P1.sethealth4(P1.gethealth4() + 80 - heal); 
             }else{
                 System.out.println(P1.getP1Name() + "Health is already full, lose a turn. ");
             }
             
         }
     }
    public static void attack5(){
        magicatt.setheal(5); 
        System.out.print("Choose Your Attack: ");
        int Attop1 = scn.nextInt();
         
        
         if(Attop1 == 1){
             
             if(map.getMap5() == 1){
                 
                System.out.println(P1.getP1Name() + " use punch");
                enm.setHealth5(enm.getHealth5() - (P1.getPhysical5() * 2));
             }else if(map.getMap5() == 2){
                 System.out.println(P1.getP1Name() + " use puch did 0 damage");
                 
             }
         }else if(Attop1 == 2){
             if(map.getMap5() == 1){
   
                System.out.println("did 0 damage");
                        
             }else if(map.getMap5() == 2){
                 
                 P1.setMana5(P1.getMana5() - 5);
                 enm.setHealth5(enm.getHealth5() - P1.getmagic());
             }
         }else if(Attop1 == 3){
             
             System.out.println(P1.getP1Name() + "use rest and recover mana");
             if(P1.getMana5() != 0 && P1.getMana5() < 25){
                 
                 int mana = (P1.getMana5() + 25) - P1.getPmana5();
                 P1.setMana5(P1.getMana5() + 25 - mana); 
             }else{
                 System.out.println(P1.getP1Name() + "Mana is already full, lose a turn. ");
             }
         }else if(Attop1 == 4){
             
             System.out.println(P1.getP1Name() + "use heal and recover health");
             magicatt.setheal(magicatt.getheal() - 1);
             if(P1.gethealth5() != 0 && P1.gethealth5() < 100){
                 
                 int heal = (P1.gethealth5() + 100) - P1.getPhealth5();
                 P1.sethealth5(P1.gethealth5() + 100 - heal); 
             }else{
                 System.out.println(P1.getP1Name() + "Health is already full, lose a turn. ");
             }
             
         }
     } 
     public static void PlayerAttack(){
        
        if(P1.getTypeMagic().equals("wind")){
            
            magicatt.windElement();
            
        }else if(P1.getTypeMagic().equals("fire")){
            
            magicatt.FireElement();
            
        }else if(P1.getTypeMagic().equals("water")){
            
            magicatt.waterElement();
                    
        }else if(P1.getTypeMagic().equals("earth")){
            
            magicatt.earthElement();           
        }
    }
     public static void En_att(){
        
         if(P1.getPlayerLevel() == 1){
             
            if(map.getMap1() == 1){
                EnemyD.level1Shinsui();
                P1.sethealth1(P1.gethealth1() - EnemyD.getMag());
            }else{
                EnemyD.level1Yuno();
                P1.sethealth1(P1.gethealth1() - EnemyD.getMag()); 
            }
            
            
        }else if(P1.getPlayerLevel() == 2){
            
            if(map.getMap2() == 1){
            EnemyD.level1Luffy();
            P1.sethealth2(P1.gethealth2() - EnemyD.getPhys());
            
            }else{
                
            EnemyD.level1Pica();
            P1.sethealth2(P1.gethealth2() - EnemyD.getPhys()); 
            }
            
            
        }else if(P1.getPlayerLevel() == 3){
            
            if(map.getMap3() == 1){
            EnemyD.level1Wendy();
            P1.sethealth3(P1.gethealth3() - EnemyD.getMag());
            
            }else{
                
            EnemyD.level1Ace();
            P1.sethealth3(P1.gethealth3() - EnemyD.getMag()); 
            }
            
        }else if(P1.getPlayerLevel() == 4){
            
            if(map.getMap4() == 1){
            EnemyD.level1Neptune();
            P1.sethealth4(P1.gethealth4() - EnemyD.getMag());
            
            }else{
                
            EnemyD.level1Saitama();            
            P1.sethealth4(P1.gethealth4() - EnemyD.getPhys()); 
            }
            
        }else if(P1.getPlayerLevel() == 5){
            
            if(map.getMap5() == 1){
            EnemyD.level1Sailor();
            P1.sethealth5(P1.gethealth5() - EnemyD.getMag());
            
            }else{
                
            EnemyD.level1Rimuru();            
            P1.sethealth5(P1.gethealth5() - EnemyD.getPhys()); 
            }
            
        }  
    }
}
