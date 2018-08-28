package Debug;
import java.util.*;

public class MergeIntervals {
	

	public static void main(String[] args) {
		System.out.println(merge([[1,3],[2,6],[8,10],[15,18]]));
	}
	public static List<Interval> merge(List<Interval> intervals) {
	    List<Interval> list = new ArrayList<Interval>();
	    Interval addition = new Interval(0,0);
	    for(int i=0; i<list.size()-1;i++){
	        Interval int1 = intervals.get(i);
	        Interval int2 = intervals.get(i+1);
	        if(int1.end>=int2.start){
	             addition = new Interval(int1.start,int2.end);
	            list.add(addition);
	        }else{
	            list.add(intervals.get(i));
	        }
	    }
	    if(addition.end == intervals.get(intervals.size()-1).end){
	        return list;
	    }
	    list.add(intervals.get(intervals.size()-1));
	    return list;
	    
	}

}
