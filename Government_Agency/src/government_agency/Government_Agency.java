
package government_agency;

import java.util.*;
public class Government_Agency {

    static Birth B = new Birth();
    static String TBP;
    public static void main(String[] args) {
 
        Scanner scn = new Scanner(System.in);
        
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
                   
                   System.out.print("2A. Enter Last Name: ");
                   String LName = scn.next();
                   scn.nextLine();
                   
                   System.out.print("3A. Enter Suffix (NA if not have): ");
                   String suf = scn.next();
                   
                   System.out.print("4A. Enter Middle Name (Enter NA if does'nt have one): ");
                   String Mname = scn.next();
                   
                   System.out.print("5A. Enter Age: ");
                   int Age = scn.nextInt();
                   
                   System.out.print("6A. Enter Birthday(MM/DD/YYYY): ");
                   String BD = scn.nextLine();
                   scn.nextLine();
                   
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
                   
                   
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tMother information");
                   System.out.println("----------------------------------------------------------");
                    
                   System.out.print("1M. Enter First Name: ");
                   scn.nextLine();
                   String MFname = scn.nextLine();
                   
                   
                   System.out.print("2M. Enter Last Name: ");
                   String MLname = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("3M. Enter Middle Name: ");
                   String MMname = scn.nextLine(); 
                   scn.nextLine();
                   
                   System.out.print("4M. Enter Citizenship: ");
                   String Citen = scn.next();
                   
                   System.out.print("5M. Enter Religion: ");
                   String Rel = scn.next();
                   
                   System.out.print("6M. Enter Occupation: ");
                   String Occ = scn.nextLine();
                   
                   System.out.print("7M. Enter Age at time of this birth: ");
                   int MAge = scn.nextInt();
                   
                   System.out.print("8M. Residence(House Number/Steet, Barangay): ");
                   String HNSB = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("9M. Residence Munipality: ");
                   String muni = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("10M. Province: ");
                   String Prov = scn.nextLine();
                   scn.nextLine();
                  
                  // Father Info
                  
                  System.out.println("----------------------------------------------------------");
                   System.out.println("\t\tFather information");
                   System.out.println("----------------------------------------------------------");
                    
                   System.out.print("1F. Enter First Name: ");
                   scn.nextLine();
                   String FFname = scn.nextLine();
                   
                   
                   System.out.print("2F. Enter Last Name: ");
                   String FLname = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("3F. Enter Middle Name: ");
                   String FMname = scn.nextLine(); 
                   scn.nextLine();
                   
                   System.out.print("4F. Enter Citizenship: ");
                   String FCiten = scn.next();
                   
                   System.out.print("5F. Enter Religion: ");
                   String FRel = scn.next();
                   
                   System.out.print("6F. Enter Occupation: ");
                   String FOcc = scn.nextLine();
                   
                   System.out.print("7F. Enter Age at time of this birth: ");
                   int FAge = scn.nextInt();
                   
                   System.out.print("8F. Residence(House Number/Steet, Barangay): ");
                   String fHNSB = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("9F. Residence Munipality: ");
                   String fmuni = scn.nextLine();
                   scn.nextLine();
                   
                   System.out.print("10F. Province: ");
                   String fProv = scn.nextLine();
                   scn.nextLine();
                }
                
                break;
            case 2:
                
                break;
            default:
                System.out.println("Invalid Number Please Enter the right number!");
        }
    }
    
}
