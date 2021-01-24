package com.xworkz.pattern.eager;

public class SingletonExample {

    private static SingletonExample singletonInstance = 
                                             new SingletonExample();

    private SingletonExample() {
    }

   
    public static SingletonExample getSingletonInstance() {
        return singletonInstance;
    }
}
