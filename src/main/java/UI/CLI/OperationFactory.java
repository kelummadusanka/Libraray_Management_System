package UI.CLI;

import UI.CLI.Operations.addNewBookOperation;

public class OperationFactory {

    public static Operation createOperation(int CommandNo){
        switch (CommandNo){
            case 1:
                return new addNewBookOperation();
            default:
                throw new IllegalArgumentException("Enter valid Number!");

        }
    }

}
