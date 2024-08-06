package CardOffers;

import Offer.OfferVisitor;

public class GoldCreditCard implements CreditCard{

    public String getName(){
        return "Gold Credit Card";
    }

    public void accept(OfferVisitor v, double cost){
        v.visit(this, cost);
    }
}
