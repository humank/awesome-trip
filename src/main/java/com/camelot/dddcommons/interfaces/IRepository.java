package com.camelot.dddcommons.interfaces;


import com.camelot.dddcommons.baseclasses.AggregateRoot;
import com.camelot.dddcommons.baseclasses.EntityId;
import com.camelot.dddcommons.baseclasses.Specification;

import java.util.List;

public interface IRepository<T extends AggregateRoot, U extends EntityId> {


    List<T> all();

    T get(U entityId);

    /**
     * Just pass a functional interface, leave the most wide dev freedom for builder.
     * pros: leave the most freedom.
     * cons: lack of type constraints from FunctionalInterface
     */
    T get(FunctionalInterface func, Specification<U> by);

    T get(ISelector selector, Specification<U> by);

    T first(ISelector selector, Specification<U> by);

    boolean any(Specification<T> by);

    long count(Specification<T> by);

    void create(T aggregateRoot);

    int update(T aggregateRoot);

    void remove(T aggregateRoot);


}
