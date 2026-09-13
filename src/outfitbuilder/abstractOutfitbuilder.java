package outfitbuilder;

import java.util.ArrayList;
import java.util.List;

public abstract class abstractOutfitbuilder implements outfitbuilder {
    protected String top;
    protected String bottom;
    protected String footwear;
    protected String outerwear;
    protected List<String> accessories = new ArrayList<>();
    protected Season season = Season.SPRING;

    @Override
    public outfitbuilder addTop(String item) {
        top = item;
        return this;
    }

    @Override
    public outfitbuilder addBottom(String item) {
        bottom = item;
        return this;
    }

    @Override
    public outfitbuilder addFootwear(String item) {
        footwear = item;
        return this;
    }

    @Override
    public outfitbuilder addOuterwear(String item) {
        outerwear = item;
        return this;
    }

    @Override
    public outfitbuilder addAccessory(String item) {
        accessories.add(item);
        return this;
    }

    @Override
    public outfitbuilder setSeason(Season season) {
        this.season = season;
        return this;
    }

    @Override
    public outfit build() {
        if (top == null || bottom == null || footwear == null) {
            throw new IllegalStateException("Top, bottom and footwear are required");
        }
        return new outfit(getStyleName(), top, bottom, footwear, outerwear, accessories, season);
    }

    protected abstract String getStyleName();
}