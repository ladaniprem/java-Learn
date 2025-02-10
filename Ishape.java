public interface Ishape {
    
    public static final int i = 34;

    public abstract void calculatearea(int r); //abstract is redundant for interface method

    //IMP NOTE :- default,private,static method ki baat nahi kar rahe hai
    // Jo bi normal method hoge vo abstract ho jayege and 100% abstraction provide karege 
    // jo polymorphism method kar sakhte vo method.

}

class circle implements Ishape 
{
    @Override
public void calculatearea(int r){
    System.out.println("Area of Circle is"+(Math.PI * r * r));
}
    public static void main(String[] args) {
        Ishape c1 = new circle();
         c1.calculatearea(3);
    }
}

//study the Abtract vs Interface 
