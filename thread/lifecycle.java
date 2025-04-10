package thread;

public class lifecycle extends Thread {
    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        lifecycle L1 = new lifecycle();
        System.out.println(L1.getState());
        L1.start();
         System.out.println(L1.getState());
        // System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);   //blocked/waiting :- A thread is in this state when it is waiting for the resource or for anthor threasd to perform an action 
        
       System.out.println(L1.getState());
       L1.join();
       System.out.println(L1.getState()); // terminated : a thread is in this state when it has finished executing.
    }
    //running Is not show in java but the use for the thread is in this state when it is executing.
  
    // the lifecycle of a thread in java consists of serveral states,which a thread can move through during its execusion 
}