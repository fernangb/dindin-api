package com.dindin.domain.expense.aggregates;

import com.dindin.domain.commons.AggregateRoot;
import com.dindin.domain.expense.entities.ExpenseCategoryID;

import java.time.Instant;
import java.util.UUID;

public class ExpenseCategory extends AggregateRoot<ExpenseCategoryID> {
    private String name;
    private boolean isActive;
    private Instant createdAt;
    private Instant updatedAt;

    private ExpenseCategory(
            final ExpenseCategoryID id,
            final String name,
            final boolean isActive,
            final Instant createdAt,
            final Instant updatedAt
    ) {
        super(id);
        this.name = name;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static ExpenseCategory newExpenseCategory(
            final String name,
            final boolean isActive
    ){
        final var id = ExpenseCategoryID.unique();
        final var now = Instant.now();

        return new ExpenseCategory(id, name, isActive, now, now);
    }

    public ExpenseCategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
