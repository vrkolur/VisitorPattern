package Offer;

import CardOffers.BronzeCreditCard;
import CardOffers.GoldCreditCard;
import CardOffers.PlatinumCreditCard;
import CardOffers.SilverCreditCard;

public interface OfferVisitor {
    void visit(BronzeCreditCard bronzeCreditCard, double cost);

    void visit(SilverCreditCard silverCreditCard, double cost);

    void visit(GoldCreditCard goldCreditCard, double cost);

    void visit(PlatinumCreditCard platinumCreditCard, double cost);
}
