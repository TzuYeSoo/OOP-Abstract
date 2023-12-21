/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package government_agency;


public class Birth {
    
    // child info
    private String Fname;//
    private String Lname;//
    private String Mname;//
    private int Age;//
    private String BP;//
    private String suff;//
    private String BG;//
    private String BD;//
    private char gen;//
    private String City;//
    private String Provi;
    private String Hos;//
    private String TB;//
    private String TBP;//
    private int weigh;
    

    
    public void setFname(String Fname){
        this.Fname = Fname;
    }
    public String getFname(){
        return Fname;
    }
    
    public void setLname(String Lname){
        this.Lname = Lname;
    }
    public void setMname(String Mname){
        this.Mname = Mname;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public void setBP(String BP){
        this.BP = BP;
    }
    public void setHos(String Hos){
        this.Hos = Hos;
    }
     public void setBG(String BG){
        this.BG = BG;
    }
     public void setSuff(String suff){
        this.suff = suff;
    }
    public void setBD(String BD){
        this.BD = BD;
    } 
    public void setgen(char gen){
        this.gen = gen;
    }
    public void setCity(String City){
        this.City = City;
    }
    public void setTBP(String TBP){
        this.TBP = TBP;
    }
    public void setweigh(int weigh){
        this.weigh = weigh;
    }
    public void setprovi(String provi){
        this.Provi = provi;
    }
    public void setTB(String TB){
        this.TB = TB;
    }
    
    
    
     
    public String getLname(){
        return Lname;
    }
     public String getMname(){
        return Mname.substring(0, 1).toUpperCase();
    }
    public int getAge(){
        return Age;
    }
     public String getBP(){
        return BP;
    }
    public String getHos(){
        return Hos;
    }
    public String getBG(){
        return BG;
    }
    public String getsuff(){
        return suff;
    }
    public String setBD(){
        return BD;
    }
    public char getgen(){
        return gen;
    }
    public String getCity(){
        return City;
    }
    public String getTBP(){
        return TBP;
    }
    public int getweigh(){
        return weigh;
    }
     public String getprovi(){
        return Provi;
    }
     public String getTB(){
        return TB;
    }
    
    
   
    
    public void Display(){
        //Child info
        System.out.println("First Name: " + Fname);
        System.out.println("Last Name: " + Lname);
        
        if(suff.equalsIgnoreCase("NA")){
            
        }else{
             System.out.println("Suffix: " + suff ); 
        }
        System.out.println("Middle Name: " + Mname);
        System.out.println("Age: " + Age);
        System.out.println("Birthday: " + BD);
        System.out.println("Sex: " + gen);
        System.out.println("Birth of Place (Province): " + Provi);
        System.out.println("Birth of Place (City/Municipality): " + City);
        System.out.println("Birth of Place(Hospital): " + Hos);
        System.out.println("Type of Birth: " + TB);
        if(TB.equalsIgnoreCase("Single")){
            
        }else{
            System.out.println("Mutiple Birth: " + TBP);
        }
        System.out.println("Weight: " + weigh);
        
    }
}
