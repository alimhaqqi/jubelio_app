# Jubelio - Login and Adjust Stock

This project is automation test for login and adjust item stock feature in Jubelio's website.

## Automation Test
Step by step to run automation :
1. Open IntelliJ IDEA app
2. Open folder "Jubelio-LoginAndAdjustStock"
3. Open path "Jubelio-LoginAndAdjustStock\src\main\java\runner\RunTest.java"
4. Click run RunTest.java

## Change Case
Step by step to change feature and test case :
1. To test login automation, open RunTest.java and change tags into "@login"
2. To test adjust stock automation, open RunTest.java and change tags into "@item"
3. To test positive case automation, open RunTest.java and change tags into "@positive"
4. To test negative case automation, open RunTest.java and change tags into "@negative"
5. To test login and adjust stock automation, open RunTest.java and change tags into "@login or @item"
6. To test login and only in positive case automation, open RunTest.java and change tags into "@login and @positive"

## Check Status
To check report for test status, follow this steps :
1. Run RunTest.java until the test is done
2. Open path Jubelio-LoginAndAdjustStock\target
3. Open RegressionReport.html in browser

## NB
After trying all automation, if you want to close all chromedriver.exe in the background task. Follow this steps :
1. Open cmd
2. Input "taskkill /f /im chromedriver.exe", then enter