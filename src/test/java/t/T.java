package t;

import data.DataModel;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class T {

    ReadDataFromJson readDataFromJson;
    DataModel dataModel;

    @Test
    public void t1() throws FileNotFoundException {

        dataModel = new ReadDataFromJson().readJsonFile();
        System.out.println(dataModel.URL);
        System.out.println(dataModel.Login.ValidCredentials.Username);
        System.out.println(dataModel.Login.InvalidCredentials.InvalidPassword.Password);

    }
}
