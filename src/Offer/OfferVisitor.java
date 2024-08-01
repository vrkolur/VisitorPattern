package Offer;

import CardOffers.BronzeCreditCard;
import CardOffers.GoldCreditCard;
import CardOffers.PlatinumCreditCard;
import CardOffers.SilverCreditCard;

public interface OfferVisitor {
    void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard, double cost);
    void visitSilverCreditCard(SilverCreditCard silverCreditCard, double cost);
    void visitGoldCreditCard(GoldCreditCard goldCreditCard, double cost);
    void visitPlatinumCreditCard(PlatinumCreditCard platinumCreditCard, double cost);
}
