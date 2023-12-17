package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        String message;
        boolean isValidTriangle = firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide;

        message = (isValidTriangle) ? "this is a valid triangle": "it's not a triangle";

        System.out.println(message);
    }
}
