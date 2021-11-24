package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single SLDS data set
 */

public class CfaReconSet  {

	private String recon1,recon2,recon3;
	
	

	/**
	 * Constructor
	 */
	@DataBoundConstructor
	public CfaReconSet(String recon1,String recon2,String recon3) {
		this.recon1 = recon1;	
		this.recon2=recon2;
		this.recon3=recon3;
	}

	public String getRecon1() {
		return recon1;
	}
	public void setRecon1(String recon1) {
		this.recon1 = recon1;
	}
	public void setRecon2(String recon2) {
		this.recon2 = recon2;
	}
	public String getRecon2() {
		return recon2;
	}
	public void setRecon3(String recon3) {
		this.recon3 = recon3;
	}
	public String getRecon3() {
		return recon3;
	}
	
	
}