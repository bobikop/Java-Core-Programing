package day25_constructors;
import java.util.ArrayList;
import java.util.Arrays;
public class OfferObject {
    public static void main(String[] args) {
        Offer offer1 = new Offer("Columbia", "Google", "Java Developer", 120000, true, true, false, false);
        Offer offer2 = new Offer("Rockville", "Adobe", "UI/UX designer", 100000, true, false, false, true);
        Offer offer3 = new Offer("Bethesda", "Amazon", "Front-end developer", 95000, true, true, true, true);
        Offer offer4 = new Offer("Monroe", "Facebook", "Senior developer", 150000, true, true, true, false);
        Offer offer5 = new Offer("Burbank", "Google", "Backend developer", 110000, false, true, false, true);
        Offer offer6 = new Offer("Glendale", "Microsoft", "Backend developer", 120000, true, true, false, true);
        Offer offer7 = new Offer("San Francisko", "Apple", "iOS developer", 140000, true, true, true, true);


        Offer[] offers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p -> p.isFullTime == false);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p -> p.equals("Bethesda"));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(offers));
        offersWithBenefits.removeIf(p -> p.hasBenefit == false && p.hasPTO == false);

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(offers));
        devOffers.removeIf(p -> !p.jobTitle.contains("developer"));

        ArrayList<Offer> with100K = new ArrayList<>(Arrays.asList(offers));
        with100K.removeIf(p -> p.salary < 100000);


        System.out.println(fullTimeOffers);
    }
}
