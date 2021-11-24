package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single IMS system that is associated with the input RECON 
 */

public class CfaImsid  {

	private String imsid;
	
	@DataBoundConstructor
	public CfaImsid(String imsid) {
		this.imsid = imsid;		
	}
	
	public String getImsid() {
		return imsid;
	}
	
	public void setImsid(String imsid) {
		this.imsid = imsid;
	}	
	
}