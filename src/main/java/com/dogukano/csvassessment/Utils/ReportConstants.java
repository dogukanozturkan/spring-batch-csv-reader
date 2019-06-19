package com.dogukano.csvassessment.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ReportConstants {


    public static final String ACCOUNTID = "accountId";
    public static final String DATE = "date";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String CREDIT_DEBIT = "creditDebit";
    public static final String AMOUNT = "amount";
    public static final String COUNTER_ACCOUNT = "counterAccount";
    public static final String VALUTADATUM = "Valutadatum";
    public static final String DESCRIPTION = "Description";
    public static final String VAT = "VAT";
    public static final String DATE_SENT = "dateSent";
    public static final String TYPE = "type";
    public static final String CURRENCY = "EUR";
    public static final String PROFIT = "PROFIT";
    public static final String LOSS = "LOSS";



    public static final String[] CreditIems = new String[]{ACCOUNTID, DATE, CURRENCY_CODE, CREDIT_DEBIT,
            AMOUNT, COUNTER_ACCOUNT, VALUTADATUM, DESCRIPTION, VAT, DATE_SENT};

    public static final String[] DebitItems = new String[]{ACCOUNTID, DATE, CURRENCY_CODE, CREDIT_DEBIT,
            AMOUNT, COUNTER_ACCOUNT, DESCRIPTION, VAT, TYPE};

}
