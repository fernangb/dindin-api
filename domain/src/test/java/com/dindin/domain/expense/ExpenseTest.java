package com.dindin.domain.expense;

import com.dindin.domain.expense.aggregates.Expense;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpenseTest {
    @Test
    public void testNewExpense(){
        Assertions.assertNotNull(new Expense());
    }
}
