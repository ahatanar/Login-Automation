set projectLocation=C:\Users\Taha\eclipse-workspace\PhysicsLogin
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause