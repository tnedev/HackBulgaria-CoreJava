
public class Logger {
    protected int level = 3;
    
    public Logger(int level){
        if (level>1 && level <= 5) {
            this.level = level;
        }
        else {
            throw new Error ("Wrong level input") ;
        }
    }
    
    public Logger(){
    }
    
    public void setLevel(int level){
        if (level>1 && level <= 5) {
            this.level = level;
        }
        else {
            throw new Error ("Wrong level input") ;
        }
    }
    
    public void log (int messageLevel, String message){
        if (messageLevel>1 && messageLevel <= 5) {
            this.printMsg(messageLevel, message);
        }
        else {
            throw new Error ("Wrong message level input") ;
        }          
    }
    
    public void log (String message){
        int messageLevel = 3;
        this.printMsg(messageLevel, message);
    }
    
    protected void printMsg(int messageLevel, String message){
        if(messageLevel<=level){
            System.out.format("%d => %s", messageLevel,message);
        }
    }
    public static void main(String[] args) {
        Logger logger = new Logger(5);
        logger.log(5, "Working");

    }

}
