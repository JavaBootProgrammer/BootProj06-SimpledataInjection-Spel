package com.nt.sbeans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tInfo")
@Data
public class TestsRateCard {
    @Value("${test.xray}")
    private float xrayRate;
    @Value("${test.2decho}")
    private float echo2dRate;
    @Value("${test.3decho}")
    private float echo3dRate;
    @Value("${test.mri}")
    private float mriRate;

    //toString()
    @Override
    public String toString() {
        return "TestsRateCard [xrayRate=" + xrayRate + ", echo2dRate=" + echo2dRate + ", echo3dRate=" + echo3dRate
                + ", mriRate=" + mriRate + "]";
    }


}
