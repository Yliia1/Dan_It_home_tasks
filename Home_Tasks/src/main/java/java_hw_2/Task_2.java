package java_hw_2;

public class Task_2 {
    public static void main(String[] args) {
        String string1 = "Testing, is my favourite job";
        String [] words = string1.split(" ");
        for (int i = 0; i < words.length; i++)
            System.out.println("Слово" + (i+1) + "= "   + words[i].replace(",", "") + ", Довжина цього слова= " + words[i].length());
        if (words[0].length()>words[1].length() && words[0].length()>words[2].length() && words[0].length()>words[3].length() && words[0].length()>words[4].length())
            System.out.println(true);
        else { System.out.println(false); }

    }
}
