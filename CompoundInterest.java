class CompoundInterest {
    private double principal;
    private double rate;
    private int time;

    public CompoundInterest(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateCompoundInterest() {
        double monthlyInterestRate = rate / 12 / 100;
        int totalMonths = time * 12;
        double totalAmount = principal * Math.pow(1 + monthlyInterestRate, totalMonths);
        return totalAmount;
    }
    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest(500000, 18, 3);
        double totalAmount = compoundInterest.calculateCompoundInterest();

        System.out.println("The total amount Mr. Bob will have paid after 3 years with compound interest is: " + totalAmount);
    }
}

