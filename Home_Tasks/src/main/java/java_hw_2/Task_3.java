package java_hw_2;

public class Task_3 {
    public static void main(String[] args) {
        String string1 = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        String upper = string1.toUpperCase();
        String [] symbol1 = upper.split("A");
        System.out.println(symbol1.length -1);
        String lower = string1.toLowerCase();
        String [] symbol2 = lower.split("a");
        System.out.println(symbol2.length -1);

    }
}
