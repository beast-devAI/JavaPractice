package com.qa.intermediate;

public class ExceptionHandlingDemo {

    static String str;

    public static void main(String[] args) {

        System.out.println("Inside main before the m1() call");

        m1(0);

        System.out.println("Inside main after the m1() call");

    }

    public static void m1(int i) {

        int c;
        int[] arr = new int[4];

        System.out.println("Inside m1() before the try block");

        try {

            System.out.println("Within try block, before risky code");

            /* Risky code here due to divisibility by zero, causing Arithmetic Exception */

            c = 100 / i;

            /* any operation on null reference, causing NullPointerException */

            // str.toLowerCase();

            /* Accessing array index which is out of bound (array size), causing ArrayIndexOutOfBoundException */

            // arr[5]=10;

            System.out.println("Within try block, after risky code");
        }

        // System.out.println("Immediate after try block,but before the catch block");

        /* All below 'e' references are local to corresponding catch block,
        we can take any identifier there, no restrictions at all */ catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception catch block");

        } catch (NullPointerException e) {

            System.out.println("Null pointer Exception catch block");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index out of bound Exception catch block");


        } catch (Exception e) {

            System.out.println("Exception class catch block");


        } catch (Throwable e) {

            System.out.println("Throwable class catch block");


        }


    }


}
