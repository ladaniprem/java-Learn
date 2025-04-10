package thread;

public class test{
    
    public static void main(String[] args) {
            counter c1 = new counter();
            myThread t1 = new myThread(c1);
            myThread t2 = new myThread(c1);
            t1.start();
            t2.start();
            
            try {
                t1.join();
                t2.join();
            }
            catch(Exception e) {
                System.out.println(e);
            }
            
            System.out.println(c1.getcount());
        }
    }
// public static Runnable world;
    
//         public static void main(String[] args) {
//              //called as the main theard 
//             // //jab bhi create karte ho to automaticaly call ho jata hai .
//             // System.out.println(Thread.currentThread().getName());
//             // System.out.println("hello world ");
//             world w = new world(); //NEW :- when the thread is created but not yet started.
//             Thread t1 = new Thread(world); //RUNNABLE :- after the start method called ,thread become runnable and ready to run but wait for the cpu time . 
//         t1.start();
//         // w.start();
//         for(;;){
//             System.out.println(Thread.currentThread().getName());
//         }
//         // for( ; ;){
//         // System.out.print(Thread.currentThread().getName());
        
//         // for(int i=0;i<1000;i++){
//             // System.out.println("hello");
//         }
//     }
// }
// }



        