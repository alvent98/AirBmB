
public class OwnerPresenter {
	private OwnerView view;
	private Owner owner;
	//private OwnerDAO ownerDao;
	
	public OwnerPresenter(OwnerView view) {
		this.view = view;
		//ownerDao = new OwnerDAOMemory();
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
		updateView();
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void start() {
		view.setPresenter(this);
		updateView();
		view.open();
	}
	
	public void updateView() {
		view.setUserId(owner.getId());
		view.setFirstName(owner.getFirstName());
		view.setLastName(owner.getLastName());
		view.setEmail(owner.getEmail());
		view.setIBAN(owner.getIBAN());
		view.setUsername(owner.getUsername());
		view.setPassword(owner.getPassword());
	}
	
	public void save() {
//		owner.setId(view.getOwnerId()); possibly auto generated
		owner.setFirstName(view.getFirstName());
		owner.setLastName(view.getLastName());
		owner.setEmail(view.getEmail());
		owner.setIBAN(view.getIBAN());
		owner.setUsername(view.getUsername());
		owner.setPassword(view.getPassword());
//	    ownerDao.save(owner);
		view.close();
	}
	
	public void cancel() {
		view.close();
	}
}
