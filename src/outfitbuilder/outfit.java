package outfitbuilder;

import java.util.List;

public class outfit {
    private final String style;
    private final String top;
    private final String bottom;
    private final String footwear;
    private final String outerwear;
    private final List<String> accessories;
    private final Season season;

    outfit(String style, String top, String bottom, String footwear,
           String outerwear, List<String> accessories, Season season) {
        this.style = style;
        this.top = top;
        this.bottom = bottom;
        this.footwear = footwear;
        this.outerwear = outerwear;
        this.accessories = List.copyOf(accessories);
        this.season = season;
    }

    @Override
    public String toString() {
        return style + " outfit for " + season +
                "\n  Top: " + top +
                "\n  Bottom: " + bottom +
                "\n  Footwear: " + footwear +
                "\n  Outerwear: " + (outerwear == null ? "-" : outerwear) +
                "\n  Accessories: " + accessories;
    }
}