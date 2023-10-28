package class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void login(){
      // System.out.println(1/0);
        System.out.println("hello");
    }
    @Test(dependsOnMethods = {"login"})
    public void dashBoardVerification(){
        System.out.println("i am dashboard verification");
    }
}
