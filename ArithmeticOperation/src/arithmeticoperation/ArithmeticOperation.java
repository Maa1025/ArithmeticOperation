package arithmeticoperation;
//libarary
import java.util.Scanner;
//class name/
public class ArithmeticOperation {

    public static void main(String[] args) {
        
        //Declare variable
        double Num1;
        double Num2;
        String operator;
        Scanner myNum = new Scanner(System.in);
        try{
        //Input for choose Operator
        System.out.println("Choose your preferred operator.\nType +, -, x OR /");
        operator = myNum.nextLine();
        
        //Input for first integer
        System.out.println("Enter first integer");
        Num1 = myNum.nextInt();
        
        //Input for seconde integer
        System.out.println("Enter second integer");
        Num2 = myNum.nextInt();
        myNum.close();
        

        //Formula for Operator
        double add = Num1 + Num2;
        double sub = Num1 - Num2;
        double multiply = Num1 * Num2;
        double divide = Num1 / Num2;
        double modulos = Num1 % Num2;
        
        //Display the answer
        switch(operator){
            case "+":
                System.out.println("Your answer is : " +add);break;
            case "-":
                System.out.println("Your answer is : " +sub);break;
            case "x":
                System.out.println("Your answer is : " +multiply);break;
            case "/":
                System.out.println("Your answer is : " +divide);break;
        }
        }
        catch(Exception ae)
                {System.out.println("attempt to drive by 0");}
        System.out.println("after catch");
        }
        

    }
