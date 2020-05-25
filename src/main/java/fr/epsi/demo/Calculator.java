package fr.epsi.demo;

public class Calculator {

    public static  int calculate(int a, int b, String operator)
    throws UnknownOperatorException {
       int ret = 0;
       switch(operator){
           case "+":
               ret = a+b;
           case "-":
               ret = a-b;
               break;
           case "*":
               ret = a*b;
               break;
           case "/":
               ret = a/b;
               break;
       }
       return ret;
    }
}
