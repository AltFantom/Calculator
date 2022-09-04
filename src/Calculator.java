import java.util.Scanner;

public class Calculator {
    public void toStart() {
        int firstNumber;
        int secondNumber;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Введите первое число:");
            firstNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Введите второе число:");
            secondNumber = Integer.parseInt(sc.nextLine());
            chooseOperator(firstNumber, secondNumber);
            if (!isContinue()) {
                flag = false;
            }
        }
    }

    private void sum(int firstNumber, int secondNumber) {
        System.out.println("Результат: " + (firstNumber + secondNumber));
    }

    private void diff(int firstNumber, int secondNumber) {
        System.out.println("Результат: " + (firstNumber - secondNumber));
    }

    private void multiplication(int firstNumber, int secondNumber) {
        System.out.println("Результат: " + (firstNumber * secondNumber));
    }

    private void division(int firstNumber, int secondNumber) {
        System.out.println("Результат: " + (firstNumber / secondNumber));
    }

    private boolean isContinue() {
        String yourDecision;
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите продолжить?");
        yourDecision = scan.nextLine().toLowerCase();
        if (yourDecision.equals("да")) {
            return true;
        } else if (yourDecision.equals("нет")) {
            return false;
        } else {
            System.out.println("Хорошая попытка, но есть только два варианта: да или нет");
            return isContinue();
        }
    }
    private void chooseOperator(int firstNumber, int secondNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую операцию");
        String operator = scanner.nextLine();
        switch (operator) {
            case "+":
                sum(firstNumber, secondNumber);
                break;
            case "-":
                diff(firstNumber, secondNumber);
                break;
            case "*":
                multiplication(firstNumber, secondNumber);
                break;
            case "/":
                division(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Введенная операция не существует");
                chooseOperator(firstNumber, secondNumber);
        }
    }
}