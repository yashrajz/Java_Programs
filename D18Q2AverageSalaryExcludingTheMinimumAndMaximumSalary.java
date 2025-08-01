// Leetcode questions - 1491
public class D18Q2AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        return (sum - min - max) / (double)(salary.length - 2);
    }
}
