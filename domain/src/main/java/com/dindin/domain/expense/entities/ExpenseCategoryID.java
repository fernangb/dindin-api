package com.dindin.domain.expense.entities;

import com.dindin.domain.commons.Identifier;

import java.util.Objects;
import java.util.UUID;

public class ExpenseCategoryID extends Identifier {
    private final String value;

    private ExpenseCategoryID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static ExpenseCategoryID unique(){
        return ExpenseCategoryID.from(UUID.randomUUID());
    }

    public static ExpenseCategoryID from(final String id){
        return new ExpenseCategoryID(id);
    }

    public static ExpenseCategoryID from(final UUID id){
        return new ExpenseCategoryID(id.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ExpenseCategoryID that = (ExpenseCategoryID) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
