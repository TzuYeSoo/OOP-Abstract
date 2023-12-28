
package government_agency;

import java.util.*;
public class Government_Agency{

    static Birth B = new Birth();
    static String TBP;
    static Map ques = new HashMap();
    static String[] Nume;
    static Queue <String> NumE = new LinkedList();
    static Queue <String> NumEE = new LinkedList();
    static Queue <String> NumEEE = new LinkedList();
    static String[][] T1 = new String[2][100];
    static int CoE;
    
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
                   
                   B.Question();                   
                   B.Display();
                   PrintCopy();
                                    
                   do{
                       
                   System.out.println("----------------------------------------------------------");
                   System.out.print("Check your answers(if theres any mistake press 2 to edit)"
                            + "\n[1] Continue"
                            + "\n[2] Edit: ");
                   CoE = scn.nextInt();
                    
                   
                   if(CoE == 2){
                       
                       
                        System.out.print("Enter the Code Value of that question example(1A)"
                                + "\nif more than 1 each number and value should be seprate by space: ");
                        scn.nextLine();
                        String edit = scn.nextLine().toUpperCase();
                        
                        Nume = edit.split(" ");
                        
                        for(String a: Nume){
                            NumE.add(a);
                            NumEE.add(a);
                            NumEEE.add(a);
                  
                        }
                        for(int i = 0; i < NumE.size(); i++){
                            
                        
                        System.out.print(NumEEE.poll()+ " " +ques.get(NumE.poll()));
                        String change = scn.nextLine();
                       
                    switch(NumEE.poll()){
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
                            B.setSuff(change);
                            break;
                        case "5A":
                            B.setAge(Integer.parseInt(change));
                            break;
                        case "6A":
                            B.setBD(change);
                            break;
                        case "7A":
                            B.setgen(change.charAt(0));
                            break;
                        case "8A":
                            B.setprovi(change);
                            break;
                        case "9A":
                            B.setCity(change);
                            break;
                        case "10A":
                            B.setHos(change);
                            break;
                        case "11A":
                            B.setTB(change);
                            break;
                        case "12A":
                            B.setTBP(change);
                            break;
                        case "13":
                            B.setweigh(Integer.parseInt(change));
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
                            B.setMage(Integer.parseInt(change));
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
                            B.setFage(Integer.parseInt(change));
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
                        default: 
                            System.out.println("Invalid Code Value");
                    
                                }       
                            }
                        
                        B.Display();  
                        }
                   
                    }while(CoE == 2);
                   
