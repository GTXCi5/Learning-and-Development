package properties;

import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author ROG STRIX
 * Class having constructors to load the log4j properties.
 */
public class SetLoggerProperties {
	
	public SetLoggerProperties(){
		Logger logger = Logger.getLogger(this.getClass());
		String log4JPropertyFilePath = "C:\\Users\\ROG STRIX\\git\\Learning-and-Development\\Java\\JsonCreator\\properties\\log4j.properties";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(log4JPropertyFilePath));
		    PropertyConfigurator.configure(properties);
		    logger.info("Logger properties Configured");
		} catch (IOException e) {
		    e.printStackTrace();

		}
	}
	

}
