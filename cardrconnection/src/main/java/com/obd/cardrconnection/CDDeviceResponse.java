package com.obd.cardrconnection;

import java.util.ArrayList;

public class CDDeviceResponse {
    public String vin = "";
    public ArrayList<CDScanResponse>cdScanResponses  = new ArrayList<CDScanResponse>();

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public ArrayList<CDScanResponse> getCdScanResponses() {
        return cdScanResponses;
    }

    public void setCdScanResponses(ArrayList<CDScanResponse> cdScanResponses) {
        this.cdScanResponses = cdScanResponses;
    }



}

