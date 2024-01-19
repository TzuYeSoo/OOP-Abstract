package government.agency;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class GOVERNMENTAGENCY {
	
//Cenomar
        static private String WName, WDate, WPlace, WMother, WFather;
        static private String FName, FDate, FPlace, FFather, FMother;
        static int CNavi = 1;
        static int CCode_Num = 990001;
        static LinkedHashMap <Object, String> Cenomar_Code = new LinkedHashMap();
        static LinkedHashMap <Object, String> Cenomar_CCode = new LinkedHashMap();
        static LinkedHashMap <Object, String> Cenomar_Request = new LinkedHashMap();
        static LinkedHashMap <Object, String> Admin_CStore = new LinkedHashMap();
        static LinkedHashMap <Object, String> Cenomar_Delete = new LinkedHashMap();
        static HashMap <String, String> Cenomar_Storage = new HashMap <String, String>();
        static String CenoNavi;
//marraige
        static String WFname, WMname, WLname, WBD, WAGE;
        static String HFname, HMname, HLname, HBD, HAGE;
        
        static Marriage_Setter Marriage = new Marriage_Setter();
        private static Map queue = new HashMap();
        private static Map ques = new HashMap();
        static int MNavi = 1;
        static String MarriageNavi, MFill;
        static int MCode_Num = 1090001;
        static LinkedHashMap <Object, String> Marriage_Storage = new LinkedHashMap();
        static LinkedHashMap <Object, String> Marriage_Code = new LinkedHashMap();
        static LinkedHashMap <Object, String> Marriage_MCode = new LinkedHashMap();
        static LinkedHashMap <Object, String> Marriage_Request = new LinkedHashMap();
        static LinkedHashMap <Object, String> Admin_MStore = new LinkedHashMap();
        static LinkedHashMap <Object, String> Marriage_Delete = new LinkedHashMap();
        
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
	    static Birth_Setter B = new Birth_Setter();
	    
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
	    static boolean MainLoop = true, RF = true, BDML = true;
            static String PE, PD, BDM, CE,BFill, RYN, YorN, NoC, AlCode, Edit_Name, YoN, AdminPurp, CFill, Purp, Purpose, NA, NX, Another = "1";
	    static String Cont, PDName, Price, Copy, Amount, Address;
	    static double change;
	static Scanner scn = new Scanner(System.in);

	
	public static void main (String[]args) throws InterruptedException, IOException {
            
		
			Birth_Question();
                        Cenomar_Question();
                        Marriage_Question();
			
			do {
       System.out.println("\n\t\t\t=============================================================================================================================");
       System.out.print("\t\t\t\t\t\t\t           ________  ____  ____  _______   __    _____  ___      \n" +
                        "\t\t\t\t\t\t\t          /\"       )(\"  _||_ \" ||   _  \"\\ |\" \\  (\\\"   \\|\"  \\     \n" +
                        "\t\t\t\t\t\t\t         (:   \\___/ |   (  ) : |(. |_)  :)||  | |.\\\\   \\    |    \n" +
                        "\t\t\t\t\t\t\t          \\___  \\   (:  |  | . )|:     \\/ |:  | |: \\.   \\\\  |    \n" +
                        "\t\t\t\t\t\t\t          __/  \\\\   \\\\ \\__/ // (|  _  \\\\ |.  | |.  \\    \\. |    \n" +
                        "\t\t\t\t\t\t\t          /\" \\   :)  /\\\\ __ //\\ |: |_)  :)/\\  |\\|    \\    \\ |    \n" +
                        "\t\t\t\t\t\t\t         (_______/  (__________)(_______/(__\\_|_)\\___|\\____\\)    \n" +
                        "\t\t\t\t\t\t\t                                                                    \n" +
                        "\t\t\t\t\t\t\t      __       _______    _______  _____  ___    ______   ___  ___  \n" +
                        "\t\t\t\t\t\t\t     /\"\"\\     /\" _   \"|  /\"     \"|(\\\"   \\|\"  \\  /\" _  \"\\ |\"  \\/\"  | \n" +
                        "\t\t\t\t\t\t\t    /    \\   (: ( \\___) (: ______)|.\\\\   \\    |(: ( \\___) \\   \\  /  \n" +
                        "\t\t\t\t\t\t\t   /' /\\  \\   \\/ \\       \\/    |  |: \\.   \\\\  | \\/ \\       \\\\  \\/   \n" +
                        "\t\t\t\t\t\t\t  //  __'  \\  //  \\ ___  // ___)_ |.  \\    \\. | //  \\ _    /   /    \n" +
                        "\t\t\t\t\t\t\t /   /  \\\\  \\(:   _(  _|(:      \"||    \\    \\ |(:   _) \\  /   /     \n" +
                        "\t\t\t\t\t\t\t(___/    \\___)\\_______)  \\_______) \\___|\\____\\) \\_______)|___/      \n" +
                        "\t\t\t\t\t\t\t"
		                + "\n\t\t\t\t\t\t\t  [A] Main Admin"
		                + "\t  [S] Semi Admin "
		                + "\t  [G] Guest\n"
                                + "\n\t\t\t\t\t\t\t\t\t\t    Your Input: ");
		        Purpose = scn.next().toUpperCase();
		        
		        switch(Purpose) {
		        case "A":
		        	MainAdmin();
		        	break;
		        case "S":
                                Semi_Admin_Login();
                                BDMQuestions();
                                BDM = scn.next();
                                
                                switch(BDM){
                                    case "B":
                                        Birth_Semi_Admin();
                                        break;
                                    case "C":
                                        Cenomar_Semi_Admin();
                                        break;
                                    case "M":
                                        Marriage_Semi_Admin();
                                        break;
                                }
		        	break;
		        case "G":
		        	do {
		        	   System.out.println();
		               System.out.print("\t\t\t------------------------------------------------------------------------------------------------------------------------"
		                       + "\n\t\t\t\t\t\t\t\t\t\tGovernment Agency"
		                       + "\n\t\t\t\t\t\t\t\t\t\t[F] Fill Up Form"
		                       + "\n\t\t\t\t\t\t\t\t\t\t[R] Request Copy"
		                       + "\n\t\t\t\t\t\t\t\t\t\tYour Input: ");
		               
		               Purp = scn.next().toUpperCase();
		               System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
		               			
		               switch(Purp) {
		               
		               case "F":
		            	   do{
		            		   
		            	   BDMQuestions();
		            	   BDM = scn.next().toUpperCase();
		            	   
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
                                           
                                   case "C":
                                        Cenomar_FillUp();
                                        Marriage.setCenoName(Marriage.getWApplicationName());
                                        Cenomar_Storage();
                                        
                                        Cenomar_Code.put("C" + CCode_Num, Marriage.getCenoName());
                                        Cenomar_CCode.put("C" + CCode_Num, "Request");
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("\t\t\t\t\t\tThank You for Registering!");
                                        System.out.println("\t\t\t\t\t\tWarning do not show this code to anyone!!!!");
                                        System.out.println("\t\t\t\tHeres your Code Number if you ever wanted the Copy of the certificate: B" + CCode_Num);
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        CCode_Num++;
                                        break;
		            	   case "M":
                                        inputMarriageCertificate();
                                        Marriage.setSMName(Marriage.getWifeFirst() + " " + Marriage.getWifeMiddle() + " " + Marriage.getWifeLast());
                                        Marriage_Store();
                                        
                                        Marriage_Code.put("M" + MCode_Num, Marriage.getSMName());
                                        Marriage_MCode.put("M" + MCode_Num, "Request");
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println("\t\t\t\t\t\tThank You for Registering!");
                                        System.out.println("\t\t\t\t\t\tWarning do not show this code to anyone!!!!");
                                        System.out.println("\t\t\t\tHeres your Code Number if you ever wanted the Copy of the certificate: M" + MCode_Num);
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        MCode_Num++;
		            		   break;   
                                   default:
                                       InvalidErrors();
		            	   		}
		            	   }while(!BDM.matches("M|B|C"));
                                   
		            	   break;
		               case "R":
		            	   do{
                                   System.out.print("\t\t\t\t\t\tRequest Copy Options"
                                           + "\n\t\t\t\t\t\t[N] New Request"
                                           + "\n\t\t\t\t\t\t[A] Already Request: ");
                                    NA = scn.next().toUpperCase();
                                   
                                   switch(NA){
                                       
                                       case "N":
                                           
                                           do{
                                               BDMQuestions();
                                               BDM = scn.next().toUpperCase();
                                               
                                               switch(BDM){
                                                   case "B":
                                                       Birth_NewReq();
                                                       break;
                                                   case "M":
                                                       Marriage_NewReq();
                                                       break;
                                                       
                                                   case "C":
                                                       Cenomar_NewReq();
                                                       break;
                                               }
                                               
                                           }while(BDM.matches("B|D|C"));
                                           
                                   
                                   break;
                                       case "A":
                                           
                                            do{
                                               BDMQuestions();
                                               BDM = scn.next().toUpperCase();
                                               
                                               switch(BDM){
                                                   case "B":
                                                       Birth_AlreadyReq();
                                                       break;
                                                   case "M":
                                                       Marriage_AlreadyReq();
                                                       break;
                                                       
                                                   case "C":
                                                       Cenomar_AlreadyReq();
                                                       break;
                                                   default:
                                                       InvalidErrors();
                                               }
                                               
                                           }while(BDM.matches("B|D|C"));
                                       
                                       break;
                                       default:
                                           
                                           InvalidErrors();
                                   }
                               }while(!NA.matches("N|A"));
		            	   break;
		               default:
		            	   
		            	   InvalidErrors();
		            	   
		               }
		        	}while(!Purp.matches("R|F"));
		               
		        	
		        	break;
		        	
		       default:
		    	   InvalidErrors();
		    	   
		        }
                        NewTrans();
			}while(NX.equals("N"));
		
	}
	
	
	public static void Birth() {
            
		  System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tChild information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   scn.nextLine();
                   System.out.print("\t\t\t\t1A. Child First Name: ");
                   Fname = scn.nextLine().toUpperCase();
                   while(!Fname.matches("[A-Z ]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t1A. Child First Name: ");
                   Fname = scn.nextLine().toUpperCase();
                   }
                   B.setFname(Fname);
                   
                   
                   System.out.print("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): ");
                   Mname = scn.next().toUpperCase();
                   while(!Mname.matches("[A-Z ]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t2A. Child Middle Name (Enter NA if does'nt have one): ");
                   Mname = scn.next().toUpperCase();
                   }
                   B.setMname(Mname);
                   
                   
                   System.out.print("\t\t\t\t3A. Child Last Name: ");
                   Lname = scn.next().toUpperCase();
                   while(!Lname.matches("[A-Z ]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t3A. Child Last Name: ");
                   Lname = scn.next().toUpperCase();
                   }
                   B.setLname(Lname);
                   
                   
                   System.out.print("\t\t\t\t4A. Child Suffix (NA if not have): ");
                   suff = scn.next().toUpperCase();
                   while(!suff.matches("JR.|JR|NA")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t4A. Child Suffix (NA if not have): ");
                   suff = scn.next().toUpperCase();
                   }    
                   B.setSuff(suff);
                   
                   
                   System.out.print("\t\t\t\t5A. Child Birthday(MM/DD/YYYY): ");
                   BD = scn.next();
                   while(!BD.matches("\\d{2}/\\d{2}/\\d{4}")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t5A. Child Birthday(MM/DD/YYYY): ");
                   BD = scn.next();
                   }
                   B.setBD(BD);
                   
                   
                   System.out.print("\t\t\t\t6A. Child Sex(f/m): ");
                   gen = scn.next().toUpperCase();
                   while(!gen.matches("[F|M]{1}")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t6A. Child Sex(f/m): ");
                   gen = scn.next().toUpperCase();
                   }
                   B.setgen(gen);
                   
                   
                   System.out.print("\t\t\t\t7A. Child Place of Bitht(Province): ");
                   Provi = scn.next().toUpperCase();
                   while(!Provi.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t7A. Child Place of Bitht(Province): ");
                   Provi = scn.next().toUpperCase();
                   }    
                   B.setprovi(Provi);
                   
                   
                   System.out.print("\t\t\t\t8A. Child Place of Birth (City/Municipality): " );
                   City = scn.next().toUpperCase();
                   while(!City.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t8A. Child Place of Birth (City/Municipality): " );
                   City = scn.next().toUpperCase();
                   }
                   B.setCity(City);
                   
                   System.out.print("\t\t\t\t9A. Child Place of Birth(Hospital/Clinic/Institution): ");
                   scn.nextLine();
                   Hos = scn.nextLine().toUpperCase();
                   while(!Hos.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t9A. Child Place of Birth(Hospital/Clinic/Institution): ");
                   Hos = scn.nextLine().toUpperCase();
                   }    
                   B.setHos(Hos);
                   
                   System.out.print("\t\t\t\t10A. Type of Birth(Single/Twin/Triplet/etc.): ");
                   TB = scn.next().toUpperCase();
                   while(!TB.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t10A. Type of Birth(Single/Twin/Triplet/etc.): ");
                   TB = scn.next().toUpperCase();
                   }
                   B.setTB(TB);
                       
                   System.out.print("\t\t\t\t11A. if multiple birth, child was (first/second/third/fourth/etc.): ");
                   TBP = scn.next().toUpperCase();
                   while(!TBP.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t11A. if multiple birth, child was (first/second/third/fourth/etc.): ");
                   TBP = scn.next().toUpperCase();
                   }
                   B.setTBP(TBP);
                   
                   System.out.print("\t\t\t\t12A. Child Weight At Birth: ");
                   weigh = scn.next(); 
                   while(!weigh.matches("[0-9]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t12A. Child Weight At Birth: ");
                   weigh = scn.next();
                   }
                   B.setweigh(weigh);
                   
                   //Mothers Info
                  System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tMother information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.print("\t\t\t\t1M. Mother First Name: ");
                   scn.nextLine();
                   MFname = scn.nextLine().toUpperCase();
                   while(!MFname.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t1M. Mother First Name: ");
                   MFname = scn.nextLine().toUpperCase();
                   }
                   B.setMFname(MFname);
                                     
                   System.out.print("\t\t\t\t2M. Mother Middle Name: ");
                   MMname = scn.nextLine().toUpperCase(); 
                   while(!MMname.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t2M. Mother Middle Name: ");
                   MMname = scn.nextLine().toUpperCase(); 
                   }
                   B.setMMname(MMname);
                   
                   System.out.print("\t\t\t\t3M. Mother Last Name: ");
                   MLname = scn.nextLine().toUpperCase();
                   while(!MLname.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t3M. Mother Last Name: ");
                   MLname = scn.nextLine().toUpperCase();
                   }
                   B.setMLname(MLname);
                   
                   System.out.print("\t\t\t\t4M. Mother Citizenship: ");
                   MCiten = scn.next().toUpperCase();
                   while(!MCiten.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t4M. Mother Citizenship: ");
                   MCiten = scn.next().toUpperCase();
                   }
                   B.setMCite(MCiten);
                   
                   System.out.print("\t\t\t\t5M. Mother Religion: ");
                   scn.nextLine();
                   MReligion = scn.nextLine().toUpperCase();
                   while(!MReligion.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t5M. Mother Religion: ");
                   MReligion = scn.nextLine().toUpperCase();
                   }
                   B.setMReligion(MReligion);
                   
                   System.out.print("\t\t\t\t6M. Mother Occupation: ");
                   Mocc = scn.nextLine().toUpperCase(); 
                   while(!Mocc.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t6M. Mother Occupation: ");
                   Mocc = scn.nextLine().toUpperCase(); 
                   }
                   B.setMoc(Mocc);
                   
                   System.out.print("\t\t\t\t7M. Mother Age at time of this birth: ");
                   Mage = scn.next();
                   while(!Mage.matches("[0-1]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t7M. Mother Age at time of this birth: ");
                   Mage = scn.next();
                   }
                   B.setMage(Mage);
                   
                   System.out.print("\t\t\t\t8M. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   MHos = scn.nextLine().toUpperCase();
                   while(!MHos.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t8M. Residence(House Number/Steet, Barangay): ");
                   MHos = scn.nextLine().toUpperCase();
                   }
                   B.setMHos(MHos);
                   
                   System.out.print("\t\t\t\t9M. Residence Munipality: ");
                   MCity = scn.nextLine().toUpperCase();
                   while(!MCity.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t9M. Residence Munipality: ");
                   MCity = scn.nextLine().toUpperCase();
                   }
                   B.setMCity(MCity);
                   
                   System.out.print("\t\t\t\t10M. Province: ");
                   Mprovi = scn.nextLine().toUpperCase();
                   while(!Mprovi.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t10M. Province: ");
                   Mprovi = scn.nextLine().toUpperCase();
                   }
                   B.setMprovi(Mprovi);
                  
                  // Father Info
                  
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\t\t\t\t\t\t\t\t\t\tFather Information");
                   System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                   
                   System.out.print("\t\t\t\t1F. Father First Name: ");
                   scn.nextLine();
                   FFname = scn.nextLine().toUpperCase();
                   while(!FFname.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t1F. Father First Name: ");
                   FFname = scn.nextLine().toUpperCase();
                   }
                   B.setFFname(FFname);
                                     
                   System.out.print("\t\t\t\t2F. Father Middle Name: ");
                   FMname = scn.nextLine().toUpperCase(); 
                   while(!FMname.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t2F. Father Middle Name: ");
                   FMname = scn.nextLine().toUpperCase(); 
                   }
                   B.setFMname(FMname);
                   
                   System.out.print("\t\t\t\t3F. Father Last Name: ");
                   FLname = scn.nextLine().toUpperCase();
                   while(!FLname.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t3F. Father Last Name: ");
                   FLname = scn.nextLine().toUpperCase();
                   }
                   B.setFLname(FLname);
                   
                   System.out.print("\t\t\t\t4F. Father Citizenship: ");
                   FCiten = scn.next().toUpperCase();
                   while(!FCiten.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t4F. Father Citizenship: ");
                   FCiten = scn.next().toUpperCase();
                   }
                   B.setFCite(FCiten);
                   
                   System.out.print("\t\t\t\t5F. Father Religion: ");
                   scn.nextLine();
                   FReligion = scn.nextLine().toUpperCase();
                   while(!FReligion.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t5F. Father Religion: ");
                   FReligion = scn.nextLine().toUpperCase();
                   }
                   B.setFReligion(FReligion);
                   
                   System.out.print("\t\t\t\t6F. Father Occupation: ");
                   Focc = scn.nextLine().toUpperCase(); 
                   while(!Focc.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t6F. Father Occupation: ");
                   Focc = scn.nextLine().toUpperCase(); 
                   }
                   B.setFocc(Focc);
                   
                   System.out.print("\t\t\t\t7F. Father Age at time of this birth: ");
                   Fage = scn.next();
                   while(!Fage.matches("[0-1]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t7F. Father Age at time of this birth: ");
                   Fage = scn.next();
                   }
                   B.setFage(Fage);
                   
                   System.out.print("\t\t\t\t8F. Residence(House Number/Steet, Barangay): ");
                   scn.nextLine();
                   FHos = scn.nextLine().toUpperCase();
                   while(!FHos.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t8F. Residence(House Number/Steet, Barangay): ");
                   FHos = scn.nextLine().toUpperCase();
                   }
                   B.setFHos(FHos);
                   
                   System.out.print("\t\t\t\t9F. Residence Munipality: ");
                   FCity = scn.nextLine().toUpperCase();
                   while(!FCity.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t9F. Residence Munipality: ");
                   FCity = scn.nextLine().toUpperCase();
                   }
                   B.setFCity(FCity);
                   
                   System.out.print("\t\t\t\t10F. Province: ");
                   Fprovi = scn.nextLine().toUpperCase();
                   while(!Fprovi.matches("[A-Z]*")){
                   System.out.println("\t\t\t\tInvalid Input!");
                   System.out.print("\t\t\t\t10F. Province: ");
                   Fprovi = scn.nextLine().toUpperCase();
                   }
                   B.setFprovi(Fprovi);
        
        //Birth_EDIT
        do {
        BDisplay();
		System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\tCheck your answers(if theres any mistake press 2 to edit)"
                 + "\n\t\t\t\t\t\t\t\t\t[C] Continue"
                 + "\n\t\t\t\t\t\t\t\t\t[E] Edit "
                 + "\n\t\t\t\t\t\t\t\t\tYour Input: ");
        CoE = scn.next().toUpperCase();
         
        
        if(CoE.equals("C")){
            

        	
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
	
	}
        public static void Birth_NewReq(){
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
                                           
                                           
                                       }else if(Birth_ACode.get(BFill) == "Request"){
                                           System.out.println("\t\t\t\t\tThis Data is still waiting to be Approve."
                                                   + "\n\t\t\t\t\tPlease wait for the Approval of the Admin");
                                           
                                       }else if(Birth_ACode.get(BFill) == "Approve"){
                                           System.out.println("\t\t\t\t\tThis Data is already Approve"
                                                   + "\n\t\t\t\t\tPlease go to Already Request section to pay for the certificate");
                                       }

                                        }
            
        }
        public static void Birth_AlreadyReq() throws InterruptedException{
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
                                                       PickUp();
                                                       Birth_ACode.replace(BFill, "Done");
                                                   }else if(PD.equals("D")){
                                                       Delivery();
                                                       Birth_ACode.replace(BFill, "Done");
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
                + "\n\t\t\t\t\t\t\t\t\t\t[C] Cenomar: ");
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
        public static void Delivery() throws InterruptedException{
            
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tFull Name: ");
                            scn.nextLine();
                            Fname = scn.nextLine();
                            System.out.print("\t\t\t\tContact Number");
                            Cont = scn.next();
                            System.out.print("\t\t\t\tAddress: ");
                            Address = scn.nextLine();
                            
                            do{
                                
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\t\tFull Name: "  + Fname);
                            System.out.println("\t\t\t\tContact Number: +63" + Cont);
                            System.out.println("\t\t\t\tAddress: " + Address);
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tCheck Your Answer, Proceed(Y/N):  ");
                            PE = scn.next().toUpperCase();
                            
                            if(PE.equals("N")){
                                    System.out.print("\t\t\t\tEnter the Part you want to edit(N(Name)/C(Contact)/A(Addresses)/B(Both): ");
                                    NoC = scn.next().toUpperCase();
                                    
                                    if(NoC.equals('N')){
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tFull Name: ");
                                        Fname = scn.nextLine();   
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        
                                    }else if(NoC.equals("C")){
                                        do{
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tContact Number: +63");
                                        Cont = scn.next();
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        }while(Cont.matches("[0-9]{10}"));
                                        
                                    }else if(NoC.equals("A")){
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tAddress: ");
                                        Address = scn.nextLine();
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");

                                        
                                    }else if(NoC.equals("B")){
                                    
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\tFull Name: ");
                                        Fname = scn.nextLine(); 
                                        System.out.print("\t\t\t\tContact Number");
                                        Cont = scn.next();
                                        System.out.print("\t\t\t\tAddress: ");
                                        scn.nextLine();
                                        Address = scn.nextLine();
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                    
                                        }
                                    }
                            }while(PE.equals("N"));
                            
                            
                            if(PE.equals("Y")){
                                
                                   
                                    System.out.print("\t\t\t\tHow Many Copies: ");
                                    Copy = scn.next();
                                    double Price = 155 * Double.parseDouble(Copy);
                                    
                                    System.out.println("\t\t\t\tTotal: " + Price);
                                    System.out.println("\t\t\t\tEnter Amount paying: ");
                                    Amount = scn.next();
                                    change = Double.parseDouble(Amount) - Price;
                                    
                                    Reciept();
                                                     
                }                               

            
        }
        public static void PickUp() throws InterruptedException{
            
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.print("\t\t\t\tFull Name of Reciever: ");
                                scn.nextLine();
                                PDName = scn.nextLine();
                                do{ 
                                System.out.print("\t\t\t\tContact Number: +63");
                                Cont = scn.next();
                                }while(!Cont.matches("[0-9]{10}"));
                                do{
                                    
                                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("\t\t\t\tPlease Check Pick up Information");
                                System.out.println("");
                                System.out.println("\t\t\t\tName: " + PDName);
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
                                    Copy = scn.next();
                                    double Price = 155 * Integer.parseInt(Copy);
                                    
                                    System.out.println("\t\t\t\tTotal: " + Price);
                                    while(true){
                                    System.out.print("\t\t\t\tEnter Amount paying: ");
                                    Amount = scn.next();
                                    change = Double.parseDouble(Amount) - Price;
                                    
                                    if(change <= 0){
                                        break;
                                        }else{
                                        System.out.println("You need to get the right price or above!!!");
                                    } 
                                    }
                                    Reciept();
                                    
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
        public static void Reciept() throws InterruptedException{
            
                                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\t\t\t\tPrinting of receipt, Please wait a moment........");
                                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                    
                                    System.out.println("\t\t\t\t\t\t\t\t==================================================");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|           Republic of the Philippines          |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|         PHILIPPINE STATISTICS AUTHORITY        |");
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|               OFFICIAL RECEIPT                 |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                         Amount |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| %-47s|\n", Fname);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| COPY ISSUANCE - PSA CERTIFICATE                |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| Unit cost: 155        Qty: %-20s|\n" , Copy);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    if(Navi == 2){

                                    System.out.println("\t\t\t\t\t\t\t\t| Delivery Fee:                               "+ 50 +" |");
                                    }
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500); 
                                    System.out.printf("\t\t\t\t\t\t\t\t| TOTAL                                  %-20s |\n", Price );
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| AMOUNT TENDERED:                       %-20s |\n",Amount);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.printf("\t\t\t\t\t\t\t\t| CHANGE                                 %-20s |\n" , change);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|       INCLUDES DOCUMENTARY STAMP TAX OF        |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                 PHP30.00/COPY                  |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| Collecting officer:                            |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| Date - Time:                                   |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t\t\t\t\t==================================================");
            
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
                    Birth_ACode.replace(BCODE, "Approve");
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
                case "C":
                    System.out.println("Customers");
                    Cenomar_Customer_View();
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Main Admin"
                            + "\n[A] Add new Customer"
                            + "\n[E] Edit existing Data"
                            + "\n[V] View exisitng Data"
                            + "\n[D] Delete existing Data: ");
                    AdminPurp = scn.next().toUpperCase();
                    System.out.println("--------------------------------------------------------");
                    Cenomar_Admin();
                    break;
                    
                case "M":
                    System.out.println("Customers");
                    Marriage_Customer_View();
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Main Admin"
                            + "\n[A] Add new Customer"
                            + "\n[E] Edit existing Data"
                            + "\n[V] View exisitng Data"
                            + "\n[D] Delete existing Data: ");
                    AdminPurp = scn.next().toUpperCase();
                    System.out.println("--------------------------------------------------------");
                    Marriage_Admin();
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
        public static void Birth_Admin_View()throws InterruptedException{
           do{
             System.out.print("Enter the code you want to view: ");
                                BFill = scn.next().toUpperCase();
                                if(Birth_Code.containsKey(BFill)){
                                    B.setBirthStoreKey(Birth_Code.get(BFill));
                                    Display_Admin_Marriage();

                                    System.out.print("Do you wish to edit the status of this Data?"
                                            + "\n[Y] Yes"
                                            + "\n[N] No: ");
                                    CE = scn.next().toUpperCase();
                                    
                                    if(CE.equals("Y")){
                                        
                                        if(Birth_ACode.get(BFill) == "New"){
                                            
                                            BirthNavi = BFill.substring(BFill.length() -1);
                                            System.out.println("Checking " + BFill + Birth_Code.get(BFill));
                                            B.setBirthStoreKey(Birth_Code.get(BFill));
                    
                                            System.out.println("\t\t\t\t\t--------------------------------------------");
                                            System.out.println("\t\t\t\t\t| Existing Data       | User Request       |");
                                            System.out.println("\t\t\t\t\t--------------------------------------------");
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("1A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("1A" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("2A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("2A" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("3A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("3A" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("5A" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("5A" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("1M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("1M" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("2M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("2M" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("3M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("3M" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("7M" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("7M" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("1F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("1F" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("2F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("2F" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("3F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("3F" + BFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , BStore.get("7F" + BirthNavi + B.getBirthStoreKey()), Birth_Request.get("7F" + BFill));
                                            System.out.println("\t\t\t\t\t--------------------------------------------"); 
                                            
                                            System.out.print("This Data is for a new coppy you want to Approve it?([Y] Yes|[N] No): ");
                                            String YoN = scn.next().toUpperCase();
                                            if(YoN.equals("Y")){
                                                
                                                System.out.print("Processing.");
                                                Thread.sleep(400);
                                                System.out.print(".");
                                                Thread.sleep(400);
                                                System.out.println(".");
                                                System.out.println("Approve Successfully");
                                                Birth_ACode.replace(BFill, "Approve");
                                               
                                            }else if(YoN.equals("N")){
                                                Another();
                                            }else{
                                                InvalidErrors();
                                            }
                                            
                                            
                                        }else if(Birth_ACode.get(BFill) == "Approve"){
                                            System.out.println("This Data is waiting to be payed");
                                        }else if(Birth_ACode.get(BFill) == "Request"){
                                            System.out.println("This Data is on request and waiting to be approve you want to approve it? ");
                                            System.out.print("Do you want to Approve it?([Y] Yes|[N] No):");
                                            String YoN = scn.next().toUpperCase();
                                            if(YoN.equals("Y")){
                                                System.out.print("Processing.");
                                                Thread.sleep(400);
                                                System.out.print(".");
                                                Thread.sleep(400);
                                                System.out.println(".");
                                                System.out.println("Approve Successfully");
                                                Birth_ACode.replace(BFill, "Approve");
                                                
                                            }else if(YoN.equals("N")){
                                                Another();
                                            }else{
                                                InvalidErrors();
                                            }
                                        }else if(Birth_ACode.get(BFill) == "Denied"){
                                            System.out.println("This Data have been denied you want to Approve it?");
                                        }
                                        Another();
                                    }else if(CE.equals("N")){
                                        Another();
                                        }
                                    
                                }
            }while(!Another.contains("N"));
            
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
                                
                                MarriageNavi = BFill.substring(BFill.length()-1);
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
        
        //Start of Cenomar
        
        public static void Cenomar_Storage(){
            
		Cenomar_Storage.put("1p" + CNavi + Marriage.getCenoName(), Marriage.getWApplicationName());
                Cenomar_Storage.put("2p" +  CNavi +Marriage.getCenoName(), Marriage.getWApplicantBirthday()); 
                Cenomar_Storage.put("3p" + CNavi + Marriage.getCenoName(), Marriage.getWApplicantPlaceOfBirth());
                Cenomar_Storage.put("4p" + CNavi + Marriage.getCenoName(), Marriage.getWApplicantFatherName());
                Cenomar_Storage.put("5p" + CNavi + Marriage.getCenoName(), Marriage.getWApplicantMotherName()); 
                Cenomar_Storage.put("6p" + CNavi + Marriage.getCenoName(), Marriage.getHApplicantName());
                Cenomar_Storage.put("7p" + CNavi + Marriage.getCenoName(), Marriage.getHApplicantBirthday());
                Cenomar_Storage.put("8p" + CNavi + Marriage.getCenoName(), Marriage.getHApplicantPlaceOfBirth());
		Cenomar_Storage.put("9p" + CNavi +Marriage.getCenoName(), Marriage.getHApplicantFatherName());
		Cenomar_Storage.put("10p" + CNavi +Marriage.getCenoName(), Marriage.getHApplicantMotherName());
                CNavi++;
	}
	public static void Cenomar_Certificate(){
        System.out.println("   CRS FORM NO. 4 (CENOMAR)");
        System.out.println("\t\t\t\t\t\t\t\t                       Republic of the Philippines");
        System.out.println("\t\t\t\t\t\t\t                             PHILIPPINE STATISTIC AUTHORITY ");
        System.out.println("\t\t\t\t\t\t\t                                        MANILA");
        System.out.println("\t\t\t\t\t\t\t                          OFFICE OF THE CIVIL REGISTRAR GENERAL");
	System.out.println("\t\t\t                       TO WHOM IT MAY CONCERN: ");
	System.out.printf("\t\t\t\t\t We certrify that \t\t\t(1p) %-10s who is alleged to have been", Cenomar_Storage.get("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
        System.out.printf("\t\t\tborn on %-15s ",Cenomar_Storage.get("2p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()), "\t\tin", Cenomar_Storage.get("p3" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()), "\t\tto"  );
	System.out.printf(Cenomar_Storage.get("4p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()) + "\t\tand", Cenomar_Storage.get("5p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()), "\t\tdoes not apprear in our", "\n\t\t\t\t\t\t\t National Indices of Marriages.");
        System.out.println();
	System.out.println();
	System.out.println("\t\t\t\t\t\t\t This certification is based on the records of 1945-2024 marriages enrolle ");
        System.out.println("\t\t\t\t\t\t\tDatebase as of June 30, 2024.");
	System.out.println("\t\t\t\t\t\t\t\t Issued upon the request of " + Cenomar_Storage.get("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()) + "for Marriages License.");
			
	}
        public static void Cenomar_Question(){
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
        public static void Cenomar_NewReq(){
            System.out.print("\t\t\t\t\tEnter the Code Number That have been given to you after your Fill Up Form: ");
                                   CFill = scn.next().toUpperCase();
                                   
                                   if(Cenomar_Code.containsKey(CFill)){
                                       
                                       if(Cenomar_CCode.get(CFill) == "Done"){
                                           System.out.print("This Certificate have been Already approve and certificate is ready"
                                                   + "\n\t\t\t\t\tif you want another copy press N, if no press X"
                                                   + "\n\t\t\t\t\t[N] New Coppy"
                                                   + "\n\t\t\t\t\t[X] Exit: ");
                                           String NCopy = scn.next().toUpperCase(); 
                                            
                                           if(NCopy.equals("N")){
                                               Cenomar_Request_New();
                                           }else if(NCopy.equals("X")){
                                               
                                           }else {
                                               InvalidErrors();
                                           }
                                           
                                       }else if(Cenomar_CCode.get(CFill) == "Denied"){
                                           System.out.println("\t\t\t\t\tThis Request Have been denied already!!!");
                                           System.out.println("\t\t\t\t\tPlease be more carefull and check your answers before Inputing them");
                                           Cenomar_Request_New();
                                           
                                           
                                       }else if(Cenomar_CCode.get(CFill) == "Request"){
                                           System.out.println("\t\t\t\t\tThis Data is still waiting to be Approve."
                                                   + "\n\t\t\t\t\tPlease wait for the Approval of the Admin");
                                           
                                       }else if(Cenomar_CCode.get(CFill) == "Approve"){
                                           System.out.println("\t\t\t\t\tThis Data is already Approve"
                                                   + "\n\t\t\t\t\tPlease go to Already Request section to pay for the certificate");
                                       }
                                        }
        }
        public static void Cenomar_AlreadyReq() throws InterruptedException{
            
            System.out.print("\t\t\t\t\tEnter the Code Number That have been given to you after your Fill Up Form: ");
                                            CFill = scn.next().toUpperCase();
                                           
                                           if(Cenomar_CCode.containsKey(CFill)){
                                               if(Cenomar_CCode.get(CFill) == "Approve"){
                                                   CenoNavi = CFill.substring(CFill.length() - 1);
                                                   Marriage.setCenoName(Cenomar_Code.get(CFill));                                               
                                                   do{
                                                   System.out.println("The Code Have been Approve!!");
                                                   System.out.println("Choose the Method you want"
                                                           + "\n[P] Pick Up"
                                                           + "\n[D] Delivery");
                                                   PD = scn.next().toUpperCase();
                                                   
                                                   if(PD.equals("P")){
                                                       PickUp();
                                                       Cenomar_CCode.replace(CFill, "Done");
                                                   }else if(PD.equals("D")){
                                                       Delivery();
                                                       Cenomar_CCode.replace(CFill, "Done");
                                                   }else{
                                                       InvalidErrors();
                                                   }
                                                   }while(!PD.matches("P|D"));
                                               }else if(Cenomar_CCode.get(CFill) == "Request"){
                                                   System.out.println("\t\t\t\t\tPlease wait for the Approval of the Request!!");
                                               }else if(Cenomar_CCode.get(CFill) == "Denied"){
                                                   System.out.println("\t\t\t\t\tYour Request Had been denied!!"
                                                           + "\n\t\t\t\t\tYour Answer Doesn't Match the data your trying to access");
                                               }
                                           }else{
                                               InvalidErrors();
                                           }
        }
        public static void Cenomar_FillUp(){
        Scanner scanner = new Scanner(System.in);
                 
                // Wife information input
                System.out.println("\t\t\t\tWife Cenomar Information");
                System.out.println();
    
                System.out.print("\t\t\t\tName: ");
                String Wname = scanner.nextLine();
                Marriage.setWApplicantName(Wname);
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
                    Marriage.setWApplicantBirthday(dateofbirth);
                    birthchecker = false;
                }
    
                }
                System.out.print("\t\t\t\tPlace Of Place birth: ");
                String wifePlaceOfBirth = scanner.nextLine();
                Marriage.setWApplicantPlaceOfBirth(wifePlaceOfBirth);
                System.out.print("\t\t\t\tFull name of Father: ");
                String father = scanner.nextLine();
                Marriage.setWApplicantFatherName(father);
                System.out.print("\t\t\t\tFull name of Mother: ");
                String motherName = scanner.nextLine();
                Marriage.setWApplicantMotherName(motherName);
    
    
                // Husband information input
                System.out.println();
                System.out.println("\t\t\t\tHusband Cenomar Information");
                System.out.println();
                
                System.out.print("\t\t\t\tName: ");
                String Hname = scanner.nextLine();
                Marriage.setHApplicantName(Hname);
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
                    Marriage.setHApplicantBirthday(Hdateofbirth);
                    Hbirthchecker = false;
                }
    
                }
                System.out.print("\t\t\t\tPlace Of Birth: ");
                String husbandPlaceOfBirth = scanner.nextLine();
                Marriage.setHApplicantPlaceOfBirth(husbandPlaceOfBirth);
                System.out.print("\t\t\t\tFull name of Father: ");
                String Hfather = scanner.nextLine();
                Marriage.setHApplicantFather(Hfather);
                System.out.print("\t\t\t\tFull name of Mother: ");
                String HmotherName = scanner.nextLine();
                Marriage.setHApplicantMother(HmotherName);
                
    
    
    }
        public static void Cenomar_Semi_Admin() throws InterruptedException{
            Cenomar_Customer_View();
            System.out.print("Enter the Code you want to change status: ");
            CFill = scn.next();
             if(Cenomar_Code.containsKey(CFill)){

                     
            
                if(Cenomar_Code.containsKey(CFill)){
                    
                    if(Cenomar_CCode.get(CFill) == "Request"){
                        
                        CenoNavi = CFill.substring(CFill.length() -1);
                        Marriage.setCenoName(Cenomar_Code.get(CFill));
                        displayCenomar();
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
                            Cenomar_Certificate();
                            Cenomar_CCode.replace(CFill, "Approve");
                            
                        }else if(RYN.equals("N")){
                            break;
                        }
                        }while(!RYN.equals("Y"));
                    }else if(Cenomar_CCode.get(CFill) == "New" || Cenomar_CCode.get(CFill) == "Denied"){
                    
                    CenoNavi = CFill.substring(CFill.length() -1);
                    System.out.println("Checking " + CFill + Cenomar_Code.get(CFill));
                    Marriage.setCenoName(Cenomar_Code.get(CFill));
                    
                    System.out.println("\t\t\t\t\t--------------------------------------------");
                    System.out.println("\t\t\t\t\t| Existing Data       | User Request       |");
                    System.out.println("\t\t\t\t\t--------------------------------------------");
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("1p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("1p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("2p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("2p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("3p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("3p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("4p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("4p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("5p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("5p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("6p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("6p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("7p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("7p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("8p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("8p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("9p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("9p" + CFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("10p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("10p" + CFill));
                   
                    System.out.println("\t\t\t\t\t--------------------------------------------");    
                    do{
                    System.out.println("\t\t\t\t\t\tConfirm the request?"
                                + "\n\t\t\t\t\t\t[Y] Yes"
                                + "\n\t\t\t\t\t\t[N] No");
                        YorN = scn.next().toUpperCase();
                        if(YorN.equals("Y")){
                    Cenomar_CCode.replace(CFill, "Approve");
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
                          Cenomar_CCode.replace(CFill, "\t\t\t\tDenied");
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
        }
        public static void Cenomar_Customer_View(){
            
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            System.out.println("\t\t\t\t\t\t| User ID    | User Name           | User Status    |");
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            System.out.println("\t\t\t\t\t\t|New = New Coppy                                    |");
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            



             for(Map.Entry<Object, String> eh : Cenomar_Code.entrySet()){
                
                    if(Cenomar_CCode.get(eh.getKey()) == "New"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Cenomar_CCode.get(eh.getKey()));
                    }
            }
                
                
                System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                System.out.println("\t\t\t\t\t\t|Request = Request Sent But not Approve             |");
                System.out.println("\t\t\t\t\t\t-----------------------------------------------------");

                    
                    
                    for(Map.Entry<Object, String> eh : Cenomar_Code.entrySet()){
                
                    if(Cenomar_CCode.get(eh.getKey()) == "Request"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Cenomar_CCode.get(eh.getKey()));
                            }
                                       
                    }
             

                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Approve = Waiting for the user to pay              |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");

                    for(Map.Entry<Object, String> eh : Cenomar_Code.entrySet()){
                
                    if(Cenomar_CCode.get(eh.getKey()) == "Approve"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Cenomar_CCode.get(eh.getKey()));
                     
                            }                   
                    }
             
             
        System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Denied = Request Due to Invalid Inputs             |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                    for(Map.Entry<Object, String> eh : Cenomar_Code.entrySet()){
                
                    if(Cenomar_CCode.get(eh.getKey()) == "Denied"){
                        
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Cenomar_CCode.get(eh.getKey()));
                        
                            }
                        
                    }
         
       
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Done = Done with the transaction                   |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                     for(Map.Entry<Object, String> eh : Cenomar_Code.entrySet()){
                
                    if(Cenomar_CCode.get(eh.getKey()) == "Done"){
                        
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Cenomar_CCode.get(eh.getKey()));
                        
                            }
                        
                    }
        System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
        }
        public static void Cenomar_Request_New(){
            
            System.out.print("1p. " + queue.get("1p"));
            WName = scn.nextLine();
            System.out.print("2p. " + queue.get("2p"));
            WDate = scn.next();
            System.out.print("3p. " + queue.get("3p"));
            WPlace = scn.nextLine();
            System.out.print("4p. " + queue.get("4p"));
            WFather = scn.nextLine();
            System.out.print("5p. " + queue.get("5p"));
            WMother = scn.nextLine();
            System.out.print("6p. " + queue.get("6p"));
            FName = scn.nextLine();
            System.out.print("7p. " + queue.get("7p"));
            FDate = scn.next();
            System.out.print("8p. " + queue.get("8p"));
            FPlace = scn.nextLine();
            System.out.print("9p. " + queue.get("9p"));
            FFather = scn.nextLine();
            System.out.print("10p. " + queue.get("10p"));
            FMother = scn.nextLine();
            
            Cenomar_Request.put("1p" + CFill, WName);
            Cenomar_Request.put("2p" + CFill, WDate);
            Cenomar_Request.put("3p" + CFill, WPlace);
            Cenomar_Request.put("4p" + CFill, WFather);
            Cenomar_Request.put("5p" + CFill, WMother);
            Cenomar_Request.put("6p" + CFill, FName);
            Cenomar_Request.put("7p" + CFill, FDate);
            Cenomar_Request.put("8p" + CFill, FPlace);
            Cenomar_Request.put("9p" + CFill, FFather);
            Cenomar_Request.put("10p" + CFill, FMother);
            
        }
        public static void EditCenomar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tEnter the line number you want to edit: ");
                String lineNumber = scanner.nextLine().toLowerCase();
                    
                
                System.out.println(queue.get(lineNumber));
                System.out.print("\tEnter the new value: ");
                String newValue = scanner.nextLine();
    
                switch(lineNumber) {
                    case "1p":    
                    Marriage.setWApplicantName(newValue);
                        break;
                    case "2p":
                    Marriage.setWApplicantBirthday(newValue);
                        break;
                case "3p":
                    Marriage.setWApplicantPlaceOfBirth(newValue);
                    case "4p":
                    Marriage.setWApplicantFatherName(newValue);
                        break;
                    case "5p":
                    Marriage.setWApplicantMotherName(newValue);
                        break;
                    case "6p":
                    Marriage.setHApplicantName(newValue);
                        break;
                    case "7p":
                    Marriage.setHApplicantBirthday(newValue);;
                        break;
                    case "8p":
                    Marriage.setHApplicantPlaceOfBirth(newValue);
                    case "9p":
                    Marriage.setHApplicantFather(newValue);;
                        break;
                    case "10p":
                    Marriage.setHApplicantMother(newValue);;
                        break;
    
        
    }
    }
        public static void Cenomar_Admin() throws InterruptedException{
            switch(AdminPurp){
                case "A":
                    Cenomar_Add();
                    break;
                case "V":
                    Cenomar_View();
                    break;
                case "D":
                    Cenomar_Delete();
                    break;
            }
        }
        public static void Cenomar_Add() throws InterruptedException{
                                CFill = String.valueOf(CCode_Num);
                                System.out.println(CFill);
                                Cenomar_FillUp();
                                Marriage.setCenoName(Marriage.getWApplicationName());
                                Cenomar_Storage();
                                
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
                                    Cenomar_Certificate();
                                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("\t\t\t\t\t\tThank You for Registering!");
                                            System.out.println("\t\t\t\t\t\tWarning do not show this code to anyone!!!!");
                                            System.out.println("\t\t\t\tHeres your Code Number if you ever wanted the Copy of the certificate: C" + CCode_Num);
                                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                }else if(YoN.equals("N")){
                                    break;
                                }else{
                                    InvalidErrors();
                                }
                                }while(!YoN.equals("N"));
                                
                                Cenomar_Code.put("C" + CCode_Num, Marriage.getCenoName());
                                Cenomar_CCode.put("C" + CCode_Num, "Approve");
                                System.out.println(Cenomar_Code + " " + Cenomar_CCode);
                                
                                CCode_Num++;
        }
        public static void Cenomar_View() throws InterruptedException{
            do{
             System.out.print("Enter the code you want to view: ");
                                CFill = scn.next().toUpperCase();
                                if(Cenomar_Code.containsKey(CFill)){
                                    B.setBirthStoreKey(Cenomar_Code.get(CFill));
                                    Admin_Cenomar_Display();

                                    System.out.print("Do you wish to edit the status of this Data?"
                                            + "\n[Y] Yes"
                                            + "\n[N] No: ");
                                    CE = scn.next().toUpperCase();
                                    
                                    if(CE.equals("Y")){
                                        
                                        if(Cenomar_Code.get(CFill) == "New"){
                                            
                                            CenoNavi = CFill.substring(CFill.length() -1);
                                            System.out.println("Checking " + CFill + Cenomar_Code.get(CFill));
                                            Marriage.setCenoName(Cenomar_Code.get(CFill));
                    
                                            System.out.println("\t\t\t\t\t--------------------------------------------");
                                            System.out.println("\t\t\t\t\t| Existing Data       | User Request       |");
                                            System.out.println("\t\t\t\t\t--------------------------------------------");
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("1p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("1p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("2p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("2p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("3p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("3p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("4p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("4p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("5p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("5p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("6p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("6p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("7p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("7p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("8p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("8p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("9p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("9p" + CFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Cenomar_Storage.get("10p" + CenoNavi + Marriage.getCenoName()), Cenomar_Request.get("10p" + CFill));
                                            System.out.println("\t\t\t\t\t--------------------------------------------"); 
                                            
                                            System.out.print("This Data is for a new coppy you want to Approve it?([Y] Yes|[N] No): ");
                                            String YoN = scn.next().toUpperCase();
                                            if(YoN.equals("Y")){
                                                
                                                System.out.print("Processing.");
                                                Thread.sleep(400);
                                                System.out.print(".");
                                                Thread.sleep(400);
                                                System.out.println(".");
                                                System.out.println("Approve Successfully");
                                                Cenomar_CCode.replace(CFill, "Approve");
                                               
                                            }else if(YoN.equals("N")){
                                                Another();
                                            }else{
                                                InvalidErrors();
                                            }
                                            
                                            
                                        }else if(Cenomar_CCode.get(CFill) == "Approve"){
                                            System.out.println("This Data is waiting to be payed");
                                        }else if(Cenomar_CCode.get(CFill) == "Request"){
                                            System.out.println("This Data is on request and waiting to be approve you want to approve it? ");
                                            System.out.print("Do you want to Approve it?([Y] Yes|[N] No):");
                                            String YoN = scn.next().toUpperCase();
                                            if(YoN.equals("Y")){
                                                System.out.print("Processing.");
                                                Thread.sleep(400);
                                                System.out.print(".");
                                                Thread.sleep(400);
                                                System.out.println(".");
                                                System.out.println("Approve Successfully");
                                                Cenomar_CCode.replace(CFill, "Approve");
                                                
                                            }else if(YoN.equals("N")){
                                                Another();
                                            }else{
                                                InvalidErrors();
                                            }
                                        }else if(Cenomar_CCode.get(CFill) == "Denied"){
                                            System.out.println("This Data have been denied you want to Approve it?");
                                        }
                                        Another();
                                    }else if(CE.equals("N")){
                                        Another();
                                        }
                                    
                                }
            }while(!Another.contains("N"));
            
        }
        public static void Cenomar_Delete() throws InterruptedException{
            
             System.out.print("Delete data or View Deleted History"
                                        + "\n[D] Delete Data"
                                        + "\n[V] View Deleted History: ");
                                String DV = scn.next().toUpperCase();
                                if(DV.equals("D")){
                                System.out.print("Enter the code of the Data you want to delete: ");
                                CFill = scn.next().toUpperCase();
                                if(Cenomar_Code.containsKey(CFill)){
                                    Marriage.setCenoName(Cenomar_Code.get(CFill));
                                    Admin_Cenomar_Display();
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
                                        Cenomar_Edit_Store();
                                        Cenomar_Delete.putAll(Admin_CStore);
                                        Admin_CStore.clear();
                                        Cenomar_CCode.replace(CFill, "Deleted");
                                        System.out.println(Admin_CStore);
                                        
                                    }
                                }
                            }else if(DV.equals("V")){
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("| User ID        | User Name           | Status        |");
                                    System.out.println("--------------------------------------------------------");
                                    
                                    for(Map.Entry<Object, String> eh: Cenomar_Code.entrySet()){
                                        if(Cenomar_CCode.get(eh.getKey()) == "Deleted"){
                                            
                                        System.out.printf("| %-15s| %-20s| %-15s|\n", eh.getKey(), eh.getValue(), Cenomar_CCode.get(eh.getKey()));
                                        }
                                        
                                    }
                                    System.out.println("--------------------------------------------------------");;
                                    
                                    System.out.print("Enter the code you want to view: ");
                                    CFill = scn.next().toUpperCase();
                                    
                                    if(Cenomar_Code.containsKey(CFill)){
                                        Marriage.setCenoName(Cenomar_Code.get(CFill));
                                        System.out.println(Cenomar_Delete);
                                        Admin_Cenomar_View();
                                    }else{
                                        InvalidErrors();
                                    }
                            }
            
        }
        public static void Cenomar_Edit_Store(){
            
                Admin_CStore.put("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
                Admin_CStore.put("2p" +  CFill.substring(CFill.length()-1) +Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName())); 
                Admin_CStore.put("3p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
                Admin_CStore.put("4p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
                Admin_CStore.put("5p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName())); 
                Admin_CStore.put("6p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
                Admin_CStore.put("7p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
                Admin_CStore.put("8p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
		Admin_CStore.put("9p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
		Admin_CStore.put("10p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName(), Cenomar_Storage.remove("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
        }
        public static void displayCenomar(){
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
            System.out.println("\n\t\t\t\t1p. First Name: " + Marriage.getHApplicantName());
            System.out.println("\t\t\t\t2p. Date of Birth (MM/DD/YYYY): " +  Marriage.getWApplicantBirthday());
            System.out.println("\t\t\t\t3p. Place of Birth: " +  Marriage.getWApplicantPlaceOfBirth());
            System.out.println("\t\t\t\t4p. Father's Name " +  Marriage.getWApplicantFatherName());
            System.out.println("\t\t\t\t5p. Mother's Name " +  Marriage.getWApplicantMotherName());
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
            System.out.println("\n\t\t\t\t6p. First Name: " +  Marriage.getWApplicationName());
            System.out.println("\t\t\t\t7p. Date of Birth (MM/DD/YYYY): " +  Marriage.getHApplicantBirthday());
            System.out.println("\t\t\t\t8p. Place of Birth: " +  Marriage.getHApplicantPlaceOfBirth());
            System.out.println("\t\t\t\t9p. Father's Name " +  Marriage.getHApplicantFatherName());
            System.out.println("\t\t\t\t10p. Mother's Name " +  Marriage.getHApplicantMotherName());
    
    }
        public static void Admin_Cenomar_Display(){
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
            System.out.println("\n\t\t\t\t1p. First Name: " + Cenomar_Storage.get("1p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t2p. Date of Birth (MM/DD/YYYY): " +  Cenomar_Storage.get("2p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t3p. Place of Birth: " +  Cenomar_Storage.get("3p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t4p. Father's Name " +  Cenomar_Storage.get("4p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t5p. Mother's Name " +  Cenomar_Storage.get("5p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
            System.out.println("\n\t\t\t\t6p. First Name: " +  Cenomar_Storage.get("6p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t7p. Date of Birth (MM/DD/YYYY): " +  Cenomar_Storage.get("7p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t8p. Place of Birth: " +  Cenomar_Storage.get("8p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t9p. Father's Name " +  Cenomar_Storage.get("9p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t10p. Mother's Name " +  Cenomar_Storage.get("10p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
        }
        public static void Admin_Cenomar_View(){
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
            System.out.println("\n\t\t\t\t1p. First Name: " + Cenomar_Delete.get("1P" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t2p. Date of Birth (MM/DD/YYYY): " +  Cenomar_Delete.get("2p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t3p. Place of Birth: " +  Cenomar_Delete.get("3p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t4p. Father's Name " +  Cenomar_Delete.get("4p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t5p. Mother's Name " +  Cenomar_Delete.get("5p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
            System.out.println("\n\t\t\t\t6p. First Name: " +  Cenomar_Delete.get("6p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t7p. Date of Birth (MM/DD/YYYY): " +  Cenomar_Delete.get("7p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t8p. Place of Birth: " +  Cenomar_Delete.get("8p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t9p. Father's Name " +  Cenomar_Delete.get("9p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            System.out.println("\t\t\t\t10p. Mother's Name " +  Cenomar_Delete.get("10p" + CFill.substring(CFill.length()-1) + Marriage.getCenoName()));
            
        }
    // Start of Marraige
        public static void inputMarriageCertificate() {
        
        Scanner scanner = new Scanner(System.in);
        // Wife information input
        System.out.println("\t\t\t\tWife Information");
        System.out.println();

        System.out.print("\t\t\t\tFirst Name: ");
        String firstname = scanner.nextLine();
        Marriage.setWifeName(firstname);
        System.out.print("\t\t\t\tMiddle Name: ");
        String middlename = scanner.nextLine();
        if(middlename.isEmpty()){
            Marriage.setWifeMiddle("NA");
        }
        else{
            Marriage.setWifeMiddle(middlename);
        }
        System.out.print("\t\t\t\tLast Name: ");
        String lastname = scanner.nextLine();
        Marriage.setWifeLast(lastname);
      
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
            Marriage.setWifeDateOfBirth(dateofbirth);
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
                Marriage.setWifeAge(age);
                ageChecker = false;
            }
        }
        
       

        System.out.print("\t\t\t\tPlace of Birth (City, Province): ");
        String province = scanner.nextLine();
        Marriage.setWifePlaceOfBirth(province);
        //Gender Checker
        boolean genderChecker = true;
        while(genderChecker){
        
        System.out.print("\t\t\t\tSex(F/M): ");
        String sex = scanner.nextLine().toUpperCase();
        
        if(sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("M")){
            Marriage.setWifeSex(sex);
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
        
        do{
                System.out.println("Do you to continue or edit"
                        + "\n[C] Continue"
                        + "\n[E] Edit");
                CE = scn.next().toUpperCase();
                if(CE.equals("C")){
                    break;
                }else if(CE.equals("E")){
                System.out.print("\tEnter the line number you want to edit"
                    + "if Multiple enter the code numbers separted with space ex.(1a 1b 1c): ");
			String lineNumber = scn.nextLine().toLowerCase();
				
			String[] editLine = lineNumber.split(" ");
                        
                        for(String a: editLine){
			System.out.println(ques.get(a));
			System.out.print("\tEnter the new value: ");
			scn.nextLine();
                        String newValue = scn.nextLine();

	        switch(a) {
	            case "1a":    
	                Marriage.setWifeName(newValue);
	                break;
	            case "1b":
	               Marriage.setWifeMiddle(newValue);
	                break;
	            case "1c":
	                Marriage.setWifeLast(newValue);
	                break;
	            case "2":
	                Marriage.setWifeDateOfBirth(newValue);
	                break;
	            case "3":
	                Marriage.setWifeAge(newValue);
	                break;
	            case "4":
	                Marriage.setWifePlaceOfBirth(newValue);
	                break;
	            case "5":
	                Marriage.setWifeSex(newValue);
	                break;
	            case "6":
	                Marriage.setWifeCitezenship(newValue);
	                break;
	            case "7a":
	                Marriage.setWifeProvince(newValue);
	                break;
	            case "7b":
	                Marriage.setWifeCity(newValue);
	                break;
	            case "7c":
	                Marriage.setWifeBarangay(newValue);
	                break;
	            case "7d":
	                Marriage.setWifeStreet(newValue);
	                break;
	            case "8":
	                Marriage.setWifeReligion(newValue);
	                break;
	            case "9":
	                Marriage.setWifeStatus(newValue);
	                break;
	            case "10":
	                Marriage.setWifeFather(newValue);
	                break;
	            case "11":
	                Marriage.setWifeFatherCitizen(newValue);
	                break;
	            case "12":
	                Marriage.setWifeMother(newValue);
	                break;
	            case "13":
	                Marriage.setWifeMotherCitizen(newValue);
	                break;

	            // Husband's information
	            case "14a":
	                Marriage.setHusbandName(newValue);
	                break;
	            case "14b":
	                Marriage.setHusbandMiddle(newValue);
	                break;
	            case "14c":
	                Marriage.setHusbandLast(newValue);
	                break;
	            case "15":
	                Marriage.setHusbandDateOfBirth(newValue);
	                break;
	            case "16":
	                Marriage.setHusbandAge(newValue);
	                break;
	            case "17":
	                Marriage.setHusbandPlaceOfBirth(newValue);
	                break;
	            case "18":
	                Marriage.setHusbandSex(newValue);
	                break;
	            case "19":
	                Marriage.setHusbandCitizen(newValue);
	                break;
	            case "20a":
	                Marriage.setHusbandProvince(newValue);
	                break;
	            case "20b":
	                Marriage.setHusbandCity(newValue);
	                break;
	            case "20c":
	                Marriage.setHusbandBarangay(newValue);
	                break;
	            case "20d":
	                Marriage.setHusbandStreet(newValue);
	                break;
	            case "21":
	                Marriage.setHusbandReligion(newValue);
	                break;
	            case "22":
	                Marriage.setHusbandStatus(newValue);
	                break;
	            case "23":
	                Marriage.setHusbandFather(newValue);
	                break;
	            case "24":
	                Marriage.setHusbandFatherCitizen(newValue);
	                break;
	            case "25":
	                Marriage.setHusbandMother(newValue);
	                break;
	            case "26":
	                Marriage.setHusbandMotherCitizen(newValue);
	                break;

	            default:
	                System.out.println("\tInvalid line number.");
	                break;
                            }
                        }
                }
        }while(!CE.equals("C"));

    }
        public static void displayCertificateInformation(){
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
        public static void Marriage_Question(){
    
        ques.put("1a", "First Name:");
        ques.put("1b","Middle Name:" );
        ques.put("1c","Last Name: ");
        ques.put("2","Date of Birth(MM/DD/YYYY)");
        ques.put("3","Age: ");
        ques.put("4", "Place of Birth (City, Province): ");
        ques.put("5", "Sex (f/m):" );
        ques.put("6", "Citizenship");
        ques.put("7a", "Residence (Province): ");
        ques.put("7b", "Residence (City/Municipality): ");
        ques.put("7c", "Residence (Baranggay): ");
        ques.put("7d","Residence (House Number/Street): ");
        ques.put("8", "Religion: ");
        ques.put("9","Civil Status: " );
        ques.put("10", "Full name of Father: ");
        ques.put("11", "Citizenship of Father: ");
        ques.put("12", "Full name of Mother: ");
        ques.put("13","Citizenship of Mother: ");
        ques.put("14a", "First Name: ");
        ques.put("14b", "Middle Name: ");
        ques.put("14c", "Last Name: ");
        ques.put("15 ", "Date  of Birth (MM/DD/YYYY): ");
        ques.put("16", "Age: ");
        ques.put("17", "Place of Birth (City/Province): ");
        ques.put("18","Sex(f/m): ");
        ques.put("19","Citizenship: ");
        ques.put("20a","Residence (Province): ");
        ques.put("20b","Residence (City/Municipality): ");
        ques.put("20c","Residence (Baranggay): ");
        ques.put("20d","Residence (House Number/Street): ");
        ques.put("23"," Full name of Father: " );
        ques.put("24", "Citizenship of Father: " );
        ques.put("25", "Full name of Mother: ");
        ques.put("26", "Citizenship of Mother: ");
    }
        
        public static void Marriage_Certificate(){
        System.out.println("\t\t\t\t\t=======================================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t                       Republic of the Philippines");
        System.out.println("\t\t\t\t\t\t\t                            OFFICE OF THE CIVIL REGISTRAR GENERAL");
         System.out.println("\t\t\t\t\t\t\t\t                         CERTIFICATE OF MARRIAGE");
        System.out.println("\t\t\t\t\t=======================================================================================================================");	 
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t|WIFE\t\t\t\t\t|HUSBAND");
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tName of Contracting Parties\t\t|(1a) %-14s|(1b) %-14s|(14a) %-14s|(14b) %-14s\n\t\t\t\t\t|(1c) %-34s|(14c) %-14s\n", 
                            Marriage_Storage.get("1a" + MarriageNavi + Marriage.getSMName()), Marriage_Storage.get("14a" + MarriageNavi + Marriage.getSMName()), Marriage_Storage.get("1b" + MarriageNavi + Marriage.getSMName())
                , Marriage_Storage.get("14b" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("1c" +MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("14c" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tDate of Birth/Age\t\t\t|(2) %-15s|(3) %-15s|(15) %-15s|(16) %-15s\n",Marriage_Storage.get("15" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("2" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("16" + MarriageNavi + Marriage.getSMName()), Marriage_Storage.get("3" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tPlace of Birth\t\t\t\t|(4) %-35s|(17) %-15s\n", Marriage_Storage.get("17" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("4" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tSex (Male/Female)\t\t\t|(5) %-30s\t|(18) %-10s\n", Marriage_Storage.get("18" + MarriageNavi + Marriage.getSMName()), Marriage_Storage.get("5" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(6) %-30s\t|(19) %-20s\n",Marriage_Storage.get("19" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("6" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tResidence\t\t\t\t|(7a) %-14s|(7a) %-14s|(20a) %-14s|(20b) %-14s\n\t\t\t\t\t|(7c) %-14s|(7d) %-14s|(20c) %-14s|(20d) %-14s\n",
                Marriage_Storage.get("7a" + MNavi + Marriage.getSMName()), Marriage_Storage.get("20a" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("7b" + MarriageNavi + Marriage.getSMName()),
                Marriage_Storage.get("20b" + MNavi + Marriage.getSMName()),Marriage_Storage.get("7c" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("7d" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("20c" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("20d" + MarriageNavi + Marriage.getSMName()));	   
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tReligion\t\t\t\t|(8) %-35s|(21) %-20s\n",Marriage_Storage.get("8" + MarriageNavi + Marriage.getSMName()), Marriage_Storage.get("21" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCivil Status\t\t\t\t|(9) %-35s|(22) %-15s\n",Marriage_Storage.get("9" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("22" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tName of Father\t\t\t\t|(10) %-34s|(23) %-15s\n", Marriage_Storage.get("10" + MarriageNavi + Marriage.getSMName()), Marriage_Storage.get("23" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(11) %-34s|(24) %-15s\n", Marriage_Storage.get("11" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("24" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tName of Mother\t\t\t\t|(12) %-34s|(25) %-15s\n", Marriage_Storage.get("12" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("25" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\tCitizenship\t\t\t\t|(13) %-34s|(26) %-15s\n", Marriage_Storage.get("13" + MarriageNavi + Marriage.getSMName()),Marriage_Storage.get("26" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tPlace of Marriage: "+ Marriage_Storage.get("27" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\tDate Of Marriage: "+ Marriage_Storage.get("28" + MarriageNavi + Marriage.getSMName()));
        System.out.println("\t\t\t\t\t-----------------------------------------------------------------------------------------------------------------------");
}
        public static void Marriage_Store(){
    Marriage_Storage.put("1a" +  MNavi + Marriage.getSMName(),  Marriage.getWifeFirst());
    Marriage_Storage.put("1b" + MNavi + Marriage.getSMName(),  Marriage.getWifeMiddle());
    Marriage_Storage.put("1c" + MNavi + Marriage.getSMName(),  Marriage.getWifeLast());
    Marriage_Storage.put("2" + MNavi + Marriage.getSMName(),  Marriage.getWifeDateOfBirth());
    Marriage_Storage.put("3" + MNavi + Marriage.getSMName(),  Marriage.getWifeAge()); 
    Marriage_Storage.put("4" + MNavi + Marriage.getSMName(),  Marriage.getWifePlaceOfBirth());
    Marriage_Storage.put("5" + MNavi + Marriage.getSMName(),   Marriage.getWifeSex());
    Marriage_Storage.put("6" + MNavi + Marriage.getSMName(),  Marriage.getWifeCitzen());
    Marriage_Storage.put("7a" + MNavi +  Marriage.getSMName(),  Marriage.getWifeProvince());
    Marriage_Storage.put("7b" + MNavi + Marriage.getSMName(),   Marriage.getWifeCity());
    Marriage_Storage.put("7c" + MNavi + Marriage.getSMName(),  Marriage.getWifeBarangay());
    Marriage_Storage.put("7d" + MNavi + Marriage.getSMName(), Marriage.getWifeStreet());
    Marriage_Storage.put("8" + MNavi + Marriage.getSMName(),   Marriage.getWifeReligion());
    Marriage_Storage.put("9" + MNavi + Marriage.getSMName(),  Marriage.getWifeStatus());
    Marriage_Storage.put("10" + MNavi + Marriage.getSMName(), Marriage.getWifeFather());
    Marriage_Storage.put("11" + MNavi + Marriage.getSMName(),   Marriage.getWifeFatherCitizen());
    Marriage_Storage.put("12" + MNavi + Marriage.getSMName(),  Marriage.getWifeMother());
    Marriage_Storage.put("13" + MNavi + Marriage.getSMName(), Marriage.getWifeMotherCitizen());
    
    //HUSBAND
    Marriage_Storage.put("14a" + MNavi + Marriage.getSMName(),  Marriage.getHusbandFirst());
    Marriage_Storage.put("14b" + MNavi + Marriage.getSMName(),  Marriage.getHusbandMiddle());
    Marriage_Storage.put("14c" + MNavi + Marriage.getSMName(),  Marriage.getHusbandLast());
    Marriage_Storage.put("15" + MNavi + Marriage.getSMName(),  Marriage.getHusbandDateOfBirth());
    Marriage_Storage.put("16" + MNavi + Marriage.getSMName(),  Marriage.getHusbandAge());
    Marriage_Storage.put("17" + MNavi + Marriage.getSMName(),  Marriage.getHusbandPlaceOfBirth());
    Marriage_Storage.put("18" + MNavi + Marriage.getSMName(),  Marriage.getHusbandSex());
    Marriage_Storage.put("19" + MNavi + Marriage.getSMName(),  Marriage.getHusbandCitizen());
    Marriage_Storage.put("20a" + MNavi + Marriage.getSMName(),   Marriage.getHusbandProvince());
    Marriage_Storage.put("20b" + MNavi + Marriage.getSMName(),   Marriage.getHusbandCity());
    Marriage_Storage.put("20c" + MNavi + Marriage.getSMName(),  Marriage.getHusbandBarangay());
    Marriage_Storage.put("20d" + MNavi + Marriage.getSMName(),  Marriage.getHusbandStreet());
    Marriage_Storage.put("21" + MNavi + Marriage.getSMName(),  Marriage.getHusbandReligion());
    Marriage_Storage.put("22" + MNavi + Marriage.getSMName(),  Marriage.getHusbandStatus());
    Marriage_Storage.put("23" + MNavi + Marriage.getSMName(),   Marriage.getHusbandFather());
    Marriage_Storage.put("24" + MNavi + Marriage.getSMName(),    Marriage.getHusbandFatherCitizen());
    Marriage_Storage.put("25" + MNavi + Marriage.getSMName(),  Marriage.getHusbandMother());
    Marriage_Storage.put("26" + MNavi + Marriage.getSMName(),  Marriage.getHusbandMotherCitizen());
    Marriage_Storage.put("27" + MNavi + Marriage.getSMName(),  Marriage.getPlaceMarriage());
    Marriage_Storage.put("28" + MNavi + Marriage.getSMName(),  Marriage.getDateMarriage());
    
    MNavi++;
    
    }
        public static void Marriage_Customer_View(){
            
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            System.out.println("\t\t\t\t\t\t| User ID    | User Name           | User Status    |");
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            System.out.println("\t\t\t\t\t\t|New = New Coppy                                    |");
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            



             for(Map.Entry<Object, String> eh : Marriage_Code.entrySet()){
                
                    if(Marriage_MCode.get(eh.getKey()) == "New"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Marriage_MCode.get(eh.getKey()));
                    }
            }
                
                
                System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                System.out.println("\t\t\t\t\t\t|Request = Request Sent But not Approve             |");
                System.out.println("\t\t\t\t\t\t-----------------------------------------------------");

                    
                    
                    for(Map.Entry<Object, String> eh : Marriage_Code.entrySet()){
                
                    if(Marriage_MCode.get(eh.getKey()) == "Request"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Marriage_MCode.get(eh.getKey()));
                            }
                                       
                    }
             

                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Approve = Waiting for the user to pay              |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");

                    for(Map.Entry<Object, String> eh : Marriage_Code.entrySet()){
                
                    if(Marriage_MCode.get(eh.getKey()) == "Approve"){
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Marriage_MCode.get(eh.getKey()));
                     
                            }                   
                    }
             

                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Denied = Request Due to Invalid Inputs             |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                    for(Map.Entry<Object, String> eh : Marriage_Code.entrySet()){
                
                    if(Cenomar_CCode.get(eh.getKey()) == "Denied"){
                        
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Marriage_MCode.get(eh.getKey()));
                        
                            }
                    }

                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t|Done = Done with the transaction                   |");
                    System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
                    
                     for(Map.Entry<Object, String> eh : Marriage_Code.entrySet()){
                
                    if(Marriage_MCode.get(eh.getKey()) == "Done"){
                        
                    System.out.printf("\t\t\t\t\t\t| %-11s| %-20s| %-15s|\n",eh.getKey() , eh.getValue() , Marriage_MCode.get(eh.getKey()));
                        
                            }
                        }
                    
        System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            
        }
        public static void Marriage_Semi_Admin() throws InterruptedException{
            Marriage_Customer_View();
            System.out.print("Enter the Code you want to change status: ");
            MFill = scn.next();
             if(Marriage_Code.containsKey(MFill)){

                     
            
                if(Marriage_Code.containsKey(MFill)){
                    
                    if(Marriage_MCode.get(MFill) == "Request"){
                        
                        MarriageNavi = MFill.substring(MFill.length() -1);
                        Marriage.setSMName(Marriage_Code.get(MFill));
                        Display_Admin_Marriage();
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
                            Marriage_Certificate();
                            Marriage_MCode.replace(MFill, "Approve");
                            
                        }else if(RYN.equals("N")){
                            break;
                        }
                        }while(!RYN.equals("Y"));
                    }else if(Marriage_MCode.get(MFill) == "New" || Marriage_MCode.get(MFill) == "Denied"){
                    
                    MarriageNavi = MFill.substring(MFill.length() -1);
                    System.out.println("Checking " + MFill + Marriage_Code.get(MFill));
                    Marriage.setCenoName(Marriage_Code.get(MFill));
                    
                    System.out.println("\t\t\t\t\t--------------------------------------------");
                    System.out.println("\t\t\t\t\t| Existing Data       | User Request       |");
                    System.out.println("\t\t\t\t\t--------------------------------------------");
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("1a" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("1a" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("1b" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("1b" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("1c" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("1c" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("2" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("2" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("3" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("3" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("14a" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("14a" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("14b" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("14b" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("14a" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("14c" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("15" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("15" + MFill));
                    System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("16" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("16" + MFill));
                   
                    System.out.println("\t\t\t\t\t--------------------------------------------");    
                    do{
                    System.out.println("\t\t\t\t\t\tConfirm the request?"
                                + "\n\t\t\t\t\t\t[Y] Yes"
                                + "\n\t\t\t\t\t\t[N] No");
                        YorN = scn.next().toUpperCase();
                        if(YorN.equals("Y")){
                            Marriage_MCode.replace(MFill, "Approve");
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
                          Marriage_MCode.replace(MFill, "\t\t\t\tDenied");
                          break;
                        }else{
                            InvalidErrors();
                        }
                    }while(!YorN.matches("Y|M"));
                    }
            }else {
                    InvalidErrors();
                }
                }
        }
        public static void Display_Admin_Marriage(){
            
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
        System.out.println("\n\t\t\t\t1a. First Name: " + Marriage_Storage.get("1a" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t1b. Middle Name: " + Marriage_Storage.get("1b" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t1c. Last Name: " +  Marriage_Storage.get("1c" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t2. Date of Birth (MM/DD/YYYY): " + Marriage_Storage.get("2" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t3. Age: " + Marriage_Storage.get("3" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t4. Place of Birth (City, Province): " + Marriage_Storage.get("4" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t5. Sex(f/m): " + Marriage_Storage.get("5" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t6. Citizenship: " + Marriage_Storage.get("6" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t7a. Residence (Province): " + Marriage_Storage.get("7a" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t7b. Residence (City/Municipality): " + Marriage_Storage.get("7b" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t7c. Residence (Baranggay): " + Marriage_Storage.get("7c" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t7d. Residence (House Number/Street): " +Marriage_Storage.get("7d" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t8. Religion: " + Marriage_Storage.get("8" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t9. Civil status: " + Marriage_Storage.get("9" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t10. Full name of Father: " + Marriage_Storage.get("10" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t11. Citizenship of Father: " + Marriage_Storage.get("11" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t12. Full name of Mother: " + Marriage_Storage.get("12" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t13. Citizenship of Mother: " + Marriage_Storage.get("13" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
        System.out.println("\t\t\t\t14a. First Name: " + Marriage_Storage.get("14a" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t14b. Middle Name: " + Marriage_Storage.get("14b" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t14c. Last Name: " + Marriage_Storage.get("14c" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t15. Date of Birth (MM/DD/YYYY): " + Marriage_Storage.get("15" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t16. Age: " + Marriage_Storage.get("16" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t17. Place of Birth (City, Province): " + Marriage_Storage.get("17" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t18. Sex(f/m): " + Marriage_Storage.get("18" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t19. Citizenship: " + Marriage_Storage.get("19" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t20a. Residence (Province): " + Marriage_Storage.get("20a" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t20b. Residence (City/Municipality): " + Marriage_Storage.get("20b" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t20c. Residence (Baranggay): " + Marriage_Storage.get("20c" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t20d. Residence (House Number/Street): " + Marriage_Storage.get("20d" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t21. Religion: " + Marriage_Storage.get("21" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t22. Civil status: " + Marriage_Storage.get("22" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t23. Full name of Father: " + Marriage_Storage.get("23" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t24. Citizenship of Father: " + Marriage_Storage.get("24" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t25. Full name of Mother: " + Marriage_Storage.get("25" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\t26. Citizenship of Mother: " + Marriage_Storage.get("26" + MFill.substring(MFill.length()-1) + Marriage.SMName));
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tPlace of Marriage" + Marriage_Storage.get("27" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\tDate of Marriage" + Marriage_Storage.get("28" + MFill.substring(MFill.length()-1) + Marriage.SMName));
        System.out.println("\t\t\t\tThis is to certify that I " + Marriage_Storage.get("1a" + MFill.substring(MFill.length()-1) + Marriage.SMName) +" "+ Marriage_Storage.get("1b" + MFill.substring(MFill.length()-1) + Marriage.SMName) +" "+ Marriage_Storage.get("1c" + MFill.substring(MFill.length()-1) + Marriage.SMName) 
                + " and " + Marriage_Storage.get("14a" + MFill.substring(MFill.length()-1) + Marriage.SMName) +" "+ Marriage_Storage.get("14b" + MFill.substring(MFill.length()-1) + Marriage.SMName) + " " + Marriage_Storage.get("14c" + MFill.substring(MFill.length()-1) + Marriage.SMName)
                            +",\n\t\t\t\tboth of legal age, of our own free will and accord,"
                            + "\n\t\t\t\tthe presence of the person solemmizing this marriage and of the witness named below,"
                            + "\n\t\t\t\ttake each other as husband and wife.");
            
        }
        public static void Marriage_Request_New(){
            
            System.out.print("1a. " + ques.get("1a"));
            WFname = scn.nextLine();
            System.out.print("1b. " + ques.get("1b"));
            WMname = scn.nextLine();
            System.out.print("1c. " + ques.get("1c"));
            WLname = scn.nextLine();
            System.out.print("2. " + ques.get("2"));
            WBD = scn.nextLine();
            System.out.print("3. " + ques.get("3"));
            WAGE = scn.nextLine();
            System.out.print("14a. " + ques.get("14a"));
            HFname = scn.nextLine();
            System.out.print("14b. " + ques.get("14b"));
            HMname = scn.next();
            System.out.print("14c. " + ques.get("14c"));
            HLname = scn.nextLine();
            System.out.print("15. " + ques.get("15"));
            HBD = scn.nextLine();
            System.out.print("16. " + ques.get("16"));
            HAGE = scn.nextLine();
            
            Cenomar_Request.put("1a" + MFill, WFname);
            Cenomar_Request.put("1b" + MFill, WMname);
            Cenomar_Request.put("1c" + MFill, WLname);
            Cenomar_Request.put("2" + MFill, WBD);
            Cenomar_Request.put("3" + MFill, WAGE);
            Cenomar_Request.put("14a" + MFill, HFname);
            Cenomar_Request.put("14b" + MFill, HMname);
            Cenomar_Request.put("14c" + MFill, HLname);
            Cenomar_Request.put("15" + MFill, HBD);
            Cenomar_Request.put("16" + MFill, HAGE);
            
        }
        public static void Marriage_NewReq(){
            
             System.out.print("\t\t\t\t\tEnter the Code Number That have been given to you after your Fill Up Form: ");
                                   MFill = scn.next().toUpperCase();
                                   
                                   if(Marriage_Code.containsKey(MFill)){
                                       
                                       if(Marriage_MCode.get(MFill) == "Done"){
                                           System.out.print("This Certificate have been Already approve and certificate is ready"
                                                   + "\n\t\t\t\t\tif you want another copy press N, if no press X"
                                                   + "\n\t\t\t\t\t[N] New Coppy"
                                                   + "\n\t\t\t\t\t[X] Exit: ");
                                           String NCopy = scn.next().toUpperCase(); 
                                            
                                           if(NCopy.equals("N")){
                                               Marriage_Request_New();
                                           }else if(NCopy.equals("X")){
                                               
                                           }else {
                                               InvalidErrors();
                                           }
                                           
                                       }else if(Marriage_MCode.get(MFill) == "Denied"){
                                           System.out.println("\t\t\t\t\tThis Request Have been denied already!!!");
                                           System.out.println("\t\t\t\t\tPlease be more carefull and check your answers before Inputing them");
                                           Cenomar_Request_New();
                                           
                                           
                                       }else if(Marriage_MCode.get(CFill) == "Request"){
                                           System.out.println("\t\t\t\t\tThis Data is still waiting to be Approve."
                                                   + "\n\t\t\t\t\tPlease wait for the Approval of the Admin");
                                           
                                       }else if(Marriage_MCode.get(MFill) == "Approve"){
                                           System.out.println("\t\t\t\t\tThis Data is already Approve"
                                                   + "\n\t\t\t\t\tPlease go to Already Request section to pay for the certificate");
                                       }

                                        }
            
        }
        public static void Marriage_AlreadyReq()throws InterruptedException{
            
            System.out.print("\t\t\t\t\tEnter the Code Number That have been given to you after your Fill Up Form: ");
            MFill = scn.next().toUpperCase();
                                           
                if(Marriage_MCode.containsKey(MFill)){
                    if(Marriage_MCode.get(MFill) == "Approve"){
                                                   MarriageNavi = MFill.substring(MFill.length() - 1);
                                                   Marriage.setSMName(Marriage_Code.get(MFill));                                               
                                                   do{
                                                   System.out.println("The Code Have been Approve!!");
                                                   System.out.println("Choose the Method you want"
                                                           + "\n[P] Pick Up"
                                                           + "\n[D] Delivery");
                                                   PD = scn.next().toUpperCase();
                                                   
                                                   if(PD.equals("P")){
                                                       PickUp();
                                                       Marriage_MCode.replace(MFill, "Done");
                                                   }else if(PD.equals("D")){
                                                       Delivery();
                                                       Marriage_MCode.replace(MFill, "Done");
                                                   }else{
                                                       InvalidErrors();
                                                   }
                                                   }while(!PD.matches("P|D"));
                                               }else if(Marriage_MCode.get(MFill) == "Request"){
                                                   System.out.println("\t\t\t\t\tPlease wait for the Approval of the Request!!");
                                               }else if(Marriage_MCode.get(MFill) == "Denied"){
                                                   System.out.println("\t\t\t\t\tYour Request Had been denied!!"
                                                           + "\n\t\t\t\t\tYour Answer Doesn't Match the data your trying to access");
                                               }
                                           }else{
                                               InvalidErrors();
                                           }
        }
        public static void Marriage_Admin() throws InterruptedException{
            switch(AdminPurp){
                case "A":
                    Marriage_Add();
                    break;
                case "V":
                    Marriage_View();
                    break;
                case "D":
                    Marriage_Delete();
                    break;
                case "E":
                    Marriage_Edit();
                    break;
                default:
                    InvalidErrors();
            }
            
        }
        public static void Marriage_Add() throws InterruptedException{
            
                                MFill = String.valueOf(MCode_Num);
                                MarriageNavi = MFill.substring(MFill.length()-1);
                                inputMarriageCertificate();
                                Marriage.setSMName(Marriage.getWifeFirst() + " " + Marriage.getWifeMiddle() + " " + Marriage.getWifeLast());
                                Marriage_Store();
                                
                                do{
                                System.out.print("Do you want to Print the Copy"
                                        + "\n[Y] Yes"
                                        + "\n[N] No: " );
                                YoN = scn.next().toUpperCase();
                                if(YoN.equals("Y")){
                                    System.out.print("Printing Sample Copy.");
                                    Thread.sleep(400);
                                    System.out.print(".");
                                    Thread.sleep(400);
                                    System.out.println(".");
                                    Marriage_Certificate();
                                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("\t\t\t\t\t\tThank You for Registering!");
                                            System.out.println("\t\t\t\t\t\tWarning do not show this code to anyone!!!!");
                                            System.out.println("\t\t\t\tHeres your Code Number if you ever wanted the Copy of the certificate: M" + MCode_Num);
                                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                            break;
                                }else if(YoN.equals("N")){
                                    break;
                                }else{
                                    InvalidErrors();
                                }
                                }while(!YoN.equals("N"));
                                
                                Marriage_Code.put("M" + MCode_Num, Marriage.getSMName());
                                Marriage_MCode.put("M" + MCode_Num, "Approve");
                                System.out.println(Marriage_Code + " " + Marriage_MCode);
                                
                                MCode_Num++;
            
        }
        public static void Marriage_Edit(){
            
              System.out.println("--------------------------------------------------------");
                                System.out.println("Enter The code you want to edit: ");
                                MFill = scn.next();
                                
                                MarriageNavi = MFill.substring(MFill.length()-1);
                                if(Marriage_Code.containsKey(MFill)){
                                    Marriage.setSMName(Marriage_Code.get(MFill));
                                    Edit_Name = Marriage.getSMName();
                                    
                                do{
                                 
                                    Display_Admin_Marriage();
                                    System.out.println("Do You wish to continue or Edit?"
                                            + "\n[C] Continue"
                                            + "\n[E] Edit: ");
                                    CoE = scn.next().toUpperCase();
                                    if(CoE.equals("C")){
                                        
                                        Marriage.setSMName(Marriage_Storage.get("1a" + MarriageNavi + Marriage_Code.get(MFill)) + Marriage_Storage.get("1b" + MarriageNavi + Marriage_Code.get(MFill)) + Marriage_Storage.get("1c" + MarriageNavi + Marriage_Code.get(MFill)));
                                        Marriage_Admin_Edit_Store();
                                        Marriage_Code.replace(MFill, Marriage.getSMName());
                                        Marriage_Storage.putAll(Admin_MStore);
                                        Admin_MStore.clear();
                                    }else if(CoE.equals("E")){
                                        
                                        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                                        System.out.print("\t\t\t\t\tEnter the Code Value of that question example(1A)"
                                               + "\n\t\t\t\t\tif more than 1 each number and value should be seprate by space: ");
                                        scn.nextLine();
                                        String edit = scn.nextLine().toLowerCase();
                                        String[] Marriage_editor = edit.split(" ");
                                        
                                        for(String a : Marriage_editor){
                                            if(ques.containsKey(a)){
                                                System.out.println( a + " " + ques.get(a) + " ");
                                                String newValue = scn.nextLine();
                                            switch(a) {
	            case "1a":    
	               Marriage_Storage.replace("1a" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "1b":
	               Marriage_Storage.replace("1b" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "1c":
	               Marriage_Storage.replace("1c" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "2":
	                Marriage_Storage.replace("2" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "3":
	                Marriage_Storage.replace("3" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "4":
	                Marriage_Storage.replace("4" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "5":
	                Marriage_Storage.replace("5" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "6":
	                Marriage_Storage.replace("6" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "7a":
	                Marriage_Storage.replace("7a" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "7b":
	                Marriage_Storage.replace("7b" + MarriageNavi + Marriage.getSMName(), newValue);;
	                break;
	            case "7c":
	                Marriage_Storage.replace("7c" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "7d":
	                Marriage_Storage.replace("7d" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "8":
	                Marriage_Storage.replace("8" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "9":
	               Marriage_Storage.replace("9" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "10":
	                Marriage_Storage.replace("10" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "11":
	                Marriage_Storage.replace("11" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "12":
	                Marriage_Storage.replace("12" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "13":
	                Marriage_Storage.replace("13" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;

	            // Husband's information
	            case "14a":
	                Marriage_Storage.replace("14a" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "14b":
	                Marriage_Storage.replace("14b" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "14c":
	                Marriage_Storage.replace("14c" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "15":
	                Marriage_Storage.replace("15" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "16":
	                Marriage_Storage.replace("16" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "17":
	                Marriage_Storage.replace("17" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "18":
	                Marriage_Storage.replace("18" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "19":
	                Marriage_Storage.replace("19" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "20a":
	                Marriage_Storage.replace("20a" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "20b":
	                Marriage_Storage.replace("20b" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "20c":
	               Marriage_Storage.replace("20c" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "20d":
	                Marriage_Storage.replace("20d" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "21":
	                Marriage_Storage.replace("21" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "22":
	                Marriage_Storage.replace("2" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "23":
	                Marriage_Storage.replace("23" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "24":
	                Marriage_Storage.replace("24" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "25":
	                Marriage_Storage.replace("25" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;
	            case "26":
	                Marriage_Storage.replace("26" + MarriageNavi + Marriage.getSMName(), newValue);
	                break;

	            default:
	                System.out.println("\tInvalid line number.");
	                break;
                                                }
                                            }
                                            
                                        }
                                        
                                    }
                                }while(!CoE.matches("C"));
           }
            
        }
        public static void Marriage_Delete() throws InterruptedException{
            
             System.out.print("Delete data or View Deleted History"
                                        + "\n[D] Delete Data"
                                        + "\n[V] View Deleted History: ");
                                String DV = scn.next().toUpperCase();
                                if(DV.equals("D")){
                                System.out.print("Enter the code of the Data you want to delete: ");
                                MFill = scn.next().toUpperCase();
                                if(Marriage_Code.containsKey(MFill)){
                                    Marriage.setSMName(Marriage_Code.get(MFill));
                                    Edit_Name = Marriage.getSMName();
                                    MarriageNavi = MFill.substring(MFill.length()-1);
                                    Display_Admin_Marriage();
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
                                        Marriage_Admin_Edit_Store();
                                        Marriage_Delete.putAll(Admin_MStore);
                                        Admin_MStore.clear();
                                        Marriage_MCode.replace(MFill, "Deleted");
                                        
                                    }
                                }
                            }else if(DV.equals("V")){
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("| User ID        | User Name           | Status        |");
                                    System.out.println("--------------------------------------------------------");
                                    
                                    for(Map.Entry<Object, String> eh: Marriage_Code.entrySet()){
                                        if(Marriage_MCode.get(eh.getKey()) == "Deleted"){
                                            
                                        System.out.printf("| %-15s| %-20s| %-15s|\n", eh.getKey(), eh.getValue(), Marriage_MCode.get(eh.getKey()));
                                        }
                                        
                                    }
                                    System.out.println("--------------------------------------------------------");;
                                    
                                    System.out.print("Enter the code you want to view: ");
                                    MFill = scn.next().toUpperCase();
                                    
                                    if(Marriage_Code.containsKey(MFill)){
                                        Marriage.setSMName(Marriage_Code.get(MFill));
                                        Marriage_Delete_View();
                                    }else{
                                        InvalidErrors();
                                    }

                                    
                                
                            }
            
        }
        public static void Marriage_View() throws InterruptedException{
            
             do{
             System.out.print("Enter the code you want to view: ");
                                MFill = scn.next().toUpperCase();
                                if(Marriage_Code.containsKey(MFill)){
                                    Marriage.setSMName(Marriage_Code.get(MFill));
                                    Display_Admin_Marriage();

                                    System.out.print("Do you wish to edit the status of this Data?"
                                            + "\n[Y] Yes"
                                            + "\n[N] No: ");
                                    CE = scn.next().toUpperCase();
                                    
                                    if(CE.equals("Y")){
                                        
                                        if(Marriage_Code.get(MFill) == "New"){
                                            
                                            MarriageNavi = MFill.substring(MFill.length() -1);
                                            System.out.println("Checking " + MFill + Marriage_Code.get(MFill));
                                            Marriage.setSMName(Marriage_Code.get(MFill));
                    
                                            System.out.println("\t\t\t\t\t--------------------------------------------");
                                            System.out.println("\t\t\t\t\t| Existing Data       | User Request       |");
                                            System.out.println("\t\t\t\t\t--------------------------------------------");
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("1a" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("1a" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("1b" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("1b" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("1c" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("1c" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("2" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("2" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("3" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("3" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("14a" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("14a" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("14b" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("14b" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("14a" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("14c" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("15" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("15" + MFill));
                                            System.out.printf("\t\t\t\t\t| %-20s| %-19s|\n" , Marriage_Storage.get("16" + MarriageNavi + Marriage.getSMName()), Marriage_Request.get("16" + MFill)); 
                                            System.out.println("\t\t\t\t\t--------------------------------------------"); 
                                            
                                            System.out.print("This Data is for a new coppy you want to Approve it?([Y] Yes|[N] No): ");
                                            String YoN = scn.next().toUpperCase();
                                            if(YoN.equals("Y")){
                                                
                                                System.out.print("Processing.");
                                                Thread.sleep(400);
                                                System.out.print(".");
                                                Thread.sleep(400);
                                                System.out.println(".");
                                                System.out.println("Approve Successfully");
                                                Marriage_MCode.replace(MFill, "Approve");
                                               
                                            }else if(YoN.equals("N")){
                                                Another();
                                            }else{
                                                InvalidErrors();
                                            }
                                            
                                            
                                        }else if(Marriage_MCode.get(MFill) == "Approve"){
                                            System.out.println("This Data is waiting to be payed");
                                        }else if(Marriage_MCode.get(MFill) == "Request"){
                                            System.out.println("This Data is on request and waiting to be approve you want to approve it? ");
                                            System.out.print("Do you want to Approve it?([Y] Yes|[N] No):");
                                            String YoN = scn.next().toUpperCase();
                                            if(YoN.equals("Y")){
                                                System.out.print("Processing.");
                                                Thread.sleep(400);
                                                System.out.print(".");
                                                Thread.sleep(400);
                                                System.out.println(".");
                                                System.out.println("Approve Successfully");
                                                Marriage_MCode.replace(MFill, "Approve");
                                                
                                            }else if(YoN.equals("N")){
                                                Another();
                                            }else{
                                                InvalidErrors();
                                            }
                                        }else if(Cenomar_CCode.get(CFill) == "Denied"){
                                            System.out.println("This Data have been denied you want to Approve it?");
                                        }
                                        Another();
                                    }else if(CE.equals("N")){
                                        Another();
                                        }
                                    
                                }
            }while(!Another.contains("N"));
            
        }
        public static void Marriage_Admin_Edit_Store(){
            
            Admin_MStore.put("1a" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("1a" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("1b" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("1b" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("1c" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("1c" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("2" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("2" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("3" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("3" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("4" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("4" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("5" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("5" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("6" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("6" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("7a" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("7a" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("7b" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("7b" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("7c" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("7c" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("7d" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("7d" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("8" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("8" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("9" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("9" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("10" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("10" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("11" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("11" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("12" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("12" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("13" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("13" +  MarriageNavi + Edit_Name));
            
            
            
    
    //HUSBAND
            Admin_MStore.put("14a" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("14a" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("14b" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("14b" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("14c" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("14c" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("15" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("15" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("16" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("16" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("17" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("17" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("18" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("18" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("19" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("19" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("20a" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("20a" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("20b" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("20b" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("20c" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("20c" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("20d" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("20d" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("21" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("21" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("22" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("22" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("23" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("23" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("24" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("24" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("25" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("25" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("26" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("26" +  MarriageNavi + Edit_Name));
            
            Admin_MStore.put("27" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("27" +  MarriageNavi + Edit_Name));
            Admin_MStore.put("28" +  MarriageNavi + Marriage.getSMName(),  Marriage_Storage.remove("28" +  MarriageNavi + Edit_Name));
            
        }
        public static void Marriage_Delete_View(){
            
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
        System.out.println("\n\t\t\t\t1a. First Name: " + Marriage_Delete.get("1a" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t1b. Middle Name: " + Marriage_Delete.get("1b" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t1c. Last Name: " +  Marriage_Delete.get("1c" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t2. Date of Birth (MM/DD/YYYY): " + Marriage_Delete.get("2" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t3. Age: " + Marriage_Delete.get("3" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t4. Place of Birth (City, Province): " + Marriage_Delete.get("4" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t5. Sex(f/m): " + Marriage_Delete.get("5" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t6. Citizenship: " +Marriage_Delete.get("6" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t7a. Residence (Province): " + Marriage_Delete.get("7a" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t7b. Residence (City/Municipality): " + Marriage_Delete.get("7b" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t7c. Residence (Baranggay): " + Marriage_Delete.get("7c" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t7d. Residence (House Number/Street): " + Marriage_Delete.get("7d" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t8. Religion: " + Marriage_Delete.get("8" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t9. Civil status: " + Marriage_Delete.get("9" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t10. Full name of Father: " + Marriage_Delete.get("10" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t11. Citizenship of Father: " + Marriage_Delete.get("11" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t12. Full name of Mother: " + Marriage_Delete.get("12" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t13. Citizenship of Mother: " + Marriage_Delete.get("13" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
        System.out.println("\t\t\t\t14a. First Name: " + Marriage_Delete.get("14a" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t14b. Middle Name: " + Marriage_Delete.get("14b" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t14c. Last Name: " + Marriage_Delete.get("14c" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t15. Date of Birth (MM/DD/YYYY): " + Marriage_Delete.get("15" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t16. Age: " + Marriage_Delete.get("16" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t17. Place of Birth (City, Province): " + Marriage_Delete.get("17" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t18. Sex(f/m): " + Marriage_Delete.get("18" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t19. Citizenship: " + Marriage_Delete.get("19" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t20a. Residence (Province): " + Marriage_Delete.get("20a" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t20b. Residence (City/Municipality): " + Marriage_Delete.get("20b" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t20c. Residence (Baranggay): " + Marriage_Delete.get("20c" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t20d. Residence (House Number/Street): " + Marriage_Delete.get("20d" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t21. Religion: " + Marriage_Delete.get("21" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t22. Civil status: " + Marriage_Delete.get("22" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t23. Full name of Father: " + Marriage_Delete.get("23" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t24. Citizenship of Father: " + Marriage_Delete.get("24" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t25. Full name of Mother: " + Marriage_Delete.get("25" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\t26. Citizenship of Mother: " + Marriage_Delete.get("26" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tPlace of Marriage" + Marriage_Delete.get("27" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\tDate of Marriage" + Marriage_Delete.get("28" + MFill.substring(MFill.length()-1) + Marriage.getSMName()));
        System.out.println("\t\t\t\tThis is to certify that I " + Marriage_Delete.get("1a" + MFill.substring(MFill.length()-1) + Marriage.getSMName()) +" "+Marriage_Delete.get("1b" + MFill.substring(MFill.length()-1) + Marriage.getSMName())+" "+Marriage_Delete.get("1c" + MFill.substring(MFill.length()-1) + Marriage.getSMName())
                +" and "
                + Marriage_Delete.get("14a" + MFill.substring(MFill.length()-1) + Marriage.getSMName())+" "+Marriage_Delete.get("14b" + MFill.substring(MFill.length()-1) + Marriage.getSMName())+" "+Marriage_Delete.get("14c" + MFill.substring(MFill.length()-1) + Marriage.getSMName())
                            +",\n\t\t\t\tboth of legal age, of our own free will and accord,"
                            + "\n\t\t\t\tthe presence of the person solemmizing this marriage and of the witness named below,"
                            + "\n\t\t\t\ttake each other as husband and wife.");
            
        }
        public static void Another(){
            System.out.print("Continue or Another?([Y] Yes|[N] No): ");
            Another = scn.next().toUpperCase();
            
        }
}
        