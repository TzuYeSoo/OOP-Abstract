package government.agency;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.io.IOException;

public class GOVERNMENTAGENCY {
	
    
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
	    static Birth_Setter B = new Birth_Setter();
	    
//Child HashMaps Storages
	    public static LinkedHashMap <String, String>BStore  = new LinkedHashMap();
	    public static Queue <String> BS = new LinkedList();
	    private static String Name;
	    private static int Navi = 1;
	    private static LinkedHashMap <String, String> BBStore = new LinkedHashMap();
            static LinkedHashMap <Object, String> Birth_Request = new LinkedHashMap();
            
            //R Questions HashMap
	    
	    
	    
//Loops Boolean	    
	    static boolean MainLoop = true, RF = true, BDML = true, YN = true;
            static String PE, PD, PYN, CE,BFill, RYN, YorN, NoC;
	    
	    
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
		            		   BDML = false;
		            		   break;
		            	   case "M":
		            		   
		            		   BDML = false;
		            		   break;   
		            	   case "D":
		            		   
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
                                       if(Birth_ACode.get(BFill) == "Aprrove"){
                                           System.out.print("This Certificate have been Already approve and certificate is ready"
                                                   + "\n\t\t\t\t\tif you want another copy press N, if no press X"
                                                   + "\t\t\t\t\t[N] New Coppy"
                                                   + "\t\t\t\t\t[X] Exit: ");
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
                                       }

                                        }
                                   break;
                                       case "A":
                                           
                                           System.out.print("\t\t\t\t\tEnter the Code Number That have been given to you after your Fill Up Form: ");
                                           String AlCode = scn.next().toUpperCase();
                                           
                                           if(Birth_ACode.containsKey(AlCode)){
                                               if(Birth_ACode.get(AlCode) == "Approve"){
                                                   BirthNavi = AlCode.substring(AlCode.length() - 1);
                                                   B.setBirthStoreKey(Birth_Code.get(AlCode));                                               
                                                   do{
                                                   System.out.println("The Code Have been Approve!!");
                                                   System.out.println("Choose the Method you want"
                                                           + "\n[P] Pick Up"
                                                           + "\n[D] Delivery");
                                                   PD = scn.next();
                                                   
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

                   System.out.print("\t\t\t\t1A. Child First Name: ");
                   scn.nextLine();
                   Fname = scn.nextLine().toUpperCase();
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
            B.setBirthStoreKey(B.getFname());
            Birth_Storage();

        	
        }else if(CoE.equals("E")){
        	
            
             System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
             System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                     + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
             scn.nextLine();
             String edit = scn.nextLine().toUpperCase();
             System.out.println(edit);
             String[] Birth_editor = edit.split(" ");
             
             for(String a: Birth_editor) {
		               System.out.println(a);
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
        
                    Birth_Code.put( "B" + BCode_Num, B.getBirthStoreKey());
                    Birth_ACode.put("B" + BCode_Num, "Request");
                    
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\tThank You for Registering!");
                    System.out.println("\t\t\t\t\t\tWarning do not show this code to anyone!!!!");
                    System.out.println("\t\t\t\tHeres your Code Number if you ever wanted the Copy of the certificate: B" + BCode_Num);
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");

                    BCode_Num++;
        
        
		
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
	        
	       
	        BS.add(BStore.get("1A" + B.getBirthStoreKey() + " " + BStore.get("2A" + B.getBirthStoreKey()) + " " + BStore.get("3A" + B.getBirthStoreKey())));
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
                                    while(Amount.matches("[0-9]{1,}")){
                                    System.out.print("\t\t\t\tEnter Amount paying: ");
                                    Amount = scn.next();
                                    }
                                    double change = Double.parseDouble(Amount) - Price;
                                    System.out.println(change);
                                    if(change > 0){
                                        break;
                                        }   
                                    }
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
                    
                    System.out.println("\t\t\t\t\tNew = No Request Yet"
                            + "\n\t\t\t\t\tFalse = Request Sent But not Approve"
                            + "\n\t\t\t\t\tTrue  = Request Approve");
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
                    System.out.println("\t\t\t\t\t\t|Request = Request Sent But not Approve             |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                    for(Map.Entry<Object, String> eh : Birth_Code.entrySet()){
                
                    if(Birth_ACode.get(eh.getKey()) == "Request"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Birth_ACode.get(eh.getKey()));
                    }
                
                    
                    }
                    System.out.println("\t\t\t\t\t\t|Denied = Request Due to Invalid Inputs             |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                    for(Map.Entry<Object, String> eh : Birth_Code.entrySet()){
                
                    if(Birth_ACode.get(eh.getKey()) == "Denied"){
                        
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Birth_ACode.get(eh.getKey()));
                        
                        }
                    }
            
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
                            System.out.print(".");
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
                            System.out.print(".");
                            
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
}
        