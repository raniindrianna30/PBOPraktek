package AnotherType_of_Employee;
public class Commission extends Hourly{
       private double TotalSales;
       private double CommissionRate;
       
       public Commission (String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate, double ComRate) {
        
        super (eName, eAddress, ePhone, socSecNumber, rate);
        CommissionRate = ComRate;
       }
       
      public void addSales(double totalSales) {
          this.TotalSales=TotalSales * CommissionRate;
      } 
      
      public double pay() {
          double payment = super.pay() + TotalSales;
          TotalSales = 0;
          return payment;
      }
      
      public String toString() {
          String result = super.toString();
          result += "\nTotal Sales : " + TotalSales;
          
          return result;
      }
}


