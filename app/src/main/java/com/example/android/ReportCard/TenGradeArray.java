package com.example.android.ReportCard;


public class TenGradeArray {
    private String mStudent;
    private double mMath , mChem , mphy , mavg ;
    public TenGradeArray (String studentname , double Math , double Chem , double phy , double avg ){
       mStudent = studentname;
        mMath = Math;
        mChem = Chem;
        mphy = phy ;
        mavg=avg;
    }

    public double getAvg() {
        return mavg;
    }

    public double getChem() {
        return mChem;
    }

    public double getMath() {
        return mMath;
    }

    public double getPhy() {
        return mphy;
    }

    public String getmStudent() {
        return mStudent;
    }
}
