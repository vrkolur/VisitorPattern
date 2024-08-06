package Offer;

import CardOffers.BronzeCreditCard;
import CardOffers.GoldCreditCard;
import CardOffers.PlatinumCreditCard;
import CardOffers.SilverCreditCard;

public class FoodOfferVisitor implements  OfferVisitor{

    @Override
    public void visit(BronzeCreditCard bronzeCreditCard, double cost) {
        double discounted_cost = cost-cost * 0.01;
        System.out.println("Bronze Card Food Price: " + discounted_cost);
    }

    @Override
    public void visit(SilverCreditCard silverCreditCard,double cost) {
        double discounted_cost = cost-cost * 0.05;
        System.out.println("Silver Card Food Price: "+ discounted_cost);
    }

    @Override
    public void visit(GoldCreditCard goldCreditCard, double cost) {
        double discounted_cost = cost-cost * 0.1;
        System.out.println("Gold Card Food Price: "+ discounted_cost);
    }

    @Override
    public void visit(PlatinumCreditCard platinumCreditCard, double cost) {
        double discounted_cost = cost-cost * 0.15;
        System.out.println("Platinum Card Food Price: "+ discounted_cost);
    }
}
