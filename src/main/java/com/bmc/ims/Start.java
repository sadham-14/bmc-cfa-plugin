package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single START radioBlock  
 */

public class Start  {

	private String value;
	private String startDate;
	private String startlogSeq;
	
	
	@DataBoundConstructor
	public Start(String value,String startDate,String startlogSeq) {
		this.value = value;
		this.startDate=startDate;
		this.startlogSeq=startlogSeq;
		
	}	
		
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartlogSeq() {
		return startlogSeq;
	}
	public void setStartlogSeq(String startlogSeq) {
		this.startlogSeq = startlogSeq;
	}
}