package com.store;

public class Store<T, U> {
    private T value;
    private U code;

    public Store(){}
    public Store(T value){
        this.value = value;
    }

    public void SetValue(T value){
        this.value = value;
    }

    public T GetValue() {
        return value;
    }
}

interface IAccumulable<T>{
    void Add(T diff);
    T Get();
}

class AccAll<T> implements IAccumulable<T>{

    @Override
    public void Add(T diff) {

    }

    @Override
    public T Get() {
        return null;
    }
}



class AccInt implements IAccumulable<Integer>{

    @Override
    public void Add(Integer diff) {

    }

    @Override
    public Integer Get() {
        return null;
    }
}
