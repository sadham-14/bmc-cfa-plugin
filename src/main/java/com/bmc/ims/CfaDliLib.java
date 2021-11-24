package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single DLI log data set
 */

public class CfaDliLib  {

	private String dliname,dliver,dliunit,dlivolser;
	

	/**
	 * Constructor
	 */
	@DataBoundConstructor
	public CfaDliLib(String dliname,String dliver, String dliunit, String dlivolser) {
		this.dliname = dliname;
		this.dliver=dliver;
		this.dliunit=dliunit;
		this.dlivolser=dlivolser;
		
	}

	public String getDliname() {
		return dliname;
	}
	public String getDliunit() {
		return dliunit;
	}
	public String getDliver() {
		return dliver;
	}
	public String getDlivolser() {
		return dlivolser;
	}
	public void setDliname(String dliname) {
		this.dliname = dliname;
	}
	public void setDliunit(String dliunit) {
		this.dliunit = dliunit;
	}
	public void setDliver(String dliver) {
		this.dliver = dliver;
	}
	public void setDlivolser(String dlivolser) {
		this.dlivolser = dlivolser;
	}
	
	
}