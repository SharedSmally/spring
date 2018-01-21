HOME=`pwd`
PKG=com.jpw.spring
CH01=ex01 ex02 ex03
CHXX=ch02 ch03 ch04 ch05 ch06

.PHONY: ch01 chxx

main:update

test: ch01 chxx 

update:
	find ./ -name pom.xml | xargs sed -i 's/1.0-SNAPSHOT/1.0.0/g'
	find ./ -name pom.xml | xargs sed -i 's/<groupId>junit/<groupId>org.springframework/g'
	find ./ -name pom.xml | xargs sed -i 's/junit/spring-context/g'
	find ./ -name pom.xml | xargs sed -i "s/3.8.1/\x24{spring.version}/g"

#ch02

ch01:
	mkdir -p ch01
	for var in ${CH01}; do \
		mvn archetype:generate \
		-DgroupId=${PKG}.ch01 -DartifactId=ch01_$${var} \
		-DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false; \
		mv ch01_$${var} ch01/;  \
	done	

chxx:
	for var in ${CHXX}; do \
		mvn archetype:generate \
		-DgroupId=${PKG} -DartifactId=$${var} \
		-DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false; \
	done	
