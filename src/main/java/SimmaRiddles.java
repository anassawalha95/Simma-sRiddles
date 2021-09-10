public
class SimmaRiddles {


    public static
    void solveTripleVariableEquation(double fizzyDrinkPerUnit, double donutPricePerUnit, double burgerPricePerUnit, int NumberOfInvitedPeople, double balance) {
        boolean flag = true;
        for (int i = 0; i <= NumberOfInvitedPeople; i++) {
            for (int j = 0; j <= NumberOfInvitedPeople; j++) {
                for (int y = 0; y <= NumberOfInvitedPeople; y++) {
                    double i1 = i * fizzyDrinkPerUnit;
                    double j1 = j * donutPricePerUnit;
                    double y1 = y * burgerPricePerUnit;
                    if (i + j + y == NumberOfInvitedPeople && i1 < balance && j1 * 2 < balance && y1 < balance) {

                        if (i1 + j1 + y1 == balance && i != 0 && j != 0 && y != 0) {
                            System.out.println("you will have to buy " + i + " drinks, " + j + " donuts," + y + " burger.");
                            flag = false;

                        }
                    }
                }
            }
        }

        if (flag)
            System.out.println("your balance isn't enough");
    }

    public static
    double calcTheSeriesSolution1(double a1, double a2, double endNumberOfTheSeries) {
        endNumberOfTheSeries--;
        double d = a2 - a1;
        while (endNumberOfTheSeries % a1 != 0) {
            endNumberOfTheSeries -= 1;
        }
        double n = findNumberOfTheBoundersN(a1,endNumberOfTheSeries,d);

        //  System.out.println(TotalValue);

        return (n / 2) * (2 * a1 + ((n - 1) * d));
    }

    public static
    double calcTheSeriesSolution2(int val1, int val2,int lastValue) {


        double value1 = 0;
        double value2 = 0;
        double value3 = 0;

        for (int i = val1; i < lastValue; i += val1) {
            value1 += i;
        }


        for (int y = val2; y < lastValue; y += val2) {
            value2 += y;
        }


        for (int z = val1*val2; z < 1000; z += 15) {
            value3 += z;
        }


        return value1 + value2 - value3;


    }
    public static double findNumberOfTheBoundersN(double a1,double an,double d){
        double n= ((an-a1)/d)+1;
         return n;
    }
    public static
    double findTwoSeriesSummationValue(double firstSeriesStartingValue, double SecondSeriesStartingValue, double endOfTheSeries) {
        double a1 = firstSeriesStartingValue * SecondSeriesStartingValue;

        double tempEndOfTheseries = endOfTheSeries;
        while (tempEndOfTheseries % a1 != 0) {
            tempEndOfTheseries -= 1;
        }
        double n = tempEndOfTheseries / a1;
        double Sn = (n / 2) * (a1 + tempEndOfTheseries);
        double d = ((2 * Sn) / ((n * n) - n)) - ((2 * a1) / (n - 1));
        double a2 = a1 + d;
        return calcTheSeriesSolution1(a1, a2, endOfTheSeries);

    }

    public static
    void main(String[] args) {

        solveTripleVariableEquation(0.2, 2, 10, 200, 200);

        double firstSeries = calcTheSeriesSolution1(3, 6, 1000);
        double secondSeries = calcTheSeriesSolution1(5, 10, 1000);
        double firstAndSecondSeriesIntersections = findTwoSeriesSummationValue(3, 5, 1000);
        double seriesFinalValue = firstSeries + secondSeries - firstAndSecondSeriesIntersections;


        System.out.println("Solution 1: The Summation of the Two Series is : " + seriesFinalValue);


        System.out.println("Solution 2: The Summation of the Two Series is : " + calcTheSeriesSolution2(3,5,1000));


    }
}
