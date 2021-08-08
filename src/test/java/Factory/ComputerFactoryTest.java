package Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerFactoryTest {

    @Test
    public void whenPutPC_thenReturnPC() {
        Computer pc = ComputerFactory.getComputer("pc", "16GB", "1T", "2.4GHz");
        assertEquals("RAM= 16GB, HDD= 1T, CPU= 2.4GHz", pc.toString());
    }

    @Test
    public void whenPutServer_thenReturnPC() {
        Computer server = ComputerFactory.getComputer("server", "32GB", "8T", "2.9GHz");
        assertEquals("RAM= 32GB, HDD= 8T, CPU= 2.9GHz", server.toString());
    }

}