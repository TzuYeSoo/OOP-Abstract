package government_agency;
import java.util.*;
public class MarriageCertificate{
	String PersonName, Addresses;
    private static Map ques = new HashMap();
    String contact_Number;
    String correctionDetail;
    double copy, price, amount, change = 1;
    String Number_Contact_Both;
    int pickup;
    

	
	//Wife Documents Info
	private static String Wife_First;
    private static String Wife_Middle;
    private static String Wife_Last;
    private static String Wife_Date_Of_Birth;
    private static String Wife_Age;
    private static String Wife_Place_Of_Birth;
    private static String Wife_Sex;
    private static String Wife_Citizenship;
    private static String Wife_Provice;
    private static String Wife_City;
    private static String Wife_Barangay;
    private static String Wife_Street;
    private static String Wife_Religion;
    private static String Wife_Status;
    private static String Wife_Father;
    private static String Wife_Father_Citizenship;
    private static String Wife_Mother;
    private static String Wife_Mother_Citizenship;

    // Husband Documents Info
    private static String Husband_First;
    private static String Husband_Middle;
    private static String Husband_Last;
    private static String Husband_Date_Of_Birth;
    private static String Husband_Age;
    private static String Husband_Place_Of_Birth;
    private static String Husband_Sex;
    private static String Husband_Citizenship;
    private static String Husband_Provice;
    private static String Husband_City;
    private static String Husband_Barangay;
    private static String Husband_Street;
    private static String Husband_Religion;
    private static String Husband_Status;
    private static String Husband_Father;
    private static String Husband_Father_Citizenship;
    private static String Husband_Mother;
    private static String Husband_Mother_Citizenship;
    private static String place_Marriage;
    private static String date_Marriage;


        


		//Wife Document Setter

		public void setWifeName(String wifeFirst){
			Wife_First = wifeFirst;
		}
		public void setWifeMiddle(String wifeMiddle){
			Wife_Middle = wifeMiddle;
		}
		public void setWifeLast(String wifeLast){
			Wife_Last = wifeLast;
		}
		public void setWifeDateOfBirth(String dateofbirth){
			Wife_Date_Of_Birth = dateofbirth;
		}
		public void setWifeAge(String wifeage){
			Wife_Age = wifeage;
		}
		public void setWifePlaceOfBirth(String wifeplaceofbirth){
			Wife_Place_Of_Birth = wifeplaceofbirth;
		}
		public void setWifeSex(String wifesex){
			Wife_Sex = wifesex;
		}
		public void setWifeCitezenship(String wifecitizenship){
			Wife_Citizenship = wifecitizenship;
		}
		public void setWifeProvince(String wifeProvince){
			Wife_Provice = wifeProvince;
		}
		public void setWifeCity(String wifecity){
			Wife_City = wifecity;
		}
		public void setWifeBarangay(String wifebarangay){
		  Wife_Barangay = wifebarangay;
		}
		public void setWifeStreet(String wifeStreet){
			Wife_Street = wifeStreet;
		}
		public void setWifeReligion(String wifeReligion){
	       Wife_Religion = wifeReligion;
		}
		public void setWifeStatus(String wifeStatus){
		 Wife_Status = wifeStatus;
		}
		public void setWifeFather(String wifeFather){
			Wife_Father = wifeFather;
		}
		public void setWifeFatherCitizen(String wifeFatherCitizen)
		{
			Wife_Father_Citizenship = wifeFatherCitizen;
		}
		public void setWifeMother(String wifeMother){
			Wife_Mother = wifeMother;
		}
		public void setWifeMotherCitizen(String wifeMotherCitizen)
		{
			Wife_Mother_Citizenship = wifeMotherCitizen;
		}
		

