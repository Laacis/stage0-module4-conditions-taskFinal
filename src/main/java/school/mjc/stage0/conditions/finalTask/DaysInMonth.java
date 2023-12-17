package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        String message;
        boolean isYearLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        switch (month){
            case(2):
                if(isYearLeap){
                    message = "29";
                }else{
                    message = "28";
                }
                break;
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                message = "31";
                break;
            case(4):
            case(6):
            case(9):
            case(11):
                message = "30";
                break;
            default:
                message = "invalid date";
                break;
        }

        System.out.println(message);
    }
}
