package org.example.entity;

import org.example.DAO.InMemoryOperationDAO;
import org.example.DAO.OperationDAO;
import org.example.Service.HistoryService;
import org.example.entity.calculayorOperation.*;
import org.example.util.MenuMessage;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Calculator {
    Scanner scanner = new Scanner(System.in);
    boolean isStarted = true;

    public Operation userChoice(){
        switch (scanner.nextInt()){
            case 1: return new Sum();
            case 2: return  new Min();
            case 3: return  new Mul();
            case 4: return  new Div();
            case 5:
                HistoryService historyService = new HistoryService();
                historyService.showHistory();
                run();
                break;

            case 0:  isStarted = false;
        }
        return null;

    }


    public void run(){
        while (isStarted){
            MenuMessage.showMenu();
            Operation operation = userChoice();
            OperationDAO operationDAO = new InMemoryOperationDAO();
            operationDAO.saveOperation(operation);
            if(isStarted == false) {
                MenuMessage.showExitMessage();
                break;
            }
            operation.calc();
        }
    }
}

