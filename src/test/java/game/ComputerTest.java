package game;

import static org.junit.Assert.*;
import org.junit.Test;


public class ComputerTest  {

    @Test
    public void checkComputerInput() {
        Computer computer = new Computer();
        assertNotNull(computer.getChoice());
    }

}