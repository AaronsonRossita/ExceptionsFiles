package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws MyException,Exception {

        int[] arr1 = {0,1,2,3,4,5,6};
        String[] arr2 = {"abc","def","ghi"};
        int a = 5;
        int b = 6;
        int c = 0;

        String path = "/Users/aaronsonrossita/Desktop/Test/myFile.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write("Rossita b\n");
        bw.write("76i878\n");
        bw.write("jdausfajhf");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(path));
//        String line = br.readLine();
        int ch = br.read();
        while (ch != -1){
            System.out.print((char)ch);
            ch = br.read();
        }
        br.close();

//        System.out.println(line);

//        File file = new File(path);
//        file.delete();
//        try{
//            int x = scanner.nextInt();
//        }catch(Exception ex){
//            System.out.println(ex);
//        }
//
//        try{
//            int x = scanner.nextInt();
//        }catch (InputMismatchException input){
//            System.out.println("wrong type");
//            //System.out.println(input.getMessage());
//        }catch (Exception ex){
//            System.out.println("something else wrong " + ex.getMessage());
//        }
//
//        try {
//            System.out.println(arr1[1]/arr1[0]);
//        }catch (ArithmeticException ex1){
//            System.out.println("ex1 = " + ex1);
//        }catch(ArrayIndexOutOfBoundsException ex2){
//            System.out.println("ex2 = " + ex2);
//        }catch (Exception ex3){
//            System.out.println("ex3 = " + ex3);
//        }
//
//        try{
//            System.out.println(a/b);
//            try{
//                System.out.println(b/a);
//            }catch (Exception ex){
//                System.out.println("nested exception");
//                c = 1;
//            }
//        }catch (Exception ex){
//            System.out.println("out exception");
//            b = 1;
//        }finally {
//            System.out.println("I happen either way");
//        }
//
//        System.out.println("abc");
//
//        div(7,0);
//        check(6);

    }

    static void div(int a, int b) throws Exception{
        if (b == 0){
            throw new Exception("can't divide by zero");
        }
        System.out.println(a/b);
    }

    static void check(int x) throws MyException{
        if (x > 5){
            throw new MyException("x is larger than 5");
        }else{
            System.out.println("x is smaller than 5");
        }
    }

}

class MyException extends Exception{

    MyException(String message){
        super(message);
    }
}