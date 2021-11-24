package com.bmc.ims;
/***********************************************************************
 * BMC Software, Inc.
 * Confidential and Proprietary
 * Copyright (c) BMC Software, Inc. 2019
 * All Rights Reserved.
 ***********************************************************************/


import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class TrustAllHostNameVerifier implements HostnameVerifier {

	
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }

}
