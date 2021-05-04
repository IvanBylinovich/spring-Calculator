package org.example.entity.calculayorOperation;

import org.example.util.ConsoleWriter;
import org.example.util.ConsoleReader;
import org.springframework.stereotype.Component;

@Component
public class Sum implements Operation {
    @Override
    public void calc() {
        ConsoleWriter.messageWriter("Enter num1" );
        int a = ConsoleReader.readNum();
        ConsoleWriter.messageWriter("Enter num2" );
        int b = ConsoleReader.readNum();
        int result = a + b;
        ConsoleWriter.messageWriter("Result " + result);
    }
}
