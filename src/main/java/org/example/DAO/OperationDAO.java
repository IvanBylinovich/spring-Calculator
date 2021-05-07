package org.example.DAO;

import org.example.entity.calculayorOperation.Operation;
import org.springframework.stereotype.Component;


public interface OperationDAO {
    public void saveOperation(Operation operation);

}
