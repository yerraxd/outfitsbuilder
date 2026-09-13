package outfitbuilder;

public interface outfitbuilder {
    outfitbuilder addTop(String item);
    outfitbuilder addBottom(String item);
    outfitbuilder addFootwear(String item);
    outfitbuilder addOuterwear(String item);
    outfitbuilder addAccessory(String item);
    outfitbuilder setSeason(Season season);
    outfit build();
}