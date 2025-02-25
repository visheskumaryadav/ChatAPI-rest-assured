package apiMgmt.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggerUtil {
    private static final Logger  log = (Logger) LogManager.getLogger(LoggerUtil.class);

    public static void info(String message){
        log.info(message);
    }
    public static void error(String message,Exception e){
        log.error(message,e);
    }

}
