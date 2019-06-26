package com.dogukano.csvassessment.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ReportConstants {


    private static final String ACCOUNTID = "accountId";
    private static final String DATE = "date";
    private static final String CURRENCY_CODE = "currencyCode";
    private static final String CREDIT_DEBIT = "creditDebit";
    private static final String AMOUNT = "vatIncluded";
    private static final String COUNTER_ACCOUNT = "counterAccount";
    private static final String VALUE_DATE = "valueDate"; // Valutadatum
    private static final String DESCRIPTION = "Description";
    private static final String VAT = "VAT";
    private static final String DATE_SENT = "dateSent";
    private static final String TYPE = "type";

    public static final String CURRENCY = "EUR";
    public static final String PROFIT = "PROFIT";
    public static final String LOSS = "LOSS";



    public static final String[] CreditItems = new String[]{ACCOUNTID, DATE, CURRENCY_CODE, CREDIT_DEBIT,
            AMOUNT, COUNTER_ACCOUNT, VALUE_DATE, DESCRIPTION, VAT, DATE_SENT};

    public static final String[] DebitItems = new String[]{ACCOUNTID, DATE, CURRENCY_CODE, CREDIT_DEBIT,
            AMOUNT, COUNTER_ACCOUNT, DESCRIPTION, VAT, TYPE};

}
