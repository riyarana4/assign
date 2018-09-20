import java.util.*;
class Map {
  public static void main(String[] args) {
     Scanner Scan= new Scanner (System.in);
    HashMap<String, Integer> hm= new HashMap<String, Integer>();
         hm.put("Riya", 309); 
        hm.put("Shruti", 359); 
        hm.put("Tanisha", 395);
 if (hm.isEmpty())  
        { 
            System.out.println("HM is empty"); 
        } 
          
        else
        { 
            System.out.println(hm); 
        } 
   
  }
}