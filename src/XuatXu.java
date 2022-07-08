import java.io.Serializable;
import java.util.ArrayList;

public class XuatXu implements Serializable {
    private String name;

    public XuatXu() {
    }

    public XuatXu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quốc gia :" +
                 name + '\'' +
                '}';
    }

}
