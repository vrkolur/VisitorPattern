package Offer;

import CardOffers.BronzeCreditCard;
import CardOffers.GoldCreditCard;
import CardOffers.PlatinumCreditCard;
import CardOffers.SilverCreditCard;

public interface OfferVisitor {
    void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard);
    void visitSilverCreditCard(SilverCreditCard silverCreditCard);
    void visitGoldCreditCard(GoldCreditCard goldCreditCard);
    void visitPlatinumCreditCard(PlatinumCreditCard platinumCreditCard);
}
