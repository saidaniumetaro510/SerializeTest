package seriarizetest;

import java.util.Properties;

/**
 *
 * @author KK
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Properties prop = new Properties();
 
        // seriarize
        SerializeOut so = new SerializeOut();
        so.outputObj(prop);
        
        // desirialize
        SerializeIn si = new SerializeIn();
        si.inputObject(prop);

    }
    
}
