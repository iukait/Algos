public class AscendingSequence {

    //0 1 2 3 4 5 6
    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {
        if (start < end && step > 0) {
            int[] arr = new int[((end - start) / step) + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = start;
                start += step;
                System.out.println(arr[i]);
            }
            return arr;
        } else return new int[]{};
    }
}
