import java.util.ArrayList;

public class Route {
	
	private String name;
	private ArrayList<interval> intevals = new ArrayList<interval>() ;
	
	public ArrayList<interval> getIntevals() {
		return intevals;
	}

	public void setIntevals(ArrayList<interval> intevals) {
		this.intevals = intevals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
