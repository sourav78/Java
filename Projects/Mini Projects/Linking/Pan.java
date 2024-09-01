public class Pan {
    private String panNumber;
    private String addharNumber;
    private String bankDetails;
    private String investment;

    public Pan(String panNumber, String addharNumber, String bankDetails, String investment) {
        this.panNumber = panNumber;
        this.addharNumber = addharNumber;
        this.bankDetails = bankDetails;
        this.investment = investment;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAddharNumber() {
        return addharNumber;
    }

    public void setAddharNumber(String addharNumber) {
        this.addharNumber = addharNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", addharNumber='" + addharNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
