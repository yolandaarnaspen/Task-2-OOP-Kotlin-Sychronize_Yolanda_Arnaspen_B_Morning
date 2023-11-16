package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     */
    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     */
    hero.setProfile("Yolanda Arnaspen", 21, 160)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     */
    println("Sebelum Melakukan Kegiatan:")
    hero.profile()

    /**
     * Challenge:
     * ===============Class B Morning===============
     * Synchronize -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
     **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     */
    with(hero) {
        jalan()
        repeat(3) { lari() }
        repeat(2) { makan() }
        repeat(5) { minum() }
        repeat(4) { lompat() }
        duduk()
    }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     */
    println("\nSetelah Melakukan Kegiatan:")
    hero.profile()
}
