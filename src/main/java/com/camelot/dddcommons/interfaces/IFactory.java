package com.camelot.dddcommons.interfaces;


import com.camelot.dddcommons.baseclasses.AggregateRoot;
import com.camelot.dddcommons.baseclasses.EntityId;

public interface IFactory<T extends AggregateRoot, U extends EntityId> {

    T create(Object param);
}
