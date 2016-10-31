package seriarizetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 *
 * @author KK
 */
public class SerializeOut {
    
    public void outputObj(final Properties prop){
        try{
            FileInputStream fis = new FileInputStream(new File(Constant.propFileName));
            prop.load(fis);
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(prop.getProperty("filename")));
            
            Hello hello = new Hello(prop.getProperty("message"));
            System.out.println("Object Hello has message : "+hello.getMessage());
            
            oos.writeObject(hello);
            
            fis.close();
            oos.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
