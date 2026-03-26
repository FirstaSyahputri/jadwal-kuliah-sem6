package com.firstakhory.campusinfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _announcements = MutableLiveData<List<Announcement>>()
    val announcements: LiveData<List<Announcement>> get() = _announcements

    init {
        _announcements.value = listOf(
            Announcement(
                0,
                "UTS Semester Genap 2026",
                "25 Maret 2026",
                "Jadwal UTS sudah dapat diakses di portal akademik. Ujian akan dilaksanakan secara luring di gedung perkuliahan masing-masing sesuai jadwal yang tertera di kartu ujian. Pastikan membawa kartu ujian fisik, KTM, dan alat tulis lengkap. Harap hadir 15 menit sebelum ujian dimulai untuk proses verifikasi data mahasiswa."
            ),
            Announcement(
                1,
                "Workshop Mobile Programming",
                "28 Maret 2026",
                "Workshop intensif Android menggunakan Kotlin bagi pemula. Peserta akan mempelajari lifecycle, navigation component, view binding, dan arsitektur MVVM. Pendaftaran gratis namun kuota sangat terbatas hanya untuk 50 peserta pertama. Sertifikat digital akan diberikan bagi peserta yang menyelesaikan proyek akhir workshop."
            ),
            Announcement(
                2,
                "Beasiswa Pertamina 2026",
                "1 April 2026",
                "Program beasiswa prestasi untuk mahasiswa aktif semester 2 hingga 6. Komponen beasiswa meliputi bantuan biaya UKT per semester dan uang saku bulanan. Berkas administrasi seperti transkrip nilai terbaru harus dikumpulkan ke rektorat."
            )
        )
    }
}