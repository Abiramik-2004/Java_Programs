package reentry;

interface RBI {
    void setIntrestRate();
}

interface KYC {
    void updateKYC();
}

interface Loan {
    void UpdateKYC();
    void checkLoan();
}

public class Bank implements RBI, KYC, Loan {

    Bank() {
        super();
    }

    @Override
    public void setIntrestRate() {
        System.out.println("Interest rate is 6%");
    }

    @Override
    public void checkLoan() {
        System.out.println("Not eligible for loan");
    }

    @Override
    public void UpdateKYC() {
        System.out.println("KYC Updated");
    }

    @Override
    public void updateKYC() {
        System.out.println("Updating basic KYC...");
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Bank b = new Bank();

        b.setIntrestRate();
        b.UpdateKYC();
        b.updateKYC();
        b.checkLoan();
    }
}
