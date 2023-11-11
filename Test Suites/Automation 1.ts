<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Automation 1</name>
   <tag></tag>
   <delayBetweenInstances>1</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>2</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobile</key>
                  <value>{
  &quot;id&quot;: &quot;apple_iphone_14_pro_max&quot;,
  &quot;deviceId&quot;: &quot;iPhone_14_Pro_Max_real_us&quot;,
  &quot;isTablet&quot;: false,
  &quot;manufacturer&quot;: [
    &quot;iPhone&quot;
  ],
  &quot;name&quot;: &quot;iPhone 14 Pro Max&quot;,
  &quot;osVersion&quot;: &quot;16.5.1&quot;,
  &quot;os&quot;: &quot;iOS&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: true
}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Mobile_Automation_Regression_1</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
