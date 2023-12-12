package lesson_2

fun main() {
    val numberOfStudents = 4

    val gradeOfFirstStudent = 3.0
    val gradeOfSecondStudent = 4.0
    val gradeOfThirdStudent = 3.0
    val gradeOfFourthStudent = 5.0

    val averageGradeInClass: Double =
        (gradeOfFirstStudent + gradeOfSecondStudent + gradeOfThirdStudent + gradeOfFourthStudent) / numberOfStudents

    println(averageGradeInClass)
}