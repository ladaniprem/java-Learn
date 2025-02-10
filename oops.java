  //oops:-object oriented programming system

        //oops is methedology (style) and oops koy programming nahi hai language ke concept hai
      
       //class is logical entity(data and method hogi)

       //propertity and bahaviours hoti hai but tabi access kar pavoge jab iska object creat karoge.
       
       //class se multiple object create kar sakha te hai.

     //class and object example

        class oops{
   public static void main(String[] args) {
   }
    /*
    student st1;
    st1 = new student();//new keyword use for the crated dynamic memory allocate karte hai java me. 
    st1.studentCity = "rajkot";
    st1.studentId = 101;
    st1.studentName = "Ladani prem";
    st1.study();
    st1.showdetails();

    student st2 = new student();
    st2.studentId = 102;
    st2.studentName = "Ladani jeel";
    st2.studentCity = "Junagath";
    st2.study();
    st2.showdetails();
   }
        int studentId;
        String studentName;
        String studentCity; 
    
        public void study(){
            System.out.println(studentName + " is studying");
        }
public void showdetails(){
    System.out.println("my name is "+studentName);
    System.out.println("my Id is "+studentId);
    System.out.println("my city is "+studentCity);
    */

    //constructor :- object create samay jo data hota hai intialize karta hai

    //Automatically when we create constructor

   // Name == class Name

   //constructor does not return any value.(Not even void)

   //ex: public student(){} //Non parameterized constructor

   //ex :public student(int a,int b){} //parameterized constructor

  //when java create automatically - default constructor

  // if class does not have ant constructor then java creates one default constructor

  //ex: public student(){} //default constructor 

//example
/* 
  int studentId;
  String studentName;
  String studentCity; 

  public student(){
    System.out.println("create the obhject");
  }
  */

  //overloading (method overloading,constructor overloading)

  //constructor overloading:
  
  //1. number of argument different, 2. type of argument different , 3. order of aruments may differ
  
  //atleast one must be there for constructor overloading 

  //method overloading 

  // Having multiple methods in same class with same name

  //1. number of argument different, 2. type of argument different , 3. order of aruments may differ
  
  //atleast one must be there for Method  overloading 
  //example
   /* 
  //student st2 = new student(12);
  student st2 = new student(105,"rajkot","Ladani kush");
   
  int studentId;
  String studentName;
  String studentCity; 
   
  public student(){
    System.out.println("create the obhject : non-para");
  }
    public student(int st){
      System.out.println("parameteriazed construtor:(int)");
    } */

   //code is not run but understand the method overloading 
   /* 
    public void student(){
      System.out.println(studentName +" is studying");
    }
    public double student(float f){

    }
     */

     //This keyword

     //Refer the current invoking object

     //this() -> for calling class constructor from inside different constructor of same class

     //note:- one object mayse bi dhushre object me values ko call kar sakhat hai depending upon arrugument

     //ex :-  class test{
     //     public void show(){
       //    This.a
     //       }    
    //       }
   /*  test t = new test(){
      t.show();
      test t2 = new test(){
        t2.show();
      }
    }
    int studentId;
        String studentName;
        String studentCity;

        this.studentName =studentName;
        this.studentId = studentId;
    public student(){
      System.out.println(studentName +" is studying");
      System.out.println(this.studentCity);
  }
      */

      //Inheritance 

      //It is the mechanism in java by which one class is allowed to inherit the features of another class.

      //ex:-(child/subclass/derived class) dog -extends->Animal(patent class/super class/base class) (eat(),colour() etc.) 
       // class Dog extends Animal{//code}

       //Types of Inheritance :-

       //single inheritance :- (A<--B) 
       //multilevel inheritance :- (A<--B<--C)
       //Hirearchical inheritance :- (A<--B,A<--C,A<--D...A<--N)
       //multiple inheritance :- (A-->B,A-->C,A-->D) Note :- java me support nahi karta hai(class ki  help se nahi hota hai) but interfaces help se kiya ja sakhta hai.
       //Hybrid inheritance :- (A<--C B<--C<--D C<--E) combination hai Note:- multiple ke involvement se Hybrid nahi support nahi hoga class vale me but interfaces me hoga.
      //Cyclic inheritance :- (A<--A) Note:- cylic pattern bane par Java support nahi karta hai.

      //Ex:- 

       /* 
       public class Animal{
       string colour = "RED";
       int x =12; //for super class example 
       public void eating(){
       System.out.println("Animal is eating");
       }  
      }

      /*
       Dog d1 = new Dog();
       d1.eating(); //output :- Animal is eating 

       */
       
       //super Keyword :- two same data type vales hogi usme se parent class ki value ko access karne kaliye super keyword ka use karta hai.
       
       //(small s) super keyword referce to immediate parent.

       //super() user to call parent class constructor from inside child class constructor.

       //IMP NOTE :- this/super keyword must be the First line 

       //   Overriding :-  

       //Differnce between Method Overriding and Method overriden:- 

       //example :- eat(){//body redefined by shay} overriding method(parent ka esa method jiski body child change kar raha hai) 
       //Note overriding :- 1. parent and child class ke between relationship hona jaruri hai
       // 2. parent and child me jo arrgument,data type,return type(differnt me covarient return type are allowed) and name bhi vo same hone chahiye.
       // 3. access modifiers me ap child class ki accessblity kam nahi kar sakhte yato equal rakho ya fir badhado.


       //example :- public void eat(){//body} overridden method (child ka esa method jo body(parent ki body) ko change kar raha ho)

       //Encapulation :- Wrapping of data members(variables) and member methods(method) in a single unit.

      /*  example of encapulation :- class test{
            private int a =12;
             public void show(){
              System.out.println();
             } 
              // getters & setters   
      }
*/
      // 1. data hiding and security increase ho jayegi
      // 2. class ke variable ko private banavo recommantation hoti hai
      
      // getters &  setters :- 

      //example:-
/* 
      public class student{
       private String name; //access nahi kar sakhte hai private hai is liye
        private int Rollnum;

        public void display(){
          System.out.println(this.name);
          System.out.println(this.Rollnum);

          //Getter:-

          public int getRollnum(){

            if (Rollnum<=0) {
              throw new IllegalAccessException("Invaild");
            }
            return this.Rollnum;
          }

          //setter 

          public void setRollnum(int Rollnum){
            this.Rollnum();
          }
        }
      }
      */

      //Abstraction :- topic covered Abstract Class,Interface 

      // Showing features and hinding internal details(implementation)

      // ex :- CPU :- On/Off , ATM --> Return money, Google-->Best search Results

      //Features-->show,Implementation-->Hide 

      //100% abstraction --> Interfaces

      //0% to 100% abstraction --> Abstract Classes

      //Abstract Method :- public void calculator(){//maths related}

      //example :- abstract public void call(); jeske pas body nahi hai adura hai usai Abstract Method bolte hai. 
      
      // method ko banane ke liye jo keyword use karoge usai abstract

       //interface use karne kai liye interface keyword use hota hai.


       //Polymorphism :- poly :- many and morphs :- Forms 

       //Ability of an object to behave differently.

       //Methods :- ex:- public void test(){//body of the method(functionality)}

       //Method Name with arguments,return type and modifiers

       //two types :- compile time(static Binding/overloading) and Run time(Dynamic Binding/overriding)

       //compile time :- object bound with their functionality at the compile time

       //Runtime :- object is bound with their functonality at the Runtime
       
  
      // compile time example :- M1(int 1),M1(double d),M1(3.5) to double method call ho jayega 
      // and M1(3) to int vala method call ho jayega isliye isko complie time polymorphism bolte hai.

      // Run time example :- parent M1() , Child M1() run time pate chlege kon pahele excute hoga.

      
    }