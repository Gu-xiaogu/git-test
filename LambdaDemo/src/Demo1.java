public class Demo1 {
    //内部函数的写法
    public static void main(String[] args) {
        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is thread");
            }
        });
        thread.start();*/

        Thread thread = new Thread(() -> System.out.println("this is lambdda" ));
        thread.start();

    }
}
