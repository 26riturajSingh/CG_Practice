package features.java8.lambda.runnableinterface;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };
        new Thread(runnable).start();

        Runnable runnable1 = () -> {
            System.out.println("Lambda run");
        };

        new Thread(runnable1).start();

        new Thread(() -> System.out.println("Another one")).start();
    }
}
