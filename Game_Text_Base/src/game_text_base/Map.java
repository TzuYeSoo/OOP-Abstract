
package game_text_base;


public class Map extends Enemy implements Door_Switch{
    
    private int Map1;
    private int Map2;
    private int Map3;
    private int Map4;
    private int Map5;
         
    public void setMap1(int map1){
        this.Map1 = map1;
    }
    public int getMap1(){
        return Map1;
    }
    public void setMap2(int map2){
        this.Map2 = map2;
    }
    public int getMap2(){
        return Map2;
    }
    public void setMap3(int map3){
        this.Map3 = map3;
    }
    public int getMap3(){
        return Map3;
    }
    public void setMap4(int map4){
        this.Map4 = map4;
    }
    public int getMap4(){
        return Map4;
    }
    public void setMap5(int map5){
        this.Map5 = map5;
    }
    public int getMap5(){
        return Map5;
    }
    //enemy doors
    public void door1(){
       
        if(Map1 == 1){
            
            Shinsui();
            
        }else if(Map1 == 2){
         
            Yuno();
        }
    }
    public void door2(){
        
        if(Map2 == 1){
            
            Luffy();
            
        }else if(Map2 == 2){
           
            Pica();
        }
    }
    public void door3(){
        
        if(Map3 == 1){
            Wendy();
        }else if(Map3 == 2){
            Ace();
        }
    }
    public void door4(){
        
        if(Map4 == 1){
            
            Sailor_Neptune();
            
        }else if(Map4 == 2){
            Saitama();
        }
    }public void door5(){
        
        if(Map5 == 1){
            
            Sailor();
            
        }else if(Map5 == 2){
            Rimuru();
            
        }
    }
    
}
