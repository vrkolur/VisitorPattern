package Offer;

import CardOffers.BronzeCreditCard;
import CardOffers.GoldCreditCard;
import CardOffers.PlatinumCreditCard;
import CardOffers.SilverCreditCard;

public class GasOfferVisitor implements OfferVisitor {
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
        System.out.println("Bronze Card Gas price");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
        System.out.println("Silver Card Gas price");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
        System.out.println("Gold Card Gas price");
    }

    @Override
    public void visitPlatinumCreditCard(PlatinumCreditCard platinumCreditCard) {
        System.out.println("Platinum Card Gas price");
    }
}