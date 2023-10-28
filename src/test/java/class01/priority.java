package class01;

import org.testng.annotations.Test;

public class priority {
//if I will not use priority keyword then it will execute based on the
// alphabetical order of the methods names
    //another note that priority = 0 by default is the highest priority
    @Test(priority = 2,groups = "regression")
    public void Atest(){
        System.out.println("i am TestA");
    }

    @Test(priority = 1)
    public void Ctest(){
        System.out.println("i am TestC");
    }
    @Test(priority = 3)
    public void Btest(){
        System.out.println("i am TestB");
    }
}
