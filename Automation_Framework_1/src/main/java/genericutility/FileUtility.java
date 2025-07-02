package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author sekha
 */
public class FileUtility {
	/**
	 * This method is used to read data from property file 
	 * by taking key  from the caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	

}
