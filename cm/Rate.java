package cm;

        import java.math.BigDecimal;
        import java.util.ArrayList;
        import java.util.List;
/**
 * Created by CM on 01/02/2018.
 */
public class Rate {
    private CarParkKind kind;
    private BigDecimal hourlyNormalRate;
    private BigDecimal hourlyReducedRate;
    private ArrayList<Period> reduced = new ArrayList<>();
    private ArrayList<Period> normal = new ArrayList<>();
    private Irate staff = new Staff();
    private Irate student = new Student();
    private Irate visitor = new Visitor();

    public Rate(CarParkKind kind, BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods
            , ArrayList<Period> normalPeriods) {
        if (reducedPeriods == null || normalPeriods == null) {
            throw new IllegalArgumentException("periods cannot be null");
        }
        if (normalRate == null || reducedRate == null) {
            throw new IllegalArgumentException("The rates cannot be null");
        }
        if (normalRate.compareTo(BigDecimal.ZERO) < 0 || reducedRate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("A rate cannot be negative");
        }
        if (normalRate.compareTo(reducedRate) < 0) {
            throw new IllegalArgumentException("The normal rate cannot be less or equal to the reduced rate");
        }
        if (!isValidPeriods(reducedPeriods) || !isValidPeriods(normalPeriods)) {
            throw new IllegalArgumentException("The periods are not valid individually");
        }
        if (!isValidPeriods(reducedPeriods, normalPeriods)) {
            throw new IllegalArgumentException("The periods overlaps");
        }
        this.kind = kind;
        this.hourlyNormalRate = normalRate;
        this.hourlyReducedRate = reducedRate;
        this.reduced = reducedPeriods;
        this.normal = normalPeriods;
    }

    /**
     * Checks if two collections of periods are valid together
     * @param periods1
     * @param periods2
     * @return true if the two collections of periods are valid together
     */
    private boolean isValidPeriods(ArrayList<Period> periods1, ArrayList<Period> periods2) {
        Boolean isValid = true;
        int i = 0;
        while (i < periods1.size() && isValid) {
            isValid = isValidPeriod(periods1.get(i), periods2);
            i++;
        }
        return isValid;
    }

    /**
     * checks if a collection of periods is valid
     * @param list the collection of periods to check
     * @return true if the periods do not overlap
     */
    private Boolean isValidPeriods(ArrayList<Period> list) {
        Boolean isValid = true;
        if (list.size() >= 2) {
            Period secondPeriod;
            int i = 0;
            int lastIndex = list.size()-1;
            while (i < lastIndex && isValid) {
                isValid = isValidPeriod(list.get(i), ((List<Period>)list).subList(i + 1, lastIndex+1));
                i++;
            }
        }
        return isValid;
    }

    /**
     * checks if a period is a valid addition to a collection of periods
     * @param period the Period addition
     * @param list the collection of periods to check
     * @return true if the period does not overlap in the collecton of periods
     */
    private Boolean isValidPeriod(Period period, List<Period> list) {
        Boolean isValid = true;
        int i = 0;
        while (i < list.size() && isValid) {
            isValid = !period.overlaps(list.get(i));
            i++;
        }
        return isValid;
    }
    public BigDecimal calculate(Period periodStay) {
        int normalRateHours = periodStay.occurences(normal);
        int reducedRateHours = periodStay.occurences(reduced);

        BigDecimal calculation = new BigDecimal(0);//new code
        BigDecimal newCalculation = new BigDecimal(0);//new code

        calculation = (this.hourlyNormalRate.multiply(BigDecimal.valueOf(normalRateHours))).add(
                this.hourlyReducedRate.multiply(BigDecimal.valueOf(reducedRateHours)));

        // new code from here
        if(this.kind == CarParkKind.STAFF)
        {
//            if(calculation.compareTo(new BigDecimal(16)) < 1 )
//            {
//                return calculation;
//            }
//            else
//            {
//                return new BigDecimal(16);
//            }
            newCalculation = staff.calculation(calculation);

        }

        if(this.kind == CarParkKind.MANAGEMENT)
        {
//            if(calculation.compareTo(new BigDecimal(3.0)) < 1 )
//            {
//                return new BigDecimal(3);
//            }
//            else
//            {
//
//                return calculation;
//            }
            newCalculation = staff.calculation(calculation);
        }

//
        if(this.kind == CarParkKind.VISITOR)
        {
//
//
//            if(calculation.compareTo(new BigDecimal(8))==1)
//            {
//
//                newCalculation = calculation.subtract(new BigDecimal(8));
//                newCalculation = newCalculation.divide(new BigDecimal(2));
//
//                //return newCalculation;
//
//            }
//            else
//            {
//                return new BigDecimal(0);
//            }
            newCalculation = visitor.calculation(calculation);
        }
//
        if(this.kind == CarParkKind.STUDENT)
        {
//            if(calculation.compareTo(new BigDecimal(5.5)) < 1 )
//            {
//                return calculation;
//            }
//            else
//            {
//               newCalculation = calculation.subtract(new BigDecimal(5.5));
//               newCalculation = newCalculation.multiply(new BigDecimal(.75));
//               newCalculation = newCalculation.add(new BigDecimal(5.5));
//
//               //return newCalculation;
//
//            }

            newCalculation = student.calculation(calculation);
        }



//
        return newCalculation;
    }

}
