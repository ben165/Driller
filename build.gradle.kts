plugins {
    id("java")
}

group = "dhbw"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    implementation("org.springframework.boot:spring-boot:3.2.1")
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.2.1")
    implementation("org.springframework.shell:spring-shell-starter:3.2.0")
    runtimeOnly("org.springframework.shell:spring-shell-standard:3.2.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}