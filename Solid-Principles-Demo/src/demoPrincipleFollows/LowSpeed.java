package demoPrincipleFollows;

public class LowSpeed implements BroadbandCost{
    public double getCalculatedCost(Broadband plan)
    {
        return plan.durationInMonths * 250;
    }
}