		//Wife Information Getter Section
		public String getWifeFirst(){
			return Wife_First;
		}
		public String getWifeMiddle(){
			return Wife_Middle;
		}
		public String getWifeLast(){
			return Wife_Last;
		}
		public String getWifeDateOfBirth(){
			return Wife_Date_Of_Birth;
		}
		public String getWifeAge(){
			return Wife_Age;
		}
		public String getWifePlaceOfBirth(){
			return Wife_Place_Of_Birth;
		}
		public String getWifeSex(){
			return Wife_Sex;
		}
		public String getWifeCitzen(){
			return Wife_Citizenship;
		}
		public String getWifeProvince(){
			return Wife_Provice;
		}
		public String getWifeCity(){
			return Wife_City;
		}
		public String getWifeBarangay(){
			return Wife_Barangay;
		}
		public String getWifeStreet(){
			return Wife_Street;
		}
		public String getWifeReligion(){
			return Wife_Religion;
		}
		public String getWifeStatus(){
			return Wife_Status;
		}
		public String getWifeFather(){
			return Wife_Father;
		}
		public String getWifeFatherCitizen(){
			return Wife_Father_Citizenship;
		}
		public String getWifeMother(){
			return Wife_Mother;
		}
		public String getWifeMotherCitizen(){
			return Wife_Mother_Citizenship;
		}
		

		//Husband Document Setter

