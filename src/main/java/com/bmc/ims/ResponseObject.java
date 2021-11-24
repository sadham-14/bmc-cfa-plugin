package com.bmc.ims;

import java.io.InputStream;
import java.util.ArrayList;

public class ResponseObject {
	
	int status = 0;
	StringBuffer statAndHeaders = new StringBuffer();
	InputStream istream = null;
	String jobId = null;
	String jobName = null;
	String jobRetCode = null;
	String jobOwner = null;
	String jobStatus = null;
	String jobType = null;
	ArrayList<String> idvalarr = new ArrayList<String>(); //Array of spool files "id"s 
	ArrayList<String> ddnamevalarr = new ArrayList<String>(); //Array of spool files "ddname"s
	String numOfSpoolFiles;
	StringBuffer append_data = new StringBuffer();
	int ret_code = 0;
	String resp_details = "";
	String ACM_security_error = "";

}
