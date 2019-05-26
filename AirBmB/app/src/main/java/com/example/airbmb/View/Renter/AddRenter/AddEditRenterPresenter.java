package com.example.airbmb.View.Renter.AddRenter;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.View.AddEditUserView;
//import com.example.airbmb.dao.RenterDAO;
import com.example.airbmb.Model.Renter;

public class AddEditRenterPresenter
{
    private AddEditUserView view;

    //private RenterDAO publishers;
    private List<String> countries;

    private Renter attachedRenter;

    private boolean verifyOnlyDigits(String in)
    {
        for(int i = 0; i < in.length(); i++)
            if(!Character.isDigit(in.charAt(i)))
                return false;
        return true;
    }

    public AddEditRenterPresenter(AddEditUserView view, RenterDAO renters)
    {
        this.view = view;
        this.renters = renters;

        int ID = view.getID();
        attachedRenter = attachedPublisherID == null ? null : renters.find(attachedPublisherID);

        if(attachedRenter != null)//edit mode
        {
            //view.setPageName("�?•�?�?�?΄�?�?�?�?�?Ή�?�?�?��?�? �?��?―�?�?�?�?�?�? #" + attachedPublisher.getId());

            view.setName(attachedRenter.getName());
            view.setPhone(attachedRenter.getTelephone().getTelephoneNumber());
            view.setEmail(attachedRenter.getEMail().getAddress());
            view.setCountryPosition(countries.indexOf(attachedRenter.getAddress().getCountry()));
            view.setAddressCity(attachedRenter.getAddress().getCity());
            view.setAddressStreet(attachedRenter.getAddress().getStreet());
            view.setAddressNumber(attachedRenter.getAddress().getNumber());
            view.setAddressPostalCode(attachedRenter.getAddress().getZipCode().getCode());
        }
    }

    public void onSaveRenter()
    {
        String
                name = view.getName(),
                phone = view.getPhone(),
                email = view.getEmail(),
                addressCity = view.getAddressCity(),
                addressStreet = view.getAddressStreet(),
                addressNumber = view.getAddressNumber(),
                addressPostalCode = view.getAddressPostalCode();

        Integer countryPosition = view.getCountryPosition();

        if(name.length() < 2 || name.length() > 15)
            view.showErrorMessage("�?£�?†�?¬�?»�?�?�?±!", "�?£�?…�?�?�?€�?»�?·�?��?��?ƒ�?�?�?µ 2 �?­�?‰�?�? 15 �?‡�?±�?��?±�?�?�?�?�?®�?��?µ�?�? �?ƒ�?�?�?�? �?��?½�?�?�?�?�?±.");
        else if(phone.length() < 2 || phone.length() > 15 || !verifyOnlyDigits(phone))
            view.showErrorMessage("�?£�?†�?¬�?»�?�?�?±!", "�?£�?…�?�?�?€�?»�?·�?��?��?ƒ�?�?�?µ �?�?�?��?�?�?¬ �?�?�?�? �?¤�?·�?»�?­�?†�?‰�?½�?�?.");
        else if(email.length() < 2 || email.length() > 100 || !validateEmail(email))
            view.showErrorMessage("�?£�?†�?¬�?»�?�?�?±!", "�?£�?…�?�?�?€�?»�?·�?��?��?ƒ�?�?�?µ �?�?�?��?�?�?¬ �?�?�?�? Email.");
        else if(addressCity.length() < 2 || addressCity.length() > 15)
            view.showErrorMessage("�?£�?†�?¬�?»�?�?�?±!", "�?£�?…�?�?�?€�?»�?·�?��?��?ƒ�?�?�?µ 2 �?­�?‰�?�? 15 �?‡�?±�?��?±�?�?�?�?�?®�?��?µ�?�? �?ƒ�?�?�?·�?½ �? �?��?»�?·.");
        else if(addressStreet.length() < 2 || addressStreet.length() > 15)
            view.showErrorMessage("�?£�?†�?¬�?»�?�?�?±!", "�?£�?…�?�?�?€�?»�?·�?��?��?ƒ�?�?�?µ 2 �?­�?‰�?�? 15 �?‡�?±�?��?±�?�?�?�?�?®�?��?µ�?�? �?ƒ�?�?�?·�?½ �?��?΄�?�.");
        else if(addressNumber.length() < 2 || addressNumber.length() > 10 || !verifyOnlyDigits(addressNumber))
            view.showErrorMessage("�?£�?†�?¬�?»�?�?�?±!", "�?£�?…�?�?�?€�?»�?·�?��?��?ƒ�?�?�?µ 2 �?­�?‰�?�? 10 �?±�?��?Ή�?�?�?�?�?·�?�?�?Ή�?�?�?¬ �?��?·�?†�?―�?± �?ƒ�?�?�?�?�?½ �?�?�?��?Ή�?�?�?�?�?�.");
        else if(addressPostalCode.length() < 2 || addressPostalCode.length() > 10 || !verifyOnlyDigits(addressPostalCode))
            view.showErrorMessage("�?£�?†�?¬�?»�?�?�?±!", "�?£�?…�?�?�?€�?»�?·�?��?��?ƒ�?�?�?µ 2 �?­�?‰�?�? 10 �?±�?��?Ή�?�?�?�?�?·�?�?�?Ή�?�?�?¬ �?��?·�?†�?―�?± �?ƒ�?�?�?�?�?½ �?¤.�?�.");
        else
        {
            Address addr = new Address(addressStreet, addressNumber, addressCity, new ZipCode(addressPostalCode), countries.get(countryPosition));

            if(attachedRenter == null)//add
            {
                publishers.save(new Renter(publishers.nextId(), name, addr, new EmailAddress(email), new TelephoneNumber(phone)));
                view.successfullyFinishActivity("�?•�?€�?Ή�?�?�?…�?‡�?®�?�? �?•�?³�?³�?��?±�?†�?® �?�?�?�?�?… '"+name+"'!");

            }
            else//update
            {
            	attachedRenter.setFirstName(name);
            	attachedRenter.setLastName(name);
            	attachedRenter.setAddress(addr);
            	attachedRenter.setEmail(email);

                view.successfullyFinishActivity("�?•�?€�?Ή�?�?�?…�?‡�?®�?�? �?¤�?��?�?�?€�?�?�?€�?�?�?―�?·�?ƒ�?· �?�?�?�?�?… '"+name+"'!");
            }
        }
    }
}*/
