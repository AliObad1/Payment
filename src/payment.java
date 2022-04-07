import java.time.LocalTime;

public class payment {

    public int cash(LocalTime time1) {
        LocalTime ninehalf = LocalTime.of(9,30,00);
        LocalTime four = LocalTime.of(16,01,00);
        LocalTime sevenhalf = LocalTime.of(19,31,00);
        if (time1.isBefore(ninehalf)) {
            return 10000;
        } else if (time1.isBefore(four)) {
            return 6000;
        } else if (time1.isBefore(sevenhalf)) {
            return 10000;
        } else  {
            return 6000;
        }


    }
}
