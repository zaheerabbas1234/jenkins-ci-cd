package com.jenkins.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jenkins {

    @Id
    private String citizenId;
    private String citizenName;
    private String citizenVaccinationCenter;
    private String citizenVaccinationCenterId;

    public Jenkins() {
        super();
    }

    public Jenkins(String citizenId, String citizenName, String citizenVaccinationCenter, String citizenVaccinationCenterId) {
        super();
        this.citizenId = citizenId;
        this.citizenName = citizenName;
        this.citizenVaccinationCenter = citizenVaccinationCenter;
        this.citizenVaccinationCenterId = citizenVaccinationCenterId;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getCitizenVaccinationCenter() {
        return citizenVaccinationCenter;
    }

    public void setCitizenVaccinationCenter(String citizenVaccinationCenter) {
        this.citizenVaccinationCenter = citizenVaccinationCenter;
    }

    public String getCitizenVaccinationCenterId() {
        return citizenVaccinationCenterId;
    }

    public void setCitizenVaccinationCenterId(String citizenVaccinationCenterId) {
        this.citizenVaccinationCenterId = citizenVaccinationCenterId;
    }

    @Override
    public String toString() {
        return "Jenkins [citizenId=" + citizenId + ", citizenName=" + citizenName + ", citizenVaccinationCenter=" + citizenVaccinationCenter + ", citizenVaccinationCenterId=" + citizenVaccinationCenterId + "]";
    }
}
