import java.time.LocalDate

fun main(args: Array<String>) {
    val x = LocalDate.now().dayOfMonth
    for (i in x..10) {
        print("This range causes an error according to IntelliJ")
    }

    val y: Int = LocalDate.now().dayOfMonth
    for (i in y..10) {
        print("This range does not cause errors according to IntelliJ")
    }
}

// To reproduce the above error:
// 0. Create a new project using kotlin, maven and java 11. Choose to add sample code
// 1. Change kotlin-stdlib version from 1.9.0 to 1.6.21 in pom.xml. For consistency, you can also change kotlin-maven-plugin version from 1.9.0 to 1.6.21, though it is not necessary to reproduce the error
// 2. Set target jvm version to 8