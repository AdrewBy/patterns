package com.chapter1_5.behavior.chain1_0;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment waterPay = new WaterPayment(null);
        Payment electricityPay = new ElectricityPayment(waterPay);
        Payment mortgagePay = new MortgagePayment(electricityPay);

   //     mortgagePay.payManager("Pay mortgage");
   //     mortgagePay.payManager("Pay electricity");
        mortgagePay.payManager("water");
        mortgagePay.payManager("heat");
    }
}
