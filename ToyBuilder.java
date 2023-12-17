public class ToyBuilder {

    private Toy toy;

    public ToyBuilder() {
        toy = new Toy();
    }

    public Toy build() {
        if ((toy.getToyName() == null) || toy.getToyName().isEmpty())
            throw new RuntimeException("Некорректное название игрушки!");
        if ((toy.getId() < 100))
            throw new RuntimeException("Некорректная вероятность выпадения игрушки!");
        return toy;
    }

    public ToyBuilder setToyName(String toyName) {
        toy.setToyName(toyName);
        return this;
    }

    public ToyBuilder setWeight(int weight) {
        toy.setWeight(weight);
        return this;
    }

    public ToyBuilder setNameBrand(String nameBrand) {
        toy.setNameBrand(nameBrand);
        return this;
    }

    public ToyBuilder setCountryProduction(String countryProduction) {
        toy.setCountryProduction(countryProduction);
        return this;
    }

    public ToyBuilder setIngredient(String ingredient) {
        toy.setIngredient(ingredient);
        return this;
    }

}
