Austin Hodgin
HW2

NOTE: To run the code please make sure that you are using maven 3.1 at least to run the tests. The Unit test generation tool that was selected was evosuite and that
requires at least maven 3.1 to run. 

HomeWork #2 can be found in the HW2 directory located in the current directory. The Directory structure is the same as before with all the main files being held in 
src/main/java This is where the new RandomTestDominion is located as well as all the other files that were created in HW1. All the tests that were created for HW1 and
the tests generated by Evosuite are located in the file path src/test/java. 

I used two code coverage tools for this asiggment. Both are located in targent/site one is located in jacoco/index and the other one is the one generated by intellij which 
is located int he intellij folder. Both these have screen shots located in the main directory under coverae_screenshots_HW2. 


To run the test suite please run the fallowing commands:

"mvn compile"
"mvn test" //This will run the test suite including the evosuite tests that were generated


Installing intellij and running the coverage tool:

The Intelaj tool is located in the intelaj IDE. If you wish to try this you will need to run it from the application that can be downloaded from here
https://www.jetbrains.com/idea/download/#section=windows

Once you have it installed you will need to import the project as a maven project buy selecting the directory with my files and then selecting the pom.xml file
from there you will want to click on the test folder and build the project. 

Once the project is built it should download the correct depencnys to run but you will still need to install the plugin to run the evosuite tests. So to install 
the plugin in go to file->settings->plugins->browse reposiorites  and then type in evosuite then then install plugin. 

Once that is installed you can close the setting panel and go to the project panel located on the right. click on the main project which should expand the full project
folder. Right click on the main java folder and scroll down until you see "Run "All Tests" with Coverage" This will run all the tests on and show the coverage that for each
file in the main directory. 

 






