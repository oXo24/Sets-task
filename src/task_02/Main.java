package task_02;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initial data:");
        Set<String> dataSet = initialData();
        displayData(dataSet);

        System.out.println("\nUpdated data:");
        removeData(dataSet, dataToRemove());
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

    private static String dataToRemove() {

        return "kiwi";
    }

    private static void removeData(Set<String> dataSet, String dataToRemove) {

        dataSet.remove(dataToRemove);
    }

    private static void displayData(Set<String> dataSet) {

        int i = 1;
        for (String data : dataSet) {
            System.out.println(i + ") " + data);
            i++;
        }
    }
}