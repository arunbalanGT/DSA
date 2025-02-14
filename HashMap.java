import java.util.*;
public class Main {
    public static void main(String[] args) {
      HashMap<String,String> map=new HashMap<>();
        // insertion
        map.put("TN","tamilnadu");
        map.put("KA","karnataka");
        map.put("KL","kerala");
        //search
        System.out.println(map.get("TN"));
        System.out.println(map.get("KA"));
         System.out.println(map.get("KL"));
             System.out.println(map.getOrDefault("AP","not found"));
           System.out.println(map.values());
       //remove
        map.remove("KL");
        //tarversal
        for(String key:map.keySet()){
            System.out.println(key+" " +map.get(key));
        }
    
           System.out.println(map.containsKey("AP"));
        System.out.println(map.containsValue("tamilnadu"));
        
        System.out.println(map.size());
        
        System.out.println(map.isEmpty());
        
    }
}
