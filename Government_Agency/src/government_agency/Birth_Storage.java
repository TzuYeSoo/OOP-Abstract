
package government_agency;
import java.util.*;
public class Birth_Storage extends Birth{
  
    static Map BStore = new HashMap();
    private String Name;
    
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void BStore(){
        BStore.put("1A" + Name, getFname());
        BStore.put("2A" + Name, getMname());
        BStore.put("3A" + Name, getLname());
        BStore.put("4A" + Name, getsuff());
        BStore.put("5A" + Name, getAge());
        BStore.put("6A" + Name, getBD());
        BStore.put("7A" + Name, getgen());
        BStore.put("8A" + Name, getprovi());
        BStore.put("9A" + Name, getCity());
        BStore.put("10A" + Name, getHos());
        BStore.put("11A" + Name, getTB());
        BStore.put("12A" + Name, getTBP());
        BStore.put("13A" + Name, getweigh());
        
        BStore.put("1M" + Name, getMFname());
        BStore.put("2M" + Name, getMMname());
        BStore.put("3M" + Name, getMLname());
        BStore.put("4M" + Name, getMCite());
        BStore.put("5M" + Name, getReligion());
        BStore.put("6M" + Name, getMocc());
        BStore.put("7M" + Name, getMage());
        BStore.put("8M" + Name, getMHos());
        BStore.put("9M" + Name, getMCity());
        BStore.put("10M" + Name, getMprovi());
        
        BStore.put("1F" + Name, getFFname());
        BStore.put("2F" + Name, getFMname());
        BStore.put("3F" + Name, getFLname());
        BStore.put("4F" + Name, getFCiten());
        BStore.put("5F" + Name, getFReligion());
        BStore.put("6F" + Name, getFocc());
        BStore.put("7F" + Name, getFage());
        BStore.put("8F" + Name, getFHos());
        BStore.put("9F" + Name, getFCity());
        BStore.put("10F" + Name, getFprovi());
    }
    public void PrintCopy(){
        System.out.println("******************************************************************");
        System.out.println(" ");
        System.out.println("\t\t\tRepublic of the Philippines"
                + "\n\t\t\tOffice of The Civil Registar General"
                + "\n\t\t\tCertificate of Live Birth");
        System.out.println(" ");
        System.out.println("******************************************************************");
        System.out.println("\tNAME\t\t\t|First Name: \t\t\t|Middle Name: \t\t\t|Last Name: ");
        System.out.println("\t\t\t\t|" + BStore.get("1A" + Name) + "\t\t\t|" + BStore.get("2A" + Name) + "\t\t\t|" + BStore.get("3A" + Name));
        System.out.println("******************************************************************");
        System.out.println("\tSEX\t\t\t|Date of Birth:(MM/DD/YYYY)");
        System.out.println("\t" + BStore.get("5A" + Name) + "\t\t\t\t\t|" + BStore.get("6A" + Name));
        System.out.println("******************************************************************");
        System.out.println("\tPlace of Birth\t\t\t|Name of Hospital/Clinic/Institution\t|City/Municipality\t|Province");
        System.out.println("\t\t\t\t\t\t " + BStore.get("7A" + Name) + "\t\t\t" + BStore.get("8A" + Name) + "\t\t" + BStore.get("9A" + Name));
        System.out.println("\tType of Birth\t\t\t|If Multiple Birht, Child was");
        System.out.println("\t" + BStore.get("10A" + Name) + "\t\t\t|" + BStore.get("11A" + Name));
        System.out.println("\tBirth Order\t\t\t|Weight At Birth");
        System.out.println("\t" + BStore.get("12A" + Name) + "\t\t\t|" + BStore.get("13A" + Name));
        System.out.println("************************************************************************************************************************");
        System.out.println("Mother Information");
        System.out.println("************************************************************************************************************************");
        System.out.println("Maiden Name     |First Name:      |Middel Name:       |Last Name:");
        System.out.println("\t\t |" + BStore.get("1M" + Name) + "\t\t |"+ BStore.get("2M" + Name) + "\t\t |" + BStore.get("3M" + Name));
        System.out.println("************************************************************************************************************************");
        System.out.println("                |Citezenship      |Religion");
        System.out.println("\t\t |" + BStore.get("4M" + Name) + "\t\t |" + BStore.get("5M" + Name));
        System.out.println("************************************************************************************************************************");
        System.out.println("                |Occupation       |Age at the time of this birth");
        System.out.println("\t\t |"+ BStore.get("6M" + Name) + "\t\t |" + BStore.get("7M" + Name));
        System.out.println("************************************************************************************************************************");
        System.out.println("|Residence      (House No.,Street,Barangay)     (City/Municipality)    (Province)");
        System.out.println("\t\t|" + BStore.get("8M" + Name) + "\t\t|"+BStore.get("9M" + Name) + "\t\t|"+BStore.get("10" + Name));
        System.out.println("************************************************************************************************************************");
        System.out.println("Father Information");
        System.out.println("******************************************************************");
        System.out.println("\tFather's Name\t\t\tFirst Name: \t\t\t|Middel Name: \t\t\t|Last Name:");
        System.out.println("\t" + BStore.get("1F" + Name) + "\t\t\t|" +"\t\t\t|"+ BStore.get("2F" + Name) + "\t\t\t|"+ BStore.get("3F" + Name));
        System.out.println("******************************************************************");
        System.out.println("\tCitezenship\t\t\t\t\t|Religion");
        System.out.println("\t" + BStore.get("4F" + Name) + "\t\t\t\t\t|" + BStore.get("5F" + Name));
        System.out.println("*******************************************************************");
        System.out.println("\tOccupation\t\t\t\t\t|Age at the time of this birth");
        System.out.println("\t"+ BStore.get("6F" + Name) + "\t\t\t\t\t|" + BStore.get("7F" + Name));
        System.out.println("*******************************************************************");
        System.out.println("\tResidence\t\t\t(House No.,Street,Barangay)\t\t\t(City/Municipality)\t(Province)");
        System.out.println("\t"+BStore.get("8F" + Name)+"\t\t\t"+BStore.get("9F" + Name)+"\t\t\t"+BStore.get("10F" + Name));
        System.out.println("***********************************************************************");
    }
}
