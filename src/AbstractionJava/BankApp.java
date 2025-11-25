package AbstractionJava;
abstract class Bank{
        abstract void loanInterestRate(); // must be defined by each bank

        void showBankRules() {
            System.out.println("Every bank must maintain minimum balance of ₹1000.");
        }
    }
    class SBI extends Bank {
        void loanInterestRate() {
            System.out.println("SBI Loan Interest Rate: 8.5%");
        }
    }
    class HDFC extends Bank {
        void loanInterestRate() {
            System.out.println("HDFC Loan Interest Rate: 9.1%");
        }
    }
    public class BankApp {
        public static void main(String[] args) {
            Bank b1 = new SBI();
            Bank b2 = new HDFC();

            b1.loanInterestRate();
            b1.showBankRules();

            b2.loanInterestRate();
            b2.showBankRules();
        }
    }
