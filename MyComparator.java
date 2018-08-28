package Debug;

import java.util.Comparator;

public class MyComparator implements Comparator{
		public int compare(int a, int b) {
			if(a > b) {
				return -1;
			}
			if(a<b) {
				return 1;
			}
			else {
				return 0;
			}
		}

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
}