		public void setHusbandName(String husbandFirst){
			Husband_First = husbandFirst;
		}
		public void setHusbandMiddle(String husbandMiddle){
			Husband_Middle = husbandMiddle;
		}
		public void setHusbandLast(String husbandLast){
			Husband_Last = husbandLast;
		}
		public void setHusbandDateOfBirth(String husbandDateOfBirth){
			Husband_Date_Of_Birth = husbandDateOfBirth;
		}
		public void setHusbandAge(String husbandAge){
			Husband_Age = husbandAge;
		}
		public void setHusbandPlaceOfBirth(String husbandPlaceOfBirth){
			Husband_Place_Of_Birth = husbandPlaceOfBirth;
		}
		public void setHusbandSex(String husbandSex){
			Husband_Sex = husbandSex;
		}
		public void setHusbandCitizen(String husbadCitizen){
			Husband_Citizenship = husbadCitizen;
		}
		public void setHusbandCity(String husbandCity){
			Husband_City = husbandCity;
		}
		public void setHusbandProvince(String husbandProvince){
			Husband_Provice = husbandProvince;
		}
		public void setHusbandBarangay(String husbandBarangay){
			Husband_Barangay = husbandBarangay;
		}
		public void setHusbandStreet(String husbandStreet){
			Husband_Street = husbandStreet;
		}
		public void setHusbandReligion(String husbandReligion){
			Husband_Religion = husbandReligion;
		}
		public void setHusbandStatus(String husbandStatus){
			Husband_Status = husbandStatus;
		}
		public void setHusbandFather(String husbandFather){
			Husband_Father = husbandFather;
		}
		public void setHusbandFatherCitizen(String husbandFatherCitizen){
			Husband_Father_Citizenship = husbandFatherCitizen;
		}
		public void setHusbandMother(String husbandMother){
	         Husband_Mother = husbandMother;
		}
		public void setHusbandMotherCitizen(String husbandMotherCitizen){
			Husband_Mother_Citizenship = husbandMotherCitizen;
		}
		public void setPlaceMarriage(String placeMarriage) {
			place_Marriage = placeMarriage;
		}
		public void setDateMarriage(String dateMarriage) {
			date_Marriage = dateMarriage;
		}
		//Husband information Getter
		public String getHusbandFirst(){
			return Husband_First;
		}
		public String getHusbandMiddle(){
			return Husband_Middle;
		}
		public String getHusbandLast(){
			return Husband_Last;
		}
		public String getHusbandDateOfBirth(){
			return Husband_Date_Of_Birth;
		}
		public String getHusbandAge(){
			return Husband_Age;
		}
		public String getHusbandPlaceOfBirth(){
			return Husband_Place_Of_Birth;
		}
		public String getHusbandSex(){
			return Husband_Sex;
		}
		public String getHusbandCitizen(){
			return Husband_Citizenship;
		}
		public String getHusbandProvince(){
			return Husband_Provice;
		}
		public String getHusbandCity(){
			return Husband_City;
		}
		public String getHusbandBarangay(){
			return Husband_Barangay;
		}
		public String getHusbandStreet(){
			return Husband_Street;
		}
		public String getHusbandReligion(){
			return Husband_Religion;
		}
		public String getHusbandStatus(){
			return Husband_Status;
		}
		public String getHusbandFather(){
			return Husband_Father;
		}
		public String getHusbandFatherCitizen(){
			return Husband_Father_Citizenship;
		}
		public String getHusbandMother(){
			return Husband_Mother;
		}
		public String getHusbandMotherCitizen(){
			return Husband_Mother_Citizenship;
		}
		public String getPlaceMarriage() {
			return place_Marriage;
		}
		public String getDateMarriage() {
			return date_Marriage;
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
	        setWifeMiddle(middlename);

	        System.out.print("\t\t\t\tLast Name: ");
	        String lastname = scanner.nextLine();
	        setWifeLast(lastname);

	        System.out.print("\t\t\t\tDate of Birth (MM/DD/YYYY): ");
	        String dateofbirth = scanner.nextLine();
	        setWifeDateOfBirth(dateofbirth);

	        System.out.print("\t\t\t\tAge: ");
	        String age = scanner.nextLine();
	        setWifeAge(age);

	        System.out.print("\t\t\t\tPlace of Birth (City, Province): ");
	        String province = scanner.nextLine();
	        setWifePlaceOfBirth(province);

	        System.out.print("\t\t\t\tSex(f/m): ");
	        String sex = scanner.nextLine();
	        setWifeSex(sex);

	        System.out.print("\t\t\t\tCitizenship: ");
	        String citizen = scanner.nextLine();
	        setWifeCitezenship(citizen);

	        System.out.print("\t\t\t\tResidence (Province): ");
	        String provincename = scanner.nextLine();
	       setWifeProvince(provincename);

	        System.out.print("\t\t\t\tResidence (City/Municipality): ");
	        String city = scanner.nextLine();
	        setWifeCity(city);

	        System.out.print("\t\t\t\tResidence (Barangay): ");
	        String barangay = scanner.nextLine();
	        setWifeBarangay(barangay);

	        System.out.print("\t\t\t\tResidence (House Number/Street): ");
	        String residence = scanner.nextLine();
	        setWifeStreet(residence);

	        System.out.print("\t\t\t\tReligion: ");
	        String religion = scanner.nextLine();
	       setWifeReligion(religion);

	        System.out.print("\t\t\t\tCivil status: ");
	        String status = scanner.nextLine();
	        setWifeStatus(status);

	        System.out.print("\t\t\t\tFull name of Father: ");
	        String father = scanner.nextLine();
	        setWifeFather(father);

	        System.out.print( "\t\t\t\tCitizenship of Father: ");
	        String fatherCitizen = scanner.nextLine();
	        setWifeFatherCitizen(fatherCitizen);

	        System.out.print("\t\t\t\tFull name of Mother: ");
	        String motherName = scanner.nextLine();
	        setWifeMother(motherName);

	        System.out.print("\t\t\t\tCitizenship of Mother: ");
	        String motheCitizen = scanner.nextLine();
	        setWifeMotherCitizen(motheCitizen);

	        // Husband Part
	        System.out.println("\n\t\t\t\tHusband Information");
	        System.out.println();
	        System.out.print("\t\t\t\tFirst Name: ");
	        String hfirstname = scanner.nextLine();
	        setHusbandName(hfirstname);

	        System.out.print("\t\t\t\tMiddle Name: ");
	        String hmiddlename = scanner.nextLine();
	        setHusbandMiddle(hmiddlename);

	        System.out.print("\t\t\t\tLast Name: ");
	        String hlastname = scanner.nextLine();
	        setHusbandLast(hlastname);

	        System.out.print("\t\t\t\tDate of Birth (MM/DD/YYYY): ");
	        String hdateofbirth = scanner.nextLine();
	        setHusbandDateOfBirth(hdateofbirth);

	        System.out.print("\t\t\t\tAge: ");
	        String hage = scanner.nextLine();
	        setHusbandAge(hage);

	        System.out.print("\t\t\t\tPlace of Birth (City, Province): ");
	        String hprovince = scanner.nextLine();
	        setHusbandPlaceOfBirth(hprovince);

	        System.out.print("\t\t\t\tSex(f/m): ");
	        String hsex = scanner.nextLine();
	        setHusbandSex(hsex);

	        System.out.print("\t\t\t\tCitizenship: ");
	        String hcitizen = scanner.nextLine();
	       setHusbandCitizen(hcitizen);

	        System.out.print("\t\t\t\tResidence (Province): ");
	        String hprovincename = scanner.nextLine();
	        setHusbandProvince(hprovincename);

	        System.out.print("\t\t\t\tResidence (City/Municipality): ");
	        String hcity = scanner.nextLine();
	       setHusbandCity(hcity);

	        System.out.print("\t\t\t\tResidence (Barangay): ");
	        String hbarangay = scanner.nextLine();
	        setHusbandBarangay(hbarangay);

	        System.out.print("\t\t\t\tResidence (House Number/Street): ");
	        String hresidence = scanner.nextLine();
	       setHusbandStreet(hresidence);

	        System.out.print("\t\t\t\tReligion: ");
	        String hreligion = scanner.nextLine();
	        setHusbandReligion(hreligion);

	        System.out.print("\t\t\t\tCivil status: ");
	        String hstatus = scanner.nextLine();
	        setHusbandStatus(hstatus);

	        System.out.print("\t\t\t\tFull name of Father: ");
	        String hfather = scanner.nextLine();
	        setHusbandFather(hfather);

	        System.out.print( "\t\t\t\tCitizenship of Father: ");
	        String hfatherCitizen = scanner.nextLine();
	        setHusbandFatherCitizen(hfatherCitizen);

	        System.out.print("\t\t\t\tFull name of Mother: ");
	        String hmotherName = scanner.nextLine();
	       setHusbandMother(hmotherName);

	        System.out.print("\t\t\t\tCitizenship of Mother: ");
	        String hmotheCitizen = scanner.nextLine();
	        setHusbandMotherCitizen(hmotheCitizen);
	        
	        System.out.print("\t\t\t\tPlace of Marriage: ");
	        String placeMarraige = scanner.nextLine();
	        setPlaceMarriage(placeMarraige);
	        
	        System.out.print("\t\t\t\tDate of Marriage: ");
	        String dateMarriage = scanner.nextLine();
	        setDateMarriage(dateMarriage);

	    }


