package sample.ejb;

import javax.ejb.Local;

@Local
public interface Hello {
    String greet(String name);
}
