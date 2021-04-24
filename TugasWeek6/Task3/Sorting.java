package TugasWeek6.Task3;

public class Sorting {
	public static void shell_sort(Sortable[] a){
		 Sortable temp;
		 int gap, i, j;
		 
		 for(gap = a.length/2; gap > 0; gap /= 2) {
			 for(i = gap; i < a.length; i += 1) {
				 temp = a[i];
				 
				 for(j = i; j >= gap && a[j-gap].compare(temp) == 1; j -= gap) {
					 a[j] = a[j-gap];
				 }
				 a[j] = temp;
			 }
		 }
	 }
	 
	 public static void bubble_sort(Sortable[] a) {
		 Sortable temp;
		 int j;
		 boolean flag = true;

		 while(flag) {
			 flag= false;
			 for(j = 0; j < a.length -1; j++ ) {
				 if(a[j].compare(a[j+1]) == 1 )	{
					 temp = a[j];
					 a[j] = a[j + 1];
					 a[j + 1] = temp;
					 flag = true;
				 }
			 }
		 }
	 }
}
