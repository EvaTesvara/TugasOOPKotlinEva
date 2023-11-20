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
    val namaDepan : String = "Eva"
    val namaBelakang : String = "Tesvara"
    val umur : Int = 20
    val status : Boolean = false

    println("Halo nama saya $namaDepan $namaBelakang, saya berumur $umur tahun, status saya adalah $status single")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("group id : $groupId, group member : $groupMember, sesi kelas : $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam():String{
    val anggotaTim= listOf("Eva tesvara", "Nanda", "John tri sihombing", "Amanda", "Yoel", "Faqih noor", "Hasan", "ilham", "Maya", "Mita", "Yuda")
    val namaSaya = anggotaTim[0]
    return namaSaya
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Hasan", "Reynaldi")
    val jumlahMentor = mentor.size
    val countOfGroup = arrayOf<String>("Eva tesvara", "Nanda", "John tri sihombing", "Amanda", "Yoel", "Faqih noor", "Hasan", "ilham", "Maya", "Mita", "Yuda")
    val jumlahMember = countOfGroup.size

    val total = jumlahMember + jumlahMentor

    return total
}

fun main() {

    myProfile()


    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("98888", listOf("Eva tesvara", "Nanda", "John tri sihombing", "Amanda", "Yoel", "Faqih noor", "Hasan", "ilham", "Maya", "Mita", "Yuda"), "Siang")

}