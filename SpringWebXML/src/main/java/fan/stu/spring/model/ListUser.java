package fan.stu.spring.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "list-user")
public class ListUser {

    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    @XmlElement
    public void setUser(List<User> user) {
        this.user = user;
    }

}
