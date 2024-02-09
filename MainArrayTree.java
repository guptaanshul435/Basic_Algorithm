public class MainArrayTree{

  public static void main(String[] args){
	  
	  ArrayTreeImpl ati=new ArrayTreeImpl();
	  ati.root("Ram");
	  ati.setLeft("Hanuman ji",0);
	  ati.setRight("Bala ji",0);
	  ati.setLeft("Bajarngbali ji",1);
	   ati.setRight("Mata ji",2);
	  ati.setRight("Mohan ji",1);
	 
	  
	  ati.print();
  }

}