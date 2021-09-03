package com.camelot.dddcommons.interfaces;


import com.camelot.dddcommons.baseclasses.AggregateRoot;

@FunctionalInterface
public interface ISelector {

    public <T> T select(AggregateRoot aggregateRoot);
}
