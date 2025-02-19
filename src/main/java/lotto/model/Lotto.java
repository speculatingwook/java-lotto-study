package lotto.model;

import lotto.exception.InputNumberValidation;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        InputNumberValidation.isNumberLengthCorrect(numbers);
        InputNumberValidation.hasDuplicates(numbers);
        this.numbers = numbers;
    }



    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

}
