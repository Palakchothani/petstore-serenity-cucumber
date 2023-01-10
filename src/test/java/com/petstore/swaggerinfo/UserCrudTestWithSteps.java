package com.petstore.swaggerinfo;

import com.petstore.testbase.TestBase;
import com.petstore.utils.TestUtils;

public class UserCrudTestWithSteps extends TestBase

{
    static int id = TestUtils.getRandomNum();
    static String username = "" + TestUtils.getRandomValue();
    static String firstName = "";
    static String lastName = "";
    static String email = ".Patel" + TestUtils.getRandomValue() + "@email.com";
    static String password = "Hotel" + TestUtils.getRandomNum();
    static String phone = "082" + TestUtils.getRandomPhone();
    static int userStatus = 1;

    static int userID;

   // @Steps
    UserSteps userSteps;

    //@Title("This will create a new user")
    //@Test
    public void test001() {


    }


    }






