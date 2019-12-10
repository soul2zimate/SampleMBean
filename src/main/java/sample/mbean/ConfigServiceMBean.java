package sample.mbean;

import javax.management.MXBean;

@MXBean
public interface ConfigServiceMBean {
    void start();
    void stop();
}
