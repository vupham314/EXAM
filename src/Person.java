public class Person {
    private final String ID;
    private FullName fullName;
    private String job;
    private String vaccinType;
    private Address address;

    public Person(String ID, FullName fullName, String job, String vaccinType, Address address) {
        this.ID = ID;
        this.fullName = fullName;
        this.job = job;
        this.vaccinType = vaccinType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cmnd='" + ID + '\'' +
                ", fullName=" + fullName +
                ", job='" + job + '\'' +
                ", vaccinType='" + vaccinType + '\'' +
                ", address=" + address +
                '}';
    }

    public String getID() {
        return ID;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getVaccinType() {
        return vaccinType;
    }

    public void setVaccinType(String vaccinType) {
        this.vaccinType = vaccinType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
