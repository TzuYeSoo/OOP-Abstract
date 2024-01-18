package governmentagency;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class GOVERNMENTAGENCY {
	
        Marriage_Setter Marriage = new Marriage_Setter();
        
        public HashMap <String, String> Marriage_Storage = new HashMap <String, String>();
        public HashMap <String, String> Cenomar_Storage = new HashMap <String, String>();
        
        String SMName;
        Queue<String> MS = new LinkedList();
        //Accounts
        //Semi
        static String SALogin = "Jessie@gmail.com";
        static String PASSLogin = "SUBINAdmin";
        //Birth Code Number
            
            static LinkedHashMap <Object, String>Birth_Code = new LinkedHashMap();
            static int BCode_Num = 660001;
            static LinkedHashMap <Object, String>Birth_ACode = new LinkedHashMap();
	//Child Fill up form

	//Mother
            static String MFname;
	    static String MMname;
	    static String MLname;
	    static String Mocc;
	    static String Mage;
	    static String MCiten;
	    static String MReligion;
	    static String Mprovi;
	    static String MCity;
	    static String MHos;
	    
	//Father 
	    static String FFname;
	    static String FMname;
	    static String FLname;
	    static String Focc;
	    static String Fage;
	    static String FCiten;
	    static String FReligion;
	    static String Fprovi;
	    static String FCity;
	    static String FHos;
	    
	//Child
	    static String Fname;
	    static String Lname;
	    static String Mname;
	    static String BP;
	    static String suff;
	    static String BG;
	    static String BD;
	    static String gen;
	    static String City;
	    static String Provi;
	    static String Hos;
	    static String TB;
	    static String TBP;
	    static String weigh;
            
            // Child Request Copy
            //child
            static String CFName, CMName, CLName, CBD;
            //mother
            static String MFNAME, MMNAME, MLNAME, MAGE;
            //father
            static String FFNAME, FMNAME, FLNAME, FAGE;
            //
            static String BirthNavi = "1";
	    
//Child Edit Needs
	    static LinkedHashMap <String, String> Birth_Ques = new LinkedHashMap();
	    static String CoE;
	    static Birht_Setter B = new Birht_Setter();
	    
//Child HashMaps Storages
	    public static LinkedHashMap <String, String>BStore  = new LinkedHashMap();
	    //public static Queue <String> BS = new LinkedList();
	    private static String Name;
	    private static int Navi = 1;
	    private static LinkedHashMap <String, String> Admin_BStore = new LinkedHashMap();
            static LinkedHashMap <Object, String> Birth_Request = new LinkedHashMap();
            static LinkedHashMap <String, String> Deleted_Birth = new LinkedHashMap();
            
            //R Questions HashMap
	    
	    
	    
//Loops Boolean	    
	    static boolean MainLoop = true, RF = true, BDML = true, YN = true;
            static String PE, PD, PYN, CE,BFill, RYN, YorN, NoC, AlCode, Edit_Name, YoN, AdminPurp;
	    
	    
	static Scanner scn = new Scanner(System.in);

	
	public static void main (String[]args) throws InterruptedException, IOException {
            
		
			Birth_Question();
			
			do {
		         System.out.println("\n\t\t\t=============================================================================================================================");

		        System.out.print("\t\t\t\t\t\t\t  ________  ____  ____  _______   __    _____  ___  \n" +
		"\t\t\t\t\t\t\t /\"       )(\"  _||_ \" ||   _  \"\\ |\" \\  (\\\"   \\|\"  \\  \n" +
		"\t\t\t\t\t\t\t(:   \\___/ |   (  ) : |(. |_)  :)||  | |.\\\\   \\    | \n" +
		"\t\t\t\t\t\t\t \\___  \\   (:  |  | . )|:     \\/ |:  | |: \\.   \\\\  | \n" +
		"\t\t\t\t\t\t\t  __/  \\\\   \\\\ \\__/ // (|  _  \\\\ |.  | |.  \\    \\. | \n" +
		"\t\t\t\t\t\t\t /\" \\   :)  /\\\\ __ //\\ |: |_)  :)/\\  |\\|    \\    \\ | \n" +
		"\t\t\t\t\t\t\t(_______/  (__________)(_______/(__\\_|_)\\___|\\____\\) \n" +
		"\t\t\t\t\t\t\t                                                     \n" +
		"\t\t\t\t\t\t\t "
		                + "\t[A] Main Admin"
		                + "\t[S] Semi Admin "
		                + "\t[G] Guest: ");
		        String Purpose = scn.next().toUpperCase();
		        
		        switch(Purpose) {
		        case "A":
		        	MainAdmin();
		        	break;
		        case "S":
                                Semi_Admin_Login();
		       
		        	break;
		        case "G":
		        	do {
		        	   System.out.println();
		               System.out.print("\t\t\t------------------------------------------------------------------------------------------------------------------------"
		                       + "\n\t\t\t\t\t\t\t\t\t\tGovernment Agency"
		                       + "\n\t\t\t\t\t\t\t\t\t\t[F] Fill Up Form"
		                       + "\n\t\t\t\t\t\t\t\t\t\t[R] Request Copy"
		                       + "\n\t\t\t\t\t\t\t\t\t\t: ");
		               
		               String Purp = scn.next().toUpperCase();
		               System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
		               			
		               switch(Purp) {
		               
		               case "F":
		            	   while(BDML == true) {
		            		   
		            	   BDMQuestions();
		            	   String BDM = scn.next().toUpperCase();
		            	   
                                   switch(BDM) {
		            	   
		            	   case "B":
		            		   Birth();
                                           B.setBirthStoreKey(B.getFname() + " " + B.getMname() + " " + B.getLname());
                                           Birth_Storage();
            
                                           Birth_Code.put("B" + BCode_Num, B.getBirthStoreKey());
                                           Birth_ACode.put("B" + BCode_Num, "Request");
                    
                                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("\t\t\t\t\t\tThank You for Registering!");
                                            System.out.println("\t\t\t\t\t\tWarning do not show this code to anyone!!!!");
                                            System.out.println("\t\t\t\tHeres your Code Number if you ever wanted the Copy of the certificate: B" + BCode_Num);
                                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");

                                            BCode_Num++;
		            		    BDML = false;
		            		   break;
		            	   case "M":
		            		   
		            		   BDML = false;
		            		   break;   

		            	   		}
		            	   }
                                   BDML = true;
		            	   
		               
		            	   RF = false;
		            	   break;
		               case "R":
		            	   
                                   System.out.print("\t\t\t\t\t\tRequest Copy Options"
                                           + "\n\t\t\t\t\t\t[N] New Request"
                                           + "\n\t\t\t\t\t\t[A] Already Request: ");
                                   String NA = scn.next().toUpperCase();
                                   
                                   switch(NA){
                                       
                                       case "N":
                                           
                                   System.out.print("\t\t\t\t\tEnter the Code Number That have been given to you after your Fill Up Form: ");
                                   BFill = scn.next().toUpperCase();
                                   
                                   if(Birth_Code.containsKey(BFill)){
                                       
                                       if(Birth_ACode.get(BFill) == "Done"){
                                           System.out.print("This Certificate have been Already approve and certificate is ready"
                                                   + "\n\t\t\t\t\tif you want another copy press N, if no press X"
                                                   + "\n\t\t\t\t\t[N] New Coppy"
                                                   + "\n\t\t\t\t\t[X] Exit: ");
                                           String NCopy = scn.next().toUpperCase(); 
                                            
                                           if(NCopy.equals("N")){
                                               BirthSemiAdminQues();
                                           }else if(NCopy.equals("X")){
                                               
                                              MainLoop = true;
                                           }else {
                                               InvalidErrors();
                                           }
                                           
                                       }else if(Birth_ACode.get(BFill) == "Denied"){
                                           System.out.println("\t\t\t\t\tThis Request Have been denied already!!!");
                                           System.out.println("\t\t\t\t\tPlease be more carefull and check your answers before Inputing them");
                                           BirthSemiAdminQues();
                                           break;
                                           
                                       }else if(Birth_ACode.get(BFill) == "Request"){
                                           System.out.println("\t\t\t\t\tThis Data is still waiting to be Approve."
                                                   + "\n\t\t\t\t\tPlease wait for the Approval of the Admin");
                                           break;
                                       }else if(Birth_ACode.get(BFill) == "Approve"){
                                           System.out.println("\t\t\t\t\tThis Data is already Approve"
                                                   + "\n\t\t\t\t\tPlease go to Already Request section to pay for the certificate");
                                       }

                                        }
                                   break;
                                       case "A":
                                           
                                           System.out.print("\t\t\t\t\tEnter the Code Number That have been given to you after your Fill Up Form: ");
                                            AlCode = scn.next().toUpperCase();
                                           
                                           if(Birth_ACode.containsKey(AlCode)){
                                               if(Birth_ACode.get(AlCode) == "Approve"){
                                                   BirthNavi = AlCode.substring(AlCode.length() - 1);
                                                   B.setBirthStoreKey(Birth_Code.get(AlCode));                                               
                                                   do{
                                                   System.out.println("The Code Have been Approve!!");
                                                   System.out.println("Choose the Method you want"
                                                           + "\n[P] Pick Up"
                                                           + "\n[D] Delivery");
                                                   PD = scn.next().toUpperCase();
                                                   
                                                   if(PD.equals("P")){
                                                       BirthPickUp();
                                                   }else if(PD.equals("D")){
                                                       BirthDelivery();
                                                   }else{
                                                       InvalidErrors();
                                                   }
                                                   }while(!PD.matches("P|D"));
                                               }else if(Birth_ACode.get(AlCode) == "Request"){
                                                   System.out.println("\t\t\t\t\tPlease wait for the Approval of the Request!!");
                                               }else if(Birth_ACode.get(AlCode) == "Denied"){
                                                   System.out.println("\t\t\t\t\tYour Request Had been denied!!"
                                                           + "\n\t\t\t\t\tYour Answer Doesn't Match the data your trying to access");
                                               }
                                           }else{
                                               InvalidErrors();
                                           }
                                       
                                       break;
                                   }
		            	   RF = false;
		            	   break;
		               default:
		            	   
		            	   InvalidErrors();
		            	   
		               }
		        	}while(RF == true);
		               NewTrans();
		        	
		        	break;
		        	
		       default:
		    	   InvalidErrors();
		    	   
		        }
			}while(MainLoop == true);
		
	}
	
	
	public static void Birth() {
            
		   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   do{
                   System.out.print("\t\t\t\t1A. Child First Name: ");
                   scn.nextLine();
                   Fname = scn.nextLine().toUpperCase();  
                   if(!Fname.matches("[A-Z]{1,}")){
                       System.out.println("Invalid Error");
                   }
                   }while(Fname.matches("[A-Z]{1,}"));
                   B.setFname(Fname);
                   
                   System.out.print("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): ");
                   Mname = scn.next().toUpperCase();
                   B.setMname(Mname);
                   
                   System.out.print("\t\t\t\t3A. Child Last Name: ");
                   Lname = scn.next().toUpperCase();
                   B.setLname(Lname);
                   
                   System.out.print("\t\t\t\t4A. Child Suffix (NA if not have): ");
                   suff = scn.next().toUpperCase();
                   B.setSuff(suff);
                   
                   System.out.print("\t\t\t\t5A. Child Birthday(MM/DD/YYYY): ");
                   BD = scn.next();
                   B.setBD(BD);
                   
                   System.out.print("\t\t\t\t6A. Child Sex(f/m): ");
                   gen = scn.next().toUpperCase();
                   B.setgen(gen);
                   
                   System.out.print("\t\t\t\t7A. Child Place of Bitht(Province): ");
                   Provi = scn.next().toUpperCase();
                   B.setprovi(Provi);
                   
                   System.out.print("\t\t\t\t8A. Child Place of Birth (City/Municipality): " );
                   City = scn.next().toUpperCase();
                   B.setCity(City);
                   
                   System.out.print("\t\t\t\t9A. Child Place of Birth(Hospital/Clinic/Institution): ");
                   scn.nextLine();
                   Hos = scn.nextLine().toUpperCase();
                   B.setHos(Hos);
                   
                   System.out.print("\t\t\t\t10A. Type of Birth(Single/Twin/Triplet/etc.): ");
                   TB = scn.next().toUpperCase();
                   B.setTB(TB);
                       
                   System.out.print("\t\t\t\t11A. if multiple birth, child was (first/second/third/fourth/etc.): ");
                   TBP = scn.next().toUpperCase();
                   B.setTBP(TBP);
                   
                   System.out.print("\t\t\t\t12A. Child Weight At Birth: ");
                   weigh = scn.next(); 
                   B.setweigh(weigh);
                   
                   //Mothers Info
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.print("\t\t\t\t1M. Mother First Name: ");
                   scn.nextLine();
                   MFname = scn.nextLine().toUpperCase();
                   B.setMFname(MFname);
                   
                                     
                   System.out.print("\t\t\t\t2M. Mother Middle Name: ");
                   MMname = scn.nextLine().toUpperCase(); 
                   B.setMMname(MMname);
                   
                   System.out.print("\t\t\t\t3M. Mother Last Name: ");
                   MLname = scn.nextLine().toUpperCase();
                   B.setMLname(MLname);
                   
                   System.out.print("\t\t\t\t4M. Mother Citizenship: ");
                   MCiten = scn.next().toUpperCase();
                   B.setMCite(MCiten);
                   
                   System.out.print("\t\t\t\t5M. Mother Religion: ");
                   scn.nextLine();
                   MReligion = scn.nextLine().toUpperCase();
                   B.setMReligion(MReligion);
                   
                   System.out.print("\t\t\t\t6M. Mother Occupation: ");
                   Mocc = scn.nextLine().toUpperCase(); 
                   B.setMoc(Mocc);
                   
                   
                   System.out.print("\t\t\t\t7M. Mother Age at time of this birth: ");
                   Mage = scn.next();
                   B.setMage(Mage);
                   
                   System.out.print("\t\t\t\t8M. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   MHos = scn.nextLine().toUpperCase();
                   B.setMHos(MHos);
                   
                   System.out.print("\t\t\t\t9M. Residence Munipality: ");
                   MCity = scn.nextLine().toUpperCase();
                   B.setMCity(MCity);
                   
                   System.out.print("\t\t\t\t10M. Province: ");
                   Mprovi = scn.nextLine().toUpperCase();
                   B.setMprovi(Mprovi);
                  
                  // Father Info
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.print("\t\t\t\t1F. Father First Name: ");
                   FFname = scn.nextLine().toUpperCase();
                   B.setFFname(FFname);
                   
                   System.out.print("\t\t\t\t2F. Father Middle Name: ");
                   FMname = scn.nextLine(); 
                   B.setFMname(FMname);
                   
                   System.out.print("\t\t\t\t3F. Father Last Name: ");
                   FLname = scn.nextLine().toUpperCase();
                   B.setFLname(FLname);

                   System.out.print("\t\t\t\t4F. Father Citizenship: ");
                   FCiten = scn.next().toUpperCase();
                   B.setFCite(FCiten);
                   
                   System.out.print("\t\t\t\t5F. Father Religion: ");
                   scn.nextLine();
                   FReligion = scn.nextLine().toUpperCase();
                   B.setFReligion(FReligion);
                   
                   System.out.print("\t\t\t\t6F. Father Occupation: ");
                   Focc = scn.nextLine().toUpperCase();
                   B.setFocc(Focc);
                                      
                   System.out.print("\t\t\t\t7F. Father Age at time of this birth: ");
                   Fage = scn.next();
                   B.setFage(Fage);
                   
                   System.out.print("\t\t\t\t8F. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   FHos = scn.nextLine().toUpperCase();
                   B.setFHos(FHos);
                   
                   System.out.print("\t\t\t\t9F. Residence Munipality: ");
                   FCity = scn.nextLine().toUpperCase();
                   B.setFCity(FCity);
                   
                   System.out.print("\t\t\t\t10F. Province: ");
                   Fprovi = scn.nextLine().toUpperCase();
                   B.setFprovi(Fprovi);
        
        //Birth_EDIT
        do {
        BDisplay();
		System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\tCheck your answers(if theres any mistake press 2 to edit)"
                 + "\n\t\t\t\t\t\t\t\t\t[C] Continue"
                 + "\n\t\t\t\t\t\t\t\t\t[E] Edit: ");
        CoE = scn.next().toUpperCase();
         
        
        if(CoE.equals("C")){
            break;

        	
        }else if(CoE.equals("E")){
        	
            
             System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
             System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                     + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
             scn.nextLine();
             String edit = scn.nextLine().toUpperCase();
             System.out.println(edit);
             String[] Birth_editor = edit.split(" ");
             
             for(String a: Birth_editor) {
		System.out.print("\t\t\t\t\t" + a + " " + Birth_Ques.get(a));
                String change = scn.nextLine();
       
                    switch(a){
                            case "1A":
                                B.setFname(change);
                                 break;
                            case "2A":
                                B.setMname(change);
                                break;
                            case "3A":
                                B.setLname(change);
                                break;
                            case "4A":
                                B.setSuff(change);;
                                break;
                            case "5A":
                                B.setBD(change);
                                break;
                            case "6A":
                                B.setgen(change);
                                break;
                            case "7A":
                                B.setprovi(change);
                                break;
                            case "8A":
                                B.setCity(change);
                                break;
                            case "9A":
                                B.setHos(change);
                                break;
                            case "10A":
                                B.setTB(change);
                                break;
                            case "11A":
                                B.setTBP(change);
                                break;
                            case "12":
                                B.setweigh(change);
                                break;
                            case "1M":
                                B.setMFname(change);
                                break;
                            case "2M":
                                B.setMMname(change);
                                break;
                            case "3M":
                                B.setMLname(change);
                                break;
                            case "4M":
                                B.setMCite(change);
                                break;
                            case "5M":
                                B.setMReligion(change);
                                break;
                            case "6M":
                                B.setMoc(change);
                                break;
                            case "7M":
                                B.setMage(change);
                                break;
                            case "8M":
                                B.setMHos(change);
                                break;
                            case "9M":
                                B.setMCity(change);
                                break;
                            case "10M":
                                B.setMprovi(change);
                                break;
                            case "1F":
                                B.setFFname(change);
                                break;
                            case "2F":
                                B.setFMname(change);
                                break;
                            case "3F":
                                B.setFLname(change);
                                break;
                            case "4F":
                                B.setFCite(change);
                                break;
                            case "5F":
                                B.setFReligion(change);
                                break;
                            case "6F":
                                B.setFocc(change);
                                break;
                            case "7F":
                                B.setFage(change);
                               break;
                            case "8F":
                                B.setFHos(change);
                                break;
                            case "9F":
                                B.setFCity(change);
                                break;
                            case "10F":
                                B.setFprovi(change);
                                break;
    					}
    			  }
             }else{
            
            InvalidErrors();
            
            }
                }while(!CoE.equalsIgnoreCase("C"));
		
	}
	public static void Birth_Question() {
		
		 	Birth_Ques.put("1A", "Child First Name:");
		 	Birth_Ques.put("2A", "Child Middle Name (Enter NA if does'nt have one):");
		 	Birth_Ques.put("3A" , "Child Last Name:");
		 	Birth_Ques.put("4A", "Child Suffix (NA if not have): ");
		 	Birth_Ques.put("6A" , "Child Birthday(MM/DD/YYYY): ");
		 	Birth_Ques.put("7A", "Child Sex(f/m): ");
		 	Birth_Ques.put("8A", "Child Place of Birth(Province): ");
		 	Birth_Ques.put("9A", "Child Place of Birth(City/Municipality): ");
		 	Birth_Ques.put("10A","Child Place of Birth(Hospital/Clinic/Institution):");
		 	Birth_Ques.put("11A","Child Type of Birth(Single/Twin/Triplet/etc): ");
		 	Birth_Ques.put("12A","Child If multiple birth, child was(first/second/third/fourth/etc.): ");
		 	Birth_Ques.put("13A","Child Weight at Birth: ");
	        
		 	Birth_Ques.put("1M","Mother First name: ");
		 	Birth_Ques.put("2M","Mother Middle name: ");
		 	Birth_Ques.put("3M","Mother Last name: ");
		 	Birth_Ques.put("4M","Mother Citizenship: ");
		 	Birth_Ques.put("5M","Mother Religion: ");
		 	Birth_Ques.put("6M","Mother Occupation: ");
		 	Birth_Ques.put("7M","Mother Age at time of this birth: ");
		 	Birth_Ques.put("8M","Mother Residence(House Number/Street, Barangay): ");
		 	Birth_Ques.put("9M","Mother Residence Municipality: ");
		 	Birth_Ques.put("10M","Mother Province: ");

		 	Birth_Ques.put("1F","Father First name: ");
		 	Birth_Ques.put("2F","Father Middle name: ");
		 	Birth_Ques.put("3F","Father Last name: ");
		 	Birth_Ques.put("4F","Father Citizenship: ");
		 	Birth_Ques.put("5F","Father Religion: ");
		 	Birth_Ques.put("6F","Father Occupation: ");
		 	Birth_Ques.put("7F","Father Age at time of this birth: ");
		 	Birth_Ques.put("8F","Father Residence(House Number/Street, Barangay): ");
		 	Birth_Ques.put("9F","Father Residence Municipality: ");
		 	Birth_Ques.put("10F","Father Province: ");
		
	}
	public static void Birth_Storage() {
		
		BStore.put("1A" + Navi + B.getBirthStoreKey() , B.getFname());
	        BStore.put("2A" + Navi + B.getBirthStoreKey() , B.getMname());
	        BStore.put("3A" + Navi + B.getBirthStoreKey() , B.getLname());
	        BStore.put("4A" + Navi + B.getBirthStoreKey() ,  B.getsuff());
	        BStore.put("6A" + Navi + B.getBirthStoreKey() , B.getBD());
	        BStore.put("7A" + Navi + B.getBirthStoreKey() , B.getHos());
	        BStore.put("5A" + Navi + B.getBirthStoreKey() , B.getgen());
	        BStore.put("8A" + Navi + B.getBirthStoreKey() , B.getprovi());
	        BStore.put("9A" + Navi + B.getBirthStoreKey(), B.getCity());
	        BStore.put("10A" + Navi + B.getBirthStoreKey(), B.getHos());
	        BStore.put("11A" + Navi + B.getBirthStoreKey(), B.getTB());
	        BStore.put("12A" + Navi + B.getBirthStoreKey(), B.getTBP());
	        BStore.put("13A" + Navi + B.getBirthStoreKey(), B.getweigh());
	        
	        BStore.put("1M" + Navi + B.getBirthStoreKey(), B.getMFname());
	        BStore.put("2M" + Navi + B.getBirthStoreKey(), B.getMMname());
	        BStore.put("3M" + Navi + B.getBirthStoreKey(), B.getMLname());
	        BStore.put("4M" + Navi + B.getBirthStoreKey(), B.getMCite());
	        BStore.put("5M" + Navi + B.getBirthStoreKey(), B.getReligion());
	        BStore.put("6M" + Navi + B.getBirthStoreKey(), B.getMocc());
	        BStore.put("7M" + Navi + B.getBirthStoreKey(), B.getMage());
	        BStore.put("8M" + Navi + B.getBirthStoreKey(), B.getMHos());
	        BStore.put("9M" + Navi + B.getBirthStoreKey(), B.getMCity());
	        BStore.put("10M" + Navi + B.getBirthStoreKey(), B.getMprovi());
	        
	        BStore.put("1F" + Navi + B.getBirthStoreKey(), B.getFFname());
	        BStore.put("2F" + Navi + B.getBirthStoreKey(), B.getFMname());
	        BStore.put("3F" + Navi + B.getBirthStoreKey(), B.getFLname());
	        BStore.put("4F" + Navi + B.getBirthStoreKey(), B.getFCiten());
	        BStore.put("5F" + Navi + B.getBirthStoreKey(), B.getFReligion());
	        BStore.put("6F" + Navi + B.getBirthStoreKey(), B.getFocc());
	        BStore.put("7F" + Navi + B.getBirthStoreKey(), B.getFage());
	        BStore.put("8F" + Navi + B.getBirthStoreKey(), B.getFHos());
	        BStore.put("9F" + Navi +B.getBirthStoreKey(), B.getFCity());
	        BStore.put("10F" + Navi + B.getBirthStoreKey(), B.getFprovi());
	        
	       
	        
	        Navi++;
		
	}
	public static void InvalidErrors() {
		
	System.out.println( "\t\t\t------------------------------------------------------------------------------------------------------------------------/"
        + "\n\t\t\t\t\t\t\t\t\t\tInvalid Inputs"
        + "\n\t\t\t------------------------------------------------------------------------------------------------------------------------");
	}
	public static void BDMQuestions(){
		
		System.out.print( "\t\t\t\t\t\t\t\t\t\tRegistration Certificate"
                + "\n\t\t\t\t\t\t\t\t\t\t[B] Birth"
                + "\n\t\t\t\t\t\t\t\t\t\t[M] Marriage"
                + "\n\t\t\t\t\t\t\t\t\t\t[D] Death: ");
	}
        public static void BDisplay(){
       
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println(" ");
                   System.out.println("\t\t\t\t1A. Child First Name: " +B.getFname());
                   System.out.println("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): " + B.getMname());
                   System.out.println("\t\t\t\t3A. Child Last Name: " + B.getLname());
                   System.out.println("\t\t\t\t4A. Child Suffix (NA if not have): " + B.getsuff());
                   System.out.println("\t\t\t\t5A. Child Birthday(MM/DD/YYYY): " + B.getBD());
                   System.out.println("\t\t\t\t6A. Child Sex(f/m): " + B.getgen());
                   System.out.println("\t\t\t\t7A. Child Place of Bitht(Province): " + B.getprovi());
                   System.out.println("\t\t\t\t8A. Child Place of Birth (City/Municipality): " + B.getCity());
                   System.out.println("\t\t\t\t9A. Child Place of Birth(Hospital/Clinic/Institution): " + B.getHos());
                   System.out.println("\t\t\t\t10A. Type of Birth(Single/Twin/Triplet/etc.): " + B.getTB());   
                   System.out.println("\t\t\t\t11A. if multiple birth, child was (first/second/third/fourth/etc.): " + B.getTBP());
                   System.out.println("\t\t\t\t12A. Child Weight At Birth: " + B.getweigh());
                   
                   //Mothers Info
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1M. Mother First Name: " + B.getMFname());                
                   System.out.println("\t\t\t\t2M. Mother Middle Name: " + B.getMMname());
                   System.out.println("\t\t\t\t3M. Mother Last Name: " + B.getMLname());
                   System.out.println("\t\t\t\t4M. Mother Citizenship: " + B.getMCite());
                   System.out.println("\t\t\t\t5M. Mother Religion: " + B.getReligion());
                   System.out.println("\t\t\t\t6M. Mother Occupation: " + B.getMocc());
                   System.out.println("\t\t\t\t7M. Mother Age at time of this birth: " + B.getMage());
                   System.out.println("\t\t\t\t8M. Residence(House Number/Steet, Barangay): " + B.getMHos());
                   System.out.println("\t\t\t\t9M. Residence Munipality: " + B.getMCity());
                   System.out.println("\t\t\t\t10M. Province: " + B.getMprovi());
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1F. Father First Name: " + B.getFFname());                  
                   System.out.println("\t\t\t\t2F. Father Middle Name: " + B.getFMname());
                   System.out.println("\t\t\t\t3F. Father Last Name: " + B.getFLname());
                   System.out.println("\t\t\t\t4F. Father Citizenship: " + B.getFCiten());
                   System.out.println("\t\t\t\t5F. Father Religion: " + B.getFReligion());
                   System.out.println("\t\t\t\t6F. Father Occupation: " + B.getFocc());
                   System.out.println("\t\t\t\t7F. Father Age at time of this birth: " + B.getFage());
                   System.out.println("\t\t\t\t8F. Residence(House Number/Steet, Barangay): " + B.getFHos());
                   System.out.println("\t\t\t\t9F. Residence Munipality: " + B.getFCity());
                   System.out.println("\t\t\t\t10F. Province: " + B.getFprovi());               
             
    
        }      
        public static void BirthDelivery(){
            
        }
        public static void BirthPickUp(){
            
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.print("\t\t\t\tFull Name of Reciever: ");
                                scn.nextLine();
                                Fname = scn.nextLine();
                                 
                                System.out.print("\t\t\t\tContact Number: +63");
                                String Cont = scn.next();
                                
                                do{
                                    
                                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("\t\t\t\tPlease Check Pick up Information");
                                System.out.println("");
                                System.out.println("\t\t\t\tName: " + Fname);
                                System.out.println("\t\t\t\tContact Number: " + Cont);
                                System.out.println("");
                                System.out.println("\t\t\t\tPlease be informed that the Payment fee for one(1) copy"
                                        + "\n\t\t\t\tof PSA Certificate is Php 155");
                                System.out.println(" ");
                                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.print("\t\t\t\tMake sure your detail is correct. Proceed(Y/N): ");
                                PE = scn.next().toUpperCase();
                                
                               if(PE.equals("N")){
                                   
                                    System.out.print("\t\t\t\tEnter the Part you want to edit(N(Name)/C(Contact)/B(Both): ");
                                    NoC = scn.next().toUpperCase();
                                    
                                    if(NoC.equals("N")){
                                        
                                        System.out.print("\t\t\t\tFull Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                             
                                    }else if(NoC.equals("C")){
                                        
                                        System.out.print("\t\t\t\tContact Number: +63");
                                        Cont = scn.next();  
                                    }else if(NoC.equals("B")){
                                        System.out.print("\t\t\t\tFull Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                                        System.out.print("\t\t\t\tContact Number: +63");
                                        Cont = scn.next();
                                        
                                        }
                                    }
                                }while(PE.equals("N"));
                               
                                if(PE.equals("Y")){
                                    
                                    
                                    System.out.print("\t\t\t\tHow Many Copies: ");
                                    String Copy = scn.next();
                                    double Price = 155 * Integer.parseInt(Copy);
                                    
                                    System.out.println("\t\t\t\tTotal: " + Price);
                                    while(true){
                                    System.out.print("\t\t\t\tEnter Amount paying: ");
                                    String Amount = scn.next();
                                    double change = Double.parseDouble(Amount) - Price;
                                    
                                    if(change <= 0){
                                        break;
                                        }else{
                                        System.out.println("You need to get the right price or above!!!");
                                    } 
                                    }
                                    Reciept();
                                    Birth_ACode.replace(AlCode, "Done");
                                }
            
        }
        public static void BirthCertificate(){
System.out.println("\t\t\t========================================================================================================================");
System.out.println(" ");
System.out.println("\t\t\t\t\t\t\t\t\tRepublic of the Philippines"
        + "\n\t\t\t\t\t\t\t\t   Office of The Civil Registrar General"
        + "\n\t\t\t\t\t\t\t\t\tCertificate of Live Birth");
System.out.println(" ");
System.out.println("\t\t\t========================================================================================================================");
System.out.printf("\t\t\t\tNAME\t\t| First Name:\t\t      | Middle Name:\t\t    | Last Name:\t\t     | Suffix:\n");
System.out.printf("\t\t\t\t\t\t| %-20s       | %-20s      | %-20s          | %-20s \n", BStore.get("1A" + BirthNavi + B.getBirthStoreKey()), BStore.get("2A" + BirthNavi + B.getBirthStoreKey()), BStore.get("3A" + BirthNavi + B.getBirthStoreKey()),BStore.get("4A" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| SEX\t\t\t| Date of Birth:(MM/DD/YYYY)");
System.out.printf("\t\t\t\t| %-20s | %-19s \n", BStore.get("4A" + BirthNavi + B.getBirthStoreKey()), BStore.get("5A" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\tPlace of Birth\t\t | Name of Hospital/Clinic/Institution\t| City/Municipality\t| Province");
System.out.printf("\t\t\t\t\t\t\t | %-20s                | %-20s  | %-20s \n", BStore.get("6A" + BirthNavi + B.getBirthStoreKey()), BStore.get("7A" + BirthNavi + B.getBirthStoreKey()), BStore.get("8A" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Type of Birth\t\t | If Multiple Birth, Child was");
System.out.printf("\t\t\t\t| %-20s  | %-20s \n", BStore.get("9A" + BirthNavi + B.getBirthStoreKey()), BStore.get("10A" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Birth Order\t\t | Weight At Birth");
System.out.printf("\t\t\t\t| %-20s  | %-20s \n", BStore.get("11A" + BirthNavi + B.getBirthStoreKey()), BStore.get("12A" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t========================================================================================================================");
System.out.println("\t\t\tMaiden Name     |First Name:\t\t      |Middle Name:\t\t       |Last Name:");
System.out.printf("\t\t\t\t        | %-20s       | %-20s           | %-20s \n", BStore.get("1M" + BirthNavi + B.getBirthStoreKey()), BStore.get("2M" + BirthNavi + B.getBirthStoreKey()), BStore.get("3M" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Citizenship        | Religion");
System.out.printf("\t\t\t\t| %-13s      | %-13s \n", BStore.get("4M" + BirthNavi + B.getBirthStoreKey()), BStore.get("5M" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Occupation       | Age at the time of this birth");
System.out.printf("\t\t\t\t| %-14s   | %-20s \n", BStore.get("6M" + BirthNavi + B.getBirthStoreKey()), BStore.get("7M" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\tResidence     | (House No.,Street,Barangay)    | (City/Municipality)  | (Province)");
System.out.printf("\t\t\t\t              | %-20s           | %-20s| %-20s \n", BStore.get("8M" + BirthNavi + B.getBirthStoreKey()), BStore.get("9M" + BirthNavi + B.getBirthStoreKey()), BStore.get("10M" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t========================================================================================================================");
System.out.println("\t\t\t\tFather's Name\t\t\t| First Name: \t\t\t| Middel Name: \t\t\t| Last Name:");
System.out.printf("\t\t\t\t                               | %-20s         | %-20s         | %-20s \n", BStore.get("1F" + BirthNavi + B.getBirthStoreKey()), BStore.get("2F" + BirthNavi + B.getBirthStoreKey()), BStore.get("3F" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Citizenship\t\t\t\t\t| Religion");
System.out.printf("\t\t\t\t| %-20s\t\t\t\t| %-20s \n", BStore.get("4F" + BirthNavi + B.getBirthStoreKey()), BStore.get("5F" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t| Occupation\t\t\t\t\t| Age at the time of this birth");
System.out.printf("\t\t\t\t| %-20s\t\t\t\t| %-20s \n", BStore.get("6F" + BirthNavi + B.getBirthStoreKey()), BStore.get("7F" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\tResidence     | (House No.,Street,Barangay)    | (City/Municipality)   | (Province)");
System.out.printf("\t\t\t\t              | %-20s           | %-20s  | %-20s \n", BStore.get("8F" + BirthNavi + B.getBirthStoreKey()), BStore.get("9F" + BirthNavi + B.getBirthStoreKey()), BStore.get("10F" + BirthNavi + B.getBirthStoreKey()));
System.out.println("\t\t\t========================================================================================================================");

        }
        public static void NewTrans(){
          String NX; 
            do{
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.print("Do you wish to Continue"
                    + "\n[N] New Transaction"
                    + "\n[X] Exit Program: ");
            NX = scn.next().toUpperCase();
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            
            if(NX.equals("X")){
                MainLoop = false;
            }
        }while(!NX.matches("[X|N]"));
            
        }
        public static void Reciept(){
            
        }
	public static void Birth_Semi_Admin() throws InterruptedException, IOException{
                    
            Customer_View_Birth();
            System.out.println("\t\t\t-----------------------------------------------------");
            System.out.print("\t\t\t\tEnter the code of the Certificate to check the request: ");
            String BCODE = scn.next();
            
                if(Birth_Code.containsKey(BCODE)){
                    
                    if(Birth_ACode.get(BCODE) == "Request"){
                        
                        BirthNavi = BCODE.substring(BCODE.length() -1);
                        B.setBirthStoreKey(Birth_Code.get(BCODE));
                        BDisplay();
                        do{
                        System.out.print("\t\t\t\tProceed to Approve?([Y] Yes|[N] No): ");
                        RYN = scn.next().toUpperCase();
                        
                        if(RYN.equals("Y")){
                            System.out.print("Printing Sample Copy.");
                            Thread.sleep(400);
                            System.out.print(".");
                            Thread.sleep(400);
                            System.out.print(".");
                            Thread.sleep(400);
                            System.out.print(".");
                            Thread.sleep(400);
                            System.out.println(".");
                            BirthCertificate();
                            Birth_ACode.replace(BCODE, "Approve");
                            
                        }else if(RYN.equals("N")){
                            break;
                        }
                        }while(!RYN.equals("Y"));
                    }else if(Birth_ACode.get(BCODE) == "New" || Birth_ACode.get(BCODE) == "Denied"){
                    BirthNavi = BCODE.substring(BCODE.length() -1);
                    System.out.println("Checking " + BCODE + Birth_Code.get(BCODE));
                    B.setBirthStoreKey(Birth_Code.get(BCODE));
                    
                    System.out.println("\t\t\t\t\t--------------------------------------------");
                    System.out.println("\t\t\t\t\t| Existing Data       | User Request       |");
                    System.out.println("\t\t\t\t\t--------------------------------------------");
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("1A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("1A" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("2A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("2A" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("3A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("3A" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("5A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("5A" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("1M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("1M" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("2M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("2M" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("3M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("3M" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("7M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("7M" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("1F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("1F" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("2F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("2F" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("3F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("3F" + BCODE));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("7F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("7F" + BCODE));
                    System.out.println("\t\t\t\t\t--------------------------------------------");    
                    do{
                    System.out.println("\t\t\t\t\t\tConfirm the request?"
                                + "\n\t\t\t\t\t\t[Y] Yes"
                                + "\n\t\t\t\t\t\t[N] No");
                        YorN = scn.next().toUpperCase();
                        if(YorN.equals("Y")){
                    Birth_ACode.replace(BCODE, "True");
                            System.out.print("\t\t\t\tProcessing.");
                            Thread.sleep(400);
                            System.out.print(".");
                            Thread.sleep(400);
                            System.out.print(".");
                            Thread.sleep(400);
                            System.out.println(".");
                            
                            System.out.println("\t\t\t\tRequest Successfully Accepted!!");
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                        }else if(YorN.equals("N")){
                          Birth_ACode.replace(BCODE, "\t\t\t\tDenied");
                          break;
                        }else{
                            InvalidErrors();
                        }
                    }while(!YorN.equals("Y"));
                    }
            }else {
                    InvalidErrors();
                }
        }       
        public static void Semi_Admin_Login()throws InterruptedException, IOException{
            
            do{
            System.out.print("Enter Your Email: ");
            String SALoginEmail = scn.next();
            if(SALoginEmail.equals(SALogin)){
              
                break;
            }else{
                InvalidErrors();
                }
            }while(true);
            do{
            System.out.print("Enter Your Pass word: ");
            String SAPass = scn.next();
            
            if(SAPass.equals(PASSLogin)){
                break;
            }else{
                InvalidErrors();
            }
            }while(true);
            Birth_Semi_Admin();
    
}
        public static void BirthSemiAdminQues(){
        
            System.out.println("File is Existing but questions are still needed!!!");
                                       
                                       //child questions
                                       System.out.print("Enter First Name of the Child: ");
                                       scn.nextLine();
                                       CFName = scn.nextLine();
                                       System.out.print("Enter Middle Name of the Child: ");
                                       CMName = scn.nextLine();
                                       System.out.print("Enter Last Name of the Child: ");
                                       CLName = scn.nextLine();
                                       System.out.print("Enter BirthDay of the Child:");
                                       CBD = scn.next();
                                       
                                       // Mother questions
                                       System.out.print("Enter the First Name of the Mothers Child: ");
                                       scn.nextLine();
                                       MFNAME = scn.nextLine();
                                       System.out.print("Enter the Middle Name of the Mothers Child: ");
                                       MMNAME = scn.nextLine();
                                       System.out.print("Enter the Last Name of the Mothers Child: ");
                                       MLNAME  = scn.nextLine();
                                       System.out.print("Enters Mother age aat time of birth: ");
                                       MAGE = scn.next();
                                       
                                       //Fathers questions
                                       System.out.print("Enter the First Name of the Father Child: ");
                                       scn.nextLine();
                                       FFNAME = scn.nextLine();
                                       System.out.print("Enter the Middle Name of the Father Child: ");
                                       FMNAME = scn.nextLine();
                                       System.out.print("Enter the Last Name of the Father Child: ");
                                       FLNAME = scn.nextLine();
                                       System.out.print("Enters Father age aat time of birth: ");
                                       FAGE = scn.next();
                                       
                                       Birth_Request.put("1A" + BFill, CFName);
                                       Birth_Request.put("2A" + BFill, CMName);
                                       Birth_Request.put("3A" + BFill, CLName);
                                       Birth_Request.put("5A" + BFill, CBD);
                                       Birth_Request.put("1M" + BFill, MFNAME);
                                       Birth_Request.put("2M" + BFill, MMNAME);
                                       Birth_Request.put("3M" + BFill, MLNAME);
                                       Birth_Request.put("7M" + BFill, MAGE);
                                       Birth_Request.put("1F" + BFill, FFNAME);
                                       Birth_Request.put("2F" + BFill, FMNAME);
                                       Birth_Request.put("3F" + BFill, FLNAME);
                                       Birth_Request.put("7F" + BFill, FAGE);
                                       Birth_ACode.replace(BFill, "New");
        }
        public static void Customer_View_Birth(){
          
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t| User ID    | User Name           | User Status    |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|New = New Coppy                                    |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            
             for(Map.Entry<Object, String> eh : Birth_Code.entrySet()){
                
                    if(Birth_ACode.get(eh.getKey()) == "New"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Birth_ACode.get(eh.getKey()));
                    }
                
            }
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Request = Request Sent But not Approve             |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                    for(Map.Entry<Object, String> eh : Birth_Code.entrySet()){
                
                    if(Birth_ACode.get(eh.getKey()) == "Request"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Birth_ACode.get(eh.getKey()));
                    }
                
                    
                    }
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Approve = Waiting for the user to pay              |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                    for(Map.Entry<Object, String> eh : Birth_Code.entrySet()){
                
                    if(Birth_ACode.get(eh.getKey()) == "Approve"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Birth_ACode.get(eh.getKey()));
                    }
                
                    
                    }
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Denied = Request Due to Invalid Inputs             |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                    for(Map.Entry<Object, String> eh : Birth_Code.entrySet()){
                
                    if(Birth_ACode.get(eh.getKey()) == "Denied"){
                        
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Birth_ACode.get(eh.getKey()));
                        
                        }
                    }
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Done = Done with the transaction                   |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                     for(Map.Entry<Object, String> eh : Birth_Code.entrySet()){
                
                    if(Birth_ACode.get(eh.getKey()) == "Done"){
                        
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Birth_ACode.get(eh.getKey()));
                        
                        }
                    }
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
        }
        public static void MainAdmin() throws IOException, InterruptedException{
            
            System.out.printf("=========================================================================================="
                          + "\n|%20s", "MAIN ADMIN"
                          + "\n==========================================================================================\n");
            

            BDMQuestions();
            String Admin_BDM = scn.next().toUpperCase();
            
            switch(Admin_BDM){
                
                case "B":
                    System.out.println("Customers");
                    Customer_View_Birth();
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Main Admin"
                            + "\n[A] Add new Customer"
                            + "\n[E] Edit existing Data"
                            + "\n[V] View exisitng Data"
                            + "\n[D] Delete existing Data: ");
                    AdminPurp = scn.next().toUpperCase();
                    System.out.println("--------------------------------------------------------");
                    Birth_Admin();
                        
                    
                    break; 
                case "D":
                    
                    break;
                    
                case "M":
                    
                    break;
                    
                default:
                    InvalidErrors();
                    
            }
            
        }
        public static void Admin_View_Birth(){
            
             System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println(" ");
                   System.out.println("\t\t\t\t1A. Child First Name: " + BStore.get("1A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): " + BStore.get("2A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t3A. Child Last Name: " + BStore.get("3A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t4A. Child Suffix (NA if not have): " + BStore.get("4A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t5A. Child Birthday(MM/DD/YYYY): " + BStore.get("5A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t6A. Child Sex(f/m): " + BStore.get("6A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t7A. Child Place of Bitht(Province): " + BStore.get("7A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t8A. Child Place of Birth (City/Municipality): " + BStore.get("8A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t9A. Child Place of Birth(Hospital/Clinic/Institution): " + BStore.get("9A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t10A. Type of Birth(Single/Twin/Triplet/etc.): " + BStore.get("10A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));   
                   System.out.println("\t\t\t\t11A. if multiple birth, child was (first/second/third/fourth/etc.): " + BStore.get("11A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t12A. Child Weight At Birth: " + BStore.get("12A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   
                   //Mothers Info
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1M. Mother First Name: " + BStore.get("1M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));                
                   System.out.println("\t\t\t\t2M. Mother Middle Name: " + BStore.get("2M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t3M. Mother Last Name: " + BStore.get("3M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t4M. Mother Citizenship: " + BStore.get("4M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t5M. Mother Religion: " + BStore.get("5M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t6M. Mother Occupation: " + BStore.get("6M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t7M. Mother Age at time of this birth: " +BStore.get("7M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t8M. Residence(House Number/Steet, Barangay): " + BStore.get("8M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t9M. Residence Munipality: " + BStore.get("9M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t10M. Province: " + BStore.get("10M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1F. Father First Name: " + BStore.get("1F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));                  
                   System.out.println("\t\t\t\t2F. Father Middle Name: " + BStore.get("2F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t3F. Father Last Name: " + BStore.get("3F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t4F. Father Citizenship: " + BStore.get("4F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t5F. Father Religion: " + BStore.get("5F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t6F. Father Occupation: " + BStore.get("6F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t7F. Father Age at time of this birth: " + BStore.get("7F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t8F. Residence(House Number/Steet, Barangay): " + BStore.get("8F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t9F. Residence Munipality: " + BStore.get("9F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t10F. Province: " + BStore.get("10F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey())); 
            
        }
        public static void Admin_Deleted_View(){
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println(" ");
                   System.out.println("\t\t\t\t1A. Child First Name: " + Deleted_Birth.get("1A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): " + Deleted_Birth.get("2A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t3A. Child Last Name: " + Deleted_Birth.get("3A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t4A. Child Suffix (NA if not have): " + Deleted_Birth.get("4A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t5A. Child Birthday(MM/DD/YYYY): " + Deleted_Birth.get("5A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t6A. Child Sex(f/m): " + Deleted_Birth.get("6A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t7A. Child Place of Bitht(Province): " + Deleted_Birth.get("7A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t8A. Child Place of Birth (City/Municipality): " + Deleted_Birth.get("8A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t9A. Child Place of Birth(Hospital/Clinic/Institution): " + Deleted_Birth.get("9A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t10A. Type of Birth(Single/Twin/Triplet/etc.): " + Deleted_Birth.get("10A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));   
                   System.out.println("\t\t\t\t11A. if multiple birth, child was (first/second/third/fourth/etc.): " + Deleted_Birth.get("11A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t12A. Child Weight At Birth: " + Deleted_Birth.get("12A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   
                   //Mothers Info
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1M. Mother First Name: " + Deleted_Birth.get("1M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));                
                   System.out.println("\t\t\t\t2M. Mother Middle Name: " + Deleted_Birth.get("2M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t3M. Mother Last Name: " + Deleted_Birth.get("3M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t4M. Mother Citizenship: " + Deleted_Birth.get("4M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t5M. Mother Religion: " + Deleted_Birth.get("5M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t6M. Mother Occupation: " + Deleted_Birth.get("6M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t7M. Mother Age at time of this birth: " + Deleted_Birth.get("7M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t8M. Residence(House Number/Steet, Barangay): " + Deleted_Birth.get("8M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t9M. Residence Munipality: " + Deleted_Birth.get("9M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t10M. Province: " + Deleted_Birth.get("10M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.println("\t\t\t\t1F. Father First Name: " + Deleted_Birth.get("1F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));                  
                   System.out.println("\t\t\t\t2F. Father Middle Name: " + Deleted_Birth.get("2F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t3F. Father Last Name: " + Deleted_Birth.get("3F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t4F. Father Citizenship: " + Deleted_Birth.get("4F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t5F. Father Religion: " + Deleted_Birth.get("5F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t6F. Father Occupation: " + Deleted_Birth.get("6F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t7F. Father Age at time of this birth: " + Deleted_Birth.get("7F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t8F. Residence(House Number/Steet, Barangay): " + Deleted_Birth.get("8F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t9F. Residence Munipality: " + Deleted_Birth.get("9F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                   System.out.println("\t\t\t\t10F. Province: " + Deleted_Birth.get("10F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
        }
        public static void Admin_EditStore(){
            
            Admin_BStore.put("1A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("1A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("2A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("2A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("3A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("3A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("4A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("4A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("5A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("5A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("6A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("6A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("7A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("7A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("8A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("8A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("9A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("9A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("10A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("10A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("11A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("11A" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("12A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("12A" + BFill.substring(BFill.length()-1) + Edit_Name));
            
            Admin_BStore.put("1M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("1M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("2M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("2M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("3M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("3M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("4M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("4M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("5M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("5M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("6M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("6M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("7M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("7M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("8M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("8M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("9M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("9M" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("10M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("10M" + BFill.substring(BFill.length()-1) + Edit_Name));
            
            Admin_BStore.put("1F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("1F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("2F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("2F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("3F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("3F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("4F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("4F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("5F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("5F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("6F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("6F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("7F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("7F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("8F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("8F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("9F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("9F" + BFill.substring(BFill.length()-1) + Edit_Name));
            Admin_BStore.put("10F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(),BStore.remove("10F" + BFill.substring(BFill.length()-1) + Edit_Name));
            
        }
        public static void Birth_Admin() throws IOException, InterruptedException{
            switch(AdminPurp){
                            case "A":
                                Birth_Admin_Add();
                                break;
                            case "E":           
                                Birth_Admin_Edit();                           
                                break;
                            case "V":
                                Birth_Admin_View();
                                break;
                                
                            case "D":
                                Birth_Admin_Delete();
                                
                        }
        }
        public static void Birth_Admin_Add() throws IOException, InterruptedException{
                                Birth();
                                B.setBirthStoreKey(B.getFname() + " " + B.getMname() + " " + B.getLname());
                                Birth_Storage();
                                do{
                                System.out.print("Do you want to Print the Copy"
                                        + "\n[Y] Yes"
                                        + "\n[N] No: ");
                                YoN = scn.next().toUpperCase();
                                if(YoN.equals("Y")){
                                    System.out.print("Printing Sample Copy.");
                                    Thread.sleep(400);
                                    System.out.print(".");
                                    Thread.sleep(400);
                                    System.out.println(".");
                                    BirthCertificate();
                                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("\t\t\t\t\t\tThank You for Registering!");
                                            System.out.println("\t\t\t\t\t\tWarning do not show this code to anyone!!!!");
                                            System.out.println("\t\t\t\tHeres your Code Number if you ever wanted the Copy of the certificate: B" + BCode_Num);
                                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                }else if(YoN.equals("N")){
                                    break;
                                }else{
                                    InvalidErrors();
                                }
                                }while(!YoN.equals("N"));
                                Birth_Code.put("B" + BCode_Num, B.getBirthStoreKey());
                                Birth_ACode.put("B" + BCode_Num, "Approve");
                                
                                BCode_Num++;
        }
        public static void Birth_Admin_View(){
            System.out.print("Enter the code you want to view: ");
                                BFill = scn.next().toUpperCase();
                                if(Birth_Code.containsKey(BFill)){
                                    B.setBirthStoreKey(Birth_Code.get(BFill));
                                    Admin_View_Birth();
                                    
                                    System.out.print("Do you wish to edit the status of this Data?"
                                            + "\n[Y] Yes"
                                            + "\n[N] No: ");
                                    CE = scn.next().toUpperCase();
                                    
                                    if(CE.equals("Y")){
                                        if(Birth_Code.get(BFill) == "New"){
                                            
                                            System.out.println("This Data is for a new coppy you want to Approve it?");
                                            
                                        }else if(Birth_ACode.get(BFill) == "Approve"){
                                            System.out.println("This Data is waiting to be payed");
                                        }else if(Birth_ACode.get(BFill) == "Request"){
                                            System.out.println("This Data is on request and waiting to be approve you want to approve it? ");
                                        }else if(Birth_ACode.get(BFill) == "Denied"){
                                            System.out.println("This Data have been denied you want to Approve it?");
                                        }
                                        
                                    }else if(CE.equals("N")){
                                        
                                    }
                                }
            
        }
        public static void Birth_Admin_Delete() throws IOException, InterruptedException{
            
            System.out.print("Delete data or View Deleted History"
                                        + "\n[D] Delete Data"
                                        + "\n[V] View Deleted History: ");
                                String DV = scn.next().toUpperCase();
                                if(DV.equals("D")){
                                System.out.print("Enter the code of the Data you want to delete: ");
                                BFill = scn.next().toUpperCase();
                                if(Birth_Code.containsKey(BFill)){
                                    B.setBirthStoreKey(Birth_Code.get(BFill));
                                    Edit_Name = B.getBirthStoreKey();
                                    Admin_View_Birth();
                                    System.out.print("Are you sure you want to Delete this Data?"
                                            + "\n[Y] Yes"
                                            + "\n[N] No: ");
                                    CE = scn.next().toUpperCase();
                                    if(CE.equals("Y")){
                                        System.out.print("Processing.");
                                        Thread.sleep(400);
                                        System.out.print(".");
                                        Thread.sleep(400);
                                        System.out.println(".");
                                        Thread.sleep(400);
                                        System.out.println("Data Successfully Deleted!!!");
                                        Admin_EditStore();
                                        Deleted_Birth.putAll(Admin_BStore);
                                        Admin_BStore.clear();
                                        Birth_ACode.replace(BFill, "Deleted");
                                        System.out.println(Birth_ACode.get(BFill));
                                        
                                    }
                                }
                            }else if(DV.equals("V")){
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("| User ID        | User Name           | Status        |");
                                    System.out.println("--------------------------------------------------------");
                                    
                                    for(Map.Entry<Object, String> eh: Birth_Code.entrySet()){
                                        if(Birth_ACode.get(eh.getKey()) == "Deleted"){
                                            
                                        System.out.printf("| %-15s| %-20s| %-15s|\n", eh.getKey(), eh.getValue(), Birth_ACode.get(eh.getKey()));
                                        }
                                        
                                    }
                                    System.out.println("--------------------------------------------------------");;
                                    
                                    System.out.print("Enter the code you want to view: ");
                                    BFill = scn.next().toUpperCase();
                                    
                                    if(Birth_Code.containsKey(BFill)){
                                        B.setBirthStoreKey(Birth_Code.get(BFill));
                                        Admin_Deleted_View();
                                    }else{
                                        InvalidErrors();
                                    }

                                    
                                
                            }
            
        }
        public static void Birth_Admin_Edit(){
            
            System.out.println("--------------------------------------------------------");
                                System.out.println("Enter The code you want to edit: ");
                                BFill = scn.next();
                                
                                if(Birth_Code.containsKey(BFill)){
                                    B.setBirthStoreKey(Birth_Code.get(BFill));
                                    Edit_Name = B.getBirthStoreKey();
                                do{
                                 
                                    Admin_View_Birth();
                                    System.out.println("Do You wish to continue or Edit?"
                                            + "\n[C] Continue"
                                            + "\n[E] Edit: ");
                                    CoE = scn.next().toUpperCase();
                                    if(CoE.equals("C")){
                                        
                                        B.setBirthStoreKey(BStore.get("1A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()) + " " + BStore.get("2A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()) + " " + BStore.get("3A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey()));
                                        Admin_EditStore();
                                        Birth_Code.replace(BFill, B.getBirthStoreKey());
                                        BStore.putAll(Admin_BStore);
                                        Admin_BStore.clear();
                                        
                                    }else if(CoE.equals("E")){
                                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                                               + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
                                scn.nextLine();
                                String edit = scn.nextLine().toUpperCase();
                                String[] Birth_editor = edit.split(" ");
             
                                for(String a: Birth_editor) {
                                    if(Birth_Ques.containsKey(a)){
                                                System.out.print("\t\t\t\t\t" + a + " " + Birth_Ques.get(a));
                                                String change = scn.nextLine();
       
                                            switch(a){
                                                case "1A":
                                                    BStore.replace("1A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;            
                                                case "2A":
                                                    BStore.replace("2A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "3A":
                                                    BStore.replace("3A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "4A":
                                                    BStore.replace("4A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "5A":
                                                    BStore.replace("5A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "6A":
                                                    BStore.replace("6A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "7A":
                                                    BStore.replace("7A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "8A":
                                                    BStore.replace("8A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "9A":
                                                    BStore.replace("9A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "10A":
                                                    BStore.replace("10A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "11A":
                                                    BStore.replace("11A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "12":
                                                    BStore.replace("12A" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "1M":
                                                    BStore.replace("1M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "2M":
                                                    BStore.replace("2M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "3M":
                                                    BStore.replace("3M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "4M":
                                                    BStore.replace("4M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "5M":
                                                    BStore.replace("5M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "6M":
                                                    BStore.replace("6M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "7M":
                                                    BStore.replace("7M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "8M":
                                                    BStore.replace("8M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "9M":
                                                    BStore.replace("9M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "10M":
                                                    BStore.replace("10M" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "1F":
                                                    BStore.replace("1F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "2F":
                                                    BStore.replace("2F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "3F":
                                                    BStore.replace("3F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "4F":
                                                    BStore.replace("4F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "5F":
                                                    BStore.replace("5F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "6F":
                                                    BStore.replace("6F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "7F":
                                                    BStore.replace("7F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "8F":
                                                    BStore.replace("8F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "9F":
                                                    BStore.replace("9F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                                                case "10F":
                                                    BStore.replace("10F" + BFill.substring(BFill.length()-1) + B.getBirthStoreKey(), change);
                                                    break;
                            
                                                            }
                                                        }else{
                                                            InvalidErrors();
                                                        }
                                                    }
                                                }
                                                
                                            }while(!CoE.equalsIgnoreCase("C"));
                                                
                                                 }else{
                                    
                                                InvalidErrors();
                                            }         
        }
        
                public void CenoInfo(){
		Cenomar_Storage.put("1p" + Marriage.getCenoName(), Marriage.getWApplicationName());
        Cenomar_Storage.put("2p" + Marriage.getCenoName(), getWApplicantBirthday()); 
        Cenomar_Storage.put("3p" + getCenoName(), getWApplicantPlaceOfBirth());
        Cenomar_Storage.put("4p" + getCenoName(), getWApplicantFatherName());
        Cenomar_Storage.put("5p" + getCenoName(), getWApplicantMotherName()); 
        Cenomar_Storage.put("6p" + getCenoName(), getHApplicantName());
        Cenomar_Storage.put("7p" + getCenoName(),  getHApplicantBirthday());
        Cenomar_Storage.put("8p" + getCenoName(), getHApplicantPlaceOfBirth());
		Cenomar_Storage.put("9p" + getCenoName(), getHApplicantFatherName());
		Cenomar_Storage.put("10p" + getCenoName(), getHApplicantMotherName());
	}

	public void printingCenoForm(){
        System.out.println("   CRS FORM NO. 4 (CENOMAR)");
        System.out.println("\t\t\t\t\t\t\t\t                       Republic of the Philippines");
        System.out.println("\t\t\t\t\t\t\t                             PHILIPPINE STATISTIC AUTHORITY ");
        System.out.println("\t\t\t\t\t\t\t                                        MANILA");
        System.out.println("\t\t\t\t\t\t\t                          OFFICE OF THE CIVIL REGISTRAR GENERAL");
	System.out.println("\t\t\t                       TO WHOM IT MAY CONCERN: ");
	System.out.printf("\t\t\t\t\t We certrify that \t\t\t(1p) %-10s who is alleged to have been", Cenomar_Storage.get("1p" + getCenoName()));
        System.out.printf("\t\t\tborn on %-15s ",Cenomar_Storage.get("2p" + getCenoName()), "\t\tin", Cenomar_Storage.get("p3" + getCenoName()), "\t\tto"  );
	System.out.printf(Cenomar_Storage.get("4p" + getCenoName()) + "\t\tand", Cenomar_Storage.get("5p" + getCenoName()), "\t\tdoes not apprear in our", "\n\t\t\t\t\t\t\t National Indices of Marriages.");
        System.out.println();
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t This certification is based on the records of 1945-2024 marriages enrolle ");
        System.out.println("\t\t\t\t\t\t\tDatebase as of June 30, 2024.");
	System.out.println("\t\t\t\t\t\t\t\t Issued upon the request of " + Cenomar_Storage.get("1p" + getCenoName()) + "for Marriages License.");
			
	}

    // Input Marriage Area
    public void inputMarriageCertificate() {
        MarriageQuestion();
        Scanner scanner = new Scanner(System.in);
        // Wife information input
        System.out.println("\t\t\t\tWife Information");
        System.out.println();

        System.out.print("\t\t\t\tFirst Name: ");
        String firstname = scanner.nextLine();
        setWifeName(firstname);
        System.out.print("\t\t\t\tMiddle Name: ");
        String middlename = scanner.nextLine();
        if(middlename.isEmpty()){
           setWifeMiddle("NA");
        }
        else{
        setWifeMiddle(middlename);
        }
        System.out.print("\t\t\t\tLast Name: ");
        String lastname = scanner.nextLine();
        setWifeLast(lastname);
      
        //Date Of Birth
        boolean birthchecker = true;
        while(birthchecker){
        System.out.print("\t\t\t\tDate of Birth (MM/DD/YYYY): ");
        String dateofbirth = scanner.nextLine();
        
        if(!dateofbirth.matches("\\d{2}/\\d{2}/\\d{4}")){
        
        System.out.println("\t\t\t\tInvalid Input!");
        birthchecker = true;
        }
        else{
            setWifeDateOfBirth(dateofbirth);
            birthchecker = false;
        }

        }
        //Age Checker
        boolean ageChecker = true;
        while (ageChecker) {
            System.out.print("\t\t\t\tAge: ");
            String age = scanner.nextLine();
            if(!age.matches("[0-9]|[0-9]{2}")){
                
                System.out.println("\t\t\t\tInvalid Input");
                ageChecker = true;
            }
            else{
                setWifeAge(age);
                                    ageChecker = false;
            }
        }
        
       

        System.out.print("\t\t\t\tPlace of Birth (City, Province): ");
        String province = scanner.nextLine();
        setWifePlaceOfBirth(province);
        //Gender Checker
        boolean genderChecker = true;
        while(genderChecker){
        
        System.out.print("\t\t\t\tSex(F/M): ");
        String sex = scanner.nextLine().toUpperCase();
        
        if(sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("M")){
        setWifeSex(sex);
        genderChecker =false;
        }
        else{
            System.out.println("\t\t\t\tInvalid Input!");
            genderChecker =true;
        }
    }
        System.out.print("\t\t\t\tCitizenship: ");
        String citizen = scanner.nextLine();
        Marriage.setWifeCitezenship(citizen);

        System.out.print("\t\t\t\tResidence (Province): ");
        String provincename = scanner.nextLine();
        Marriage.setWifeProvince(provincename);

        System.out.print("\t\t\t\tResidence (City/Municipality): ");
        String city = scanner.nextLine();
        Marriage.setWifeCity(city);

        System.out.print("\t\t\t\tResidence (Barangay): ");
        String barangay = scanner.nextLine();
        Marriage.setWifeBarangay(barangay);

        System.out.print("\t\t\t\tResidence (House Number/Street): ");
        String residence = scanner.nextLine();
        Marriage.setWifeStreet(residence);

        System.out.print("\t\t\t\tReligion: ");
        String religion = scanner.nextLine();
        Marriage.setWifeReligion(religion);

        System.out.print("\t\t\t\tCivil status: ");
        String status = scanner.nextLine();
        Marriage.setWifeStatus(status);

        System.out.print("\t\t\t\tFull name of Father: ");
        String father = scanner.nextLine();
        Marriage.setWifeFather(father);

        System.out.print( "\t\t\t\tCitizenship of Father: ");
        String fatherCitizen = scanner.nextLine();
        Marriage.setWifeFatherCitizen(fatherCitizen);

        System.out.print("\t\t\t\tFull name of Mother: ");
        String motherName = scanner.nextLine();
        Marriage.setWifeMother(motherName);

        System.out.print("\t\t\t\tCitizenship of Mother: ");
        String motheCitizen = scanner.nextLine();
        Marriage.setWifeMotherCitizen(motheCitizen);

        // Husband Part
        System.out.println("\n\t\t\t\tHusband Information");
        System.out.println();
        System.out.print("\t\t\t\tFirst Name: ");
        String hfirstname = scanner.nextLine();
        Marriage.setHusbandName(hfirstname);
         

        System.out.print("\t\t\t\tMiddle Name: ");
        String hmiddlename = scanner.nextLine();
        if(hmiddlename.isEmpty()){
            Marriage.setHusbandMiddle("NA");
        }
        else{
            Marriage.setHusbandMiddle(hmiddlename);
        }

        System.out.print("\t\t\t\tLast Name: ");
        String hlastname = scanner.nextLine();
        Marriage.setHusbandLast(hlastname);
        
        //Husband Date Of Birth
        boolean Husbandchcker = true;
        while(Husbandchcker){
        System.out.print("\t\t\t\tDate of Birth (MM/DD/YYYY): ");
        String hdateofbirth = scanner.nextLine();
        if(!hdateofbirth.matches("\\d{2}/\\d{2}/\\d{4}")){
            System.out.println("\t\t\t\tInvalid Input!");
            Husbandchcker = true;
        }
        else{
            Marriage.setHusbandDateOfBirth(hdateofbirth);
            Husbandchcker = false;
        }
        

        }
        // Husband Age Checker
        boolean husbandAGeCHcekr = true;
        while (husbandAGeCHcekr) {
        System.out.print("\t\t\t\tAge: ");
        String hage = scanner.nextLine();
        
        if(!hage.matches("[0-9]|[0-9]{2}")){
            System.out.println("\t\t\t\tInvalid Input");
            husbandAGeCHcekr = true;
        }
        else{
            Marriage.setHusbandAge(hage);
            husbandAGeCHcekr = false;
            
        }
                    }

        System.out.print("\t\t\t\tPlace of Birth (City, Province): ");
        String hprovince = scanner.nextLine();
        Marriage.setHusbandPlaceOfBirth(hprovince);
        //Husband Checker
        boolean husbandChcker = true;
        while(husbandChcker){
        System.out.print("\t\t\t\tSex(f/m): ");
        String hsex = scanner.nextLine().toUpperCase();
        
        if(hsex.equalsIgnoreCase("M") || hsex.equalsIgnoreCase("F")){
        Marriage.setHusbandSex(hsex);
        husbandChcker = false;
        
        
        }
        else{
            System.out.println("\t\t\t\tInvalid Input");
            husbandChcker = true;

        }
                    }

        System.out.print("\t\t\t\tCitizenship: ");
        String hcitizen = scanner.nextLine();
        Marriage.setHusbandCitizen(hcitizen);

        System.out.print("\t\t\t\tResidence (Province): ");
        String hprovincename = scanner.nextLine();
        Marriage.setHusbandProvince(hprovincename);

        System.out.print("\t\t\t\tResidence (City/Municipality): ");
        String hcity = scanner.nextLine();
        Marriage.setHusbandCity(hcity);

        System.out.print("\t\t\t\tResidence (Barangay): ");
        String hbarangay = scanner.nextLine();
        Marriage.setHusbandBarangay(hbarangay);

        System.out.print("\t\t\t\tResidence (House Number/Street): ");
        String hresidence = scanner.nextLine();
        Marriage.setHusbandStreet(hresidence);

        System.out.print("\t\t\t\tReligion: ");
        String hreligion = scanner.nextLine();
        Marriage.setHusbandReligion(hreligion);

        System.out.print("\t\t\t\tCivil status: ");
        String hstatus = scanner.nextLine();
        Marriage.setHusbandStatus(hstatus);

        System.out.print("\t\t\t\tFull name of Father: ");
        String hfather = scanner.nextLine();
        Marriage.setHusbandFather(hfather);

        System.out.print( "\t\t\t\tCitizenship of Father: ");
        String hfatherCitizen = scanner.nextLine();
        Marriage.setHusbandFatherCitizen(hfatherCitizen);

        System.out.print("\t\t\t\tFull name of Mother: ");
        String hmotherName = scanner.nextLine();
        Marriage.setHusbandMother(hmotherName);

        System.out.print("\t\t\t\tCitizenship of Mother: ");
        String hmotheCitizen = scanner.nextLine();
        Marriage.setHusbandMotherCitizen(hmotheCitizen);
        
        System.out.print("\t\t\t\tPlace of Marriage: ");
        String placeMarraige = scanner.nextLine();
        Marriage.setPlaceMarriage(placeMarraige);
        
        System.out.print("\t\t\t\tDate of Marriage: ");
        String dateMarriage = scanner.nextLine();
        Marriage.setDateMarriage(dateMarriage);

    }
    void displayCertificateInformation(){
        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
        System.out.println("\n\t\t\t\t1a. First Name: " + Marriage.getWifeFirst());
        System.out.println("\t\t\t\t1b. Middle Name: " + Marriage.getWifeMiddle());
        System.out.println("\t\t\t\t1c. Last Name: " +  Marriage.getWifeLast());
        System.out.println("\t\t\t\t2. Date of Birth (MM/DD/YYYY): " + Marriage.getWifeDateOfBirth());
        System.out.println("\t\t\t\t3. Age: " + Marriage.getWifeAge());
        System.out.println("\t\t\t\t4. Place of Birth (City, Province): " + Marriage.getWifePlaceOfBirth());
        System.out.println("\t\t\t\t5. Sex(f/m): " + Marriage.getWifeSex());
        System.out.println("\t\t\t\t6. Citizenship: " + Marriage.getWifeCitzen());
        System.out.println("\t\t\t\t7a. Residence (Province): " + Marriage.getWifeProvince());
        System.out.println("\t\t\t\t7b. Residence (City/Municipality): " + Marriage.getWifeCity());
        System.out.println("\t\t\t\t7c. Residence (Baranggay): " + Marriage.getWifeBarangay());
        System.out.println("\t\t\t\t7d. Residence (House Number/Street): " + Marriage.getWifeStreet());
        System.out.println("\t\t\t\t8. Religion: " + Marriage.getWifeReligion());
        System.out.println("\t\t\t\t9. Civil status: " + Marriage.getWifeStatus());
        System.out.println("\t\t\t\t10. Full name of Father: " + Marriage.getWifeFather());
        System.out.println("\t\t\t\t11. Citizenship of Father: " + Marriage.getWifeFatherCitizen());
        System.out.println("\t\t\t\t12. Full name of Mother: " + Marriage.getWifeMother());
        System.out.println("\t\t\t\t13. Citizenship of Mother: " + Marriage.getWifeMotherCitizen());
        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
        System.out.println("\t\t\t\t14a. First Name: " + Marriage.getHusbandFirst());
        System.out.println("\t\t\t\t14b. Middle Name: " + Marriage.getHusbandMiddle());
        System.out.println("\t\t\t\t14c. Last Name: " + Marriage.getHusbandLast());
        System.out.println("\t\t\t\t15. Date of Birth (MM/DD/YYYY): " + Marriage.getHusbandDateOfBirth());
        System.out.println("\t\t\t\t16. Age: " + Marriage.getHusbandAge());
        System.out.println("\t\t\t\t17. Place of Birth (City, Province): " + Marriage.getHusbandPlaceOfBirth());
        System.out.println("\t\t\t\t18. Sex(f/m): " + Marriage.getHusbandSex());
        System.out.println("\t\t\t\t19. Citizenship: " + Marriage.getHusbandCitizen());
        System.out.println("\t\t\t\t20a. Residence (Province): " + Marriage.getHusbandProvince());
        System.out.println("\t\t\t\t20b. Residence (City/Municipality): " + Marriage.getHusbandCity());
        System.out.println("\t\t\t\t20c. Residence (Baranggay): " + Marriage.getHusbandBarangay());
        System.out.println("\t\t\t\t20d. Residence (House Number/Street): " + Marriage.getHusbandStreet());
        System.out.println("\t\t\t\t21. Religion: " + Marriage.getHusbandReligion());
        System.out.println("\t\t\t\t22. Civil status: " + Marriage.getHusbandStatus());
        System.out.println("\t\t\t\t23. Full name of Father: " + Marriage.getHusbandFather());
        System.out.println("\t\t\t\t24. Citizenship of Father: " + Marriage.getHusbandFatherCitizen());
        System.out.println("\t\t\t\t25. Full name of Mother: " + Marriage.getHusbandMother());
        System.out.println("\t\t\t\t26. Citizenship of Mother: " + Marriage.getHusbandMotherCitizen());
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tPlace of Marriage" + Marriage.getPlaceMarriage());
        System.out.println("\t\t\t\tDate of Marriage" + Marriage.getDateMarriage());
        System.out.println("\t\t\t\tThis is to certify that I " + Marriage.getWifeFirst()+" "+Marriage.getWifeMiddle()+" "+Marriage.getWifeLast() +" and "+ Marriage.getHusbandFirst()+" "+Marriage.getHusbandMiddle()+" "+Marriage.getHusbandLast()
                            +",\n\t\t\t\tboth of legal age, of our own free will and accord,"
                            + "\n\t\t\t\tthe presence of the person solemmizing this marriage and of the witness named below,"
                            + "\n\t\t\t\ttake each other as husband and wife.");
    }
    
   
    
    
    //Cenomar Question 
    public void CenomarFormQuestion(){
        queue.put("1p", "Name:");
        queue.put("2p","Date of Birth(MM/DD/YYYY): ");
        queue.put("3p", "Place Of Birth: " );
        queue.put("4p", "Father Name: ");
        queue.put("5p","Mother Name:  ");
        queue.put("6p", "Name:");
        queue.put("7p","Date of Birth(MM/DD/YYYY): ");
        queue.put("8p", "Place Of Birth: " );
        queue.put("9p", "Father Name: ");
        queue.put("10p","Mother Name:  ");
        
     
    
    }
    public void CenomarFillUp(){
        Scanner scanner = new Scanner(System.in);
                CenomarFormQuestion(); 
                // Wife information input
                System.out.println("\t\t\t\tWife Cenomar Information");
                System.out.println();
    
                System.out.print("\t\t\t\tName: ");
                String Wname = scanner.nextLine();
                setWApplicantName(Wname);
                //Date Of Birth
                boolean birthchecker = true;
                while(birthchecker){
                System.out.print("\t\t\t\tDate of Birth (MM/DD/YYYY): ");
                String dateofbirth = scanner.nextLine();
                
                if(!dateofbirth.matches("\\d{2}/\\d{2}/\\d{4}")){
                
                System.out.println("\t\t\t\tInvalid Input!");
                birthchecker = true;
                }
                else{
                    setWApplicantBirthday(dateofbirth);
                    birthchecker = false;
                }
    
                }
                System.out.print("\t\t\t\tPlace Of Place birth: ");
                String wifePlaceOfBirth = scanner.nextLine();
                setWApplicantPlaceOfBirth(wifePlaceOfBirth);
                System.out.print("\t\t\t\tFull name of Father: ");
                String father = scanner.nextLine();
                setWApplicantFatherName(father);
                System.out.print("\t\t\t\tFull name of Mother: ");
                String motherName = scanner.nextLine();
                setWApplicantMotherName(motherName);
    
    
                // Husband information input
                System.out.println();
                System.out.println("\t\t\t\tHusband Cenomar Information");
                System.out.println();
                
                System.out.print("\t\t\t\tName: ");
                String Hname = scanner.nextLine();
                setHApplicantName(Hname);
                //Date Of Birth
                boolean Hbirthchecker = true;
                while(Hbirthchecker){
                System.out.print("\t\t\t\tDate of Birth (MM/DD/YYYY): ");
                String Hdateofbirth = scanner.nextLine();
                
                if(!Hdateofbirth.matches("\\d{2}/\\d{2}/\\d{4}")){
                
                System.out.println("\t\t\t\tInvalid Input!");
                Hbirthchecker = true;
                }
                else{
                    setHApplicantBirthday(Hdateofbirth);
                    Hbirthchecker = false;
                }
    
                }
                System.out.print("\t\t\t\tPlace Of Birth: ");
                String husbandPlaceOfBirth = scanner.nextLine();
                setHApplicantPlaceOfBirth(husbandPlaceOfBirth);
                System.out.print("\t\t\t\tFull name of Father: ");
                String Hfather = scanner.nextLine();
                setHApplicantFather(Hfather);
                System.out.print("\t\t\t\tFull name of Mother: ");
                String HmotherName = scanner.nextLine();
                setHApplicantMother(HmotherName);
                
    
    
    }
    public void displayCenomar(){
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
            System.out.println("\n\t\t\t\t1p. First Name: " +getHApplicantName());
            System.out.println("\t\t\t\t2p. Date of Birth (MM/DD/YYYY): " + getWApplicantBirthday());
            System.out.println("\t\t\t\t3p. Place of Birth: " + getWApplicantPlaceOfBirth());
            System.out.println("\t\t\t\t4p. Father's Name " + getWApplicantFatherName());
            System.out.println("\t\t\t\t5p. Mother's Name " + getWApplicantMotherName());
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
            System.out.println("\n\t\t\t\t6p. First Name: " + getWApplicationName());
            System.out.println("\t\t\t\t7p. Date of Birth (MM/DD/YYYY): " + getHApplicantBirthday());
            System.out.println("\t\t\t\t8p. Place of Birth: " + getHApplicantPlaceOfBirth());
            System.out.println("\t\t\t\t9p. Father's Name " + getHApplicantFatherName());
            System.out.println("\t\t\t\t10p. Mother's Name " + getHApplicantMotherName());
    
    }
    
    public void EditCenomar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tEnter the line number you want to edit: ");
                String lineNumber = scanner.nextLine().toLowerCase();
                    
                
                System.out.println(queue.get(lineNumber));
                System.out.print("\tEnter the new value: ");
                String newValue = scanner.nextLine();
    
                switch(lineNumber) {
                    case "1p":    
                        setWApplicantName(newValue);
                        break;
                    case "2p":
                       setWApplicantBirthday(newValue);
                        break;
                case "3p":
                setWApplicantPlaceOfBirth(newValue);
                    case "4p":
                        setWApplicantFatherName(newValue);
                        break;
                    case "5p":
                        setWApplicantMotherName(newValue);
                        break;
                    case "6p":
                        setHApplicantName(newValue);
                        break;
                    case "7p":
                        setHApplicantBirthday(newValue);;
                        break;
                    case "8p":
                        setHApplicantPlaceOfBirth(newValue);
                    case "9p":
                        setHApplicantFather(newValue);;
                        break;
                    case "10p":
                        setHApplicantMother(newValue);;
                        break;
    
        
    }
    }
    public void printingForm(){
        System.out.println("\t\t\t\t\t=======================================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t                       Republic of the Philippines");
                System.out.println("\t\t\t\t\t\t\t                            OFFICE OF THE CIVIL REGISTRAR GENERAL");
                System.out.println("\t\t\t\t\t\t\t\t                         CERTIFICATE OF MARRIAGE");
        System.out.println("\t\t\t\t\t=======================================================================================================================");	 
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t|WIFE\t\t\t\t\t|HUSBAND");
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tName of Contracting Parties\t\t|(1a) %-14s|(1b) %-14s|(14a) %-14s|(14b) %-14s\n\t\t\t\t\t|(1c) %-34s|(14c) %-14s\n", 
                            Marriage_Storage.get("1a" + getSMName()), Marriage_Storage.get("14a" + getSMName()), Marriage_Storage.get("1b" + getSMName()), Marriage_Storage.get("14b" + getSMName()),Marriage_Storage.get("1c" + getSMName()),Marriage_Storage.get("14c" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tDate of Birth/Age\t\t\t|(2) %-15s|(3) %-15s|(15) %-15s|(16) %-15s\n",Marriage_Storage.get("15" + getSMName()),Marriage_Storage.get("2" + getSMName()),Marriage_Storage.get("16" + getSMName()), Marriage_Storage.get("3" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tPlace of Birth\t\t\t\t|(4) %-35s|(17) %-15s\n", Marriage_Storage.get("17" + getSMName()),Marriage_Storage.get("4" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tSex (Male/Female)\t\t\t|(5) %-30s\t|(18) %-10s\n", Marriage_Storage.get("18" + getSMName()), Marriage_Storage.get("5" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(6) %-30s\t|(19) %-20s\n",Marriage_Storage.get("19" + getSMName()),Marriage_Storage.get("6" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tResidence\t\t\t\t|(7a) %-14s|(7a) %-14s|(20a) %-14s|(20b) %-14s\n\t\t\t\t\t|(7c) %-14s|(7d) %-14s|(20c) %-14s|(20d) %-14s\n",
                Marriage_Storage.get("7a" + getSMName()), Marriage_Storage.get("20a" + getSMName()),Marriage_Storage.get("7b" + getSMName()),
                Marriage_Storage.get("20b" + getSMName()),Marriage_Storage.get("7c" + getSMName()),Marriage_Storage.get("7d" + getSMName()),Marriage_Storage.get("20c" + getSMName()),Marriage_Storage.get("20d" + getSMName()));	   
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tReligion\t\t\t\t|(8) %-35s|(21) %-20s\n",Marriage_Storage.get("8" + getSMName()), Marriage_Storage.get("21" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCivil Status\t\t\t\t|(9) %-35s|(22) %-15s\n",Marriage_Storage.get("9" + getSMName()),Marriage_Storage.get("22" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tName of Father\t\t\t\t|(10) %-34s|(23) %-15s\n", Marriage_Storage.get("10" + getSMName()), Marriage_Storage.get("23" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(11) %-34s|(24) %-15s\n", Marriage_Storage.get("11" + getSMName()),Marriage_Storage.get("24" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tName of Mother\t\t\t\t|(12) %-34s|(25) %-15s\n", Marriage_Storage.get("12" + getSMName()),Marriage_Storage.get("25" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(13) %-34s|(26) %-15s\n", Marriage_Storage.get("13" + getSMName()),Marriage_Storage.get("26" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tPlace of Marriage: "+ Marriage_Storage.get("27" + getSMName()));
        System.out.println("\t\t\t\t\tDate Of Marriage: "+ Marriage_Storage.get("28" + getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
}
public void SMarriageinfo(){
    Marriage_Storage.put("1a" + getSMName(), getWifeFirst());
    Marriage_Storage.put("1b" + getSMName(), getWifeMiddle());
    Marriage_Storage.put("1c" + getSMName(), getWifeLast());
    Marriage_Storage.put("2" + getSMName(), getWifeDateOfBirth());
    Marriage_Storage.put("3" + getSMName(), getWifeAge()); 
    Marriage_Storage.put("4" + getSMName(), getWifePlaceOfBirth());
    Marriage_Storage.put("5" + getSMName(),  getWifeSex());
    Marriage_Storage.put("6" + getSMName(), getWifeCitzen());
    Marriage_Storage.put("7a" + getSMName(), getWifeProvince());
    Marriage_Storage.put("7b" + getSMName(),  getWifeCity());
    Marriage_Storage.put("7c" + getSMName(), getWifeBarangay());
    Marriage_Storage.put("7d" + getSMName(), getWifeStreet());
    Marriage_Storage.put("8" + getSMName(),  getWifeReligion());
    Marriage_Storage.put("9" + getSMName(), getWifeStatus());
    Marriage_Storage.put("10" + getSMName(),getWifeFather());
    Marriage_Storage.put("11" + getSMName(),  getWifeFatherCitizen());
    Marriage_Storage.put("12" + getSMName(), getWifeMother());
    Marriage_Storage.put("13" + getSMName(),getWifeMotherCitizen());
    
    //HUSBAND
    Marriage_Storage.put("14a" + getSMName(), getHusbandFirst());
    Marriage_Storage.put("14b" + getSMName(), getHusbandMiddle());
    Marriage_Storage.put("14c" + getSMName(), getHusbandLast());
    Marriage_Storage.put("15" + getSMName(), getHusbandDateOfBirth());
    Marriage_Storage.put("16" + getSMName(), getHusbandAge());
    Marriage_Storage.put("17" + getSMName(), getHusbandPlaceOfBirth());
    Marriage_Storage.put("18" + getSMName(), getHusbandSex());
    Marriage_Storage.put("19" + getSMName(), getHusbandCitizen());
    Marriage_Storage.put("20a" + getSMName(),  getHusbandProvince());
    Marriage_Storage.put("20b" + getSMName(),  getHusbandCity());
    Marriage_Storage.put("20c" + getSMName(), getHusbandBarangay());
    Marriage_Storage.put("20d" + getSMName(), getHusbandStreet());
    Marriage_Storage.put("21" + getSMName(), getHusbandReligion());
    Marriage_Storage.put("22" + getSMName(), getHusbandStatus());
    Marriage_Storage.put("23" + getSMName(),  getHusbandFather());
    Marriage_Storage.put("24" + getSMName(),   getHusbandFatherCitizen());
    Marriage_Storage.put("25" + getSMName(), getHusbandMother());
    Marriage_Storage.put("26" + getSMName(), getHusbandMotherCitizen());
    Marriage_Storage.put("27" + getSMName(), getPlaceMarriage());
    Marriage_Storage.put("28" + getSMName(), getDateMarriage());
    
    MS.add( getWifeFirst()+ " " + getWifeMiddle()+ " " + getWifeLast());
    
    }
    
       
}
        