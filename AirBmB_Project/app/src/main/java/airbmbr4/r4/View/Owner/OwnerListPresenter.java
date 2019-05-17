package airbmbr4.r4.View.Owner;

import java.util.ArrayList;

import airbmbr4.r4.Model.*;
import airbmbr4.r4.View.Owner.OwnerListView;

public class OwnerListPresenter {
	private OwnerListView view;
	private ArrayList<Owner> owners;
//	private OwnerDAO ownerDao;
	
	public OwnerListPresenter(OwnerListView view) {
		this.view = view;
//		ownerDao = new OwnerDAOMemory();
	}
	
	public void start() {
		view.setPresenter(this);
		getOwnerList();
		view.open();
	}
	
	private void getOwnerList() {
//		owners = ownerDao.findAll();
		view.setOwners(owners);
	}
	
	public ArrayList<Owner> getOwners() {
		return owners;
	}
	
	public void editSelected() {
		OwnerView ownerView = ViewRegistryOfOwners.getOwnerView();
		OwnerPresenter ownerPresenter = new OwnerPresenter(ownerView);
		ownerPresenter.setOwner(new Owner("a","v","av@gmail.gr","201920","kdkdkd","dkdkdk"));
		ownerPresenter.start();
	}
	
	public void refresh() {
		getOwnerList();
	}	
}
