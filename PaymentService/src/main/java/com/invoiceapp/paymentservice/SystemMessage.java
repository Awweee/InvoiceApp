package com.invoiceapp.paymentservice;

import java.io.Serializable;

public class SystemMessage implements Serializable {

    private static final long serialVersionUID=1L;

    private String source;
    private String message;

    private String getSource(){
        return source;
    }
    private String getMessage(){
        return message;
    }
    private void setSource(String source) {
        this.source = source;
    }
    private void setMessage(String message){
        this.message=message;
    }
}
