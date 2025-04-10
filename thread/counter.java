package thread;

public class counter {
    public int count =0;

    public synchronized void incerment(){
          count++;
    }

    public int getcount(){
        return count;
    }
}
