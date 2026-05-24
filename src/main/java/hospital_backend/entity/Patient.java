package hospital_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    private int id;

    private String name;

    private String mobile;

    private String disease;

    private String ward;

    private String admitDate;

    public Patient() {
    }

    public Patient(int id,
                   String name,
                   String mobile,
                   String disease,
                   String ward,
                   String admitDate) {

        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.disease = disease;
        this.ward = ward;
        this.admitDate = admitDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }
}