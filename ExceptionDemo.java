 // Main class
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("start..");

            // Check if two arguments are provided
            if (args.length < 2) {
                System.out.println("Please provide two numbers as arguments.");
                return;
            }

            // Parse command-line arguments
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("We got the two nums..");

            // Perform division
            int result = n1 / n2;
            System.out.println("Division is: " + result);

            // Check if the second number is less than 10
            if (n2 < 10) {
                throw new AgeInvalidException("My age was invalid");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (AgeInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("End of program.");
    }
}


       /*  try {
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            System.out.println("we got the two nums..");
            int result = n1/n2;
            System.out.println("division is"+result);    
        } catch (ArithmeticException e) {
            System.out.println("n2 can not be 0!!");
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
         System.out.println(e.getMessage());
         System.out.println("Invaild number:");
        }
        catch(Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage()); //robas program to this catch 
        }
        finally{
            System.out.println("I am in the finaly block");
            System.out.println("closing all the resources....");

        }
        System.out.println("Terminated...."); */
        
        /*
        C:\Prem\4rd sem\java For college (Real file)>javac exception.java

          C:\Prem\4rd sem\java For college (Real file)>java -cp "C:\Prem\4rd sem\java For college (Real file)" exception 20 0
           start..
           we got the two nums..
           n2 can not be 0!!
           / by zero
           Terminated....

           C:\Prem\4rd sem\java For college (Real file)>javac exception.java

   C:\Prem\4rd sem\java For college (Real file)>java -cp "C:\Prem\4rd sem\java For college (Real file)" exception 45 3
     start..
     we got the two nums..
     division is15
     I am in the finaly block
     closing all the resources....
     Terminated....

  C:\Prem\4rd sem\java For college (Real file)>java -cp "C:\Prem\4rd sem\java For college (Real file)" exception 234 ggv
           start..
           For input string: "ggv"
           Invaild number:
           I am in the finaly block
           closing all the resources....
           Terminated....
         */

    
  //  }
//}
//java exception heading :-

//expection hending :- story of Raja 1 and Raja 2 to between fight and raja 2 know about the planning and other stafs
//so, that was comile time .

//story of the raja 1 and raja 2 fight between raja unexapected moment to raja 1 to hendel it so, that was the Run time.

//unexapected moment to exception created and that moment to slove called as the exception hendling .

//some keywords use in exception hendling :- try,catch,finally,throw,throws etc.

//Run time error ko reprented as the class throwble(top class) class hai adn jitni throw able class hai 

//throwble class two parts exception class(jo programmer handle kar sakhta hai.) and error(jo programmer handle nahi kar sakhta) class hai

//exception class example :- Runtime exception ,I/O exception, etc.

//To find the google exception class huerachy in java 

// how to handle exception :-

//error askati hai to try block me store kar do.

//second name error prone statements
//simple way to try and catch to handle exception 
/*try{
    code ....10 //posibility error prone statements
}catch(TypeException e)
{
    //handing code..
}*/
//Arthmetic erro store karne show it Arthmetic exception handling class bana hi hai 

//arthemetic class ka jo object hoga vo sare error ko catch ke andar throw kar dega done ki condition match ho gay to catch vala block chal jayega.

