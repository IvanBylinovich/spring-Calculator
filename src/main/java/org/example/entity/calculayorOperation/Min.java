package org.example.entity.calculayorOperation;

import org.example.util.ConsoleWriter;
import org.example.util.ConsoleReader;
import org.springframework.stereotype.Component;

@Component
public class Min implements Operation {
    int a, b, result;

    @Override
    public void calc() {
        ConsoleWriter.messageWriter("Enter num1" );
        a = ConsoleReader.readNum();
        ConsoleWriter.messageWriter("Enter num2" );
        b = ConsoleReader.readNum();
        result = a - b;
        ConsoleWriter.messageWriter("Result " + result);
    }

    @Override
    public String toString() {
        return "Div{" +
                "a=" + a +
                ", b=" + b +
                ", result=" + result +
                '}';
    }
}
