## Make jar

  # bump version?
  mvn jaxws:wsimport
  mvn package
  cp target/*.jar lib/
