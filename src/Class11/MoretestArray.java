package Class11;

public class MoretestArray {
    public static void main(String[] args) {

        char[] copyFrom = { 'a', 'b', 'c', 'd', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 5, copyTo, 0, 7);

        System.out.println(String.valueOf(copyTo));
    }

}
