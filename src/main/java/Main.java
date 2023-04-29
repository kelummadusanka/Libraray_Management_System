import Databases.DataLoader;
import Services.Implemetaions.LibraryServices;
import UI.CLI.CLI;
import UI.Interface.UIInterface;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        DataLoader data = new DataLoader("inBuild","inBuild");
        LibraryServices libraryServices = new LibraryServices(data);
        UIInterface ui = new CLI(libraryServices);
        ui.show();
    }
}