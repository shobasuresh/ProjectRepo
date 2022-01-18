package com.fidelity.countrypack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
 
public class Countries {

	
	Map<Integer,String> sampleMap; 
	Properties sampleProp;
	ArrayList<Address> addressList;
	 Set<String> sampleSet;
 	
	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	
	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}
	
		
	public Map<Integer, String> getSampleMap() {
		return sampleMap;
	}
	public void setSampleMap(Map<Integer, String> sampleMap) {
		this.sampleMap = sampleMap;
	}
	public Properties getSampleProp() {
		return sampleProp;
	}
	public void setSampleProp(Properties sampleProp) {
		this.sampleProp = sampleProp;
	}
	
	
	
    public  void getSampleSet() {
		
		 sampleSet.forEach(System.out::println);
	}

	public void setSampleSet(Set<String> sampleSet) {
		this.sampleSet = sampleSet;
	} 
	 
	 
}
