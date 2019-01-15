
public class Shipping extends State{
	public Shipping() {
		this.state="shipping";
	}
	public boolean happensBefore(State state) {
		if (state.state == "waitingreview") return true;
		return false;
	}

}
