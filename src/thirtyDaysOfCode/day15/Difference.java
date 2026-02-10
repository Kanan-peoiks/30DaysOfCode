package thirtyDaysOfCode.day15;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements, int maximumDifference) {
        this.elements = elements;
        this.maximumDifference = maximumDifference;
    }

    void computeDifference(){
        int max = elements[0];
        int min = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        maximumDifference = max - min;
    }
}
