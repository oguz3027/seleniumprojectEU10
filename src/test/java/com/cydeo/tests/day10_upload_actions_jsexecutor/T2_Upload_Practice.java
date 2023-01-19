package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.Driver;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        Driver.getDriver().get("https://practice.cydeo.com/upload" );


    }
}
