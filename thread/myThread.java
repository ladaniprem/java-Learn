package thread;

public class myThread extends Thread {
public counter counter;

public myThread(counter c1){
    this.counter = c1;
}
   public void run(){
    for(int i=0;i<1000;i++){
        counter.incerment();
    }
   }
}
