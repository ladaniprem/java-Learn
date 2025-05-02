import java.util.*;

public class Box<T>{

    // object class is top most parent class of all the classed in java 
    // static Object container; the container hold to the value of the parent class ka refernce variable vo child ke refernce ko asshani se rakh sakti hai
     T container; // generic type T is used to create a box of any type
//     public Box(Object container){
//         this.container = container;
//     }
//     public Object getvalue(){
//         return this.container;
//     }
// }
public Box(T container){
    this.container = container;
}
public Object getvalue(){
    return this.container;
}

public void performsomeTask(){
    if (container instanceof String) {
        System.out.println("length of string :"+container+"is"+(((String)this.container).length()));
    }
    else if (container instanceof Integer){
        System.out.println("This is integer value:"+ container);
    }
}
}