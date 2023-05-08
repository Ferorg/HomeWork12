import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Firm {
    private String FirmName;
    private String fieldOfActivity;
    private int id;
    private int duty;

    public Firm(int id, String firmName, String fieldOfActivity, int duty) {
        this.id = id;
        this.FirmName = firmName;
        this.fieldOfActivity = fieldOfActivity;
        this.duty = duty;
    }

    public String getFirmName() {
        return FirmName;
    }

    public void setFirmName(String firmName) {
        FirmName = firmName;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuty() {
        return duty;
    }

    public void setDuty(int duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "FirmName='" + FirmName + '\'' +
                ", fieldOfActivity='" + fieldOfActivity + '\'' +
                ", id=" + id +
                ", duty=" + duty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Firm firm = (Firm) o;
        return id == firm.id && duty == firm.duty && Objects.equals(FirmName, firm.FirmName) && Objects.equals(fieldOfActivity, firm.fieldOfActivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirmName, fieldOfActivity, id, duty);
    }


}
