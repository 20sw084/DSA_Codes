public class BinarySearchArray {
	public static boolean search(int[] data,int num) {
		int f=0,l=data.length-1;
		boolean found=false;
		while(f<=l) {
			int index=f+l;
			index/=2;
			if(data[index]==num) {
				found=true;
				break;
			}
			if(data[index]<num) {
				f=index+1;
			}
			if(data[index]>num) {
				l=index-1;
			}
		}
		return found;
	}
	public static void main(String[] args) {
		int[] data = {1,15,33,42,43,45,67,73,75,77,89,95};
		System.out.println(search(data,13));
		
	}
}