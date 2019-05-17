package airbmbr4.r4.View.Renter;

import android.view.View;
import java.util.ArrayList;
import airbmbr4.r4.Model.*;

public interface RenterListView extends View {
	public void setPresenter(RenterListPresenter presenter);
	public void setRenters(ArrayList<Renter> renters);
	
	public Owner getSelectedRenter();
}
