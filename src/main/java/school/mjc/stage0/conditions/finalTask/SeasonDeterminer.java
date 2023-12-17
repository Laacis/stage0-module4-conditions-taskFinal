package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String seasonName;

        switch (monthNumber) {
            case (1):
            case (2):
            case (12):
                seasonName = "Winter";
                break;
            case (3):
            case (4):
            case (5):
                seasonName = "Spring";
                break;
            case (6):
            case (7):
            case (8):
                seasonName = "Summer";
                break;
            case (9):
            case (10):
            case (11):
                seasonName = "Autumn";
                break;
            default:
                seasonName = "Wrong month number";
                break;
        }

        System.out.println(seasonName);
    }
}
