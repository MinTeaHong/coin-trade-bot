plugins {
    kotlin("jvm") version "1.9.0"
}

group = "com.salgam"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
//    implementation("org.springframework:spring-web:5.3.24.RELEASE")
//    implementation("org.springframework:spring-core:5.3.24")
    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.14")
    implementation("com.auth0:java-jwt:4.4.0")


}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}