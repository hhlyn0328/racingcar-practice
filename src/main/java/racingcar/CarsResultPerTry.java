package racingcar;

import java.util.Collections;
import java.util.List;

public class CarsResultPerTry {

    private List<CarResult> carResultList;


    public CarsResultPerTry(List<CarResult> carResultList) {
        this.carResultList = Collections.unmodifiableList(carResultList);
    }

    public List<CarResult> getCarResultList() {
        return carResultList;
    }

    public int maxAdvanceCount() {
        return this.carResultList.stream()
                .mapToInt(CarResult::getAdvanceCount).max().getAsInt();
    }

}
