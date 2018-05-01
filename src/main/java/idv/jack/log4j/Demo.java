package idv.jack.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private static final Logger log = LoggerFactory.getLogger(Demo.class);

    public static void main(String args[]) {
        log.info("test123456789");
        //System.out.println("Hello World");
        log.info("RUN MAIN FUNCTION");
    }
}
