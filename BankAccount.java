
    class BankAccount {
        public String name;
        public int balance;
      
        public BankAccount(String name, int balance) {
          this.name = name;
          this.balance = balance;
        }
      
        public void deposit(int amount) {
          this.balance += amount;
        }
      
        public void withdraw(int amount) {
          if (this.balance >= amount) {
            this.balance -= amount;
          } else {
            System.out.println("Insufficient funds");
          }
        }
      
        public int getBalance() {
          return this.balance;
        }
      }
      
      class Main{
        public static void main(String[] args) {
          BankAccount account = new BankAccount("John Doe", 1000);
          account.deposit(10000);
          account.withdraw(200);
          System.out.println(account.getBalance());
        }
      }

