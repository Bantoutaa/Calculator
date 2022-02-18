public class Main {
    public static void main(String[] args) {
        Calculator c =new Calculator("Sherifa");
        double x;
        int intTotal;
        //Math.floor() returns the largest integer less than or equal to a given number (ex: Math.floor(325.564783) = 325.0)
        //since Math.random() returns a number between 0 to less than 1 we will scale it to our desire
        //multiplied the random number by 1000 then dividing it by 100 will give us a range of [0-10]
        double num1=(Math.floor(Math.random() * 1000) ) / 100;
        double num2=(Math.floor(Math.random() * 1000) ) / 100;

        x= c.addTwoNumbers(num1, num2);
        System.out.println("Addition of the two random numbers "+ num1+" and " +num2+" is: "+x);

        num1=(Math.floor(Math.random() * 1000) ) / 100;
        num2=(Math.floor(Math.random() * 1000) ) / 100;

        x=c.subtractTwoNumbers(num1, num2);
        System.out.println("Subtraction of the two random numbers "+ num1+" and " +num2+" is: "+x);

        num1=(Math.floor(Math.random() * 1000) ) / 100;
        num2=(Math.floor(Math.random() * 1000) ) / 100;

        x=c.multiplyTwoNumbers(num1, num2);
        System.out.println("Multiplication of the two random numbers "+ num1+" and " +num2+" is: "+x);


        num1=(Math.floor(Math.random() * 1000) ) / 100;
        num2=(Math.floor(Math.random() * 1000) ) / 100;

        x=c.divideTwoNumbers(num1, num2);
        System.out.println("Division of the two random numbers "+ num1+" and " +num2+" is: "+x);

        //just a separator for the output to look pleasant
        System.out.println("----------------------------------------------");

        intTotal=(int) (c.getRunningTotal()*10);

        //if condition to check if the intTotal is even or odd
        if (c.checkIsEven(intTotal))
            System.out.println(intTotal+" is even");
        else
            System.out.println(intTotal+" is odd");

        //just a separator for the output to look pleasant
        System.out.println("----------------------------------------------");


        System.out.println(c.getCurrentStatus());






    }











}

