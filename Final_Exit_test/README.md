
#API Demos Automation Suite Information:-

##Testng File Description:
- testng.xml - define all parameters and tests.

##Packages Description:
* main: define all actions, dependencies and methods.
* Screens: define all screens needed for tests.
* Features: define all scenario and features description to be tested.
* Runner: define all runner class.
* StepdDefinition: define all step definitions which are related to feature files.

### main/java/main descriptions:
* BaseClass: This class defines all the dependencies.

### main/java/screens descriptions:
* Accessibility.java: It contains xpath accessibility services.
* Animation.java: It contains xpath and  animation default layout.
* HideAndShow.java: It contains xpath, id and methods for Receive Result.
* Activity.java: It contains xpath id and methods for animate drawables.
* Text.java: It contains xpath and methods for log text box.


## main/recources:
* log4j2.properties: defines log4j2 properties.

## test/java/features descriptions:
* Accessibility.feature: It is feature file containing scenarios for accessibility services.
* Animation.feature: It is feature file containing scenario for Hide And show.
* Activity.feature: It is feature file containing scenario for Action bar.
* TextOption.feature: It is feature file containing scenario for log text box.


## hooks descriptions:
 This class defines @After, @Before.

## test/main/java/Runner descriptions:
* TestRunner: This class defines and cucumber option like feature, glue, tags, etc.

## test/java/StepDef descriptions:
* AccessibilityStepDef: It defines Given,When, and Then for accessibility services.
* AnimationStepDef: It defines Given,When, and Then for default layout.
* ActivityStepDef: It defines Given,When, and Then for Action Bar
* HideAndShowStepDef: It defines Given,When, and Then for hide and show feature. 
* TextStep: It defines Given,When, and Then for log text box.


##test/resources:
* extent.properties: defines spark extent properties for spark report generation.
* extent-config.xml: defines extent properties for report generation.

##Reports:
* ExtentReport will be generated after run.
* TestNG report is generated as "Spark.html".


