package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //prints true if a given array is a palindrome
        int[] x = {3,4,4,3};
        System.out.println (equal (x, reverse(x)));
    }

    static int[] reverse (int[] a)
    {
        //reverses array a, returns new reversed array b.
        int[] b = new int [a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[a.length - 1 - i];
        return b;
    }

    static boolean equal (int[] a, int[] b)
    {
        //returns true if arrays a and b are the same (each element and length)
        boolean same = false;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == b[i] && a.length == b.length)
                same = true;
            else
                same = false;
        }
        return same;
    }
}
