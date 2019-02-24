/** 56. Merge Intervals
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
	public List<Interval> merge(List<Interval> intervals) {

		List<Interval> res = new ArrayList();
		if (intervals.size() == 0) {
			return res;
		}
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.start - b.start;
			}
		});

		res.add(intervals.get(0));
		Interval temp = new Interval();
		temp = res.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			if (temp.end >= intervals.get(i).start) {
				temp.end = Math.max(temp.end, intervals.get(i).end);
			} else {
				Interval k = new Interval();
				k = intervals.get(i);
				res.add(k);
				temp = k;
			}
		}
		return res;
	}
}
