package race;

import java.util.List;

public class ResultView {
    private final List<Race> result;

    public ResultView(List<Race> raceResult) {
        this.result = raceResult;
    }

    public void print() {
        for(Race race : this.result) {
            System.out.println(race.getTryCount()+1 + " 회");

            race.getCars().forEach(car -> {
                int i =0;
                while(i< car.getMove()) {
                    System.out.print( "-");
                    i++;
                }
                System.out.println();
            });
            System.out.println();

        }
    }
}
