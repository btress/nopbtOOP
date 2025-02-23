package bt71;

public class Customer {
    String name;
    boolean member = false;
    String memberType;
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }



    public void setMemberType(String type) {
/*        if(isMember()) {*/
            this.memberType = type;
/*        }
        else {
            this.memberType = null;
        }*/

    }
    public String getMemberType() {
        return memberType;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