	    // Display Area
	    void displayCertificateInformation(){
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
	        System.out.println("\n\t\t\t\tWIFE'S INFORMATION\n");
	        System.out.println("\n\t\t\t\t1a. First Name: " + getWifeFirst());
	        System.out.println("\t\t\t\t1b. Middle Name: " + getWifeMiddle());
	        System.out.println("\t\t\t\t1c. Last Name: " +  getWifeLast());
	        System.out.println("\t\t\t\t2. Date of Birth (MM/DD/YYYY): " + getWifeDateOfBirth());
	        System.out.println("\t\t\t\t3. Age: " + getWifeAge());
	        System.out.println("\t\t\t\t4. Place of Birth (City, Province): " + getWifePlaceOfBirth());
	        System.out.println("\t\t\t\t5. Sex(f/m): " + getWifeSex());
	        System.out.println("\t\t\t\t6. Citizenship: " + getWifeCitzen());
	        System.out.println("\t\t\t\t7a. Residence (Province): " + getWifeProvince());
	        System.out.println("\t\t\t\t7b. Residence (City/Municipality): " + getWifeCity());
	        System.out.println("\t\t\t\t7c. Residence (Baranggay): " + getWifeBarangay());
	        System.out.println("\t\t\t\t7d. Residence (House Number/Street): " + getWifeStreet());
	        System.out.println("\t\t\t\t8. Religion: " + getWifeReligion());
	        System.out.println("\t\t\t\t9. Civil status: " + getWifeStatus());
	        System.out.println("\t\t\t\t10. Full name of Father: " + getWifeFather());
	        System.out.println("\t\t\t\t11. Citizenship of Father: " + getWifeFatherCitizen());
	        System.out.println("\t\t\t\t12. Full name of Mother: " + getWifeMother());
	        System.out.println("\t\t\t\t13. Citizenship of Mother: " + getWifeMotherCitizen());
            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
	        System.out.println("\n\t\t\t\tHUSBAND'S INFORMATION\n");
	        System.out.println("\t\t\t\t14a. First Name: " + getHusbandFirst());
	        System.out.println("\t\t\t\t14b. Middle Name: " + getHusbandMiddle());
	        System.out.println("\t\t\t\t14c. Last Name: " + getHusbandLast());
	        System.out.println("\t\t\t\t15. Date of Birth (MM/DD/YYYY): " + getHusbandDateOfBirth());
	        System.out.println("\t\t\t\t16. Age: " + getHusbandAge());
	        System.out.println("\t\t\t\t17. Place of Birth (City, Province): " + getHusbandPlaceOfBirth());
	        System.out.println("\t\t\t\t18. Sex(f/m): " + getHusbandSex());
	        System.out.println("\t\t\t\t19. Citizenship: " + getHusbandCitizen());
	        System.out.println("\t\t\t\t20a. Residence (Province): " + getHusbandProvince());
	        System.out.println("\t\t\t\t20b. Residence (City/Municipality): " + getHusbandCity());
	        System.out.println("\t\t\t\t20c. Residence (Baranggay): " + getHusbandBarangay());
	        System.out.println("\t\t\t\t20d. Residence (House Number/Street): " + getHusbandStreet());
	        System.out.println("\t\t\t\t21. Religion: " + getHusbandReligion());
	        System.out.println("\t\t\t\t22. Civil status: " + getHusbandStatus());
	        System.out.println("\t\t\t\t23. Full name of Father: " + getHusbandFather());
	        System.out.println("\t\t\t\t24. Citizenship of Father: " + getHusbandFatherCitizen());
	        System.out.println("\t\t\t\t25. Full name of Mother: " + getHusbandMother());
	        System.out.println("\t\t\t\t26. Citizenship of Mother: " + getHusbandMotherCitizen());
                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
	        System.out.println("\t\t\t\tPlace of Marriage" + getPlaceMarriage());
	        System.out.println("\t\t\t\tDate of Marriage" + getDateMarriage());
	        System.out.println("\t\t\t\tThis is to certify that I " + getWifeFirst()+" "+getWifeMiddle()+" "+getWifeLast() +" and "+ getHusbandFirst()+" "+getHusbandMiddle()+" "+getHusbandLast()
	        					+",\n\t\t\t\tboth of legal age, of our own free will and accord,"
	        					+ "\n\t\t\t\tthe presence of the person solemmizing this marriage and of the witness named below,"
	        					+ "\n\t\t\t\ttake each other as husband and wife.");
	    }
	     
