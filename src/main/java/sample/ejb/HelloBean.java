package sample.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloBean implements Hello {
    @Override
    public String greet(String name) {
        return "Hello, " + name;
    }
}