public class BonusMilesService {

    public static int calculate(int ticketPrice) {
        int bonusMileCost = 20;
        return ticketPrice / bonusMileCost;
    }
}
