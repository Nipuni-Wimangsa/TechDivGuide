package google;

import java.util.ArrayList;

public class StringList {
    private ArrayList<String> D;

    public StringList(ArrayList<String> D){
        this.D = D;
    }

    public String checkingSubstring(String S) {
        String W = null;
        String newString = S;
        int index;
        int length = 0;

        for(int i = 0; i < D.size(); i++){
            String word = D.get(i);

            for(int j = 0; j < D.get(i).length(); j++){
                String character = word.substring(j,j+1);

                if(newString.contains(character)){
                    index = newString.indexOf(character);
                    newString = newString.substring(index+1);
                }
                else{
                    break;
                }
            }
            if(newString == "" && word.length() > length){
                W = word;
                length = word.length();
            }

            newString = S;
        }
        return W;
    }

}
