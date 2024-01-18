/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package government.agency;

import java.util.LinkedList;
import java.util.Queue;

public class Marriage_Setter {

//Marriage Key
    private static String MarriageCode;
    
    public void setMarriageKeyCode(String MarriageCode){
        this.MarriageCode = MarriageCode;
    }
    public String getMarraigeKeyCode(){
        return MarriageCode;
    }
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

	//Husband Cenomar
	private static String hApplicantName;
	private static String hApplicant_birthday;
	private static String hApplicant_FatherName;
	private static String hApplicant_MotherName;
	private static String hApplicant_records;
	private static String hApplicant_dateofmarriage;
	private static String hApplicant_placeofbirth;

	//Wife Cenomar
	private static String wApplicantName;
	private static String wApplicant_birthday;
	private static String wApplicant_FatherName;
	private static String wApplicant_MotherName;
	private static String wApplicant_records;
	private static String wApplicant_dateofmarriage;
	private static String wApplicant_placeofbirth;
    
        


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

//Cenomar Getter and Setter
//Husband section set
public void setHApplicantName(String ApplicantName){
	hApplicantName = ApplicantName;
}
public void setHApplicantBirthday(String Applicantbirthday){
	hApplicant_birthday = Applicantbirthday;
}
public void setHApplicantFather(String ApplicantFather){
	hApplicant_FatherName = ApplicantFather;
}
public void setHApplicantMother(String ApplicantMother){
	hApplicant_MotherName = ApplicantMother;
}
public void setHApplicantRecord(String ApplicantRecord){
	hApplicant_records = ApplicantRecord;
}
public void setHApplicantDateOfMarriage(String ApplicantDateOfMarriage){
    hApplicant_dateofmarriage = ApplicantDateOfMarriage;
}
public void setHApplicantPlaceOfBirth(String HApplicantPlaceOfBirth){
	hApplicant_placeofbirth = HApplicantPlaceOfBirth;
}
//Husband section get
public String getHApplicantName(){
	return hApplicantName;
}
public String getHApplicantBirthday(){
	return hApplicant_birthday;
}
public String getHApplicantFatherName(){
	return hApplicant_FatherName;
}
public String getHApplicantMotherName(){
	return hApplicant_MotherName;
}
public String getHApplicantRecord(){
	return hApplicant_records;
}
public String getHApplicatMarriageDate(){
	return hApplicant_dateofmarriage;
}
public String getHApplicantPlaceOfBirth(){
	return hApplicant_placeofbirth;
}

//Wife section set
public void setWApplicantName(String WApplicantName){
	wApplicantName = WApplicantName;
}
public void setWApplicantBirthday(String WApplicantBirthday){
	wApplicant_birthday = WApplicantBirthday;
}
public void setWApplicantFatherName(String WApplicantFatherName){
	wApplicant_FatherName = WApplicantFatherName;
}
public void setWApplicantMotherName(String WApplicantMotherName){
	wApplicant_MotherName = WApplicantMotherName;
}
public void setWApplicantRecord(String WApplicantRecord){
	wApplicant_records = WApplicantRecord;
}
public void setWApplicantDateOfMarriage(String WApplicantDateOfMarriage){
	wApplicant_dateofmarriage = WApplicantDateOfMarriage;
}
public void setWApplicantPlaceOfBirth(String WApplicantPlaceOfBirth){
	wApplicant_placeofbirth = WApplicantPlaceOfBirth;
}
//Wife section get
public String getWApplicationName(){
	return wApplicantName;
}
public String getWApplicantBirthday(){
	return wApplicant_birthday;
}
public String getWApplicantFatherName(){
	return wApplicant_FatherName;
}
public String getWApplicantMotherName(){
	return wApplicant_MotherName;
}
public String getWApplicantRecord(){
	return wApplicant_records;
}
public String getWApplicantDateOfMarriage(){
	return wApplicant_dateofmarriage;
}
public String getWApplicantPlaceOfBirth(){
	return wApplicant_placeofbirth;
}

private static String CenoName;

public String getCenoName(){
	return CenoName;
}
public void setCenoName(String CenoName){
   this.CenoName = CenoName;
}

String SMName;

public String getSMName(){
    return SMName;
} 
public void setSMName(String SMName){
    this.SMName = SMName;
}
		
}
