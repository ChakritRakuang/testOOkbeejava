package com.company;

import java.util.Date;

public class Labtwo {

    public static void main(String[] args) {
    }
    public static boolean IsOverlapped (Date startDate1, Date endDate1, Date startDate2, Date endDate2)
            throws NullPointerException {
        if ((startDate1.before(startDate2) && endDate1.after(startDate2))
                || (startDate1.before(endDate2) && endDate1.after(endDate2))
                || (startDate1.before(startDate2) && endDate1.after(endDate2))
                || (startDate1.equals(startDate2) && endDate1.equals(endDate2))) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}