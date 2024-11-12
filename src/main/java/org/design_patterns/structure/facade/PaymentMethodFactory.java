package org.design_patterns.structure.facade;

public class PaymentMethodFactory {

    public static PaymentMethod createPaymentMethod(PaymentMethodType paymentMethodType) {
        if(paymentMethodType == PaymentMethodType.PAYPAL)
            return new PaypalPaymentMethod();
        if(paymentMethodType == PaymentMethodType.VISA)
            return new VisaPaymentMethod();
        if(paymentMethodType == PaymentMethodType.MASTERCARD)
            return new MastercardPaymentMethod();
        throw new IllegalArgumentException("Unsupported payment method type");
    }

}
