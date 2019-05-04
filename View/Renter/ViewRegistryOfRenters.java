import javax.swing.JFrame;

public class ViewRegistryOfRenters {
	private static RenterListView renterListViewStub;
	private static RenterView renterViewStub;
	
	public static void setRenterListView(RenterListView renterListView) {
		renterListViewStub = renterListView;
	}
	
	public static void setRenterView(RenterView renterView) {
		renterViewStub = renterView;
	}
	
	public static RenterListView getRenterListView() {
		//crazycast used here, lol (never going to be used, so why not).
		return renterListViewStub == null ? (RenterListView) new JFrame() : renterListViewStub;
	}
	
	public static RenterView getRenterView() {
		//crazycast used also here (for the same reason).
		return renterViewStub == null ? (RenterView) new JFrame() : renterViewStub;
	}
	
	public static void reset() {
		renterListViewStub = null;
		renterViewStub = null;
	}
}
