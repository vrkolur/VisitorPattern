import CardOffers.*;
import Offer.FoodOfferVisitor;
import Offer.GasOfferVisitor;
import Offer.OfferVisitor;

// Here OfferVisitor is the actual Interface, the base class and both FoodOfferVisitor and
public class Main {
    public static void main(String[] args) {
        OfferVisitor foodVisitor = new FoodOfferVisitor();
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