// Вывести все простые числа от 1 до 1000

public class program {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(i + " простое");
            }
        }
    }

    /**
     * @param num1
     * @param num2
     * @param operation
     * @return
     */
    public static int calc(final int num1, final int num2, final char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, calc.getOperation());//рекурсия
        }
        return result;
    }
}
