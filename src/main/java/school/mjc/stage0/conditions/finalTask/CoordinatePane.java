package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        int switchCase;
        String message;

        if(x>0 & y>0){
            switchCase = 1;
        } else if (x>0 & y<0) {
            switchCase = 4;
        } else if (x<0 & y<0) {
            switchCase = 3;
        } else if (x<0 & y>0) {
            switchCase = 2;
        }else{
            switchCase = 0;
        }

        switch (switchCase){
            case(1):
                message = "first";
                break;
            case(2):
                message = "second";
                break;
            case(3):
                message = "third";
                break;
            case(4):
                message = "fourth";
                break;
            default:
                message = "zero";
                break;
        }

        System.out.println(message);
    }
}
