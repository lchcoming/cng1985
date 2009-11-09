package com.ada.daoimpl;

import javax.jdo.PersistenceManager;

import com.ada.data.manager.PMF;
import com.ada.world.model.Country;

public class CountryDaoImpl {
	public void addCountry(Country country) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		pm.makePersistent(country);
	}

}
