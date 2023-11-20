package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    var listAngka = mutableListOf<Int>()
    var i = 1

    while(i<=100){
        listAngka.add(i)
        i++

    }
    println(listAngka)


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini**/
    val mapMonth = mapOf("Jan" to "January", "Feb" to "February","March" to "March","April" to "April",
        "May" to "May", "June" to "June", "July" to "July", "Aug" to "August", "Sept" to "September",
        "Oct" to "October", "Nov" to "November", "Dec" to "December"
    )
    println(mapMonth)



    /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    // Buat di bawah sini**/
    mapMonth.forEach{
        k,v -> println("- $k -> $v")
    }


    /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val monthNow = "November"
    val birthMonth = "July"

    println("It's $monthNow now, I was born in $birthMonth")


}