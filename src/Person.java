public class Person {
    private final String ID;
    private FullName fullName;
    private String job;
    private String statusVaccin;
    private String vaccinType;
    private Address address;

    public Person(String ID, FullName fullName, String job, String statusVaccin, String vaccinType, Address address) {
        this.ID = ID;
        this.fullName = fullName;
        this.job = job;
        this.statusVaccin = statusVaccin;
        this.vaccinType = vaccinType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cmnd='" + ID + '\'' +
                ", fullName=" + fullName +
                ", job='" + job + '\'' +
                ", statusVaccin='" + statusVaccin + '\'' +
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

    public String getStatusVaccin() {
        return statusVaccin;
    }

    public void setStatusVaccin(String statusVaccin) {
        this.statusVaccin = statusVaccin;
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
