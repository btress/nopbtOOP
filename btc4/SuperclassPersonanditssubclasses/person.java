package SuperclassPersonanditssubclasses;

public class person {
    private String name,address;
    public person() {

    }
    public person(String name ,String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "person[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
