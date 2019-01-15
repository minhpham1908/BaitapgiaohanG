
public class Acceptance extends State{
	public Acceptance() {
		this.state="acceptance";
	}
	public boolean happensBefore(State state) {
		if (state.state == "shipping" || state .state == "cancelling") return true;
		return false;
	}

}
