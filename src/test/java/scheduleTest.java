import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class scheduleTest {

 //Два объекта поезда для тестирования методов класса Train

    Train winston = new Train("Пушка",
            "15:27",
            new ArrayList<String>(Arrays.asList("Академ","Гражданский")),
            "Девяткино");

    Train winston228 = new Train("Пушка",
            "15:27",
            new ArrayList<String>(Arrays.asList("Академ","Гражданский","Новая станция")),
            "Девяткино");

    // тесты класса Train

    @Test
    public void addNewStation() {
        winston.addNewStation("Новая станция");
        assertEquals(winston, winston228);
    }

    @Test
    public void deleteStation() {
        winston228.deleteStation("Новая станция");
        assertEquals(winston228.getStations(),winston.getStations());
    }

    //Два объекта поезда для тестирования методов класса Schedule

    Schedule mayakovskaya = new Schedule(new ArrayList<Train>(Arrays.asList(winston)));
    Schedule nevskiy = new Schedule(new ArrayList<Train>(Arrays.asList(winston, winston228)));

    // тесты класса Schedule

    @Test
    public void addNewTrain() {
        mayakovskaya.addNewTrain(winston228);
        assertEquals(mayakovskaya, nevskiy);
    }
}
