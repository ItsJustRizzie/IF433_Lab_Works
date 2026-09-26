package oop_164970_muhammadmuzakki.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun adminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}