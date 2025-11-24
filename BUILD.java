package main;

import org.orekit.data.*;
import org.orekit.time.AbsoluteDate;
import org.orekit.time.TimeScalesFactory;
import org.orekit.utils.DataContext;

public class Main {
    public static void main(String[] args) {

        try {
            String orekitDataPath =
                "C:\\orekit\\orekit-data\\orekit-data-main";

            // NEW API (Orekit 11+)
            DataProvidersManager manager =
                    DataContext.getDefault().getDataProvidersManager();

            manager.addProvider(
                    new DirectoryCrawler(new java.io.File(orekitDataPath))
            );

            AbsoluteDate date =
                    new AbsoluteDate(2025, 1, 1, 0, 0, 0.0, TimeScalesFactory.getUTC());

            System.out.println("Orekit data loaded successfully!");
            System.out.println("Test date: " + date);

        } catch (Exception e) {
            System.out.println("Error loading Orekit data:");
            e.printStackTrace();
        }
    }
}
