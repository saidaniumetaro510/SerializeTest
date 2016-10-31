package seriarizetest;

import java.io.Serializable;

/**
 *
 * @author KK
 */
public class Hello implements Serializable {

    private static final long serialVersionUID = 123456789L;

    private String message;

    /**
     * Constructer
     * 
     * @param message 
     */
    public Hello(String message){
        this.message = message;
    }
    
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
