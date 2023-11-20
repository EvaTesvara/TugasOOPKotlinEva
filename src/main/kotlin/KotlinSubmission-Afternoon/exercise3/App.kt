package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    val score = 100
    var nilai = 'c'
    if(score>=0&&score<60){
        nilai = 'E'
    }else if(score>=60&&score<=69){
        nilai = 'D'
    }else if(score>=70&&score<=79){
        nilai = 'C'
    }else if(score>=80&&score<=89){
        nilai = 'B'
    }else if(score>=90&&score<=100){
        nilai = 'A'
    }

    if(nilai == 'A'){
        println("selamat! Anda mendapatkan nilai A")
    }else{
        println("Anda mendapatkan nilai $nilai")
    }

}