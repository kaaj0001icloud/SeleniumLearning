# SeleniumLearning
Learning Selenium
Maven Dependencies
1. Apache POI
2. Selenium Web driver
3. Test NG
4. Surefire with test NG configuration added under Project tag
<build>
	<pluginManagement>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
            	<artifactId>maven-surefire-report-plugin</artifactId>
            	<version>2.19.1</version>
            	<configuration>
            		<suiteXmlfiles>
            			<suiteXmlfile>testng.xml</suiteXmlfile>
            		</suiteXmlfiles>
            	</configuration>
          
			</plugin>
		</plugins>
	</pluginManagement>
</build>

