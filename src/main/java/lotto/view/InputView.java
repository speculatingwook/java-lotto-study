package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.exception.InputNumberValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class InputView {
    public static int inputLottoBoxPrice() {
        String input = Console.readLine();
        int price = InputNumberValidation.isNumeric(input);          // 1. 정수인지 판별
        InputNumberValidation.checkRemainderZero(price);            // 2. 1000원으로 나누어떨어지는지 판별
        return price;
    }

    public static ArrayList<Integer> inputWinningNumber() {
        String input = Console.readLine();
        return Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static int inputBonusNumber() {
        String input = Console.readLine();
        InputNumberValidation.checkBonusNumberLength(input);              // 1. 1자리인지 판별
        int number = InputNumberValidation.isNumeric(input);              // 2. 정수인지 판별
        InputNumberValidation.checkNumberRange(number);                   // 3. 1부터 45 사이의 수인지 판별
        return number;
    }

}
