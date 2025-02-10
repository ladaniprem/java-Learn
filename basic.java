//class Basic {
public class basic{

    public static void main(String arr[]){
/* 
        //hello world
         System.out.print("hello world");
         System.out.print("ladani prem");

           //variables
         int a =20;
         
         System.out.println(a);
         a = 30;
         System.out.println(a);

          //name 
         string name ="prem";
         System.out.println(name);

          //type converstion
         int b =30;
         double d =b;
         System.out.println(b);
         System.out.println(d);

         double myval = 40.33;//double se int direct auto(implicit type casting)(forceful) conversion possible nahi hai
         int myint =myval;//jo value loss hogi to forceful(explicit type casting) conversation nahitar to auto
         System.out.println(myval);
         System.out.println(myint);
    
       // java operators :- in java is a symbol that is used to perform the operation 
       //serach it google for more opeators
        x+=50;
        x = x+50;
        System.out.println(x);

        //x+y;//assignment 
        //x++ unary postfix
        //++x unary prefix

        */
/* 
        //If statement
      
       int v =70;//int v =-80; negative value and excute the else statement  

       if(v>0){
        System.out.println("it is :yes");
       }
       else{
        System.out.println("No it is not");
       }
*/
/* 
       //ladder if

       if(cond1){
        //block 1
       }
       else if(cond 2){
         //block 2
       }
       else {
        //block 3
       }
   

   int s=10;

   if(s>90){
    System.out.println("grade A");
   }
   else if(s>80&&s<=90){
    System.out.println("grade B");
   }
   else{
    System.out.println("fail");
   }
*/

/* 
   //nested if 
      int n=150;
      if (n>0) {
        if (n%2==0) {
          System.out.println("it is odd and grater than zero:");
        }
      }
      //jo one line if ho to bracket likne ki jorut nahi hai
      if (true) 
        System.out.println("true");
      */

      //switch statement
/* 
      switch (values) {
        case value:
          
          break;
      
        default:
      }  
        string day ="mon";
        switch (day) {
          case "mon":
          {
            System.out.println("it is monday");
            break;
          }
            case "tue":
            {
            System.out.println("it is tuesday");
            break;
            }
            case "wed":{
            System.out.println("it is wednesday");
            break;
            }
          default:
          {
          System.out.println("no days");
          }
        }
           */
         
           //loops :for the statement repeating n number of times
             
           //For :- 1.start :intialization,2.end:termination cond,3.steps:jumps/inc./dec.
/* 
           for(int i=0;i<5;i++){
               //body(statements)
           }

           //while :-entry control loop

           while(condition/exp){
            //statement
           }
          //do while :- exit control loop

          do{
            //statements
          }while(condition);//semicolen must

        //For-Each loops : for arrays

        int arrays[];
           for(int x:array){
              //statement(x);
           }
*/
/* 
     for(int i=1;i<=10;i=i+2){
      System.out.println(i+"");
     }
      */
      /* 
      int j =10;
      while (j<=20) {
        System.out.println(j);
        j++;
      }
        */
        /* 
        int nums[]={12,13,14,15};
        for(int x:nums){
          System.out.println(x);
        }
*/
/* 
int nums[] ={10,11,12,13};
int d = 0;
 for(int x : nums){
   d = d+x;
 }
 System.out.println("sum of the array:"+d);
*/

//break and continue
//break :-loops termination on specified condition 
//continue:-continue loop with next iteration

/*for(int i=1;i<=20;i++){
  System.out.println(i);
if (i==10) {
  break;
}
}
*/
/* 
for(int i=1;i<=20;i++){
  System.out.println(i);
  if (i==10) {
    continue;
  }
  if (i==15) {
    break;
  }
}
 */
    }
}