                 if(CoE == 1){
                     
                       System.out.println("Do you wish to get the copy of the Certificate?"
                               + "\n[1] Yes"
                               + "\np[2] No: ");
                       int YorN = scn.nextInt();
                       
                       if(YorN == 1){
                           PrintCopy();
                           System.out.println("What kind of Method you want to choose"
                                   + "\n[1] Pick Up"
                                   + "\n[2] Delivery: ");
                           int Navi = scn.nextInt();
                           
                            if(Navi == 1){
                                
                            }else if(Navi == 2){
                                
                            }
                            
                       }else if(YorN == 2){
                           
                       }
                }
            }      
        }
        
    }
    
    public static void Questions(){
        
        ques.put("1A", "Child First Name:");
        ques.put("2A", "Child Middle Name (Enter NA if does'nt have one):");
        ques.put("3A" , "Child Last Name:");
        ques.put("4A", "Child Suffix (NA if not have): ");
        ques.put("5A" , "Child Age: ");
        ques.put("6A" , "Child Birthday(MM/DD/YYYY): ");
        ques.put("7A", "Child Sex(f/m): ");
        ques.put("8A", "Child Place of Birth(Province): ");
        ques.put("9A", "Child Place of Birth(City/Municipality): ");
        ques.put("10A","Child Place of Birth(Hospital/Clinic/Institution):");
        ques.put("11A","Child Type of Birth(Single/Twin/Triplet/etc): ");
        ques.put("12A","Child If multiple birth, child was(first/second/third/fourth/etc.): ");
        ques.put("13A","Child Weight at Birth: ");
        
        ques.put("1M","Mother First name: ");
        ques.put("2M","Mother Middle name: ");
        ques.put("3M","Mother Last name: ");
        ques.put("4M","Mother Citizenship: ");
        ques.put("5M","Mother Religion: ");
        ques.put("6M","Mother Occupation: ");
        ques.put("7M","Mother Age at time of this birth: ");
        ques.put("8M","Mother Residence(House Number/Street, Barangay): ");
        ques.put("9M","Mother Residence Municipality: ");
        ques.put("10M","Mother Province: ");

        ques.put("1F","Father First name: ");
        ques.put("2F","Father Middle name: ");
        ques.put("3F","Father Last name: ");
        ques.put("4F","Father Citizenship: ");
        ques.put("5F","Father Religion: ");
        ques.put("6F","Father Occupation: ");
        ques.put("7F","Father Age at time of this birth: ");
        ques.put("8F","Father Residence(House Number/Street, Barangay): ");
        ques.put("9F","Father Residence Municipality: ");
        ques.put("10F","Father Province: ");

    }

    public static void TryArray(){
        
        
        for(int i = 0; i < 2; i++){
            
            System.out.print("\t\t\t\t\t*");
    
            for(int b = 0; b < 100; b++){
                T1[i][b] = "*";
                
                System.out.print(T1[i][b]);
            }
            System.out.println(" ");
            
        }
    }
    
    public static void PrintCopy(){
        
        System.out.println("******************************************************************");
        System.out.println(" ");
        System.out.println("\t\t\tRepublic of the Philippines"
                + "\n\t\t\tOffice of The Civil Registar General"
                + "\n\t\t\tCertificate of Live Birth");
        System.out.println(" ");
        System.out.println("******************************************************************");
        System.out.println("\tNAME\t\t\t|First Name: \t\t\t|Middle Name: \t\t\t|Last Name: ");
        System.out.println("\t\t\t\t|" + B.getFname() + "\t\t\t|" + B.getMname() + "\t\t\t|" + B.getLname());
        System.out.println("******************************************************************");
        System.out.println("\tSEX\t\t\t|Date of Birth:(MM/DD/YYYY)");
        System.out.println("\t" +B.getgen() + "\t\t\t\t\t|" + B.getBD());
        System.out.println("******************************************************************");
        System.out.println("\tPlace of Birth\t\t\t|Name of Hospital/Clinic/Institution\t|City/Municipality\t|Province");
        System.out.println("\t\t\t\t\t\t " + B.getHos() + "\t\t\t" + B.getCity() + "\t\t" + B.getprovi());
        System.out.println("\tType of Birth\t\t\t|If Multiple Birht, Child was");
        System.out.println("\t" + B.getTB() + "\t\t\t|" + B.getTBP());
        System.out.println("\tBirth Order\t\t\t|Weight At Birth");
        System.out.println("\t" + B.getTBP() + "\t\t\t|" + B.getweigh());
        System.out.println("************************************************************************************************************************");
        System.out.println("Mother Information");
        System.out.println("************************************************************************************************************************");
        System.out.println("Maiden Name     |First Name:      |Middel Name:       |Last Name:");
        System.out.println("\t|" + B.getMFname() + "\t|" + "\t|"+ B.getMMname() + "\t|" + B.getMLname());
        System.out.println("************************************************************************************************************************");
        System.out.println("                |Citezenship      |Religion");
        System.out.println("\t|" + B.getMCite() + "\t|" + B.getReligion());
        System.out.println("************************************************************************************************************************");
        System.out.println("                |Occupation       |Age at the time of this birth");
        System.out.println("\t|"+ B.getMocc() + "\t|" + B.getMage());
        System.out.println("************************************************************************************************************************");
        System.out.println("|Residence      (House No.,Street,Barangay)     (City/Municipality)    (Province)");
        System.out.println("\t|"+B.getMHos()+"\t|"+B.getMCity()+"\t|"+B.getMprovi());
        System.out.println("************************************************************************************************************************");
        System.out.println("Father Information");
        System.out.println("******************************************************************");
        System.out.println("\tFather's Name\t\t\tFirst Name: \t\t\t|Middel Name: \t\t\t|Last Name:");
        System.out.println("\t" + B.getFFname() + "\t\t\t|" +"\t\t\t|"+ B.getFMname() + "\t\t\t|"+ B.getFLname());
        System.out.println("******************************************************************");
        System.out.println("\tCitezenship\t\t\t\t\t|Religion");
        System.out.println("\t" + B.getFCiten() + "\t\t\t\t\t|" + B.getFReligion());
        System.out.println("*******************************************************************");
        System.out.println("\tOccupation\t\t\t\t\t|Age at the time of this birth");
        System.out.println("\t"+ B.getFocc() + "\t\t\t\t\t|" + B.getFage());
        System.out.println("*******************************************************************");
        System.out.println("\tResidence\t\t\t(House No.,Street,Barangay)\t\t\t(City/Municipality)\t(Province)");
        System.out.println("\t"+B.getFHos()+"\t\t\t"+B.getFCity()+"\t\t\t"+B.getFprovi());
        System.out.println("***********************************************************************");
        
        
    } 

}
