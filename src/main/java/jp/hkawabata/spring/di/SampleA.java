package jp.hkawabata.spring.di;

import org.springframework.stereotype.Component;

@Component
public class SampleA {
    public String getClassName() {
        return this.getClass().getName();
    }
}
