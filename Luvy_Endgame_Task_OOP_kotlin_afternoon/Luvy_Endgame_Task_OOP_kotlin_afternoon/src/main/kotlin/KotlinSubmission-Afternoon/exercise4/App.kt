package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {

        print("Input :")
        val inputString = readLine()
        val number = inputString!!.toInt()

        println("Angka yang dihasilkan: $number")
    } catch (e: NumberFormatException) {
        // Menangani exception NumberFormatException
        println("Error: Format angka tidak valid")
    } finally {
        // Blok kode yang akan dijalankan baik terjadi exception atau tidak
        println("Program selesai")
    }

//    mengonversi String "123abc" menjadi Int. Karena String tersebut tidak dapat diubah menjadi
//    angka secara langsung, maka akan muncul exception NumberFormatException. Exception ini ditangani
//    oleh blok catch, yang kemudian mencetak pesan error. Blok finally tetap dijalankan setelah
//    blok try atau catch.
    }





