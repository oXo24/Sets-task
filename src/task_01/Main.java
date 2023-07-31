package task_01;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initial data:");
        Set<String> dataSet = initialData();
        displayData(dataSet);

        System.out.println("\nUpdated data:");
        updateData(dataSet, newData());
        displayData(dataSet);
    }

    private static Set<String> initialData() {

        Set<String> dataSet = new HashSet<>();

        dataSet.add("orange");
        dataSet.add("apple");
        dataSet.add("kiwi");
        dataSet.add("strawberry");
        dataSet.add("mango");

        return dataSet;
    }

    private static String newData() {

        return "grape";
    }

    private static void updateData(Set<String> dataSet, String newData) {

        dataSet.add(newData);
    }

    private static void displayData(Set<String> dataSet) {

        int i = 1;
        for (String data : dataSet) {
            System.out.println(i + ") " + data);
            i++;
        }
    }
}
