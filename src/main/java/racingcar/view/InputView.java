package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private InputView() {

    }

    public static String getInputRacersName() {
        String userInput = Console.readLine();
        validateUserInput(userInput);
        return userInput;
    }

    public static String getInputTryNumber() {
        String userInput = Console.readLine();
        validateUserInput(userInput);
        return userInput;
    }

    private static void validateUserInput(String userInput) {
        if (userInput.isBlank()) {
            throw new IllegalArgumentException();
        }
    }
}