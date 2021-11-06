package demoViolatesPrinciple;

public class Main {

    public static void main(String [] args){

        Broadband broadbandPlan;
        BillManagement billManagement;

        broadbandPlan = new DslBroadband("LOW_SPEED", 4);
        broadbandPlan.getSubscription("DSL");
        broadbandPlan.getBroadbandCost(broadbandPlan);
        DebitCard debitCard=new DebitCard();
        //CreditCard creditCard=new CreditCard();
        billManagement=new BillManagement(debitCard);
        billManagement.billPayment(broadbandPlan.cost);

        //BillManagement billManagement=new BillManagement()


        broadbandPlan = new CableModemBroadband("LOW_SPEED",6);
        broadbandPlan.getSubscription("CableModem");
        broadbandPlan.getBroadbandCost(broadbandPlan);
        //DebitCard debitCard=new DebitCard();
        CreditCard creditCard=new CreditCard();
        double setTopBoxCost = broadbandPlan.getSetTopBoxCost();
        billManagement=new BillManagement(debitCard);
        billManagement.billPayment(broadbandPlan.cost+setTopBoxCost);


    }
}
