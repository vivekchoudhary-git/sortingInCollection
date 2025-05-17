package vivekSorting.listSorting.listComparable1;

public class Train implements Comparable<Train>{

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		// i have overriden this
		return "id : "+this.getId()+" name : "+this.getName();
	}
	
	// sorting by train id
	@Override
	public int compareTo(Train train) {
		
		// sorted in ascending order
//		int i = this.getId() - train.getId();
		
		// sorted in descending order
		int i = train.getId() - this.getId();
		
		return i;
	}
	
	// sorting by train name
/*	@Override
	public int compareTo(Train train) {
		
		// sorted in ascending order
 //       int i=  this.getName().compareTo(train.getName());
		
		// sorted in descending order
		 int i=  train.getName().compareTo(this.getName());
		
		return i;
	}*/
	
	
}
