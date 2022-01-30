package threaddemo;

import java.security.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterDemo {
    public static void main(String[] args) {

        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(availableProcessors);

        //Submit the task for execution
        for (int i=0; i<100; i++){
            executorService.execute(new CpuIntensiveTast());
        }
    }
    static class CpuIntensiveTast implements Runnable{
        @Override
        public void run() {
            System.out.println("Current Thread:"+Thread.currentThread().getName());
        }
    }
}
