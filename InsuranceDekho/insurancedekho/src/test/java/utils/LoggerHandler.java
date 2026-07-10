package utils;
 
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
 
/**
* LoggerHandler: Utility for centralized Log4j logging.
* Creates timestamped log files and provides static log methods.
* @author Nivedita Singh
*/
public class LoggerHandler {
 
 
	/**
     * Description: Determines the appropriate logger based on the calling class
     *
     * @return Logger corresponding to the calling class
     */
	private static Logger getLogger() {
		StackTraceElement[] stackTrace = new Throwable().getStackTrace();
		for (StackTraceElement element : stackTrace) {
			String className = element.getClassName();
			if (!className.equals(LoggerHandler.class.getName())
					&& !className.equals("utils.WebDriverHelper")) {
				return Logger.getLogger(className);
			}
		}
		return Logger.getLogger(LoggerHandler.class);
	}
 
 
	/**
     * Description: Initializes the Log4j file appender with a timestamped log file
     */
	static {
		try {
			File folder = new File("./logs");
			if (!folder.exists()) {
				folder.mkdirs();
			}
 
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String logFileName = "logs/logfile_" + timestamp + ".log";
 
			FileAppender fileAppender = new FileAppender(new PatternLayout("%d{ISO8601} %-5p %c - %m%n"), logFileName,true);
			Logger.getRootLogger().addAppender(fileAppender);
 
		} catch (Exception e) {
			Logger.getRootLogger().error("Failed to initialize logger file appender", e);
		}
	}
 
 
	/**
     * Description: Logs a TRACE level message
     * @author Nivedita Singh
     * @param message - Message to be logged
     */
	public static void trace(String message) {
		getLogger().trace(message);
	}
 
	/**
     * Description: Logs a DEBUG level message
     * @author Nivedita Singh
     * @param message - Message to be logged
     */
	public static void debug(String message) {
		getLogger().debug(message);
	}
 
	/**
     * Description: Logs a INFO level message
     * @author Nivedita Singh
     * @param message - Message to be logged
     */
	public static void info(String message) {
		getLogger().info(message);
	}
 
	/**
     * Description: Logs a WARN level message
     * @author Nivedita Singh
     * @param message - Message to be logged
     */
	public static void warn(String message) {
		getLogger().warn(message);
	}
 
	/**
     * Description: Logs a ERROR level message
     * @author Nivedita Singh
     * @param message - Message to be logged
     */
	public static void error(String message) {
		getLogger().error(message);
	}
 
	/**
     * Description: Logs a FATAL level message
     * @author Nivedita Singh
     * @param message - Message to be logged
     */
	public static void fatal(String message) {
		getLogger().fatal(message);
	}
}