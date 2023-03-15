package SortingSearching;

public class InsertionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {13,35,2,65,9,54};
		int i,j,n=arr.length;
		for(i=1;i<n;i++)
		{
			int temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>=temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int x:arr)
			System.out.print(x+" ");
	}

}
