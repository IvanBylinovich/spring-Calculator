package org.example.entity;

import org.example.entity.calculayorOperation.*;
import org.example.util.MenuMessage;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Calculator {
    Scanner scanner = new Scanner(System.in);
    boolean isStarted = true;

    public Operation operation(){
        switch (scanner.nextInt()){
            case 1: return new Sum();
            case 2: return  new Min();
            case 3: return  new Mul();
            case 4: return  new Div();
            case 0:  isStarted = false;
        }
        return null;

    }


    public void run(){
        while (isStarted){
            MenuMessage.showMenu();
            Operation operation = operation();
            if(isStarted == false) {
                MenuMessage.showExitMessage();
                break;
            }
            operation.calc();
        }
    }
}

