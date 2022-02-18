public class Calculator {
    //stores the name of the user
    private String Username;
    //stores a decimal representation of a number
    private double runningTotal=0;

    //constructor for the class that initialises the username field using the parameter username public String getUserName()
    public Calculator(String username) {
        Username = username;
    }


    public String getUsername() {
        return Username;
    }


    public void setUsername(String username) {
        Username = username;
    }


    public double getRunningTotal() {
        return runningTotal;
    }


    public void setRunningTotal(double runningTotal) {
        this.runningTotal = runningTotal;
    }

    // increases runningTotal by the result of num1 + num2 and returns the result of the sum
    public double addTwoNumbers(double num1,double num2) {
        runningTotal=runningTotal+(num1+num2);
        return num1+num2;
    }
    //increases runningTotal by the result of num1 - num2 and returns the result of the sum
    public double subtractTwoNumbers(double num1,double num2) {
        runningTotal=runningTotal+(num1-num2);
        return num1-num2;
    }
    //increases runningTotal by the result of num1 * num2 and returns the result of the sum
    public double multiplyTwoNumbers(double num1,double num2) {
        runningTotal=runningTotal+(num1*num2);
        return num1*num2;
    }
    //increases runningTotal by the result of num1 / num2 and returns the result of the sum.
    public double divideTwoNumbers(double num1,double num2) {
        runningTotal=runningTotal+(num1/num2);
        return num1/num2;
    }
    //determines if checkNum is currently even
    //checkNum modules 2 is always = 0 when the number is even
    public boolean checkIsEven(int checkNum) {
        boolean flag;
        if(checkNum % 2 == 0)
            return flag=true;
        else
            return flag=false;
    }
    //returns a String in the following format "username running total is runningTotal" but show the actual values stores in username and runningTotal in the String
    public String getCurrentStatus() {

        return Username + "'s running Total is: " + runningTotal;
    }

}
