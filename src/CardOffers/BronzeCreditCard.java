package CardOffers;

import Offer.OfferVisitor;

public class BronzeCreditCard implements  CreditCard{

    public String getName() {
        return "Bronze Credit Card";
    }

    public void accept(OfferVisitor v, double cost){
        v.visit(this, cost);
    }

}
