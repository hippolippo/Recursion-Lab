public class ArraySum {
    public int sumOfArray(Integer[] a, int index) {
        return (index == 0) ? a[index] : a[index] + sumOfArray(a, index-1);
    }
}
