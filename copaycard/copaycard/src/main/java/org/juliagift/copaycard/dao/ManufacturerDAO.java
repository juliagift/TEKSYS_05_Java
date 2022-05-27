package org.juliagift.copaycard.dao;

import java.util.HashMap;
import java.util.List;

import org.juliagift.copaycard.entity.Manufacturer;
import org.juliagift.copaycard.exception.CustomException;

public interface ManufacturerDAO {
	
	List<Double> getManufacturerPaymentByMonth(Manufacturer manufacturer) throws CustomException;
	HashMap<String, Double> getManufacturerPaymentByDrug(Manufacturer manufacturer) throws CustomException;
	HashMap<String, Double> getManufacturerPaymentByState(Manufacturer manufacturer) throws CustomException;
	HashMap<String, Double> getManufacturerPaymentByGender(Manufacturer manufacturer) throws CustomException;
	HashMap<String, Double> getManufacturerPaymentByAgeGroup( Manufacturer manufacturer) throws CustomException;
}
