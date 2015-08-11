package $PACKAGE_NAME;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

public class $NAME {

	private static final Logger logger = Logger.getLogger(${NAME}.class);

	public static void main(String[] args) {
		configureLog4j();
		new $NAME();
	}

	public $NAME() {
		
	}
	
	private static void configureLog4j() {
    Properties props = new Properties();
    props.put("log4j.rootLogger", "INFO, Console");
    props.put("log4j.appender.Console", "org.apache.log4j.ConsoleAppender");
    props.put("log4j.appender.Console.layout", "org.apache.log4j.PatternLayout");
    props.put("log4j.appender.Console.layout.ConversionPattern", "%d [%t] %-5p %C{1} - %m%n");
    PropertyConfigurator.configure(props);
  }
}
