public class Simple_Interest {
        private double principal;
        private double rate;
        private double time;
    
        public Simple_Interest(double principal, double rate, double time) {
            this.principal = principal;
            this.rate = rate;
            this.time = time;
        }
    
        public double calculateSimpleInterest() {
            return (principal * rate * time) / 100;
        }
    
    
        public static void main(String[] args) {
            Simple_Interest simpleInterest = new Simple_Interest(100000, 5, 5);
            double simpleInterestAmount = simpleInterest.calculateSimpleInterest();
    
            System.out.println("The simple interest for Mr. Bob is: " + simpleInterestAmount);
        }}
    

    

