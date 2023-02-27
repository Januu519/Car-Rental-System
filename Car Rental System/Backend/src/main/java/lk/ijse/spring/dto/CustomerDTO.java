package lk.ijse.spring.dto;

import org.springframework.web.multipart.MultipartFile;

public class CustomerDTO {
    private String name;
    private String nic;
    private String drivingLicense;
    private String email;
    private String password;
    private String contactNumber;
    private String address;
    private String imageLocation;
    private MultipartFile img;


    public CustomerDTO() {
    }

    public CustomerDTO(String name, String nic, String drivingLicense, String email, String password, String contactNumber, String address, String imageLocation, MultipartFile img) {
        this.name = name;
        this.nic = nic;
        this.drivingLicense = drivingLicense;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.address = address;
        this.imageLocation = imageLocation;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                ", imageLocation='" + imageLocation + '\'' +
                ", img=" + img +
                '}';
    }
}
