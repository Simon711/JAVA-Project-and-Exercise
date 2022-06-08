class Bill{
    private int airtime, totalSms;
    private final double callrate = 0.25;
    private final double smsrate = 0.05;


    public Bill(int a, int b){
        airtime = a;
        totalSms = b;
    }

    public Bill calculateTotal(Bill a, Bill b){
        airtime = a.airtime + b.airtime;
        totalSms = a.totalSms + b.totalSms;

        return new Bill(airtime, totalSms);
    }

    public double calculateBill(){
        return ((airtime*callrate) + (totalSms*smsrate));
    }
}

public class BillTest{
    public static void main (String[] args){
        Bill mum = new Bill (140,110); //mum's airtime=130, sms=100
        Bill sister = new Bill (200, 50); //sister's airtime=200, sms=50
        Bill family = new Bill(0,0);
        family = family.calculateTotal(mum,sister);
        System.out.println("Total bill is: ");
        System.out.println(family.calculateBill());
    }
}
