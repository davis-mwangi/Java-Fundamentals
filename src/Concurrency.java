import java.util.concurrent.*;

public class Concurrency {

    //This method will be executed by only one thread per given time.
    public  synchronized  void performAction(){

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        //Fire-forget if result is not required
//        executor.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        //Result Required
        Future<Long> result = executor.submit(new Callable<Long>() {
            @Override
            public  Long call() throws Exception{
                //Some Implementation
                return 1L;
            }
        });

//        Long value =  result.get(1, TimeUnit.SECONDS);
        Long value =  result.get(); //waits forever

        System.out.println("RESULT::: " +  value);
    }
}
