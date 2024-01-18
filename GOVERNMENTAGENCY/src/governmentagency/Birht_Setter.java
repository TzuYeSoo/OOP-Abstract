package governmentagency;

public class Birht_Setter {
	
    //Birth Key Setter
    
    private static String Bname;
   
    //Mother
    private static String MFname;
    private static String MMname;
    private static String MLname;
    private static String Mocc;
    private static String Mage;
    private static String MCiten;
    private static String MReligion;
    private static String Mprovi;
    private static String MCity;
    private static String MHos;
    
    //Father
    private static String FFname;
    private static String FMname;
    private static String FLname;
    private static String Focc;
    private static String Fage;
    private static String FCiten;
    private static String FReligion;
    private static String Fprovi;
    private static String FCity;
    private static String FHos;
    
    // child info
    private static String Fname;
    private static String Lname;
    private static String Mname;
    private static String BP;
    private static String suff;
    private static String BG;
    private static String BD;
    private static String gen;
    private static String City;
    private static String Provi;
    private static String Hos;
    private static String TB;
    private static String TBP;
    private static String weigh;
    
    
    //child setter & getter
    //setter
    public void setFname(String Fname){
        this.Fname = Fname;
    }
    public void setLname(String Lname){
        this.Lname = Lname;
    }
    public void setMname(String Mname){
        this.Mname = Mname;
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
    public void setgen(String gen){
        this.gen = gen;
    }
    public void setCity(String City){
        this.City = City;
    }
    public void setTBP(String TBP){
        this.TBP = TBP;
    }
    public void setweigh(String weigh){
        this.weigh = weigh;
    }
    public void setprovi(String provi){
        this.Provi = provi;
    }
    public void setTB(String TB){
        this.TB = TB;
    }
    
    
    
     //getter
    public String getFname(){
        return this.Fname;
    }
    public String getLname(){
        return this.Lname;
    }
     public String getMname(){
        return this.Mname;
    }
     public String getBP(){
        return this.BP;
    }
    public String getHos(){
        return this.Hos;
    }
    public String getBG(){
        return this.BG;
    }
    public String getsuff(){
        return this.suff;
    }
    public String getBD(){
        return this.BD;
    }
    public String getgen(){
        return this.gen;
    }
    public String getCity(){
        return this.City;
    }
    public String getTBP(){
        return this.TBP;
    }
    public String getweigh(){
        return this.weigh;
    }
     public String getprovi(){
        return this.Provi;
    }
     public String getTB(){
        return this.TB;
    }
     
     //Mother info
     //setter
    public void setMFname(String MFname){
         this.MFname = MFname;
     }
    public void setMLname(String MLname){
         this.MLname = MLname;
     }
    public void setMMname(String MMname){
         this.MMname = MMname;
     }
    public void setMCite(String Citen){
        this.MCiten = Citen;
    }
    public void setMReligion(String Religion){
         this.MReligion = Religion;
     }
    public void setMoc(String Mocc){
         this.Mocc = Mocc;
     }
    public void setMage(String Mage){
        this.Mage = Mage;
    }
    public void setMCity(String MCity){
        this.MCity = MCity;
    }
    public void setMprovi(String Mprovi){
        this.Mprovi = Mprovi;
    }
    public void setMHos(String MHos){
        this.MHos = MHos;
    }
    
    //getter
    public String getMFname(){
         return this.MFname;
     }
    public String getMLname(){
         return this.MLname;
     }
    public String getMMname(){
         return this.MMname;
     }
    public String getMCite(){
        return this.MCiten;
    }
    public String getReligion(){
         return this.MReligion;
     }
    public String getMocc(){
         return this.Mocc;
     }
    public String getMage(){
        return this.Mage;
    }
    public String getMCity(){
        return this.MCity;
    }
    public String getMprovi(){
        return this.Mprovi;
    }
    public String getMHos(){
        return this.MHos;
    }
    
    //Father info
     //setter
    public void setFFname(String FFname){
         this.FFname = FFname;
     }
    public void setFLname(String FLname){
         this.FLname = FLname;
     }
    public void setFMname(String FMname){
         this.FMname = FMname;
     }
    public void setFCite(String FCiten){
        this.FCiten = FCiten;
    }
    public void setFReligion(String FReligion){
         this.FReligion = FReligion;
     }
    public void setFocc(String Focc){
         this.Focc = Focc;
     }
    public void setFage(String Fage){
        this.Fage = Fage;
    }
    public void setFCity(String FCity){
        this.FCity = FCity;
    }
    public void setFprovi(String Fprovi){
        this.Fprovi = Fprovi;
    }
    public void setFHos(String FHos){
        this.FHos = FHos;
    }
    
    //getter
    public String getFFname(){
         return this.FFname;
     }
    public String getFLname(){
         return this.FLname;
     }
    public String getFMname(){
         return this.FMname;
     }
    public String getFCiten(){
        return this.FCiten;
    }
    public String getFReligion(){
         return this.FReligion;
     }
    public String getFocc(){
         return this.Focc;
     }
    public String getFage(){
        return this.Fage;
    }
    public String getFCity(){
        return this.FCity;
    }
    public String getFprovi(){
        return this.Fprovi;
    }
    public String getFHos(){
        return this.FHos;
    }
    
    
    //Birth key setter
    
    public void setBirthStoreKey(String Bname){
    	this.Bname = Bname;
    }
    public String getBirthStoreKey() {
    	return Bname;
    }

}