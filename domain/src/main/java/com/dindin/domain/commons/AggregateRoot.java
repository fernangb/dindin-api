package com.dindin.domain.commons;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID> {
    protected AggregateRoot(final ID id){
        super(id);
    }
}
