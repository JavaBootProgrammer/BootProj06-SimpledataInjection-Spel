package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dcDetails")
public class DiagnosticCenterDetails {
    //injecting the properties files data
    @Value("${dc.id}")
    private String dcId;
    @Value("${dc.name}")
    private String dcName;
    @Value("${dc.location}")
    private String location;

    @Autowired
    private TestsRateCard card;

    @Value("#{tInfo.xrayRate + tInfo.echo2dRate + tInfo.echo3dRate}")  //SPEL
    private float billAmt;

    @Value("#{tInfo.xrayRate>=10000}")
    private boolean xrayIsOverpriced;

    @Value("${os.name}")  //system property injection
    private String osName;

    @Value("${Path}")  //env..variable  values injection
    private String pathData;

    @Value("500038")
    private long pinCode;

    //toString()
    @Override
    public String toString() {
        return "DiagnosticCenterDetails [dcId=" + dcId + ", dcName=" + dcName + ", location=" + location + ", card="
                + card + ", billAmt=" + billAmt + ", xrayIsOverpriced=" + xrayIsOverpriced + ", osName=" + osName
                + ", pathData=" + pathData + ", pinCode=" + pinCode + "]";
    }


}
