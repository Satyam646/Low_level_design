
//Violation of seperation of concern
public class Invoice {
    private double amount;

    public double total() {                 // calculation
        return amount * 1.18;               // 18% GST
    }

    public void print() {                   // presentation
        System.out.println("Total: ₹" + total());
    }

    public void save() {                    // persistence
        // write to database
    }
}
// After applying seperation of concern
public class Invoice {                      // calculation only
    private final double amount;
    public Invoice(double amount) { this.amount = amount; }

    public double total() { return amount * 1.18; }
}

public class InvoicePrinter {               // presentation only
    public void print(Invoice invoice) {
        System.out.println("Total: ₹" + invoice.total());
    }
}

public class InvoiceRepository {            // persistence only
    public void save(Invoice invoice) {
        // write to database
    }
}