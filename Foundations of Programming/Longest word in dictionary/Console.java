package google;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private ArrayList<String> D = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public ArrayList<String> gettingListD(){
        System.out.print("Dictionary: ");

        for(String list: input.nextLine().split(" "))
            D.add(list);

        return D;
    }

    public String gettingTheStringS(){
        System.out.print("Enter the String S: ");
        return input.nextLine();
    }

    public void printingTheLongestWord(String W){
        System.out.println(W);
    }
}
