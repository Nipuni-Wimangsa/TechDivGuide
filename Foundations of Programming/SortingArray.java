int[] sort(int[] a) {
  ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < a.length; i++) {
            if(!list.contains(a[i]))
                list.add(a[i]);
        }

        int[] sortedArray = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            sortedArray[i] = list.get(i);
        }

        for(int i = 0; i < sortedArray.length - 1; i++) {
            for(int j = i+1; j < sortedArray.length; j++) {
                if(sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
}
