# SGPACalculator

![Test cases](https://github.com/NavjotSRakhra/SGPACalculator/actions/workflows/maven.yml/badge.svg) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.NavjotSRakhra/SGPACalculator/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.NavjotSRakhra/SGPACalculator) [![javadoc](https://javadoc.io/badge2/io.github.NavjotSRakhra/SGPACalculator/javadoc.svg)](https://javadoc.io/doc/io.github.NavjotSRakhra/SGPACalculator)

This module primarily is used to calculate SGPA of a list of subjects with their grades and credits stored in
SubjectGradeList. It can also be used just to store subject grade and the corresponding credits. This also has 11 enums
which represents grades.

# Techonology used

This module has been written in OpenJDK 11. It should work with Java 11 and above.

# How to use

Paste the following in the configurations of the build automation tool you use

- Maven

```
<dependency>
    <groupId>io.github.NavjotSRakhra</groupId>
    <artifactId>SGPACalculator</artifactId>
    <version>1.1.0</version>
</dependency>
```

- Gradle

```
implementation group: 'io.github.NavjotSRakhra', name: 'SGPACalculator', version: '1.1.0'
```

OR

```
implementation 'io.github.NavjotSRakhra:SGPACalculator:1.1.0'
```

- Gradle (Kotlin)

```
implementation("io.github.NavjotSRakhra:SGPACalculator:1.1.0")
```

- sbt

```
libraryDependencies += "io.github.NavjotSRakhra" % "SGPACalculator" % "1.1.0"
```

- ivy

```
<dependency org="io.github.NavjotSRakhra" name="SGPACalculator" rev="1.1.0"/>;
```

- grape

```
@Grapes(
      @Grab(group='io.github.NavjotSRakhra', module='SGPACalculator', version='1.1.0')
  )
```

- leiningen

```
[io.github.NavjotSRakhra/SGPACalculator "1.1.0"]
```

- buildr

```
'io.github.NavjotSRakhra:SGPACalculator:jar:1.1.0'
```

# Documentation

https://navjotsrakhra.github.io/SGPACalculator/SGPACalculator/module-summary.html

# License

MIT License

Copyright (c) 2023 Navjot Singh Rakhra

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
