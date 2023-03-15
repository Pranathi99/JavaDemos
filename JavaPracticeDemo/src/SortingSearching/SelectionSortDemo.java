package SortingSearching;

public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {46,36,23,2,6,42};
		int i,n=arr.length,minInd,j;
		for(i=0;i<n;i++)
		{
			minInd=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minInd])
					minInd=j;
			}
			int temp=arr[i];
			arr[i]=arr[minInd];
			arr[minInd]=temp;
		}
		for(int x:arr)
			System.out.print(x+" ");
	}

}
