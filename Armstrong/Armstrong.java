public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = num;
        int temp2 = num;
        double count = 0;

        // Counting the number of digits
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        // Check Armstrong
        while (temp2 > 0) {
            int digit = temp2 % 10;
            sum +=Math.pow(digit, count);
            temp2 = temp2 / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
