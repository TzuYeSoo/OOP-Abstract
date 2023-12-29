
package government_agency;

import java.util.*;
public class Government_Agency{

    static Birth B = new Birth();
    static Birth_Storage BStore = new Birth_Storage();
    static Map ques = new HashMap();
    static String[] Nume;
    static Queue <String> NumE = new LinkedList();
    static Queue <String> NumEE = new LinkedList();
    static Queue <String> NumEEE = new LinkedList();
    static String[][] T1 = new String[2][100];
    static char PE, NoC;
    static int Cont;
    static double change, Copy, Price, Amount, T8, CoE, Navi, New = 1;
    static String TBP, Fname, Addresses;
    
    public static void main(String[] args) throws Exception {
        Questions();
        
        do{
        Scanner scn = new Scanner(System.in);
        System.out.println();
        System.out.print("\t\t\t\t\t\t---------------------------------------------------------------------------------------------"
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
                            T8++;
                  
                        }
                        for(int i = 0; i < T8; T8--){
                        
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
                     BStore.setName(B.getFname());
                     BStore.BStore();
                     
                     System.out.println("-----------------------------------------------------------------");
                     System.out.println("\t\t\t\t\tPrinting Copy");
                     System.out.println("-----------------------------------------------------------------");
                     BStore.PrintCopy();
                     
                       System.out.println("Do you wish to get the copy of the Certificate?"
                               + "\n[1] Yes"
                               + "\np[2] No: ");
                       int YorN = scn.nextInt();
                       if(YorN == 1){
                           PrintCopy();
                           System.out.println("What kind of Method you want to choose"
                                   + "\n[1] Pick Up"
                                   + "\n[2] Delivery: ");
                           Navi = scn.nextInt();
                            
                           
                           if(Navi == 1){
                                System.out.println("-----------------------------------------------------");
                                System.out.print("Full Name of Reciever: ");
                                scn.nextLine();
                                Fname = scn.nextLine();
                                
                                System.out.print("Contact Number: +63");
                                Cont = scn.nextInt();
                                do{
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Please Check Pick up Information");
                                System.out.println("");
                                System.out.println("Name: " + Fname);
                                System.out.println("Contact Numebr: " + Cont);
                                System.out.println("");
                                System.out.println("Please be informed that the Payment fee for one(1) copy"
                                        + "\nof PSA Certificate is Php 155");
                                System.out.println(" ");
                                System.out.println("\t\t\t\t\t-----------------------------------------------------");
                                System.out.print("Make sure your detail is correct. Proceed(Y/N): ");
                                PE = scn.next().toUpperCase().charAt(0);
                                
                               if(PE == 'N'){
                                   
                                    System.out.println("Enter the Part you want to edit(N(Name)/C(Contact)/B(Both): ");
                                    NoC = scn.next().toUpperCase().charAt(0);
                                    
                                    if(NoC == 'N'){
                                        
                                        System.out.print("Full Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                             
                                    }else if(NoC == 'C'){
                                        
                                        System.out.print("Contact Number: +63");
                                        Cont = scn.nextInt();  
                                    }else if(NoC == 'B'){
                                        System.out.print("Full Name of Reciever: ");
                                        scn.nextLine();
                                        Fname = scn.nextLine();
                                
                                        System.out.print("Contact Number: +63");
                                        Cont = scn.nextInt();
                                        
                                        }
                                    }
                                }while(PE == 'N');
                               
                                if(PE == 'Y'){
                                
                                    System.out.print("How Many Copies: ");
                                    Copy = scn.nextDouble();
                                    Price = 155 *Copy;
                                    
                                    System.out.println("Total: " + Price);
                                    System.out.println("Enter Amount paying: ");
                                    Amount = scn.nextDouble();
                                    change = Amount - Price;
                                    
                                    Reciept();
                                    
                                    
                                }
                            }else if(Navi == 2){
                                
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.print("Full Name: ");
                            Fname = scn.nextLine();
                            System.out.print("Contact Number");
                            Cont = scn.nextInt();
                            System.out.print("Address: ");
                            
                            do{
                            Addresses = scn.nextLine();
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("\t\t\t\tReciever Information");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Full Name: "  + Fname);
                            System.out.println("Contact Number: +63" + Cont);
                            System.out.println("Address: " + Addresses);
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Check Your Answer, Proceed(Y/N):  ");
                            PE = scn.next().toUpperCase().charAt(0);
                            
                            if(PE == 'N'){
                                    System.out.println("Enter the Part you want to edit(N(Name)/C(Contact)/A(Addresses)/B(Both): ");
                                    NoC = scn.next().toUpperCase().charAt(0);
                                    
                                    if(NoC == 'N'){
                                        
                                        System.out.println("--------------------------------------------------------------------");
                                        System.out.print("Full Name: ");
                                        Fname = scn.nextLine();   
                                        System.out.println("--------------------------------------------------------------------");
                                        
                                    }else if(NoC == 'C'){
                                        
                                        System.out.println("--------------------------------------------------------------------");
                                        System.out.print("Contact Number");
                                        Cont = scn.nextInt();
                                        System.out.println("--------------------------------------------------------------------");
                                        
                                    }else if(NoC == 'A'){
                                        
                                        System.out.print("Address: ");
                                        Addresses = scn.nextLine();
                                        
                                    }else if(NoC == 'B'){
                                    
                                        System.out.println("--------------------------------------------------------------------");
                                        System.out.print("Full Name: ");
                                        Fname = scn.nextLine(); 
                                        System.out.print("Contact Number");
                                        Cont = scn.nextInt();
                                        System.out.print("Address: ");
                                        Addresses = scn.nextLine();
                                        System.out.println("--------------------------------------------------------------------");
                                    
                                        }
                                    }
                            }while(PE == 'N');
                            if(PE == 'Y'){
                                
                                   
                                    System.out.print("How Many Copies: ");
                                    Copy = scn.nextDouble();
                                    Price = 155 *Copy;
                                    
                                    System.out.println("Total: " + Price);
                                    System.out.println("Enter Amount paying: ");
                                    Amount = scn.nextDouble();
                                    change = Amount - Price;
                                    
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println("\t\t\t\t\tPrinting Reciept");
                                    System.out.println("------------------------------------------------------------------");
                                    Reciept();
                                    
                                    
                            }
                                
                            }
                            
                            
                       }else if(YorN == 2){
                           System.out.println("Do you wish to continue?"
                                   + "[1] New Transaction"
                                   + "[2] Exit Program");
                           
                            New = scn.nextInt(); 
                       }
                }
            }
                break;
            case 2:
                System.out.println("Name of the Certificate: ");
                scn.nextLine();
                Fname = scn.nextLine();
                
                System.out.println(BStore.BStore.get("1A" + Fname));
                
                break;
        }
    }while(New == 1);
        
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
        
        
        
        
    } 
    
    public static void Reciept() throws Exception{
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("\t\tPrinting of receipt, Please wait a moment........");
                                    System.out.println("-----------------------------------------------------------");
                                    
                                    System.out.println("\t\t\t\t\t==================================================");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|           Republic of the Philippines          |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|         PHILIPPINE STATISTICS AUTHORITY        |");
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|               OFFICIAL RECEIPT                 |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                         Amount |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| "+  Fname + "                              |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| COPY ISSUANCE - PSA CERTIFICATE                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| Unit cost: 155        Qty:"+ Copy +"                     |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    if(Navi == 2){

                                    System.out.println("\t\t\t\t\t| Delivery Fee:                               "+ 50 +" |");
                                    }
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| TOTAL                                      " + Price + " |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| AMOUNT TENDERED                              "+ Amount +" |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| CHANGE                                       "+ change +" |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|         INCLUDES DOCUMENTARY STAMP TAX OF      |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                    PHP30.00/COPY               |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|                                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| Collecting officer:                            |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t|    Date - Time:                                |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t| ---------------------------------------------- |");
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\t\t\t==================================================");
    }
}
