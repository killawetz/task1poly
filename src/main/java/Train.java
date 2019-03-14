import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Train {

    private String trainName; // имя поезда
    private String departureTime; // время отправления
    private String lastStationName; // имя конечной станции
    private ArrayList<String> stations; // станции которые проезжает поезд


    public Train (String trainName, String departureTime, ArrayList<String> stations,  String lastStationName) {
        this.trainName = trainName;
        this.departureTime = departureTime;
        this.lastStationName = lastStationName;
        this.stations = stations;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this;
    }


    public String getTrainName() {
        return trainName;
    }

    public ArrayList<String> getStations() {
        return stations;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getLastStationName() {
        return lastStationName;
    }



    public void addNewStation(String kirza) {
        stations.add(kirza);
    }

    public void deleteStation(String vetra) {
        for (int i = 0; i < stations.size() ; i++) {
            if (stations.get(i).equals(vetra)) {
                stations.remove(i);
                break;
            }
        }
    }



}