	    //Editing Area
		
			
		
		
		
		
		
		
			
        //Marriage Certificate Editor Part
	    void editCertificateInformation() {

			Scanner scanner = new Scanner(System.in);
			System.out.print("\tEnter the line number you want to edit: ");
			String lineNumber = scanner.nextLine().toLowerCase();
				
			
			System.out.println(ques.get(lineNumber));
			System.out.print("\tEnter the new value: ");
			String newValue = scanner.nextLine();

	        switch(lineNumber) {
	            case "1a":    
	                setWifeName(newValue);
	                break;
	            case "1b":
	               setWifeMiddle(newValue);
	                break;
	            case "1c":
	                setWifeLast(newValue);
	                break;
	            case "2":
	                setWifeDateOfBirth(newValue);
	                break;
	            case "3":
	                setWifeAge(newValue);
	                break;
	            case "4":
	                setWifePlaceOfBirth(newValue);
	                break;
	            case "5":
	                setWifeSex(newValue);
	                break;
	            case "6":
	                setWifeCitezenship(newValue);
	                break;
	            case "7a":
	                setWifeProvince(newValue);
	                break;
	            case "7b":
	                setWifeCity(newValue);
	                break;
	            case "7c":
	                setWifeBarangay(newValue);
	                break;
	            case "7d":
	                setWifeStreet(newValue);
	                break;
	            case "8":
	                setWifeReligion(newValue);
	                break;
	            case "9":
	                setWifeStatus(newValue);
	                break;
	            case "10":
	                setWifeFather(newValue);
	                break;
	            case "11":
	                setWifeFatherCitizen(newValue);
	                break;
	            case "12":
	                setWifeMother(newValue);
	                break;
	            case "13":
	                setWifeMotherCitizen(newValue);
	                break;

	            // Husband's information
	            case "14a":
	                setHusbandName(newValue);
	                break;
	            case "14b":
	               setHusbandMiddle(newValue);
	                break;
	            case "14c":
	                setHusbandLast(newValue);
	                break;
	            case "15":
	                setHusbandDateOfBirth(newValue);
	                break;
	            case "16":
	                setHusbandAge(newValue);
	                break;
	            case "17":
	                setHusbandPlaceOfBirth(newValue);
	                break;
	            case "18":
	                setHusbandSex(newValue);
	                break;
	            case "19":
	                setHusbandCitizen(newValue);
	                break;
	            case "20a":
	                setHusbandProvince(newValue);
	                break;
	            case "20b":
	                setHusbandCity(newValue);
	                break;
	            case "20c":
	                setHusbandBarangay(newValue);
	                break;
	            case "20d":
	                setHusbandStreet(newValue);
	                break;
	            case "21":
	                setHusbandReligion(newValue);
	                break;
	            case "22":
	                setHusbandStatus(newValue);
	                break;
	            case "23":
	                setHusbandFather(newValue);
	                break;
	            case "24":
	                setHusbandFatherCitizen(newValue);
	                break;
	            case "25":
	                setHusbandMother(newValue);
	                break;
	            case "26":
	                setHusbandMotherCitizen(newValue);
	                break;

	            default:
	                System.out.println("\tInvalid line number.");
	                break;
	    }
	}
	
