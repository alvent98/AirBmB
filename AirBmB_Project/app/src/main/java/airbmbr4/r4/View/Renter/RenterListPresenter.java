package airbmbr4.r4.View.Renter;

import java.util.ArrayList;

import airbmbr4.r4.Model.Renter;
import airbmbr4.r4.View.Renter.RenterListView;
import airbmbr4.r4.View.Renter.ViewRegistryOfRenters;

public class RenterListPresenter {
	private RenterListView view;
	private ArrayList<Renter> renters;
//	private RenterDAO renterDao;
	
	public RenterListPresenter(RenterListView view) {
		this.view = view;
//		renterDao = new RenterDAOMemory();
	}
	
	public void start() {
		view.setPresenter(this);
		getRenterList();
		view.open();
	}
	
	private void getRenterList() {
//		renters = renterDao.findAll();
		view.setRenters(renters);
	}
	
	public ArrayList<Renter> getRenters() {
		return renters;
	}
	
	public void editSelected() {
		RenterView renterView = ViewRegistryOfRenters.getRenterView();
		RenterPresenter renterPresenter = new RenterPresenter(renterView);
		renterPresenter.setRenter(new Renter("a","v","av@gmail.gr","201920","kdkdkd","dkdkdk"));
		renterPresenter.start();
	}
	
	public void refresh() {
		getRenterList();
	}	
}
