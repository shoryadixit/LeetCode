class Solution {
    public double average(int[] salary) {
        double avg = 0;
        Arrays.sort(salary);
        // Average without the higher and lower number
        for (int i = 1; i < salary.length - 1; i++)
            avg += salary[i];

        return avg / (salary.length - 2);
    }
}