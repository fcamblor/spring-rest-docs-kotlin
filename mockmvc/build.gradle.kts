dependencies {
    api(project(":core"))
    api("org.springframework.restdocs:spring-restdocs-mockmvc")

    testImplementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
    }
}
