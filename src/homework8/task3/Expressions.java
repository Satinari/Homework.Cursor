package homework8.task3;

public class Expressions {
    public void someExpressions(){
        try {
            someMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static void someMethod() throws Exception {
        System.out.println("Expression from method 1");
        someMethod2();
    }

    static void someMethod2() throws Exception {
        System.out.println("Expression from method 2");
        throw new Exception();
    }
}
