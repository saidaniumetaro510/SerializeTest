package seriarizetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Properties;

/**
 *
 * @author KK
 */
public class SerializeIn {
    
    public void inputObject(final Properties prop){
        try{
            FileInputStream fis = new FileInputStream(new File(Constant.propFileName));
            prop.load(fis);
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(prop.getProperty("filename")));
            Hello hello = (Hello)ois.readObject();
            
            System.out.println("InputObject has message : " + hello.getMessage());
            ois.close();
            fis.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
