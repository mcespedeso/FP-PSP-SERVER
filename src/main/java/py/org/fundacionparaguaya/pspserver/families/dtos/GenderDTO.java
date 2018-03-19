package py.org.fundacionparaguaya.pspserver.families.dtos;

import java.io.Serializable;

import com.google.common.base.MoreObjects;

import py.org.fundacionparaguaya.pspserver.families.constants.Gender;

public class GenderDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer genderId;

    private Gender gender;

    private String descriptionEs;

    private String descriptionEn;

    public GenderDTO() {}

    private GenderDTO(Integer genderId, Gender gender,
            String descriptionEs, String descripcionEn){
        this.genderId = genderId;
        this.gender = gender;
        this.descriptionEs = descriptionEs;
        this.descriptionEn = descripcionEn;
    }

    public static class Builder {
        private Integer genderId;
        private Gender gender;
        private String descriptionEs;
        private String descriptionEn;

        public Builder genderId(Integer genderId){
            this.genderId = genderId;
            return this;
        }
        public Builder gender(Gender gender){
            this.gender = gender;
            return this;
        }
        public Builder descriptionEs(String descriptionEs){
            this.descriptionEs = descriptionEs;
            return this;
        }
        public Builder descriptionEn(String descriptionEn){
            this.descriptionEn = descriptionEn;
            return this;
        }
        public GenderDTO build(){
            return new GenderDTO(genderId,
                    gender,
                    descriptionEs,
                    descriptionEn);
        }
    }

    public static Builder builder(){
        return new Builder();
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDescriptionEs() {
        return descriptionEs;
    }

    public void setDescriptionEs(String descriptionEs) {
        this.descriptionEs = descriptionEs;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("genderId", genderId)
                .add("gender", gender)
                .add("descripcionEs", descriptionEs)
                .add("descripcionEn", descriptionEn).toString();
    }

}
