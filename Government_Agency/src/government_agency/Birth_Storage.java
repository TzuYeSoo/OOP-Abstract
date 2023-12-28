
package government_agency;
import java.util.*;
public class Birth_Storage extends Birth{
  
    private Map Birth_Store = new HashMap();
    
    public void Brith_Storage(){
        Birth_Store.put("1A", getFname());
        Birth_Store.put("2A" , getMname());
        
    }
}
