plugins {
    id("application") 
    id("java") 
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.micronaut:micronaut-bom:3.6.0"))
    implementation("io.micronaut.aws:micronaut-aws-cdk")
    testImplementation(platform("io.micronaut:micronaut-bom:3.6.0"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
}

application {
    mainClass.set("com.example.Main")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

