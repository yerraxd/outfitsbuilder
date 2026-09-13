package outfitbuilder;

public class outfitDirector {

    public outfit buildCasualOutfit(outfitbuilder builder) {
        return builder
                .addTop(wardrobeItems.T_SHIRT)
                .addBottom(wardrobeItems.JEANS)
                .addFootwear(wardrobeItems.SNEAKERS)
                .addAccessory(wardrobeItems.CAP)
                .setSeason(Season.SUMMER)
                .build();
    }

    public outfit buildFormalOutfit(outfitbuilder builder) {
        return builder
                .addTop(wardrobeItems.DRESS_SHIRT)
                .addBottom(wardrobeItems.SUIT_TROUSERS)
                .addFootwear(wardrobeItems.OXFORD_SHOES)
                .addOuterwear(wardrobeItems.BLAZER)
                .addAccessory(wardrobeItems.TIE)
                .setSeason(Season.AUTUMN)
                .build();
    }
}