package com.example.demo.basicDocJava.knowledge.String;

import java.util.Arrays;

public class StringFunctionsClass {
    // for this class
    // we will create some demos for string
    // also we can test some case
    public static void main(String[] args) {
        String name = "javascript";
        char ch = name.charAt(4);
        // System.out.println(this.getCompareTo());
    }

    public int getCharAt() {
        String name = "javascript";
        return name.charAt(4);
    }

    /**
     * The Java String class compareTo() method compares the given string with the current string lexicographically.
     * It returns a positive number, negative number, or 0.
     * It compares strings on the basis of the Unicode value of each character in the strings.
     * If the first string is lexicographically greater than the second string, it returns a positive number (difference of character value).
     * If the first string is less than the second string lexicographically, it returns a negative number,
     * and if the first string is lexicographically equal to the second string, it returns 0.
     */
    public int getCompareTo() {
        String name = "age";
        String nick = "arthur";
        return name.compareTo(nick);
    }

    /**
     * The Java String class concat() method combines specified string at the end of this string.
     * It returns a combined string. It is like appending another string
     */
    public void getConcat() {

    }
    public String concat(String str) {
        int otherLen = str.length();
        if (otherLen == 0) {
            return this;
        }
        int len = value.length;
        char[] buf = Arrays.copyOf(value, len + otherLen);
        str.getChars(buf, len);
        return new String(buf, true);
    }

}
