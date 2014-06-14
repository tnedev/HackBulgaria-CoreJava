import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListFun {
    ArrayList <Integer> listInput; 
    public ListFun(){
        
    } 
    public static List <Integer> sort (List <Integer> listInput){
        List <Integer> listOutput = new ArrayList <Integer>(listInput); 
        Collections.sort(listOutput);
        return listOutput;
    }
    
    public static List <Integer> reverse (List <Integer> listInput){
        List <Integer> listOutput = new ArrayList <Integer>(listInput);  
        Collections.reverse(listOutput);
        return listOutput;
    }
    
    public static boolean monotonous (List <Integer> listInput){
      if (listInput.equals(ListFun.sort(listInput)) || listInput.equals(ListFun.reverse((ListFun.sort(listInput))))) {
        return true;
    }
      else {
        return false; 
    }
    }
    
    
}


