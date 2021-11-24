package com.bmc.ims;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents a single STOP radioBlock  
 */

public class Timezone  {

	private String value;
	private String timezoneoffset;//default value	
	
	
	@DataBoundConstructor
	public Timezone(String value,String timezoneoffset) {
		this.value = value;
		this.timezoneoffset=timezoneoffset;		
	}	
		
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTimezoneoffset() {
		return timezoneoffset;
	}
	public void setTimezoneoffset(String timezoneoffset) {
		this.timezoneoffset = timezoneoffset;
	}
}