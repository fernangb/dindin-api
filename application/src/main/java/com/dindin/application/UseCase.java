package com.dindin.application;


import com.dindin.domain.expense.aggregates.Expense;

public class UseCase {
    public Expense execute(){
        return new Expense();
    }
}