package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Boolean valid = false;

        while (valid == false) {

            try {
                System.out.println("Type in a number");
                int num = input.nextInt();

                System.out.println(10/num);
                valid = true;
            }
            catch (InputMismatchException error) {
                System.out.println("number to long "+error);
                input.next();
            }
            catch (ArithmeticException error) {
                System.out.println("you should not divide a number by 0 "+error);
                input.next();
            }
            catch (Exception error) {
                System.out.println("Exception occurred "+error);
                input.next();
            }
        }
        int a[] = new int[2];
        try{
            System.out.println("access element three :"+ a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :"+e);
        }
        finally {
            a[0] = 6;
            System.out.println("first element value: "+a[0]);
            System.out.println("the finally statement is executed");

        }
    }
}
