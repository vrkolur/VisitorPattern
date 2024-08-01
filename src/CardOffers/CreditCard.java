package CardOffers;

import Offer.OfferVisitor;

public interface CreditCard {
    String getName();
    void accept(OfferVisitor v);

}
