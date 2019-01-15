
public class WaitingReview extends State{
	public WaitingReview() {
		this.state="waitingreview";
	}
	public boolean happensBefore(State state) {
		if (state.state == "theend") return true;
		return false;
	}

}
