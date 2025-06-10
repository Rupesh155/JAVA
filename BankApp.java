
import java.util.ArrayList;
import java.util.Scanner;



// public class DateTimeDemo {
//     public static void main(String[] args) {
//         // LocalDate example
//         LocalDate date =  LocalDate.now();
  
//         System.out.println("Date: " + date);

//         // LocalTime example
//         // LocalTime time = LocalTime.now();
//         // System.out.println("Time: " + time);

//         // LocalDateTime example
//         // LocalDateTime dateTime = LocalDateTime.of(date, time);
//         // System.out.println("DateTime: " + dateTime);

//         // // ZonedDateTime example
//         // ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//         // System.out.println("ZonedDateTime: " + zdt);

//         // Instant example
//         // Instant now = Instant.now();
//         // System.out.println("Instant: " + now);

//         // // Duration example
//         // Duration duration = Duration.between(LocalTime.of(10, 0), LocalTime.of(12, 30));
//         // System.out.println("Duration in minutes: " + duration.toMinutes());

//         // // Period example
//         // Period period = Period.between(LocalDate.of(2020, 1, 1), LocalDate.now());
//         // System.out.println("Period in years: " + period.getYears());

//         // // Formatting example
//         // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//         // String formattedDate = dateTime.format(formatter);
//         // System.out.println("Formatted DateTime: " + formattedDate);
//     }
// }


// Simple Console-based Bank Application in Java
// import java.util.*;

// class Transaction {
//     String type;
//     double amount;

//     Transaction(String type, double amount) {
//         this.type = type;
//         this.amount = amount;
//     }

//     public String toString() {
//         return type + ": Rs. " + amount;
//     }
// }

// class Account {
//     private String name;
//     private int accountNumber;
//     private double balance;
//     private List<Transaction> transactions = new ArrayList<>();

//     Account(String name, int accountNumber) {
//         this.name = name;
//         this.accountNumber = accountNumber;
//         this.balance = 0;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             transactions.add(new Transaction("Deposit", amount));
//             System.out.println("Deposited successfully!");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             transactions.add(new Transaction("Withdrawal", amount));
//             System.out.println("Withdrawn successfully!");
//         } else {
//             System.out.println("Insufficient balance or invalid amount.");
//         }
//     }

//     public void checkBalance() {
//         System.out.println("Current Balance: Rs. " + balance);
//     }

//     public void viewTransactions() {
//         if (transactions.isEmpty()) {
//             System.out.println("No transactions yet.");
//         } else {
//             for (Transaction t : transactions) {
//                 System.out.println(t);
//             }
//         }
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAccountNumber() {
//         return accountNumber;
//     }
// }

// public class BankApp {
//     static Scanner sc = new Scanner(System.in);
//     static Account account;
//     public static void main(String[] args) {
//         System.out.print("Enter account holder name: ");
//         String name = sc.nextLine();
//         int accNo = new Random().nextInt(10000) + 10000;
//         account = new Account(name, accNo);

//         System.out.println("Account created successfully. Account Number: " + accNo);

//         int choice;
//         do {
//             System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter amount to deposit: ");
//                     double dep = sc.nextDouble();
//                     account.deposit(dep);
//                     break;
//                 case 2:
//                     System.out.print("Enter amount to withdraw: ");
//                     double with = sc.nextDouble();
//                     account.withdraw(with);
//                     break;
//                 case 3:
//                     account.checkBalance();
//                     break;
//                 case 4:
//                     account.viewTransactions();
//                     break;
//                 case 5:
//                     System.out.println("Thank you for using the Bank App.");
//                     break;
//                 default:
//                     System.out.println("Invalid choice.");
//             }
//         } while (choice != 5);
//     }
// }


class Transactions{
    String type;
    double amount;
        Transactions(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
        public String toString() {
        return type + ": Rs. " + amount;
    }

}



class Account{
     private  int accountNumber;
    private   String name;
    private   double balance;
    ArrayList<Transactions> transaction=new ArrayList<>();

    public Account(int accountNumber,String name,double balance) {
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transaction.add(new Transactions("Deposit", amount));
            System.out.println("Deposited successfully!");
        }
    }
        public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transaction.add(new Transactions("Withdrawal", amount));
            System.out.println("Withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }


        public void viewTransactions() {
        if (transaction.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transactions t : transaction) {
                System.out.println(t);
            }
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    } 
    }
    class BankApp{
            static Scanner sc = new Scanner(System.in);
        static Account account;
        public static void main(String[] args) {
                    System.out.print("Enter account holder name: ");
                   String name = sc.nextLine();
            account=new Account(47267, name, 0);
         System.out.println("Account created successfully. Account Number: " );
    
            int choice;
            do {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double with = sc.nextDouble();
                        account.withdraw(with);
                        break;
                    case 3:
                        account.checkBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
    }
}


// class Transaction{
//     String type;
//     double  amount;

//     public Transaction(String type,double amount) {
//         this.type=type;
//         this.amount=amount;
//     }
    

// }

// class Account{
//     private    String name;
//      private  int accountNumber;
//     private    double balance;

//     public Account(String name,int accountNumber,double balance) {
//         this.accountNumber=accountNumber;
//         this.name=name;
//         this.balance=balance;
//     }
    
//     ArrayList<Transaction> transactions=new ArrayList<>();
 
//      public  void deposit(){


//      }
// }

// class BankApp{
//     public static void main(String[] args) {
        
//     }
// }