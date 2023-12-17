import java.util.Random;

public class ToysFactory {

    private static Random random = new Random();

    public static Toy generateDoll() {
        String[] toyNames = new String[]{"Кукла #1", "Кукла #2", "Кукла #3", "Кукла #4", "Кукла #5", "Кукла #6"};
        int weight = 60;
        String[] countryProduction = new String[]{"Россия", "Китай", "Германия", "Беларусь", "Италия", "Индия"};
        return new ToyBuilder()
                .setToyName(toyNames[random.nextInt(toyNames.length)])
                .setWeight(weight)
                .setCountryProduction(countryProduction[random.nextInt(countryProduction.length)])
                .build();
    }

    public static Toy generateRobot() {
        String[] toyNames = new String[]{"Робот #1", "Робот #2", "Робот #3", "Робот #4", "Робот #5", "Робот #6"};
        int weight = 20;
        String[] countryProduction = new String[]{"Россия", "Китай", "Германия", "Беларусь", "Италия", "Индия"};
        String[] brandNames = new String[]{"Производитель #1", "Производитель #2", "Производитель #3",
                "Производитель #4", "Производитель #5", "Производитель #6", "Производитель #7"};
        return new ToyBuilder()
                .setToyName(toyNames[random.nextInt(toyNames.length)])
                .setWeight(weight)
                .setCountryProduction(countryProduction[random.nextInt(countryProduction.length)])
                .setNameBrand(brandNames[random.nextInt(brandNames.length)])
                .build();
    }

    public static Toy generateConstructor() {
        String[] toyNames = new String[]{"Конструктор #1", "Конструктор #2", "Конструктор #3", "Конструктор #4",
                "Конструктор #5", "Конструктор #6"};
        int weight = 20;
        String[] countryProduction = new String[]{"Россия", "Китай", "Германия", "Беларусь", "Италия", "Индия"};
        String[] brandNames = new String[]{"Производитель #1", "Производитель #2", "Производитель #3",
                "Производитель #4", "Производитель #5", "Производитель #6", "Производитель #7"};
        String[] ingredient = new String[]{"пластик", "металл", "картон, пластик"};
        return new ToyBuilder()
                .setToyName(toyNames[random.nextInt(toyNames.length)])
                .setWeight(weight)
                .setCountryProduction(countryProduction[random.nextInt(countryProduction.length)])
                .setNameBrand(brandNames[random.nextInt(brandNames.length)])
                .setIngredient(ingredient[random.nextInt(ingredient.length)])
                .build();
    }

}
