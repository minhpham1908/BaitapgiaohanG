
public class Giaohang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction a = new Transaction();
		a.allS = new State[] {new Order(),new Acceptance(), new WaitingReview(), new TheEnd()};
		System.out.println(a.isValid());

	}

}
