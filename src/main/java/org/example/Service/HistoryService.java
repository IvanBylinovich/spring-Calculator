package org.example.Service;

import org.example.DAO.InMemoryOperationDAO;
import org.example.entity.calculayorOperation.Operation;
import org.springframework.stereotype.Component;

@Component
public class HistoryService {
    InMemoryOperationDAO inMemoryOperationDAO = new InMemoryOperationDAO();

    public void showHistory(){
        for(Operation operation : inMemoryOperationDAO.getOperations() )
        System.out.println(operation);
    }
}
