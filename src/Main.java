import CardOffers.*;
import Offer.FoodOffervisitor;
import Offer.GasOfferVisitor;
import Offer.OfferVisitor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OfferVisitor hotelVisitor = new FoodOffervisitor();
        OfferVisitor gasVisitor = new GasOfferVisitor();
        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();
        CreditCard platinum = new PlatinumCreditCard();

        bronze.accept(hotelVisitor);
        gold.accept(gasVisitor);

    }
}