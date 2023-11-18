package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    // Variabel untuk menyimpan nama depan
    val namdep: String = "Luvy"

    // Variabel untuk menyimpan nama belakang
    val nambel: String = "Muhammad Riski"

    // Variabel untuk menyimpan umur
    val umur: Int = 21

    // Variabel untuk menyimpan status (single atau tidak)
    val status: Boolean = true

    // Cetak setiap variabel ke layar
    println("Nama Depan: $namdep")
    println("Nama Belakang: $nambel")
    println("Umur: $umur tahun")
    println("Status: ${if (status) "Single" else "Tidak Single"}")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val endgame = listOf<String>("luvy","angelika","resta","awaludin","dhea","arya","iqbal","abdullah",
        "nayandra","ibnu","rifki" )
    return listOf(endgame[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("kak Reynaldi","kak Malik")
    val countOfGroup = arrayOf<String>("luvy","angelika","resta","awaludin","dhea","arya","iqbal","abdullah",
        "nayandra","ibnu","rifki")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()
    println(" ")

    val myTeam = myTeam()
    println("My team is: $myTeam")
    println(" ")
    val totalMember = totalMember()
    println("Total Member group : $totalMember")
    println(" ")
    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("02Marge", listOf("luvy","angelika","resta","awaludin","dhea","arya","iqbal","abdullah",
        "nayandra","ibnu","rifki"), "Sesi Siang")

}