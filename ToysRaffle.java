import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ToysRaffle {

    private static Random random = new Random();

    public static void main(String[] args) {

        LinkedList<Toy> toys = getToys(10);

        System.out.println(toys);
        System.out.println("Было игрушек: " + toys.size());
        fileWrite(toys, "result.txt");
        System.out.println("*".repeat(10));

        System.out.println(addToys(toys, 2));
        System.out.println("Стало игрушек2: " + toys.size());
        System.out.println("-".repeat(15));

        putToy(toys);
        System.out.println();
        System.out.println(toys);
        System.out.println("Стало игрушек3: " + toys.size());



    }

    public static LinkedList<Toy> getToys(int count) {
        LinkedList<Toy> toys = new LinkedList<>();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while (toys.size() < count) {
            int chance = random.nextInt(5);
            if (chance == 0 && counter1 < count * 0.2) {
                toys.add(ToysFactory.generateConstructor());
                counter1++;
            } else if (chance == 1 && counter2 < count * 0.2) {
                toys.add(ToysFactory.generateRobot());
                counter2++;
            } else if (counter3 < count * 0.6){
                toys.add(ToysFactory.generateDoll());
                counter3++;
            }
        }
        return toys;
    }

    public static LinkedList<Toy> addToys(LinkedList<Toy> toys, int count) {
        toys.addAll(getToys(count));
        return toys;
    }

    public static void putToy(LinkedList<Toy> toys) {
        if (toys.isEmpty())
            throw new RuntimeException("Сожалеем, но игрушки закончились.");
        System.out.println("Вы выиграли: " + toys.getFirst());
        toys.removeFirst();
    }

    public static void fileWrite(LinkedList<Toy> toys, String fileName){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            int num = 0;
            for (Toy toy: toys) {
                num++;
                writer.write("Игрушка"+ num + ": " + toy.getToyName() + "; ");
                writer.write("ID: " + toy.getId() + "; ");
                writer.write("Вероятность выпадения: " + toy.getWeight() + "%\n");
            }
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
