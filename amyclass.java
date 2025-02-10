abstract public class amyclass{

    //complete method 
    public void cal(){
       System.out.println("Calculating Results");
    }
      //abstract method 
    abstract public void rocket();
}

//IMP NOTE :- abstract class can not be instantiated
//example :-
/*class start(){
    public static void main(String[] args){
        amyclass amyclass = new amyclass();//Cannot instantiate the type amyclassJava(16777373)
        amyclass
        }
    }
 */

 class start {
    public static void main(String[] args) {
        amyclass ob=new amychild();
        ob.rocket();
        ob.cal();
    }
 
    
 }
