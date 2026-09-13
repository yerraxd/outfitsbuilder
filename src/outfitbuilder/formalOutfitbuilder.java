package outfitbuilder;

public class formalOutfitbuilder extends abstractOutfitbuilder {

    @Override
    public outfit build() {
        if (!accessories.contains(wardrobeItems.TIE)) {
            throw new IllegalStateException("A formal outfit requires a tie");
        }
        return super.build();
    }

    @Override
    protected String getStyleName() {
        return "Formal";
    }
}