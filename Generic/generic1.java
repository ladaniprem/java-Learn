import java.util.*;

public class generic1{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
     // Note :- their type-safe generic list with provided the type of data only access it 
     // Note:-  their compile time error show it 
     //NOte :-  their help to the develoing the code runtime error will be not generate it.
        list.add("prem");
        // list.add(123); their show the error
        // List anotherlist = new ArrayList();
        // anotherlist.add("ladani"); Note that this is not type safe non-generic list
        // anotherlist.add(123); Note that this is not type safe non-generic list
        //anything type can be add in this list
        

        System.out.println(list);
        // System.out.println(anotherlist);
    }
}