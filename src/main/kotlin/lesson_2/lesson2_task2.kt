package lesson_2

fun main() {
    val numberOfWorkers = 50
    val salaryForWorkers = 30000

    val numberOfInterns = 30
    val salaryForInterns = 20000

    val salaryForAllWorkers = numberOfWorkers * salaryForWorkers
    val salaryForAllInterns = numberOfInterns * salaryForInterns
    val salaryForWorkersAndInterns = salaryForAllWorkers + salaryForAllInterns

    val averageSalaryWithInterns = salaryForWorkersAndInterns / (numberOfWorkers + numberOfInterns)

    println(salaryForAllWorkers)
    println(salaryForWorkersAndInterns)
    println(averageSalaryWithInterns)
}

