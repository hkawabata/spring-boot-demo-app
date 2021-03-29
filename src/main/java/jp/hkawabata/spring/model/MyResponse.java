package jp.hkawabata.spring.model;

import java.util.List;

public class MyResponse {
    private int n;
    private String s;
    private List<MyDictItem> dict;

    public MyResponse(int n, String s, List<MyDictItem> dict) {
        this.n = n;
        this.s = s;
        this.dict = dict;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public List<MyDictItem> getDict() {
        return dict;
    }

    public void setDict(List<MyDictItem> dict) {
        this.dict = dict;
    }
}
