public class Hanoii {
	public static void hanoii(int n,char source,char dest,char aux) {
		if(n==1) {
			System.out.println(source+" ---> "+dest);
		}
		else {
			hanoii(n-1,source,aux,dest);
			System.out.println(source+" ---> "+dest);
			hanoii(n-1,aux,dest,source);
		}
	}
	public static void getMinMoves(int disks) {
		int moves=1;
		for(int i=1;i<=disks;i++) {
			moves*=2;
		}
		moves--;
		System.out.println(moves);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hanoii.hanoii(3, 'A', 'C', 'B');
		Hanoii.getMinMoves(3);
	}
}