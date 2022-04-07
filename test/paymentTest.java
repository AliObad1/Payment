import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class paymentTest {


    @Test
    public void beforeninehalf() {
        var p = new payment();
        LocalTime t1 = LocalTime.of(7, 15, 00);
        assertEquals(10000, p.cash(t1));
    }

    @Test
    public void betweenfoursevenhalf() {
        var p = new payment();
        LocalTime t2 = LocalTime.of(17, 00, 00);
        assertEquals(10000, p.cash(t2));
    }

    @Test
    public void betweenninehalffour() {
        var p = new payment();
        LocalTime t3 = LocalTime.of(15, 10, 00);
        assertEquals(6000, p.cash(t3));
    }

    @Test
    public void aftersevenhalf() {
        var p = new payment();
        LocalTime t4 = LocalTime.of(20, 00, 00);
        assertEquals(6000, p.cash(t4));
    }

    @Test
    public void ninehalf() {
        var p = new payment();
        LocalTime t5 = LocalTime.of(9, 30, 00);
        assertEquals(6000, p.cash(t5));
    }

    @Test
    public void four() {
        var p = new payment();
        LocalTime t6 = LocalTime.of(16, 00, 00);
        assertEquals(6000, p.cash(t6));
    }

    @Test
    public void sevrnhalf() {
        var p = new payment();
        LocalTime t7 = LocalTime.of(19, 30, 00);
        assertEquals(10000, p.cash(t7));
    }
}