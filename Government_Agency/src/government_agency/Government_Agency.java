
package government_agency;

import java.util.*;
public class Government_Agency{

    static Birth B = new Birth();
    static String TBP;
    static Map ques = new HashMap();
    public static void main(String[] args) {
        Questions();
        
        Scanner scn = new Scanner(System.in);
        System.out.println();
        System.out.print("----------------------------------------------------------"
                + "\n\t\tGovernment Agency"
                + "\n\t\t[1] Registration "
                + "\n\t\t[2] Print Copy"
                + "\n"
                + "\nEnter designated number: ");
        
        int Purp = scn.nextInt();
        System.out.println("----------------------------------------------------------");
        
        switch(Purp){
            case 1:
                
                System.out.print("\tEnter Registration Certificate"
                        + "\n\t\t[1] Birth"
                        + "\n\t\t[2] Marriage"
                        + "\n\t\t[3] Death"
                        + "\n"
                        + "\nEnter purpose number: ");
                int ResPurp = scn.nextInt();
                
                
                if(ResPurp == 1){
                   
                   //Child info
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tChild Information");
                   System.out.println("----------------------------------------------------------");
                   
                   System.out.println("\t\tBirth Resgistration");
                   System.out.print("1A. Enter First Name: ");
                   String Fname = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("2A. Enter Middle Name (Enter NA if does'nt have one): ");
                   String Mname = scn.next();
                   
                   System.out.print("3A. Enter Last Name: ");
                   String LName = scn.next();
                   
                   System.out.print("4A. Enter Suffix (NA if not have): ");
                   String suf = scn.next();
                   
                   System.out.print("5A. Enter Age: ");
                   int Age = scn.nextInt();
                   
                   System.out.print("6A. Enter Birthday(MM/DD/YYYY): ");
                   String BD = scn.next();
                   
                   System.out.print("7A. Enter Sex(f/m): ");
                   char gend = scn.next().toUpperCase().charAt(0);
                   
                   System.out.print("8A. Enter Place of Bitht(Province): ");
                   String Provi = scn.next();
                   
                   System.out.print("9A. Enter Place of Birth (City/Municipality): " );
                   String City = scn.next();
                   
                   System.out.print("10A. Enter Place of Birth(Hospital/Clinic/Institution): ");
                   String Hos = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("11A. Type of Birth(Single/Twin/Triplet/etc.): ");
                   String  TB = scn.next();
                   
                   if(!TB.equalsIgnoreCase("Single")){
                       
                   System.out.print("12A. if multiple birth, child was (first/second/third/fourth/etc.): ");
                   TBP = scn.next();
                   
                   }
                   
                   System.out.print("13A. Weight At Birth: ");
                   int weigh = scn.nextInt(); 
                   
                   //Mothers Info
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tMother information");
                   System.out.println("----------------------------------------------------------");
                    
                   System.out.print("1M. Enter First Name: ");
                   String MFname = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("2M. Enter Last Name: ");
                   String MLname = scn.nextLine();
                   
                   System.out.print("3M. Enter Middle Name: ");
                   String MMname = scn.nextLine(); 
                   
                   System.out.print("4M. Enter Citizenship: ");
                   String MCiten = scn.next();
                   
                   System.out.print("5M. Enter Religion: ");
                   String MRel = scn.next();
                   
                   System.out.print("6M. Enter Occupation: ");
                   String MOcc = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("7M. Enter Age at time of this birth: ");
                   int MAge = scn.nextInt();
                   
                   System.out.print("8M. Residence(House Number/Steet, Barangay): ");
                   String MHNSB = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("9M. Residence Munipality: ");
                   String Mmuni = scn.nextLine();
                   
                   System.out.print("10M. Province: ");
                   String MProv = scn.nextLine();
                  
                  // Father Info
                  
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tFather information");
                   System.out.println("----------------------------------------------------------");
                    
                   System.out.print("1F. Enter First Name: ");
                   String FFname = scn.nextLine();
                 
                   System.out.print("2F. Enter Last Name: ");
                   String FLname = scn.nextLine();
                   
                   System.out.print("3F. Enter Middle Name: ");
                   String FMname = scn.nextLine(); 
                   
                   System.out.print("4F. Enter Citizenship: ");
                   String FCiten = scn.next();
                   
                   System.out.print("5F. Enter Religion: ");
                   String FRel = scn.next();
                   
                   System.out.print("6F. Enter Occupation: ");
                   String FOcc = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("7F. Enter Age at time of this birth: ");
                   int FAge = scn.nextInt();
                   scn.nextLine();
                   
                   System.out.print("8F. Residence(House Number/Steet, Barangay): ");
                   String FHNSB = scn.nextLine();
                   
                   System.out.print("9F. Residence Munipality: ");
                   String Fmuni = scn.nextLine();
                   
                   System.out.print("10F. Province: ");
                   String FProv = scn.nextLine();
                   
                   //setter of child info
                   B.setFname(Fname);
                   B.setMname(Mname);
                   B.setLname(LName);
                   B.setSuff(suf);
                   B.setAge(Age);
                   B.setBD(BD);
                   B.setgen(gend);
                   B.setprovi(Provi);
                   B.setCity(City);
                   B.setHos(Hos);
                   B.setTB(TB);
                   B.setTBP(TBP);
                   B.setweigh(weigh);
                   //Mother
                   B.setMCity(Mmuni);
                   B.setMoc(MOcc);
                   B.setMprovi(MProv);
                   B.setMage(MAge);
                   B.setMHos(MHNSB);
                   B.setMFname(MFname);
                   B.setMLname(MLname);
                   B.setMMname(MMname);
                   B.setMReligion(MRel);
                   B.setMCite(MCiten);
                   //Father
                   B.setFCity(Fmuni);
                   B.setFocc(FOcc);
                   B.setFprovi(FProv);
                   B.setFage(FAge);
                   B.setFHos(FHNSB);
                   B.setFFname(FFname);
                   B.setFLname(FLname);
                   B.setFMname(FMname);
                   B.setFReligion(FRel);
                   B.setFCite(FCiten);
                   
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tChild information");
                   System.out.println("----------------------------------------------------------");
                   CDisplay();
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tMother information");
                   System.out.println("----------------------------------------------------------");
                   MDisplay();
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tFather information");
                   System.out.println("----------------------------------------------------------");
                   FDisplay();
                   //setter of Mother info
                   
                   
                   System.out.println("Check your answers(if theres any mistake press 2 to edit)"
                            + "\n[1] Continue"
                            + "\n[2] Edit");
                   int CoE = scn.nextInt();
                    
                   if(CoE == 1){
                        
                   }else if(CoE == 2){
                       
                        System.out.println("Enter the number and letter of that question example(1A) ");
                        String edit = scn.next();
                        
                        System.out.print(ques.get(edit));
                        String change = scn.nextLine();
                        scn.nextLine();
                       
                    switch(edit){
                        case "1A" -> B.setFname(change);
                        case "2A" -> B.setMname(change);
                        case "3A" -> B.setLname(change);
                        case "4A" -> B.setSuff(change);
                        case "5A" -> B.setAge(Integer.parseInt(change));
                        case "6A" -> B.setBD(change);
                        case "7A" -> B.setgen(change.charAt(Integer.parseInt(change)));
                        case "8A" -> B.setprovi(change);
                        case "9A" -> B.setCity(change);
                        case "10A" -> B.setHos(change);
                        case "11A" -> B.setTB(change);
                        case "12A" -> B.setTBP(change);
                        case "13A" -> B.setweigh(Integer.parseInt(change));
                        case "1M" -> B.setMCity(change);
                        case "2M" -> B.setMoc(change);
                        case "3M" -> B.setMprovi(change);
                        case "4M" -> B.setMage(Integer.parseInt(change));
                        case "5M" -> B.setMHos(change);
                        case "6M" -> B.setMFname(change);
                        case "7M" -> B.setMLname(change);
                        case "8M" -> B.setMMname(change);
                        case "9M" -> B.setMReligion(change);
                        case "10M" -> B.setMCite(change);
                        case "1F" -> B.setFCity(change);
                        case "2F" -> B.setFocc(change);
                        case "3F" -> B.setFprovi(change);
                        case "4F" -> B.setFage(Integer.parseInt(change));
                        case "5F" -> B.setFHos(change);
                        case "6F" -> B.setFFname(change);
                        case "7F" -> B.setFLname(change);
                        case "8F" -> B.setFMname(change);
                        case "9F" -> B.setFReligion(change);
                        case "10F" -> B.setFCite(change);
                        }
                       //Mother
                       //Father
                    
                    }
                    
                }
                
                
                
                break;
            case 2:
                
                break;
            default:
                System.out.println("Invalid Number Please Enter the right number!");
        }
        
    }
    
