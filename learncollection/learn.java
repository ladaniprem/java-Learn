// package learncollection;
// import java.util.*;//import the all packages [all classes]
/*create the collection 
      1) Type safe :- same type of the element(object)are added to collection
      2) Un Type safe:- differnt types of element can be added to collection 
     */
    // comparable example code 
// class ComparableExample {
//     int rollno;
//     String name;
    
//     public ComparableExample(int rollno, String name) {
//         this.rollno = rollno;
//         this.name = name;
//     }
    
//     @Override
//     public String toString() {
//         return "ComparableExample [rollno=" + rollno + ", name=" + name + "]";
//     }
// }
// end the comparable code 


// public class learn {
//     public static void main(String[] args) {
//         System.out.println("wecome the to code java collection framework");

//         //type safe 
//         ArrayList<String> names = new ArrayList<>();
//         names.add("prem");
//         names.add("prem");
//         names.add("rihsit"); 
//         names.add("sagar");
//         names.add("sachin");
//         System.out.println(names);
        //get method use 
        // System.out.println(names.get(0));
        // System.out.println(names.get(1));

        // size the method 
        // System.out.println("SIZE:"+names.size());
        // System.out.println(names.size());

        // set method 
        // System.out.println(names.set(0, null));

        //contains the method
        //check item is there or not in the list
        //type ka equals method call karta hai checking karna ke liye 
        // System.out.println(names.contains("prem")); //true because the name is in the list
        // System.out.println(names.contains("prem ladani")); //false because the name is not in the list

        //empty the list
      //   System.out.println(names.isEmpty());

      //  //clear the list
      //  names.clear();
      // System.out.println(names);

      // LinkedList<String> list = new LinkedList<>();
      // list.add("prem");
      // list.add("jeel");
      // list.add("sumit");
      // System.out.println(list);

      // System.out.println(list.getFirst());
      // System.out.println(list.getLast());
      // System.out.println(list.peek());
      // System.out.println(list.peekFirst());
      // System.out.println(list.peekLast());
      // System.out.println(list.poll());

      //names.clone();
      // names.containsAll(names);
      // names.ensureCapacity(0);
      // names.indexOf("prem");
      // names.lastIndexOf("prem");
      // names.replaceAll(null);

        // //un-type safe 
        // LinkedList<Object> list = new LinkedList<>();
        // list.add("prem");
        // list.add(123);
        // list.add(45.67);
        // list.add(true);
        // System.out.println(list);

        // //remove the element from the list
        //  names.remove("prem"); //collection ka hai
        //  System.out.println(names);
        //  names.remove(0); // list ka hai their the differnt method 
        //  System.out.println(names);

        // //vector example 
        // Vector<String> vector = new Vector<>();
        // vector.addAll(names);
        // System.out.println("Vector:"+vector);
        //HashSet example  
        //HashSet me order prejev nahi raheta hai
        //Hashset ke pas koy exter method nahi hai


    //     HashSet<Double> nms = new HashSet<>();
    //     nms.add(14.55);
    //     nms.add(34.678);
    //     nms.add(new Double(45.67)); //autoboxing the value so does not write the new keyword
    //     nms.add(99.99);
    //     nms.add(99.99); //dublicate is not allowed
    //     System.out.println(nms);
    // System.out.println("+++++++++++++++++++++");
    //     TreeSet<Double> tSet = new TreeSet<>();
    //     tSet.addAll(nms);
    //     System.out.println(tSet);
    //     System.out.println("---------------------");

         //iterator using the collection
        // Iterator<String> iterator = names.iterator();
        // while(iterator.hasNext ()){
        //   String next = iterator.next();
        //   System.out.println(next);
        //   // System.out.println("+++++++++++++++++++++");
        // }

        //backward traversing of the collection listiterator 

        // ListIterator<String> listIterator = names.listIterator();
        // System.out.println("Forward direction:");
        //    while (listIterator.hasPrevious()) {
        //     String previous = listIterator.previous();
        //     System.out.println(previous);
        //     // System.out.println("+++++++++++++++++++++");
        //    }

           //for each loop 
          //  names.forEach(str->{
          //   System.out.println(str);
          //  });

           //enumeration :-  it is used for the legacy class 
         //  Enumeration<String> elements = vector.elements();
          //  while (elements.hasMoreElements()) {
          //    String nextElement = elements.nextElement();
          //    System.out.println(nextElement);  
          //  }

          // //Treeset example
          // TreeSet<String> Set = new TreeSet<>();
          // Set.add("prem");
          // Set.forEach(e->{
          //   System.out.println(e);
          // });

          //comparator and comparable 
          //comparable :- it is used for the single class
          //comparator :- it is used for the multiple class   
          //comparable me ek hi class ke object ko compare karta hai
          //comparator me multiple class ke object ko compare karta hai
          //comparable me ek hi class ke object ko compare karta hai
          //comparator me multiple class ke object ko compare karta hai

          //comparable example
          // class Student implements Comparable<Student> {
          //   int rollno;
          //   String name;
          //   public Student(int rollno, String name) {
          //     this.rollno = rollno;
          //     this.name = name;
          //   }
          //   @Override
          //   public int compareTo(Student o) {
          //     return this.rollno - o.rollno;
          //   }
          //   @Override
          //   public String toString() {
          //     return "Student [rollno=" + rollno + ", name=" + name +
          //     "]";
          // TreeSet<ComparableExample> treeSet = new TreeSet<>();
          // treeSet.add(new ComparableExample(1, "prem"));
          // treeSet.add(new ComparableExample(2, "jeel"));
          // treeSet.add(new ComparableExample(3, "sumit"));
          // treeSet.add(new ComparableExample(4, "sagar"));
          // treeSet.forEach(e->{
          //   System.out.println(e);
          // });
         
          // HashMap example
          
          // HashMap <String,Integer> courses = new HashMap<>();

          //adding element 

//           courses.put("core java", 4000);
//           courses.put("advance java", 5000);
//           courses.put("python", 6000);
//           courses.put("c++", 7000);
//           courses.put("c", 8000);

//           System.out.println(courses);

//           courses.forEach((key, value)->{
//             System.out.println(key+ "=>");
//             System.out.println(+value);
//           });

//           //get method
//         System.out.println(courses.get("core java"));

//         //entery set
//         Set<String> keys = courses.keySet();
//         System.out.println(keys);
        
//         //key set 
//         Set<Map.Entry<String, Integer>> entrySet = courses.entrySet();
//         System.out.println(entrySet);
        
//     }
     

// }
