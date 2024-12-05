fun main() {
score()

}

fun score(){
    val students = listOf(
        "Ali" to 94,
        "Marjan" to 95,
        "Taghi" to 55,
        "Amir" to 80,
        "Minoo" to 78,
        "Akbar" to 35,
        "Asghar" to 70
    )

    val highScore = students.filter{it.second>75}
    println("نفرات برتر عبارتند از: \n $highScore")

    val sortScore =students.sortedByDescending{it.second}
    println("نفرات به ترتیب امتیاز عبارتند از: \n $sortScore")

    val averageScore = students.map{it.second}.average()
    println("میانگین کل امتیازات به دست آمده برابر است با: \n $averageScore")

    val lowScore = students.filter{it.second<=70}
    println("نفرات زیر شامل حد نصاب امتیاز نشده اند:\n $lowScore")

    val updateScore = students.map{it.first to (it.second + 5)}
    println("امتیاز افراد به میزان 5 امتیاز ارفاق شده و معادل امتیازات زیر شده است:\n $updateScore")
}

