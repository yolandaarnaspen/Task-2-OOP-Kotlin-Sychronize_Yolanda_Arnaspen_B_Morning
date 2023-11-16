package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try-catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        val userInput = "123@"
        val result = userInput.toInt()

        println("Hasil konversi: $result")
    } catch (e: NumberFormatException) {
        println("Error: Input tidak dapat dikonversi ke int.")
    }
}
