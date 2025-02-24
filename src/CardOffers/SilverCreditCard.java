package CardOffers;

import Offer.OfferVisitor;

public class SilverCreditCard implements CreditCard{

    public String getName() {
        return "Silver Credit Card";
    }

    public void accept(OfferVisitor v, double cost) {
        v.visit(this, cost);
    }
}
