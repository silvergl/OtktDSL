package kieker.otel.translation.generator.analysis

class PomGenerator {
	String analysisname
	
	
	new(String analysisname){
		this.analysisname = analysisname
	}
	def generate(){
		'''<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
				  <modelVersion>4.0.0</modelVersion>
				  <groupId>«this.analysisname»</groupId>
				  <artifactId>«this.analysisname»</artifactId>
				  <version>0.0.1-SNAPSHOT</version>
				  <repositories>
					  <repository>
				          <id>sonatype.oss.snapshots</id>
				          <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
				      </repository>
				      <repository>
				          <id>sonatype.oss.releases</id>
				          <url>https://oss.sonatype.org/content/repositories/releases/</url>
				      </repository>
				  </repositories>
					<build>
					<plugins>
					<plugin>
					    <groupId>org.apache.maven.plugins</groupId>
					    <artifactId>maven-compiler-plugin</artifactId>
					    <version>3.10.1</version>
					    <configuration>
					        <source>17</source> <!-- Specify Java source version -->
					        <target>17</target> <!-- Specify Java target version -->
					    </configuration>
					</plugin>
					<plugin>
					    <groupId>org.apache.maven.plugins</groupId>
					    <artifactId>maven-assembly-plugin</artifactId>
					    <version>3.4.2</version>
					    <configuration>
					        <archive>
					            <manifest>
					                <mainClass>Main</mainClass> <!-- Replace with your main class -->
					            </manifest>
					        </archive>
					        <descriptorRefs>
					            <descriptorRef>jar-with-dependencies</descriptorRef>
					        </descriptorRefs>
					    </configuration>
					    <executions>
					        <execution>
					            <phase>package</phase>
					            <goals>
					                <goal>single</goal>
					            </goals>
					        </execution>
					    </executions>
					</plugin>
					</plugins>
					</build>
				  <dependencies>
				<dependency>
				  <groupId>net.kieker-monitoring</groupId>
				  <artifactId>kieker</artifactId>
				  <version>2.0.0-SNAPSHOT</version>
				</dependency>
				<dependency>
				    <groupId>net.sourceforge.teetime</groupId>
				    <artifactId>teetime</artifactId>
				    <version>3.0</version>
				</dependency>
				<dependency>
				    <groupId>com.beust</groupId>
				    <artifactId>jcommander</artifactId>
				    <version>1.82</version>
				</dependency>
				<dependency>
					<groupId>org.projectlombok</groupId>
					<artifactId>lombok</artifactId>
					<version>1.18.36</version>
				</dependency>
				<dependency>
				    <groupId>org.apache.commons</groupId>
				    <artifactId>commons-compress</artifactId>
				    <version>1.27.1</version>
				</dependency>
				<dependency>
				    <groupId>org.tukaani</groupId>
				    <artifactId>xz</artifactId>
				    <version>1.10</version>
				</dependency>
				<dependency>
				<groupId>org.eclipse.emf</groupId>
				<artifactId>org.eclipse.emf.ecore</artifactId>
				<version>2.37.0</version>
				</dependency>
				<dependency>
				<groupId>org.eclipse.emf</groupId>
				<artifactId>org.eclipse.emf.ecore.xmi</artifactId>
				<version>2.38.0</version>
				</dependency>
				<dependency>
				<groupId>com.fasterxml.jackson.core</groupId>
				<artifactId>jackson-databind</artifactId>
				<version>2.18.1</version>
				</dependency>
				<dependency>
				<groupId>jakarta.xml.bind</groupId>
				<artifactId>jakarta.xml.bind-api</artifactId>
				<version>4.0.2</version>
				</dependency>
				<dependency>
				<groupId>com.sun.xml.bind</groupId>
				<artifactId>jaxb-impl</artifactId>
				<version>4.0.5</version>
				</dependency>
			</dependencies>
				
				</project>'''
	}
}
