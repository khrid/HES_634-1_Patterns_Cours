package ex2_swissmilitary.request;

public class PermissionRequest {
    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    private String purpose;

    public PermissionRequest(int days, String purpose) {
        this.days = days;
        this.purpose = purpose;
    }


}
