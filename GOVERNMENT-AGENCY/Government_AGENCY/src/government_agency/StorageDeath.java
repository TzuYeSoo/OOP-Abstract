package government_agency;

import java.util.*;
public class StorageDeath extends deathCertificate {

//STORAGE
	public LinkedHashMap <String ,String> deathStorage  = new LinkedHashMap();
        Queue <String> Dstorage= new LinkedList();

	private static String Info;
//SET AND GETTER NG STORAGE
	public void setInfo(String Information) {
		this.Info = Information;
	}
	public String getInfo() {
		return Info;
	}
	public void Info() {
         
		deathStorage.put("1a" + getInfo(), getfirstName());
		deathStorage.put("1b"  + getInfo(), getmiddleName());
		deathStorage.put("1c" + getInfo(), getlastName());
		deathStorage.put("2" + getInfo(), getsex());
		deathStorage.put("3" + getInfo(),getdateOfDeath());
		deathStorage.put("4" + getInfo(), getdateOfBirth());
		deathStorage.put("5"  + getInfo(), getageAtDeath());
		deathStorage.put("6" + getInfo(), getplaceOfDeath());
		deathStorage.put("7" + getInfo(), getcivilStatus());
		deathStorage.put("8" + getInfo(), getreligion());
		deathStorage.put("9" + getInfo(), getcitizenship());
		deathStorage.put("10" + getInfo(), getoccupation());
		deathStorage.put("11" + getInfo(), getresidence());
		deathStorage.put("12" + getInfo(), getfatherName());
		deathStorage.put("13" + getInfo(), getmotherName());
		deathStorage.put("14" + getInfo(), getageOfmother());
		deathStorage.put("15" + getInfo(), getmdelivery());
		deathStorage.put("16" + getInfo(), getlengthOfPreg());
		deathStorage.put("17" + getInfo(), gettypeOfbirth());
		deathStorage.put("18" + getInfo(), getmultiBirth());
		deathStorage.put("19a" + getInfo(), getcauseOfDeath());
		deathStorage.put("19b" + getInfo(), getcauseD());
		deathStorage.put("19c" + getInfo(), getmaternalCondition());
		deathStorage.put("19d" + getInfo(), getDExternal());
		deathStorage.put("19e" + getInfo(), getcause());
		deathStorage.put("19f" + getInfo(), getdeathExternal());
		deathStorage.put("20"  + getInfo(), getautopsy());
		deathStorage.put("21a" + getInfo(), getattendant());
		deathStorage.put("21b" + getInfo(), getduration());
                
                Dstorage.add( getfirstName()+ " " + getmiddleName()+ " " + getlastName());
	}
	 //Death Part
	  public void printcopy() {
	    System.out.println("\t\t\t=======================================================================================================================");
	    System.out.println("\t\t\t\t\t                    Republic of the Philippines");
            System.out.println("\t\t\t\t                         OFFICE OF THE CIVIL REGISTRAR GENERAL");
            System.out.println("\t\t\t\t\t                      CERTIFICATE OF DEATH");
	    System.out.println("\t\t\t=======================================================================================================================");	 
	    System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t1.| Name\t\t | (First)\t   | (Middle)\t   | (last)\t    | 2. SEX (Male/Female)");
	    System.out.printf("\t\t\t\t                         | %-15s | %-12s  | %-14s | %-13s\n", deathStorage.get("1a" + getInfo()),deathStorage.get("1b" + getInfo()), deathStorage.get("1c" + getInfo()), deathStorage.get("2" +getInfo()));
	    System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t3.| DATE OF DEATH\t\t    | 4. DATE OF BIRTH\t\t    | 5. AGE AT THE TIME OF DEATH");
	    System.out.printf("\t\t\t\t  | %-20s            | %-26s    | %-28s\n", deathStorage.get("3" + getInfo() ), deathStorage.get("4" + getInfo() ), deathStorage.get("5" + getInfo() ));
	    System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t| 6. PLACE OF DEATH\t\t\t\t\t\t    | 7. CIVIL STATUS" );
            System.out.printf("\t\t\t\t| %-50s                | %-20s\n",deathStorage.get("6" + getInfo()),deathStorage.get("7" + getInfo() ));
            System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t| 8. RELIGION/RELIGIOUS SECT\t    | 9.CITIZENSHIP\t\t    | 10. RESIDENCE");
	    System.out.printf("\t\t\t\t| %-20s              | %-25s     | %-37s\n",deathStorage.get("8" + getInfo() ), deathStorage.get("9" + getInfo() ),deathStorage.get("10" + getInfo() ));
            System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t| 11. OCCUPATION\t\t\t    | 12. NAME OF FATHER\t\t    | 13. MAIDEN NAME OF MOTHER");
	    System.out.printf("\t\t\t\t| %-20s                      | %-29s         | %-34s\n",deathStorage.get("11" + getInfo() ),deathStorage.get("12" + getInfo() ), deathStorage.get("13" + getInfo() ));
	    System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t                MEDICAL CERTIFICATE");
	    System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t\t FOR CHILDREN AGE 0 TO 7 DAYS");
            System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	   if(deathStorage.get("14" + getInfo()) != null){
            System.out.print("\t\t\t\t14. AGE OF MOTHER: ");
	    System.out.println(deathStorage.get("14" + getInfo()));
	    System.out.println("\t\t\t\t15. METHOD OF DELIVERY: ");
	    System.out.println(deathStorage.get("15" + getInfo() ));
	    System.out.println("\t\t\t\t16. LENGTH OF PREGNANCY WEEKS: ");
	    System.out.println(deathStorage.get("16" + getInfo() ));
           }else{
               System.out.println("\t\t\t\t14. AGE OF MOTHER: ");
               System.out.println("\t\t\t\t15. METHOD OF DELIVERY: ");
               System.out.println("\t\t\t\t16. LENGTH OF PREGNANCY WEEKS: ");
           }
	    System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
            if(deathStorage.get("17" + getInfo()) != null){
	    System.out.println("\t\t\t\t17. TYPE OF BIRTH: ");
	    System.out.println(deathStorage.get("17" + getInfo()));
	    System.out.println("\t\t\t\t\t\t\t\t 18. IF MULTIPLE BIRTH CHILD WAS: ");
	    System.out.println(deathStorage.get("18" + getInfo() ));
	    System.out.println("\t\t\t\t19a. CAUSE OF DEATH: ");
	    System.out.println(deathStorage.get("19a" + getInfo() ));
        }else{
            System.out.println("\t\t\t\t17. TYPE OF BIRTH: ");
	    System.out.println("\t\t\t\t18. IF MULTIPLE BIRTH CHILD WAS: ");
	    System.out.println("\t\t\t\t19a. CAUSE OF DEATH: ");

            }
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t IF THE DECEASED IS FEMALE AGED 15-49 YEARS OLD ");
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        if(deathStorage.get("19b" + getInfo()) != null){
	    System.out.println("\t\t\t\t19b. CAUSE OF DEATH: ");
	    System.out.println(deathStorage.get("19b" + getInfo() ));
	    System.out.println("\t\t\t\t19c. MATERNAL CONDITION: ");
	    System.out.println(deathStorage.get("19c" + getInfo() ));
	    System.out.println("\t\t\t\ta. MANNER OF DEATH: ");
            System.out.println("\t\t\t\tb. PLACE OF OCCURANCE:");
        }else{
            System.out.println("\t\t\t\t19b. CAUSE OF DEATH: ");
	    System.out.println("\t\t\t\t19c. MATERNAL CONDITION: ");
            System.out.println("\t\t\t\ta. MANNER OF DEATH: ");
            System.out.println("\t\t\t\tb. PLACE OF OCCURANCE:");
        }
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t IF THE DECEASED IS AGED  8 DAYS AND OVER ");
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        if(deathStorage.get("19e" + getInfo()) != null){
	    System.out.print("\t\t\t\t19e. CAUSE OF DEATH: " );
	    System.out.println(deathStorage.get("19e" + getInfo() )+"\t\t\t\t");
	    System.out.println("\t\t\t\t19f. DEATH BY EXTERNAL CAUSES: \t\t\t\t| 20. AUTOPSY");
	    System.out.println("\t\t\t\ta. MANNER OF DEATH: \t\t\t\t\t|    "+ deathStorage.get("20" + getInfo()));
	    System.out.print("\t\t\t\tb. PLACE OF OCCURANCE: "+deathStorage.get("19f" + getInfo() ) +"\t\t\t\t\t\n");
	    
        }else{
            System.out.println("\t\t\t\t19e. CAUSE OF DEATH: \t\t\t\t " );
            System.out.println("\t\t\t\t19f. DEATH BY EXTERNAL CAUSES: \t\t\t\t|20. AUTOPSY");
            System.out.println("\t\t\t\ta. MANNER OF DEATH: \t\t\t\t\t| " + deathStorage.get("20" + getInfo()));
            System.out.println("\t\t\t\tb. PLACE OF OCCURANCE: \t\t\t\t\t ");
        }
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t| 21a. ATTENDANT \t\t\t\t\t| 21b. IF ATTENDANT, STATE DURATION(MM/DD/YYYY)");
	    System.out.printf("\t\t\t\t| %-30s                       | %-20s \n", deathStorage.get("21a" + getInfo() ),deathStorage.get("21b" + getInfo() ));
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t22. CERTIFICATION OF DEATH\n"
                                                + "\t\t\t\t[] I hereby certify that the foregoing particulars are correct as near as same can be\n"
	    					+ "\t\t\t\tassertained ascertained and i futher certify that I [] have not attended the deceased\n"
	    					+ "\t\t\t\tand that death to occured at __________am/pm on the date of death specified above. \n");
	    System.out.println("\t\t\t\tSignature _______________\t\t|REVIEWED BY ");
	    System.out.println("\t\t\t\tName in Print _______________\t\t|	__________________________________");
	    System.out.println("\t\t\t\tTitle or Position ________________\t|  Signature Over Printed Name of Health Officer");
	    System.out.println("\t\t\t\tAdresses ________________\t\t	   ________________________");
	    System.out.println("\t\t\t\t_________________ Date __________\t\t	      Date");
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t23. CORPSE DISPOSAL\t\t| 24a. BURIAL/CREMATION PERMIT\t|24b. TRANSFER PERMIT");
	    System.out.println("\t\t\t\t|Number ___________\t\t|Number __________");
	    System.out.println("\t\t\t\t|Date Issued __________\t\t|Date Issued ___________");
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\t 25. NAME AND ADRESS OF CEMETERY OR CREMATORY");
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t\t26. CERTIFICATION OF INFORMANT \n"
	    					+ "\t\t\t\tI hereby certify that all information\n"
	    					+ "\t\t\t\tsupplied are true and correct to my\t\t| 27. PREPARED BY\n"
	    					+ "\t\t\t\town knowledge\n\t\t\t\t\t| Signature ____________");
	    System.out.println("\t\t\t\tSignature __________\t\t\t\t|Name in Print __________");
	    System.out.println("\t\t\t\tName in Print __________\t\t\t|Address ___________");
	    System.out.println("\t\t\t\tAddress __________\t\t\t\t|Date __________");
	    System.out.println("\t\t\t\tDate __________");
		        System.out.println("\t\t\t-----------------------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t28. RECEIVED BY\t\t\t\t\t|29. REGISTERED AT THE OFFICE OF THE CIVIL REGISTRAR");
	    System.out.println("\t\t\t\tSignature __________\t\t\t\t|Signature __________");
	    System.out.println("\t\t\t\tName in Print __________\t\t\t|Name in Print __________");
	    System.out.println("\t\t\t\tAddress __________\t\t\t\t|Address ___________");
	    System.out.println("\t\t\t\tDate __________\t\t\t\t\t|Date __________");
	
	}
         
	
}