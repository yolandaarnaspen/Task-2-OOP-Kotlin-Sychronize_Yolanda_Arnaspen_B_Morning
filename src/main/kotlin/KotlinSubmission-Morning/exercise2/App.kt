package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    val evenNumbers = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }
    println("List of Even Numbers: $evenNumbers")


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini
     */
    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    // Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    // - Jan -> January
    // - Feb -> February
    // - Dst...
    // Buat di bawah sini
    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    // Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    // - "It's {$monthNow} now, I was born in {$birthMonth}"
    // Buat di bawah sini
    val monthNow = "November"
    val birthMonth = "May"
    println("It's $monthNow now, I was born in $birthMonth")
}
