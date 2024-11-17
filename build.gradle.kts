plugins {
  java
  id("dev.monosoul.jooq-docker") version "6.1.11"
  id("org.springframework.boot") version "3.3.5"
}

repositories {
  mavenCentral()
}

dependencies {
  jooqCodegen("org.postgresql:postgresql:42.7.4")
  implementation("org.springframework.boot:spring-boot-starter-web:3.3.5")
  implementation("org.jooq:jooq:3.19.15")
  compileOnly("org.projectlombok:lombok:1.18.36")
  annotationProcessor("org.projectlombok:lombok:1.18.36")

  // Removing this dependency will cause build to fail
  implementation("org.jetbrains:annotations:26.0.1")
}

group = "com.example"

version = "0.0.1-SNAPSHOT"

description = "example"

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

tasks {
  test {
    useJUnitPlatform()
  }
}


