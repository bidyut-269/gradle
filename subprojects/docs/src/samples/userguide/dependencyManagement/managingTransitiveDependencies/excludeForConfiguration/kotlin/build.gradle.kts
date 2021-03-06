plugins {
    java
}

repositories {
    mavenCentral()
}

// tag::exclude-transitive-dependencies[]
configurations {
    "implementation" {
        exclude(group = "javax.jms", module = "jms")
        exclude(group = "com.sun.jdmk", module = "jmxtools")
        exclude(group = "com.sun.jmx", module = "jmxri")
    }
}

dependencies {
    implementation("log4j:log4j:1.2.15")
}
// end::exclude-transitive-dependencies[]

task<Copy>("copyLibs") {
    from(configurations.compileClasspath)
    into("$buildDir/libs")
}
