package Framework.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class LoggerFile {
public static void logMessage(Class<?> cls,String message){
	Logger log =Logger.getLogger(cls);
	PropertyConfigurator.configure("./Properties/log4j.properties");
	log.info(message);
	
}
}
