package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/15 11:37 下午
 **/
public class RecursiveFibonacci {
    RecursiveTest.IntCall intCall;

    public RecursiveFibonacci() {
        //简洁版本，使用三元表达式
        intCall = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                fibonacci(n - 1) + fibonacci(n - 2);

        //清晰版本
        intCall = (n) -> {
            if (n == 0 || n == 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        };

    }
    int fibonacci(int n){
        return intCall.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci fibonacci = new RecursiveFibonacci();
        for (int i = 0; i < 10; i++) {
            System.err.println(fibonacci.fibonacci(i));
        }

    }
}
