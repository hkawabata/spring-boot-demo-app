package jp.hkawabata.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleB {
    @Autowired
    private SampleA sampleA;

    public String testDi() {
        return "called " + sampleA.getClassName();
    }
}
