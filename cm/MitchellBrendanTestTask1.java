package cm;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
//import java.time.Period;
public class MitchellBrendanTestTask1
{

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void positivePath() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7) ;
        Period second = new Period(8,12) ;
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF ;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }



    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateGreaterThanReducedRate() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7) ;
        Period second = new Period(8,12) ;
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF ;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedRateGreaterThanZero() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF ;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(-1);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedPeriodAndNormalPeriodDontOverlap() throws Exception {
        /* Period a,b ; */
        Period first = new Period(7,10);
        Period second = new Period(7,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void carParkKindEqualsStaffVisitorStudentManagement() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateGreaterThanZero() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(-1),reducedRate = new BigDecimal(-1);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateNull() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(-1);
        //BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(-1);

        Rate rate = new Rate(kind,null,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedRateNull() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(-1),reducedRate = new BigDecimal(-1);

        Rate rate = new Rate(kind,normalRate,null,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedPeriodNull() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(null);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(-1),reducedRate = new BigDecimal(-1);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalPeriodNull() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(null);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(-1),reducedRate = new BigDecimal(-1);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalPeriodFirstNumberLessThanZero() throws Exception {
        Period a,b ;
        Period first = new Period(-1,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalPeriodSecondNumberLessThanZero() throws Exception {
        Period a,b ;
        Period first = new Period(1,-7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }


    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedPeriodFirstNumberLessThanZero() throws Exception {
        Period a,b ;
        Period first = new Period(-1,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedPeriodSecondNumberLessThanZero() throws Exception {
        Period a,b ;
        Period first = new Period(1,-7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedPeriodStay() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(4);
        assertEquals(expectedResult,rate.calculate(new Period(20,21)));



    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalPeriodStay() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(12);
        assertEquals(expectedResult,rate.calculate(new Period(13,15)));



    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reduceAndNormalPeriodStay() throws Exception {
        Period a,b ;
        Period first = new Period(20,23);
        Period second = new Period(7,19);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(8);
        assertEquals(expectedResult,rate.calculate(new Period(18,20)));



    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void freePeriods() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(0);
        assertEquals(expectedResult,rate.calculate(new Period(2,4)));



    }


}

