/**
 * Java program to create Stream with the same 11 elements using generate() method.
 */


package com.mystreams;

import java.util.stream.Stream;

// Main class.
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a stream of float numbers.
        Stream<Float> myStream = Stream.generate(() -> 21F).limit(11);

        // Printing mzStream to console.
        myStream.forEach(System.out::println);

    }
}