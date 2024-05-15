public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int bonusMileCost = 20;
        return ticketPrice / bonusMileCost;
    }
}
