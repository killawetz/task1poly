import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {Train train1 = new Train("Винстон",
            "15:27",
            new ArrayList<String>(Arrays.asList("Академ","Гражданский")),
            "Девяткино");
        Train train2 = new Train("Винстон",
                "15:27",
                new ArrayList<String>(Arrays.asList("Академ","Гражданский")),
                "Девяткино");
        System.out.println(train1.equals(train2));
    }




}
