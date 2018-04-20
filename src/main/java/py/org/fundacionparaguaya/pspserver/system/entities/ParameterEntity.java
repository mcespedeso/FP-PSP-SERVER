package py.org.fundacionparaguaya.pspserver.system.entities;

import py.org.fundacionparaguaya.pspserver.common.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.common.base.MoreObjects;

@Entity
@Table(name = "parameter", schema = "system")
public class ParameterEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "system.parameter_parameter_id_seq")
    @SequenceGenerator(name = "system.parameter_parameter_id_seq",
    sequenceName = "system.parameter_parameter_id_seq", allocationSize = 1)
    @Column(name = "parameter_id")
    private Long parameterId;

    private String keyParameter;

    private String description;

    private String typeParameter;

    private String value;

    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    public String getKeyParameter() {
        return keyParameter;
    }

    public void setKeyParameter(String keyParameter) {
        this.keyParameter = keyParameter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeParameter() {
        return typeParameter;
    }

    public void setTypeParameter(String typeParameter) {
        this.typeParameter = typeParameter;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("parameterId", parameterId)
                .add("keyParameter", keyParameter)
                .add("description", description)
                .add("typeParameter", typeParameter)
                .add("value", value)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (parameterId == null || obj == null
                || getClass() != obj.getClass()) {
            return false;
        }
        ParameterEntity toCompare = (ParameterEntity) obj;
        return parameterId.equals(toCompare.parameterId);
    }

    @Override
    public int hashCode() {
        return parameterId == null ? 0 : parameterId.hashCode();
    }

}
