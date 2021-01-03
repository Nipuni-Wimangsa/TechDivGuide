public int sumNumbers(String str) {
 char[] characters = str.toCharArray();
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;

        int k = 0;

        for(int i = 0; i < characters.length; i++) {
            if(Character.isDigit(characters[i])) {
                for(int j = i; j < characters.length; j++) {
                    if (!Character.isDigit(characters[j])) {
                        numbers.add(Integer.parseInt(str.substring(i, j)));
                        i = j;
                        break;
                    }
                    if(j == characters.length - 1) {
                        numbers.add(Integer.parseInt(str.substring(i, j+1)));
                        i = j;
                        break;
                    }
                }
            }
        }

        for(int number: numbers)
            sum += number;

        return sum;
}
