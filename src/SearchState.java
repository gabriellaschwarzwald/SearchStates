import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SearchState {

    public static final int listSize = 50;
    private States[] statesList;
    int numStates = 0;
    private String key;

    public SearchState(String key) {
        statesList = new States[listSize];
        this.key = key;
        this.ReadFile();
        this.Search(key);
    }
    public void ReadFile()  {
        System.out.println("Reading wordlist ...");
        System.out.println();
        Scanner scan = null;

        String name;
        String capital;
        String nickname;
        String population;

        try {
            scan = new Scanner(new File("States.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        while (scan.hasNextLine()) {
            name = scan.nextLine();
            capital = scan.nextLine();
            nickname = scan.nextLine();
            population = scan.nextLine();

            States a = new States(name, capital, nickname, population);
            statesList[numStates] = a;
            numStates++;

        }
    }
    public void Search(String key) {

        int left = 0;
        int right = listSize;
        int midpoint;
        while (left <= right) {
            midpoint = (left + right) / 2;
            int result = (statesList[midpoint].getName().compareTo(key));
            if (result == 0){
                System.out.println("State found. State info: " + statesList[midpoint].toString());
                break;}
            else if (result < 0)
                left = midpoint + 1;
            else
                right = midpoint - 1;
        }
    }
}
