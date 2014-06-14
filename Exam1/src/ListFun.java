import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ListFun {
    ArrayList <Integer> listInput; 
    public ListFun(){
        
    } 
    public static ArrayList <Integer> sort (ArrayList <Integer> listInput){
        ArrayList <Integer> listOutput = new ArrayList(listInput); 
        Collections.sort(listOutput);
        return listOutput;
    }
    
    public static ArrayList <Integer> reverse (ArrayList <Integer> listInput){
        ArrayList <Integer> listOutput = new ArrayList(listInput);  
        Collections.reverse(listOutput);
        return listOutput;
    }
    
    public static boolean monotonous (ArrayList <Integer> listInput){
      if (listInput.equals(ListFun.sort(listInput)) || listInput.equals(ListFun.reverse((ListFun.sort(listInput))))) {
        return true;
    }
      else {
        return false; 
    }
    }
    
    
}


