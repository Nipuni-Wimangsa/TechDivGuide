package google;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        StringList stringList = new StringList(console.gettingListD());
        String word = stringList.checkingSubstring(console.gettingTheStringS());
        console.printingTheLongestWord(word);
    }
}
