
package government_agency;


import java.util.*;

public class Admin_Delete extends Admin{
    
    LinkedHashMap <String, String>AdminDS = new LinkedHashMap();
    LinkedHashMap <String, String>Name = new LinkedHashMap();
    private static int DS = 1, DD;
    
    
    public void AdminDS(){
            for(int i = 0; i < 13;){
                
            String line = Admin_Store.remove( DD + "A" + getName());
             AdminDS.put(DD + "A", line);
             DD++;
            }
            DD = 0;
            for(int i = 0; i < 10;){
                
            String line = Admin_Store.remove( DD + "M" + getName());
             AdminDS.put(DD + "M", line);
             DD++;
            }
            DD = 0;
        for(int i = 0; i < 10;){
                
            String line = Admin_Store.remove( DD + "F" + getName());
             AdminDS.put(DD + "F", line);
             DD++;
            }
        
        
        
    
   
        Name.put(DS +"B" ,AdminDS.get("1A" + getName()) + " " + AdminDS.get("2A" + getName()) + " " + AdminDS.get("3A" + getName()));
        
        DS++;
    }
    
    public void ClearningData(Scanner scanner){
      
        System.out.println("Do you want to Remove Data inside: ");
        char choice = scanner.nextLine().toUpperCase().charAt(0);
        if(choice == 'Y'){
            
            System.out.print("Enter the full name of the file");
            String name = scanner.nextLine().toUpperCase();
            
            
            if(BStore.containsValue(name)){
                System.out.println("Deleting files");
                setName(name);
                AdminDS();
                
            }else{
                System.out.println("None existing file!!");
            }
        
        
        
    }
        else if(choice == 'N'){
            System.out.println("okay");
  
        }
    }
}
