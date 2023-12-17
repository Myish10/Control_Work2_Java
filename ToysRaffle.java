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
        for (int i = 0; i < count; i++) {
            int chance = random.nextInt(5);
            if (chance == 0) {
                toys.add(ToysFactory.generateConstructor());
            } else if (chance == 1) {
                toys.add(ToysFactory.generateRobot());
            } else {
                toys.add(ToysFactory.generateDoll());
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
                writer.write("Игрушка"+ num + ": " + toy.getToyName() + " ");
                writer.write("ID: " + toy.getId() + ";\n");
            }
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
