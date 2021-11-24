package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single SLDS data set
 */

public class CfaSldsLib  {

	private String sldsname,sldsver,sldsunit,sldsvolser;
	

	/**
	 * Constructor
	 */
	@DataBoundConstructor
	public CfaSldsLib(String sldsname,String sldsver, String sldsunit, String sldsvolser) {
		this.sldsname = sldsname;
		this.sldsver=sldsver;
		this.sldsunit=sldsunit;
		this.sldsvolser=sldsvolser;
		
	}

	public String getSldsname() {
		return sldsname;
	}
	public void setSldsname(String sldsname) {
		this.sldsname = sldsname;
	}
	
	public String getSldsver() {
		return sldsver;
	}
	
	public void setSldsver(String sldsver) {
		this.sldsver = sldsver;
	}
	
	public String getSldsunit() {
		return sldsunit;
	}
	public void setSldsunit(String sldsunit) {
		this.sldsunit = sldsunit;
	}
	
	public String getSldsvolser() {
		return sldsvolser;
	}
	
	public void setSldsvolser(String sldsvolser) {
		this.sldsvolser = sldsvolser;
	}
	
	
}