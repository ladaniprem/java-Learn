package thread;

// public class world extends Thread{
  //a new class world is created that extends therad.
    //the run method is overridden to define the code that constittutes the new thread
    //start method is called to initiate the new thread
public class world implements Runnable{
    //A new class world is created that implements Runnable 
    //the run method is overridden to define the code that constitutes the new thread
    //A thread object is created by passing an instance of MyRunnable
    //Start method is called on the Thread Object to initiate the new therad 
    //in both method the run method contains the code that will be execution in the new theread
    

     
       @Override
       public void run(){
        // for(int i=0;i<10000;i++){
            for(;;){
            System.out.println("world");
        }
       }
    }
   


