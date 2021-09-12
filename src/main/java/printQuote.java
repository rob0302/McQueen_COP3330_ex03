/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */


import java.util.*;
public class printQuote {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
    System.out.print("What is the quote? ");
        String quote = string.nextLine();
    System.out.print("Who said it? ");
    String author = name.nextLine();

    System.out.print(author+" says, "+ "\" " +quote+ " \"");




}
}
