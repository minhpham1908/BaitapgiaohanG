
public class Cancelling extends State{
	public Cancelling() {
		this.state="cancelling";
	}
	public boolean happensBefore(State state) {
		if (state.state == "theend") return true;
		return false;
	}

}
