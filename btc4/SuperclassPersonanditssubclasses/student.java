package SuperclassPersonanditssubclasses;

public class student extends person {
    private double fee;
    private int year;
    private String program;
    public student() {
        super();
    }
    public student(double fee,int year,String program,String name,String address) {
        super(name ,address);
        this.fee = fee;
        this.year = year;
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
