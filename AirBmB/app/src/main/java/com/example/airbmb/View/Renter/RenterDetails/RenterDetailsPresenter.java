package com.example.airbmb.View.Renter.RenterDetails;

import com.example.airbmb.View.UserDetailsView;
//import com.example.airbmb.dao.RenterDAO;
import com.example.airbmb.Model.Renter;

public class RenterDetailsPresenter
{
    private UserDetailsView view;
    private Renter attachedRenter;

    public RenterDetailsPresenter(UserDetailsView view, RenterDAO publishers)
    {
        this.view = view;

        attachedRenter = publishers.find(view.getId());

        view.setPageName("Εκδοτικ�?ς �?ίκος #" + attachedRenter.getId());

        view.setID("#"+attachedRenter.getId());
        view.setName(attachedRenter.getName());
        view.setPhone(attachedRenter.getTelephone().getTelephoneNumber());
        view.setEmail(attachedRenter.getEMail().getAddress());

        int booksPublished = attachedRenter.getBooks().size();
        view.setBooksPublished(booksPublished+" "+(booksPublished == 1 ? "Βιβλίο" : "Βιβλία"));

        view.setCountry(attachedRenter.getAddress().getCountry());
        view.setAddressCity(attachedRenter.getAddress().getCity());
        view.setAddressStreet(attachedRenter.getAddress().getStreet());
        view.setAddressNumber(attachedRenter.getAddress().getNumber());
        view.setAddressPostalCode(attachedRenter.getAddress().getZipCode().getCode());
    }

    void onStartEditButtonClick()
    {
        view.startEdit(attachedRenter.getId());
    }

    void onStartShowBooksButtonClick()
    {
        view.startShowHouses(attachedRenter.getId());
    }

    void onShowToast(String value)
    {
        view.showToast(value);
    }
}
