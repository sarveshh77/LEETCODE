
import java.util.*;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {

        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[2], a[2])
        );

        for (int i = 0; i < classes.length; i++) {

            double pass = classes[i][0];
            double total = classes[i][1];

            double temp = pass / total;
            double newRatio = (pass + 1) / (total + 1);
            double gain = newRatio - temp;

            pq.add(new double[]{pass, total, gain});
        }

        while (extraStudents > 0) {

            double[] current = pq.poll();

            current[0]++;
            current[1]++;

            double temp = current[0] / current[1];
            double newRatio = (current[0] + 1) / (current[1] + 1);

            current[2] = newRatio - temp;

            pq.add(current);    

            extraStudents--;
        }

        double sum = 0;

        while (!pq.isEmpty()) {
            double[] current = pq.poll();

            sum += current[0] / current[1];
        }

        return sum / classes.length;
    }
}