	public void printerlol() {
            
        Scanner scanner = new Scanner(System.in);
        MarriageStorage marriageStorage = new MarriageStorage();
        System.out.print("\t\t\t\tDo you wish to get the copy of the Certificate?"
                   + "\n\t\t\t\t\t\t[1] Yes"
                   + "\n\t\t\t\t\t\t[2] No: ");
           int certificate_printed = scanner.nextInt();
           if(certificate_printed == 1){
               
               System.out.print("\t\t\t\tWhat kind of Method you want to choose"
                       + "\n\t\t\t\t\t\t[1] Pick Up"
                       + "\n\t\t\t\t\t\t[2] Delivery: ");
               int pickup = scanner.nextInt();
                
               
               if(pickup == 1){
                   
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("\t\t\t\tFull Name of Reciever: ");
                    scanner.nextLine();
                    PersonName = scanner.nextLine();
                     
                    System.out.print("\t\t\t\tContact Number: +63");
                    contact_Number = scanner.nextLine();
                    
                    do{
                        
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tPlease Check Pick up Information");
                    System.out.println("");
                    System.out.println("\t\t\t\tName: " + PersonName);
                    System.out.println("\t\t\t\tContact Numebr: " + contact_Number);
                    System.out.println("");
                    System.out.println("\t\t\t\tPlease be informed that the Payment fee for one(1) copy"
                            + "\n\t\t\t\tof PSA Certificate is Php 155");
                    System.out.println(" ");
                    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("\t\t\t\tMake sure your detail is correct. Proceed(Y/N): ");
                    correctionDetail = scanner.nextLine();
                    
                   if(correctionDetail.equals("N")||correctionDetail.equals("n")){
                       
                        System.out.print("\t\t\t\tEnter the Part you want to edit(N(Name)/C(Contact)/B(Both): ");
                        Number_Contact_Both = scanner.nextLine();
                        
                        if(Number_Contact_Both.equals("N")){
                            
                            System.out.print("\t\t\t\tFull Name of Reciever: ");
                            PersonName = scanner.nextLine();
                    
                 
                        }else if(Number_Contact_Both.equals("C")|| Number_Contact_Both.equals("c")){
                            
                            System.out.print("\t\t\t\tContact Number: +63");
                            contact_Number = scanner.nextLine();  
                        }else if(Number_Contact_Both.equals("B") || Number_Contact_Both.equals("b")){
                            System.out.print("\t\t\t\tFull Name of Reciever: ");
                            PersonName = scanner.nextLine();
                    
                            System.out.print("\t\t\t\tContact Number: +63");
                            contact_Number = scanner.nextLine();
                            
                            }
                        }
                    }while(correctionDetail.equals("N") || correctionDetail.equals("n"));
                   
                    if(correctionDetail.equals("Y") || correctionDetail.equals("y")){
                    
                        System.out.print("\t\t\t\tHow Many Copies: ");
                        copy = scanner.nextDouble();
                        price = 155 *copy;
                        
                        System.out.println("\t\t\t\tTotal: " + price);
                        System.out.print("\t\t\t\tEnter Amount paying: ");
                        amount = scanner.nextDouble();
                        change = amount - price;
                        
                        receipt();
                        
                        
                    }
                    
                    
                    //Start of Delivery Method
                }else if(pickup == 2){
                    
                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\tReciever Information");
                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                System.out.print("\t\t\t\tFull Name: ");
				scanner.nextLine();
                PersonName = scanner.nextLine();
                System.out.print("\t\t\t\tContact Number: +63");
                contact_Number = scanner.nextLine();
                System.out.print("\t\t\t\tAddress: ");
                Addresses = scanner.nextLine();
                
                do{
                    
                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\tReciever Information");
                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\tFull Name: "  + PersonName);
                System.out.println("\t\t\t\tContact Number: +63" + contact_Number);
                System.out.println("\t\t\t\tAddress: " + Addresses);
                System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                System.out.print("\t\t\t\tCheck Your Answer, Proceed(Y/N):  ");
                correctionDetail = scanner.nextLine();
                
                if(correctionDetail.equals("N") || correctionDetail.equals("n")){
                        System.out.print("\t\t\t\tEnter the Part you want to edit(N(Name)/C(Contact)/A(Addresses)/B(Both): ");
                        Number_Contact_Both = scanner.nextLine();
                        
                        if(Number_Contact_Both.equals("N") || Number_Contact_Both.equals("n")){
                            
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tFull Name: ");
                            PersonName = scanner.nextLine();   
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            
                        }else if(Number_Contact_Both.equals("C") || Number_Contact_Both.equals("c")){
                            
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tContact Number: ");
                            contact_Number = scanner.nextLine();
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            
                        }else if(Number_Contact_Both.equals("A") || Number_Contact_Both.equals("a")){
                            
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tAddress: ");
                            Addresses = scanner.nextLine();
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");

                            
                        }else if(Number_Contact_Both.equals("B") || Number_Contact_Both.equals("b")){
                        
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("\t\t\t\tFull Name: ");
                            PersonName = scanner.nextLine(); 
                            System.out.print("\t\t\t\tContact Number");
                            contact_Number = scanner.nextLine();
                            System.out.print("\t\t\t\tAddress: ");
                            Addresses = scanner.nextLine();
                            System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
                        
                            }
                        }
                }while(correctionDetail.equals("N"));
                
                
                if(correctionDetail.equals("Y") || correctionDetail.equals("y")){
                    
                       
                        System.out.print("\t\t\t\tHow Many Copies: ");
                        copy = scanner.nextDouble();
                        price = 155 *copy;
                        
                        System.out.println("\t\t\t\tTotal: " + price);
                        System.out.print("\t\t\t\tEnter Amount paying: ");
                        amount = scanner.nextDouble();
                        change = amount - price;
                        
                        receipt();
                                         
    }                               
} 
}  
} 

void LinkedHashMap(){
	
}

public void receipt(){
    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
    System.out.println("\t\t\t\t\t\t\t\tPrinting of receipt, Please wait a moment........");
    System.out.println("\t\t\t------------------------------------------------------------------------------------------------------------------------");
    
    System.out.println("\t\t\t\t\t\t\t\t==================================================");

    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
   
    System.out.println("\t\t\t\t\t\t\t\t|           Republic of the Philippines          |");
   
    System.out.println("\t\t\t\t\t\t\t\t|         PHILIPPINE STATISTICS AUTHORITY        |");
    System.out.println("\t\t\t\t\t\t\t\t|                                                |");
  
    System.out.println("\t\t\t\t\t\t\t\t|               OFFICIAL RECEIPT                 |");

    System.out.println("\t\t\t\t\t\t\t\t|                                         Amount |");

    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");
  
    System.out.printf("\t\t\t\t\t\t\t\t| %-47s|\n", PersonName);

    System.out.println("\t\t\t\t\t\t\t\t| COPY ISSUANCE - PSA CERTIFICATE                |");
  
    System.out.printf("\t\t\t\t\t\t\t\t| Unit cost: 155        Qty: %-20s|\n" , copy);

    System.out.println("\t\t\t\t\t\t\t\t|                                                |");

    if(pickup == 2){

    System.out.println("\t\t\t\t\t\t\t\t| Delivery Fee:                               "+ 50 +" |");
    }
    System.out.println("\t\t\t\t\t\t\t\t|                                                |");

    System.out.printf("\t\t\t\t\t\t\t\t| TOTAL                                  %-3s |\n", price );
   
    System.out.println("\t\t\t\t\t\t\t\t|                                                |");

    System.out.printf("\t\t\t\t\t\t\t\t| AMOUNT TENDERED:                       %-3s |\n",amount);

    System.out.println("\t\t\t\t\t\t\t\t|                                                |");

    System.out.printf("\t\t\t\t\t\t\t\t| CHANGE                                 %-3s |\n" , change);

    System.out.println("\t\t\t\t\t\t\t\t|                                                |");

    System.out.println("\t\t\t\t\t\t\t\t|                                                |");

    System.out.println("\t\t\t\t\t\t\t\t|       INCLUDES DOCUMENTARY STAMP TAX OF        |");

    System.out.println("\t\t\t\t\t\t\t\t|                 PHP30.00/COPY                  |");

    System.out.println("\t\t\t\t\t\t\t\t|                                                |");

    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");

    System.out.println("\t\t\t\t\t\t\t\t| Collecting officer:                            |");

    System.out.println("\t\t\t\t\t\t\t\t| Date - Time:                                   |");

    System.out.println("\t\t\t\t\t\t\t\t| ---------------------------------------------- |");

    System.out.println("\t\t\t\t\t\t\t\t==================================================");
}
public void MarriageQuestion(){
    
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

public void updateMarriageStorage(MarriageStorage storage) {
    storage.setSMName(getWifeFirst() + getWifeMiddle() + getWifeLast());
    storage.SMarriageinfo();
}
}

	// Ending of line of code