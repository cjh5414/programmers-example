import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by jihun on 2018. 10. 24..
 */
class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
        int job_idx = 0;
        int[] curr_job;
        int time = 0;
        int sum = 0;

        Arrays.sort(jobs, (int[] a, int[] b) -> a[0] - b[0]);

        while (job_idx < jobs.length || !pq.isEmpty()) {
            if (pq.isEmpty())
                curr_job = jobs[job_idx++];
            else
                curr_job = pq.poll();

            boolean again = false;
            int tmp_time = curr_job[0] > time ? curr_job[0] : time;
            tmp_time += curr_job[1];
            for (int i = job_idx; i < jobs.length; i++) {
                if (jobs[i][0] + jobs[i][1] < tmp_time) {
                    pq.add(curr_job);
                    pq.add(jobs[i]);
                    job_idx++;
                    again = true;
                    break;
                }
            }
            if (again) continue;

            time = tmp_time;
            sum += (time - curr_job[0]);

            while (job_idx < jobs.length) {
                int[] tmp = jobs[job_idx];
                if (tmp[0] <= time) {
                    pq.add(tmp);
                    job_idx++;
                }
                else
                    break;
            }
        }

        return sum / jobs.length;
    }
}
