package CardOffers;

import Offer.OfferVisitor;

public class PlatinumCreditCard implements CreditCard{

    public String getName() {
        return "Platinum Credit Card";
    }

    public void accept(OfferVisitor v, double cost) {
        v.visit(this, cost);
    }
}
