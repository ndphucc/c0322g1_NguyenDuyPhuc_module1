package ss8_clean_code_refactoring.thuc_hanh.doi_ten_bien_va_tach_hang;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculate(int firthOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firthOperand + secondOperand;
            case SUBTRACTION:
                return firthOperand - secondOperand;
            case MULTIPLICATION:
                return firthOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firthOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
