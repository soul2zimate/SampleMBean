package sample.mbean;

import sample.ejb.Hello;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class ConfigService extends AbstractComponentMBean implements ConfigServiceMBean {

    // work well with @EJB, but we cannot use @Inject to inject EJB session bean in .sar archive.
//    @EJB
    @Inject
    Hello helloBean;

    public ConfigService() {
        super("quickstarts");
    }

    @Override
    public void start() {
        System.out.println(helloBean.greet("start MBean: ConfigService done!"));
    }

    @Override
    public void stop() {
        // no-op
    }
}
