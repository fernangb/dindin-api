package com.dindin.infrastructure;


import com.dindin.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(new UseCase().execute());
    }
}