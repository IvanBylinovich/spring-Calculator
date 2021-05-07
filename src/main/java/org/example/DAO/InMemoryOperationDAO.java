package org.example.DAO;

import org.example.entity.calculayorOperation.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryOperationDAO implements OperationDAO {
    public static List<Operation> operations = new ArrayList<>();

    @Override
    public void saveOperation(Operation operation) {
        operations.add(operation);
    }

    public static List<Operation> getOperations() {
        return operations;
    }
}
