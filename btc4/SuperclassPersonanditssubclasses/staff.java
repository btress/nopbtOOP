package SuperclassPersonanditssubclasses;

public class staff extends person {
    private String school;
    private double pay;
    public staff() {
        super();
    }
    public staff (String name,String address,String school,double pay) {
        super(name, address);
        this.pay=pay;
        this.school=school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "staff[" + super.toString() + ",school=" + school + ",pay=" + pay +"]";
    }
    
}
