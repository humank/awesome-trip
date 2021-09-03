package com.camelot.dddcommons.interfaces;

public interface ITranslator<O, I> {

    O translate(I transRequest);
}
