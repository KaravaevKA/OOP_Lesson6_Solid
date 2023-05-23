package src.solid;


import src.solid.dip.Print;
import src.solid.dip.PrintReport;
import src.solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        Print print= new PrintReport();
        report.output(print);
    }
}
