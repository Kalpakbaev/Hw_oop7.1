package kalpakbaev.kz;

import java.util.Scanner;
import java.util.logging.Logger;

public class ComplexCalculator {
    private static final Logger LOGGER = Logger.getLogger(ComplexCalculator.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Введите первое комплексное число: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(a, b);

        LOGGER.info("Введите второе комплексное число: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(a, b);

        LOGGER.info("Выберите операцию (+ или -): ");
        String operation = scanner.next();

        if (operation.equals("+")) {
            ComplexNumber result = num1.add(num2);
            LOGGER.info("Сумма комплексных чисел: " + result);
        } else if (operation.equals("-")) {
            ComplexNumber result = num1.subtract(num2);
            LOGGER.info("Разность комплексных чисел: " + result);
        } else {
            LOGGER.warning("Некорректная операция");
        }

        scanner.close();
    }
}
