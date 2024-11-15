package t;

import Reader.ReadDataFromJson;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static Reader.ReadDataFromJson.dataModel;

public class T {

    ReadDataFromJson readDataFromJson;

    @Test
    public void t1() throws FileNotFoundException {
        System.out.println(dataModel().URL);
    }


    @Test
    public void t2() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(dataModel().Login.ValidCredentials.Username);
        System.out.println(dataModel().Login.ValidCredentials.Password);
    }

    @Test
    public void t3() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(dataModel().Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(dataModel().Login.InvalidCredentials.InvalidUsername.Password);
    }

    @Test
    public void t4() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(dataModel().Login.InvalidCredentials.InvalidPassword.Username);
        System.out.println(dataModel().Login.InvalidCredentials.InvalidPassword.Password);
    }
}