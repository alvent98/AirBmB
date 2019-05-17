package airbmbr4.r4.View.Owner;

import javax.swing.JFrame;

import airbmbr4.r4.View.Owner.OwnerListView;

public class ViewRegistryOfOwners {
	private static OwnerListView ownerListViewStub;
	private static OwnerView ownerViewStub;
	
	public static void setOwnerListView(OwnerListView ownerListView) {
		ownerListViewStub = ownerListView;
	}
	
	public static void setOwnerView(OwnerView ownerView) {
		ownerViewStub = ownerView;
	}
	
	public static OwnerListView getOwnerListView() {
		//crazycast used here, lol (never going to be used, so why not).
		return ownerListViewStub == null ? (OwnerListView) new JFrame() : ownerListViewStub;
	}
	
	public static OwnerView getOwnerView() {
		//crazycast used also here (for the same reason).
		return ownerViewStub == null ? (OwnerView) new JFrame() : ownerViewStub;
	}
	
	public static void reset() {
		ownerListViewStub = null;
		ownerViewStub = null;
	}
}
