package cm;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;


public class MitchellBrendanTestTask3
{

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalRateGreaterThanReducedRate() throws Exception {
        /* Period a,b ; */
        Period first = new Period(0,7) ;
        Period second = new Period(8,12) ;
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF ;
        BigDecimal normalRate = new BigDecimal(2),reducedRate = new BigDecimal(4);

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
    //new test
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void multipleReducedPeriodAndMultipleNormalPeriodDontOverlap() throws Exception {
        /* Period a,b ; */
        Period first = new Period(7,9);
        Period second = new Period(8,13);
        Period third = new Period(14,19);

        Period fifth = new Period(19,21);
        Period sixth = new Period(21,22);
        Period seventh = new Period(22,23);


        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        normalPeriod.add(second);
        normalPeriod.add(third);

        reducedPeriod.add(fifth);
        reducedPeriod.add(sixth);
        reducedPeriod.add(seventh);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    //new test
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void TwoPeriodsInNormalPeriodDontOverlap() throws Exception {
        /* Period a,b ; */
        Period first = new Period(7,9);
        Period second = new Period(8,13);

        Period fifth = new Period(19,21);
        Period sixth = new Period(21,22);



        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        normalPeriod.add(second);


        reducedPeriod.add(fifth);
        reducedPeriod.add(sixth);


        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }


    @org.junit.Test(expected = IllegalArgumentException.class)
    public void TwoPeriodsInReducedPeriod() throws Exception {
        /* Period a,b ; */
        Period first = new Period(7,9);
        Period second = new Period(9,13);

        Period fifth = new Period(19,21);
        Period sixth = new Period(20,22);



        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        normalPeriod.add(second);


        reducedPeriod.add(fifth);
        reducedPeriod.add(sixth);


        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }


    @org.junit.Test(expected = IllegalArgumentException.class)
    public void collectionsOfPeriodsValidTogether() throws Exception {
        /* Period a,b ; */
        Period first = new Period(7,9);
        Period second = new Period(9,13);

        Period fifth = new Period(8,21);
        Period sixth = new Period(21,22);



        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        normalPeriod.add(second);


        reducedPeriod.add(fifth);
        reducedPeriod.add(sixth);


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
    public void normalPeriodFirstNumberGreaterThanSecond() throws Exception {
        Period a,b ;
        Period first = new Period(5,3);
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
        Period first = new Period(1,7);
        Period second = new Period(-3,0);
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
        Period first = new Period(1,7);
        Period second = new Period(8,-12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void periodNotNull() throws Exception {
        Period a,b ;
        Period first = new Period(1,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate, null, null);

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void normalPeriodEqualNull() throws Exception {
        Period a,b ;
        Period first = new Period(1,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod=null;
        reducedPeriod.add(second);

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate, reducedPeriod, normalPeriod);

    }


    @org.junit.Test(expected = IllegalArgumentException.class)
    public void reducedPeriodEqualNull() throws Exception {
        Period a,b ;
        Period first = new Period(1,7);
        Period second = new Period(8,12);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod=null;

        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate, reducedPeriod, normalPeriod);

    }

    @org.junit.Test
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
        BigDecimal expectedResult = new BigDecimal(2);
        assertEquals(expectedResult,rate.calculate(new Period(20,21)));



    }

    @org.junit.Test
    public void normalPeriodStay() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(8);
        assertEquals(expectedResult,rate.calculate(new Period(13,15)));



    }

    @org.junit.Test
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
        BigDecimal expectedResult = new BigDecimal(2);
        assertEquals(expectedResult,rate.calculate(new Period(18,20)));



    }

    @org.junit.Test
    public void freePeriods() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(0);
        assertEquals(expectedResult,rate.calculate(new Period(2,4)));



    }

    //new test for task 3
    @org.junit.Test
    public void calculateStaff() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(16);
        assertEquals(expectedResult,rate.calculate(new Period(8,16)));



    }




    @org.junit.Test
    public void calculateManagement() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(1);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(8);
        assertEquals(expectedResult,rate.calculate(new Period(7,9)));



    }

    @org.junit.Test
    public void calculateStudent() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(5.875);
        assertEquals(expectedResult,rate.calculate(new Period(20,23)));



    }

    @org.junit.Test
    public void calculateStudent2() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind= CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(2);
        assertEquals(expectedResult,rate.calculate(new Period(20,21)));



    }


    @org.junit.Test
    public void calculateVisitor() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(6);
        assertEquals(expectedResult,rate.calculate(new Period(8,13)));



    }

    @org.junit.Test
    public void calculateVisitor2() throws Exception {
        Period a,b ;
        Period first = new Period(7,18);
        Period second = new Period(19,23);
        ArrayList<Period> normalPeriod = new ArrayList<Period>() ,reducedPeriod = new ArrayList<Period>();
        normalPeriod.add(first);
        reducedPeriod.add(second);


        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(4),reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind,normalRate,reducedRate,reducedPeriod,normalPeriod);
        BigDecimal expectedResult = new BigDecimal(0);
        assertEquals(expectedResult,rate.calculate(new Period(7,8)));



    }

}


