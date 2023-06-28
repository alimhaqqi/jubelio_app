# Jubelio - Login and Adjust Stock

This project is automation test for login and adjust item stock feature in Jubelio's website

Step by step to run automation :
1. Open IntelliJ IDEA app
2. Open folder "Jubelio-LoginAndAdjustStock"
3. Open path "Jubelio-LoginAndAdjustStock\src\main\java\runner\RunTest.java"
4. Click run RunTest.java

Note :
1. If you want to test login automation, open RunTest.java and change tags into "@login"
2. If you want to test adjust stock automation, open RunTest.java and change tags into "@item"
3. If you want to test positive case automation, open RunTest.java and change tags into "@positive"
4. If you want to test negative case automation, open RunTest.java and change tags into "@negative"
5. If you want to test login and adjust stock automation, open RunTest.java and change tags into "@login or @item"
6. If you want to test login and only in positive case automation, open RunTest.java and change tags into "@login or @positive"

After trying all automation, if you want to close all chromedriver.exe in the background task. Follow this steps :
1. Open cmd
2. Input "taskkill /f /im chromedriver.exe", then enter