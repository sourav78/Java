public class Addhar {
    private String adddharNumber;
    private String name;
    private String fatherName;
    private String address;

    public Addhar(String adddharNumber, String name, String fatherName, String address) {
        this.adddharNumber = adddharNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
    }

    public String getAdddharNumber() {
        return adddharNumber;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Addhar{" +
                "adddharNumber='" + adddharNumber + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
