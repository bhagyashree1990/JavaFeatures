# Java Features

Java Features explained with examples for Java versions 8 to 17

## Features

### Java8
1. Lambda Expression `com.java8.test.lambda.LambdaExample`
2. Method Reference `com.java8.test.method.reference.MethodReferenceExample`
3. Functional Interfaces `com.java8.test.functional.interfaces.FunctionalInterfaceExample`
4. Default and Static methods in Interfaces `com.java8.test.defaultinterfaces.DefaultAndStaticMethodExample` and `com.java8.test.defaultinterfaces.DefaultMethodAmbiguityExample`
5. Streams `com.java8.test.streams.StreamExample`
6. Collectors `com.java8.test.collectors.CollectorsExample`
7. Comparator `com.java8.test.comparator.ComparatorExample`
8. String joins `com.java8.test.string.join.StringJoinExample`
9. Optional `com.java8.test.optional.OptionalClassExample`
10. New Date Time API

### Java9
1. REPL 

```
jshell
jshell>10*5
jshell>10/5
jshell>$1+$2
jshell>Math.max(15,22)
jshell>String twice(String s){return s+s;}
jshell>twice("Ocean")
jshell>String twice(String s){return s+"-"+s;}
jshell>twice(twice(twice("Ocean")))
jshell>/list
jshell>/vars
jshell>/methods
jshell>/exit
```

2. Factory Methods for Immutable List,Set,Map `com.java9.test.FactoryMethodsCollectionExample`
3. Private Methods in Interface `com.java9.test.PrivateMethodInterfaceExample`

### Java 15
1. Unicode 13 Support
2. TreeMap Specialized Methods
3. Text Blocks
4. Sealed (Preview)
5. Records (Preview)

### Java 17
1. Sealed class
2. Pattern Matching for switch (Preview)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

```
git clone https://github.com/bhagyashree1990/JavaFeatures.git
```

### Prerequisites

* [ Java SE 17 ](https://www.oracle.com/technetwork/java/javase/downloads/index.html)

## Authors

* [ **Bhagyashree Chavan** ](https://github.com/bhagyashree1990)
