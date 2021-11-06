package demoPrincipleFollows;

public class Main {

    public static void main(String [] args){

        Subscriber subscription = new Subscriber();

        /* //FOR DSL BROADBAND IMPLEMENT BELOW CODE

        //Broadband reference with DSLBroadband object
        Broadband broadband = subscription.getBroadbandTypeObject("DSL","LOW_SPEED",6);
        BroadbandCost speed=new LowSpeed();
        //speed=new HighSpeed();
        broadband.getBroadbandCost(speed,broadband);
        PaymentMethod paymentMethod=new DebitCard();
        //PaymentMethod paymentMethod=new CreditCard();
        BillManagement billManagement=new BillManagement(paymentMethod);
        billManagement.billPayment(broadband.cost);

        // */

         // FOR CABLEMODEM BROADBAND IMPLEMENT BELOW CODE

        //Broadband reference with CableModem object
        Broadband broadband =  subscription.getBroadbandTypeObject("CableModem","LOW_SPEED",6);
        BroadbandCost speed=new LowSpeed();
        //speed=new HighSpeed();
        broadband.getBroadbandCost(speed,broadband);
        CableModemBroadband cmb= (CableModemBroadband) broadband;
        double setTopBoxCost = cmb.getSetTopBoxCost();
        PaymentMethod paymentMethod=new DebitCard();
        //PaymentMethod paymentMethod=new CreditCard();
        BillManagement billManagement=new BillManagement(paymentMethod);
        billManagement.billPayment(broadband.cost+setTopBoxCost);

        //*/



        // for CableModem Broadband

//        BroadbandPlan newBroadBandConnection2 = new BroadbandPlan();
//        newBroadBandConnection2.setSpeed("HIGH_SPEED");
//        newBroadBandConnection2.setDurationInMonths(6);
//
//
//        Subscriber subscription2 = new Subscriber();
//        BroadbandPlan broadbandPlan2 =  subscription2.getBroadbandTypeObject("CableModem");
//
//        broadbandPlan2.getBroadbandCost(newBroadBandConnection2);
//
//        CableModemBroadband cableModemBroadband = new CableModemBroadband();
//        cableModemBroadband.getSetTopBoxCost();


    }
}
