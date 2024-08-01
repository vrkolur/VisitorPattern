import CardOffers.*;
import Offer.FoodOffervisitor;
import Offer.GasOfferVisitor;
import Offer.OfferVisitor;

public class Main {
    public static void main(String[] args) {
        OfferVisitor foodVisitor = new FoodOffervisitor();
        OfferVisitor gasVisitor = new GasOfferVisitor();
        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();
        CreditCard platinum = new PlatinumCreditCard();

        bronze.accept(foodVisitor,100);
        silver.accept(foodVisitor,100);
        gold.accept(foodVisitor, 100);
        platinum.accept(foodVisitor,100);

    }
}