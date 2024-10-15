package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Test", (text) -> "**" + text + "**"));
        System.out.println(poemBeautifier.beautify("Koding", (text) -> "{ " + text + " }"));
        System.out.println(poemBeautifier.beautify("Course", (text) -> "======== " + text + " ========"));

    }
}