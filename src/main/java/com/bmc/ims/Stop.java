package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single STOP radioBlock  
 */

public class Stop  {

	private String value;
	private String stopDate;
	private String stoplogSeq;
	
	
	@DataBoundConstructor
	public Stop(String value,String stopDate,String stoplogSeq) {
		this.value = value;
		this.stopDate=stopDate;
		this.stoplogSeq=stoplogSeq;
		
	}	
		
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStopDate() {
		return stopDate;
	}
	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}
	public String getStoplogSeq() {
		return stoplogSeq;
	}
	public void setStoplogSeq(String stoplogSeq) {
		this.stoplogSeq = stoplogSeq;
	}
}