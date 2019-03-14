import java.util.ArrayList;

public class Schedule {

    private ArrayList<Train> schedule; // расписание поездов

    public Schedule(ArrayList<Train> lisOfTrains) {
        this.schedule = lisOfTrains;
    }


    public void addNewTrain(Train podj) {
        schedule.add(podj);
    }

    public void deleteTrain(String zubik) {
        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getTrainName().equals(zubik)) {
                schedule.remove(i);
                break;
            }
        }
    }

    public int timeStrToMinute(String time) {  // Время представленное строкой представляю в виде минут прошедших с 00:00
        String[] parts = time.split(":");
        int result = 0;
        for (int i = 0; i < parts.length ; i++) {
            int number = Integer.parseInt(parts[i]);
            result = result * 60 + number;
        }
            return result;
    }

    public Train routeSearch(String currentTime, String destination) {    //поиск ближайшего поезда
        ArrayList<Train> sortedSchedule = new ArrayList<Train>();
        for (int i = 0; i < schedule.size(); i++) {
            if( timeStrToMinute(schedule.get(i).getDepartureTime()) > timeStrToMinute(currentTime)
                    && schedule.get(i).getLastStationName().equals(destination)) sortedSchedule.add(schedule.get(i));
        }
        Train trainOfSorted = sortedSchedule.get(0);
        for (int j = 1; j < sortedSchedule.size() ; j++) {
            if( timeStrToMinute(trainOfSorted.getDepartureTime())
                    > timeStrToMinute(sortedSchedule.get(j).getDepartureTime())) trainOfSorted = sortedSchedule.get(j);
        }
        return trainOfSorted;
    }

}




