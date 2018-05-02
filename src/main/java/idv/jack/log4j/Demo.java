package idv.jack.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private static final Logger log = LoggerFactory.getLogger(Demo.class);

    public static void main(String args[]) {
        log.info("run main function");
        log.debug("debug1");
        log.debug("debug2");
        //System.out.println("Hello World");
    }
}
