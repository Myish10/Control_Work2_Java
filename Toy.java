public class Toy {

    private String toyName;

    private final int id;
    private static int count = 100;
    private int weight;
    private String nameBrand;
    private String countryProduction;
    private String ingredient;

    public Toy() {
        id = ++count;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Игрушка: %s\nПроизводитель: %s, страна производства: %s, состав: %s\nID: %d, " +
                "вероятность выпадения %d%%\n", toyName, nameBrand, countryProduction, ingredient, id, weight);
    }
}
