package outfitbuilder;

public class casualOutfitbuilder extends abstractOutfitbuilder {

    @Override
    public outfitbuilder addFootwear(String item) {
        if (item.equals(wardrobeItems.OXFORD_SHOES)) {
            throw new IllegalArgumentException(
                    "Oxford shoes are not suitable for a casual outfit");
        }
        footwear = item;
        return this;
    }

    @Override
    protected String getStyleName() {
        return "Casual";
    }
}