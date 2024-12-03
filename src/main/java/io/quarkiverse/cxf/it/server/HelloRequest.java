package io.quarkiverse.cxf.it.server;

import jakarta.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

public class HelloRequest {

    private String arg0;
    private Date arg1;
    private List<String> arg2;
    private CustomObject arg3;
    private CustomObject arg4;

    @XmlElement
    public String getArg0() {
        return arg0;
    }

    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

    @XmlElement
    public Date getArg1() {
        return arg1;
    }

    public void setArg1(Date arg1) {
        this.arg1 = arg1;
    }

    @XmlElement
    public List<String> getArg2() {
        return arg2;
    }

    public void setArg2(List<String> arg2) {
        this.arg2 = arg2;
    }

    @XmlElement
    public CustomObject getArg3() {
        return arg3;
    }

    public void setArg3(CustomObject arg3) {
        this.arg3 = arg3;
    }

    @XmlElement
    public CustomObject getArg4() {
        return arg4;
    }

    public void setArg4(CustomObject arg4) {
        this.arg4 = arg4;
    }
}
