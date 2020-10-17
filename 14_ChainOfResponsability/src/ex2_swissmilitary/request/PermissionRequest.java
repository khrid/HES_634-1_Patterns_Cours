package ex2_swissmilitary.request;

public class PermissionRequest {
    private double days;

    public double getDays() {
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

    public PermissionRequest(double days, String purpose) {
        this.days = days;
        this.purpose = purpose;
    }


}
