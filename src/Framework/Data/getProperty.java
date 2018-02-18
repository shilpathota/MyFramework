package Framework.Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getProperty {

	public static String get(String Key,String type) throws IOException{
		File src = null;
		if(type=="data"){
		src=new File("./Properties/data.Properties");
		}
		else if(type=="uimap")
		{
		src=new File("./Properties/UIMap.Properties");
		}
		FileInputStream fis=new FileInputStream(src);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
	}
}
