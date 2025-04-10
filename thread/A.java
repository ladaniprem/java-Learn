package thread;

public class A extends B implements Runnable{

    @Override
    public void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
