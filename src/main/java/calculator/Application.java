package calculator;

import calculator.utils.Calculators;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        Calculators calculators = new Calculators(inputView.getInputStr());
        System.out.println(calculators.getSumNum());
    }
}