package com.dindin.domain.expense;

import com.dindin.domain.expense.aggregates.ExpenseCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpenseCategoryTest {
    @Test
    public void createExpenseCategory(){
        final var name = "Casa";
        final var isActive = true;

        final var category = ExpenseCategory.newExpenseCategory(name, isActive);

        Assertions.assertNotNull(category);
        Assertions.assertNotNull(category.getId());
        Assertions.assertEquals(name, category.getName());
        Assertions.assertEquals(isActive, category.getIsActive());
        Assertions.assertNotNull(category.getCreatedAt());
        Assertions.assertNotNull(category.getUpdatedAt());

    }
}
