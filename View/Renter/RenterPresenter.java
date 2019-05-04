
public class RenterPresenter {
	private RenterView view;
	private Renter renter;
	//private RenterDAO renterDao;
	
	public RenterPresenter(RenterView view) {
		this.view = view;
		//renterDao = new RenterDAOMemory();
	}
	
	public void setRenter(Renter renter) {
		this.renter = renter;
		updateView();
	}
	
	public Renter getRenter() {
		return renter;
	}
	
	public void start() {
		view.setPresenter(this);
		updateView();
		view.open();
	}
	
	public void updateView() {
		view.setUserId(renter.getId());
		view.setFirstName(renter.getFirstName());
		view.setLastName(renter.getLastName());
		view.setEmail(renter.getEmail());
		view.setIBAN(renter.getIBAN());
		view.setUsername(renter.getUsername());
		view.setPassword(renter.getPassword());
	}
	
	public void save() {
//		renter.setId(view.getUserId()); possibly auto generated
		renter.setFirstName(view.getFirstName());
		renter.setLastName(view.getLastName());
		renter.setEmail(view.getEmail());
		renter.setIBAN(view.getIBAN());
		renter.setUsername(view.getUsername());
		renter.setPassword(view.getPassword());
//	    renterDao.save(renter);
		view.close();
	}
	
	public void cancel() {
		view.close();
	}
}
