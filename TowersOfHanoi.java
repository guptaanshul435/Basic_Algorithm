// Towers of Hanoi

class TowersOfHanoi{
	
	public void towers(int n,char from,char to,char aux){
		if(n==1){
			System.out.printf("Move disk 1 from %c peg to %c peg \n",from,to);
			return;
		}
		//move top n-1 disks from A to B using C
		towers(n-1,from,aux,to);
		System.out.printf("Move disk %d from %c peg to %c peg \n",n,from,to);
		towers(n-1,aux,to,from);
	}

public static void main(String[] args){
	TowersOfHanoi towersOfHanoi=new TowersOfHanoi();
	towersOfHanoi.towers(3,'A','B','C');
	
	
}
}