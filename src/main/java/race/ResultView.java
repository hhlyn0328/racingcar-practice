package race;

import java.util.List;

public class ResultView {
    private final List<Race> result;

    public ResultView(List<Race> raceResult) {
        this.result = raceResult;
    }

    public void print() {
        for(int i=0; i< this.result.size(); i++){
            System.out.println(i+1 + " 회");


            this.result.get(i).getCars().forEach(car -> {
                this.printMove(car);
                System.out.println();
            });
            System.out.println();

        }
    }

    private void printMove(Car car) {
        for(int i=0; i< car.getMove(); i++) {
            System.out.print("-");
        }

    }
}
