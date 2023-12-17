package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        String message;
        int caseNumber, multiplicationResult;
        float divisionResult;

        divisionResult = (float) dividend / divider;
        multiplicationResult = (int)divisionResult * divider;

        caseNumber = divider == 0? 0:
                (dividend == multiplicationResult)? 1 : 2;

        switch (caseNumber){
            case(1):
                message = "can be divided completely";
                break;
            case (2):
                message = "cannot be divided completely";
                break;
            default:
                message = "division by zero";
                break;
        }

        System.out.println(message);
    }
}
