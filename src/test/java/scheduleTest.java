import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class scheduleTest {

 //Объекты поезда для тестирования методов

    private Train sapsan = new Train("Сапсан",
            "15:27",
            new ArrayList<String>(Arrays.asList("Академ","Гражданский")),
            "Девяткино");

    private Train sapsan2 = new Train("Сапсан",
            "15:27",
            new ArrayList<String>(Arrays.asList("Академ","Гражданский","Новая станция")),
            "Девяткино");
    private Train lokomotiv = new Train("Локомотив",
            "12:30",
            new ArrayList<String>(Arrays.asList("Пионерская", "Удельная")),
            "Парнас");
    private Train skorohod = new Train("Скороход",
            "10:15",
            new ArrayList<String>(Arrays.asList("Владимирская","Достоеская")),
            "Девяткино");


    // тесты класса Train

    @Test
    public void addNewStation() {
        sapsan.addNewStation("Новая станция");
        assertEquals(sapsan, sapsan2);
    }

    @Test
    public void deleteStation() {
        sapsan2.deleteStation("Новая станция");
        assertEquals(sapsan2, sapsan);
    }

    //Два объекта поезда для тестирования методов класса Schedule

    private Schedule mayakovskaya = new Schedule(new ArrayList<Train>(Arrays.asList(sapsan)));
    private Schedule nevskiy = new Schedule(new ArrayList<Train>(Arrays.asList(sapsan, sapsan2)));

    // тесты класса Schedule

    @Test
    public void addNewTrain() {
        mayakovskaya.addNewTrain(sapsan2);
           assertEquals(mayakovskaya, nevskiy);
    }


    @Test
    public void deleteTrain() {
        mayakovskaya.deleteTrain(sapsan2);
        nevskiy.deleteTrain(sapsan2);
        assertEquals(mayakovskaya,nevskiy);
    }

    // еще один объект для теста routeSearch
    private Schedule avtovo = new Schedule(new ArrayList<Train>(Arrays.asList(sapsan2, skorohod, lokomotiv)));


    @Test
    public void routeSearch(){
    assertEquals(skorohod, avtovo.routeSearch("9:00", "Девяткино"));
    assertEquals(sapsan2,avtovo.routeSearch("13:00","Девяткино"));
    }
}
