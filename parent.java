public class parent {

   //overriden method 
/*public void m1(){
    System.out.println("I am m1() of parent");
}*/
}

//prayority order :- public>protected>default>private

class child extends parent{

     // overriding method 
     //co-varient return type are allowed
    public A m1(){
        System.out.println("I am m1 of Child ");
        return new A();
    }
        
}
    class A {
    
        
    }
    class B extends A{
        public class parent{
            public B m1(){
                System.out.println("I am m1() of parent");
                return new B();
            }
        }
    }

    

