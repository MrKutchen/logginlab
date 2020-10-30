import org.junit.Test;

import java.awt.datatransfer.FlavorEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is "+i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }
    @Test
    public void thresholdReachedTest() {
        Integer finalLimit = 2;

        LogginLab lab = new LogginLab();
        if(lab.thresholdReached(finalLimit)) {
            logger.log(Level.INFO, "false - Personal test created for lab");
            assertTrue(lab.thresholdReached(finalLimit));
        } else {
            logger.log(Level.INFO, "true - Personal test created for lab");
            assertFalse(lab.thresholdExceeds(finalLimit));
        }
    }
}