
package courseraapplication.user;
import java.util.Arrays;

public class invalidPasswordException extends Exception{
    
    public invalidPasswordException(String output){
        super(output);
    }  
  public String printinstructions(){
        return Arrays.toString(Gender.values());
    }
}
