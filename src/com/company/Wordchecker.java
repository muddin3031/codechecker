package com.company;



public class CodeWordChecker implements Stringchecker {
    private int min;
    private int max;
    private String sym;
    public CodeWordChecker(int min, int max, String sym)
    {
        this.min = min;
        this.max = max;
        this.sym = sym;
    }

    public CodeWordChecker(String sym )
    {
        this.sym = sym;
    }

    public boolean isValid(String str)
    {
        if((str.length() < min) || (str.length() > max) || (str.contains(sym)))
        {
            return false;
        }
        else
        {
            return true;
        }
    }


}
