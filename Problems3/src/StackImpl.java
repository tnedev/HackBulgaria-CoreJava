
public class StackImpl implements Stack {
    private int size; 
    private long[] stackArray; 
    private int placeHolder;
    
    public StackImpl(int sizeInput){
        size = sizeInput;  
        stackArray = new long[size]; 
        placeHolder = -1; 
    }
    
    public void push(int j){
        stackArray[++placeHolder]=j;
    }
    public long pop(){
        if(placeHolder>=0){
            return stackArray[placeHolder--];
        }
        else {
            return 0;
        }
    }
    public long peak(){
        return stackArray[placeHolder];
    }
    public boolean isEmpty(){
        return (placeHolder == -1);
    }
    public boolean isFull(){
        return (placeHolder == size-1);
    }
    public void clear(){
        placeHolder = -1; 
    }
    public int length(){
        return placeHolder+1;
    }

}
