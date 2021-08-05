package Adaptor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdaptorTest {

    @Test
    public void whenConvertingMPHtoKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        Adaptor.MovableAdaptor bugattiVeyronAdaptor = new MovableAdaptorImpl(bugattiVeyron);

        assertEquals(431.30312, bugattiVeyronAdaptor.getSpeed(), 0.00001);
    }

}