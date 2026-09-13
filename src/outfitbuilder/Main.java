package outfitbuilder;

public class Main {
    public static void main(String[] args) {
        outfitDirector director = new outfitDirector();

        outfit casual = director.buildCasualOutfit(new casualOutfitbuilder());
        System.out.println(casual);

        outfit formal = director.buildFormalOutfit(new formalOutfitbuilder());
        System.out.println(formal);

        outfit custom = new casualOutfitbuilder()
                .addTop(wardrobeItems.T_SHIRT)
                .addBottom(wardrobeItems.JEANS)
                .addFootwear(wardrobeItems.SNEAKERS)
                .setSeason(Season.SPRING)
                .build();
        System.out.println(custom);

        try {
            new casualOutfitbuilder()
                    .addTop(wardrobeItems.T_SHIRT)
                    .addBottom(wardrobeItems.JEANS)
                    .addFootwear(wardrobeItems.OXFORD_SHOES)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        try {
            new formalOutfitbuilder()
                    .addTop(wardrobeItems.DRESS_SHIRT)
                    .addBottom(wardrobeItems.SUIT_TROUSERS)
                    .addFootwear(wardrobeItems.OXFORD_SHOES)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}