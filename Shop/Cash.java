package Shop;

class Cash extends PrintServices implements PaymentType, SavePayment{


    @Override
    public void processPayment() {
        System.out.println("via cash");
    }

    @Override
    public void savePaymentInfo() {
        System.out.println("cash payment info");

    }
}
