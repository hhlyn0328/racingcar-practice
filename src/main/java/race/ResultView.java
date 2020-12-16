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
                int ii =0;
                while(ii< car.getMove()) {
                    System.out.print( "-");
                    ii++;
                }
                System.out.println();
            });
            System.out.println();

        }
    }
}
