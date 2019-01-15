
public class Order extends State {
	public Order() {
		this.state ="order";
	}
	public boolean happensBefore(State s) {
		if (s.state == "cancelling" || s.state == "acceptance") return true;
		return false;
	}
}
