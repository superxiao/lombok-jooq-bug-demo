plugins {
  java
  id("io.freefair.lombok") version "8.10.2"
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


