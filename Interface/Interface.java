import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

enum PaymentStatus { SUCCESS, FAILED }

record PaymentResult(PaymentStatus status, String transactionId, String message) {}

interface PaymentGateway {
    PaymentResult initiatePayment(BigDecimal amount, String currency);
}

class StripePaymentGateway implements PaymentGateway {
    @Override
    public PaymentResult initiatePayment(BigDecimal amount, String currency) {
        System.out.println("Stripe processing: " + amount + " " + currency);
        return new PaymentResult(PaymentStatus.SUCCESS, "stripe_" + UUID.randomUUID(), "OK");
    }
}

class RazorpayPaymentGateway implements PaymentGateway {
    @Override
    public PaymentResult initiatePayment(BigDecimal amount, String currency) {
        System.out.println("Razorpay processing: " + amount + " " + currency);
        return new PaymentResult(PaymentStatus.SUCCESS, "rzp_" + UUID.randomUUID(), "OK");
    }
}

class CheckoutService {
    private final PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = Objects.requireNonNull(paymentGateway, "paymentGateway must not be null");
    }

    public PaymentResult checkout(BigDecimal amount, String currency) {
        if (amount == null || amount.signum() <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        return paymentGateway.initiatePayment(amount, currency);
    }
}

class Interface {
    public static void main(String[] args) {
        CheckoutService stripeCheckout = new CheckoutService(new StripePaymentGateway());
        System.out.println(stripeCheckout.checkout(new BigDecimal("26.00"), "USD"));

        CheckoutService razorpayCheckout = new CheckoutService(new RazorpayPaymentGateway());
        System.out.println(razorpayCheckout.checkout(new BigDecimal("36.00"), "INR"));
    }
}