    public static void Questions(){
        
        ques.put("1A","First Name:");
        ques.put("2A", "Middle Name (Enter NA if does'nt have one): ");
        ques.put("3A" , "Last Name:");
        ques.put("4A", "Suffix (NA if not have): ");
        ques.put("5A" , "Age: ");
        ques.put("6A" , "Birthday(MM/DD/YYYY): ");
        ques.put("7A","Sex(f/m): ");
        ques.put("8A","Place of Birth(Province): ");
        ques.put("9A","Place of Birth(City/Municipality): ");
        ques.put("10A","Place of Birth(Hospital/Clinic/Institution):");
        ques.put("11A","Type of Birth(Single/Twin/Triplet/etc): ");
        ques.put("12A","If multiple birth, child was(first/second/third/fourth/etc.): ");
        ques.put("13A","Weight at Birth: ");
        
        ques.put("1M","Mother First name: ");
        ques.put("2M","Mother Last name: ");
        ques.put("3M","Mother Middle name: ");
        ques.put("4M","Mother Citizenship: ");
        ques.put("5M","Mother Religion: ");
        ques.put("6M","Mother Occupation: ");
        ques.put("7M","Mother Age at time of this birth: ");
        ques.put("8M","Mother Residence(House Number/Street, Barangay): ");
        ques.put("9M","Mother Residence Municipality: ");
        ques.put("10M","Mother Province: ");

        ques.put("1F","Father First name: ");
        ques.put("2F","Father Last name: ");
        ques.put("3F","Father Middle name: ");
        ques.put("4F","Father Citizenship: ");
        ques.put("5F","Father Religion: ");
        ques.put("6F","Father Occupation: ");
        ques.put("7F","Father Age at time of this birth: ");
        ques.put("8F","Father Residence(House Number/Street, Barangay): ");
        ques.put("9F","Father Residence Municipality: ");
        ques.put("10F","Father Province: ");

    }
    public static void CDisplay(){
        //Child info
        System.out.println("First Name: " + B.getFname());
        System.out.println("Last Name: " + B.getLname());
        
        if(B.getsuff().equalsIgnoreCase("NA")){
            
        }else{
             System.out.println("Suffix: " + B.getsuff()); 
        }
        System.out.println("Middle Name: " + B.getMname());
        System.out.println("Age: " + B.getAge());
        System.out.println("Birthday: " + B.getBD());
        System.out.println("Sex: " + B.getgen());
        System.out.println("Birth of Place (Province): " + B.getprovi());
        System.out.println("Birth of Place (City/Municipality): " + B.getCity());
        System.out.println("Birth of Place(Hospital): " + B.getHos());
        System.out.println("Type of Birth: " + B.getTB());
        if(B.getTB().equalsIgnoreCase("Single")){
            
        }else{
            System.out.println("Mutiple Birth: " + TBP);
        }
        System.out.println("Weight: " + B.getweigh());
        
    }
    public static void MDisplay(){
        
        System.out.println("Mother First Name: " + B.getMname() );
        System.out.println("Mother Last Name: " + B.getMLname());
        System.out.println("Mother Middle Name" + B.getMMname() );
        System.out.println("Mother Citezenship " + B.getMCite());
        System.out.println("Mother Religion " + B.getReligion());
        System.out.println("Mother Occupation " + B.getMocc());
        System.out.println("Mother age at birth " + B.getMage());
        System.out.println("Mother Residence(House Number/Steet, Barangay) " + B.getMHos());
        System.out.println("Mother Residencce (City/Munipality) " + B.getMCity());
        System.out.println("Mother Residence (Province) " + B.getMprovi());
    }
    public static void FDisplay(){
        System.out.println("Father First Name: " + B.getFFname());
        System.out.println("Father Last Name: " + B.getFLname());
        System.out.println("Father Middle Name" + B.getFMname());
        System.out.println("Father Citezenship " + B.getFCiten());
        System.out.println("Father Religion " + B.getFReligion());
        System.out.println("Father Occupation " + B.getFocc());
        System.out.println("Father age at birth " + B.getFage());
        System.out.println("Father Residence(House Number/Steet, Barangay) " + B.getFHos());
        System.out.println("Father Residencce (City/Munipality) " + B.getFCity());
        System.out.println("Father Residence (Province) " + B.getFprovi());
    }

}
