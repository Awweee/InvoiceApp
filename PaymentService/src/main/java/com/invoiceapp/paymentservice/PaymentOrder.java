package com.invoiceapp.paymentservice;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentOrder implements Serializable {

    private static final long serialVersionUID=1L;

    private String orderId;
    private String invoiceId;
    private String supplierId;
    private String supplierName;
    private double amount;
    private String currency;
    private String iban;          // target IBAN of the supplier
    private String createdAt;
    private PaymentStatus status;

    public static PaymentOrder create(String invoiceId, String supplierId,
                                      String supplierName, String invoiceNumber,
                                      double amount, String currency,
                                      String iban, String dueDate) {
        PaymentOrder o = new PaymentOrder();
        o.orderId       = UUID.randomUUID().toString();
        o.invoiceId     = invoiceId;
        o.supplierId    = supplierId;
        o.supplierName  = supplierName;
        o.amount        = amount;
        o.currency      = currency;
        o.iban          = iban;
        o.createdAt     = LocalDateTime.now().toString();
        o.status        = PaymentStatus.PENDING;
        return o;
    }
    public String getOrderId()       { return orderId; }
    public void setOrderId(String v) { this.orderId = v; }

    public String getInvoiceId()       { return invoiceId; }
    public void setInvoiceId(String v) { this.invoiceId = v; }

    public String getSupplierId()       { return supplierId; }
    public void setSupplierId(String v) { this.supplierId = v; }

    public String getSupplierName()       { return supplierName; }
    public void setSupplierName(String v) { this.supplierName = v; }

    public double getAmount()       { return amount; }
    public void setAmount(double v) { this.amount = v; }

    public String getCurrency()       { return currency; }
    public void setCurrency(String v) { this.currency = v; }

    public String getIban()       { return iban; }
    public void setIban(String v) { this.iban = v; }

    public String getCreatedAt()       { return createdAt; }
    public void setCreatedAt(String v) { this.createdAt = v; }

    public PaymentStatus getStatus()       { return status; }
    public void setStatus(PaymentStatus v) { this.status = v; }

    @Override
    public String toString() {
        return "PaymentOrder{orderId=" + orderId +
                ", invoiceId=" + invoiceId +
                ", supplier=" + supplierName +
                ", amount=" + amount + " " + currency +
                ", status=" + status + "}";
    }
}
