package com.example.teknologi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.laptop,"-","Laptop Lenovo V330","Lenovo V330 merupakan laptop Lenovo 7 jutaan yang dirancang untuk kalangan pebisnis. Hadir menawarkan bentang layar 14 inci Full HD yang didesain dengan stylish dan modern."+
                "Layar dari laptop ini bisa diputar hingga 180 derajat lantaran dilengkapi bezel yang solid. Karena ditujukan untuk para pebisnis, laptop ini memiliki bobot yang ringan dan tipis sehingga nyaman untuk dibawa dalam tas."+
                "Bicara soal performanya sudah pasti laptop ini berkualitas, berbekal kekuatan dari Intel Core i5-8250U yang terpasang di dalamnya. Untuk menambah daya operasionalnya dilengkapi memori RAM sebesar 4GB yang akan membuat kegiatan komputasi berjalan lancar.+" +
                " Tak lupa Lenovo menyediakan media penyimpanan berupa HDD berkapasitas 1TB berkecepatan 5400rpm."))

        data?.add(DataModel(R.drawable.hp,"-","HP Samsung Galaxy M51", "HP Rp 4 jutaan ini mengusung panel Super AMOLED Plus seluas 6.7inci dengan resolusi FHD+. Samsung Galaxy M51 dipersenjatai dengan prosesor Snapdragon 730G yang dipadukan "+
                "bersama RAM 8GB dan memori internal 128GB. Untuk memenuhi kebutuhan fotografi, terdapat empat kamera belakang beresolusi 64MP + 12MP + 5MP + 5MP dan kamera depan dengan resolusi 32MP."+
                "Sisi baterai menjadi spesifikasi utama Samsung Galaxy M51 dengan kapasitasnya yang mencapai 7000mAh. Tak lupa, fitur 25W fast charging juga turut melengkapi canggihnya baterai smartphone ini. Saat ini," +
                " Samsung Galaxy M51 dibanderol dengan harga sekitar Rp4,299 juta."))

        data?.add(DataModel(R.drawable.kamera,"-","kamera", "Kamera adalah alat paling populer dalam aktivitas fotografi. Nama ini didapat dari camera obscura, bahasa Latin untuk \"ruang gelap\", yang ditemukan oleh Al Haitam atau Alhazen sekitar tahun 1000 Masehi, "+
                "mekanisme awal untuk memproyeksikan tampilan di mana suatu ruangan berfungsi seperti cara kerja kamera fotografis yang modern, kecuali tidak ada cara pada waktu itu untuk mencatat tampilan gambarnya selain secara manual mengikuti jejaknya. "))

        data?.add(DataModel(R.drawable.vr,"-","VR", "Virtual Reality (VR) adalah teknologi yang mampu menciptakan simulasi. Simulasi ini bisa mirip seperti dunia nyata, seperti suasana kamu berjalan-jalan di sebuah kota di luar negeri. "+
                "VR juga bisa mensimulasikan sebuah dunia yang benar-benar berbeda, hasil dari imajinasi. Misalnya suasana di sebuah kastil atau kerajaan."))

        data?.add(DataModel(R.drawable.printer,"-","printer", "Printer berasal dari kata print yang dalam Bahasa Indonesia berarti Cetak. Dari namanya tersebut kita pasti juga mengerti fungsi printer adalah untuk mencetak. "+
                "Dalam dunia komputer, printer termasuk perangkat keras yang menyajikan representasi tulisan atau grafis pada sebuah kertas atau media semacamnya."))

        data?.add(DataModel(R.drawable.finger,"-","finger", "Sensor fingerprint adalah sebuah perangkat teknologi yang memanfaatkan sidik jari sebagai media identifikasi penggunanya. Cara kerja sensor fingerprint adalah dengan "+
                "merekam gambar digital pada pola sidik jari. Dari hasil rekaman tersebut kemudian dijadikan sebagai sebuah template biometrik yang disimpan dan digunakan untuk pencocokan identitas sesorang atau penggunanya."))

        data?.add(DataModel(R.drawable.proyektor,"-","proyektor", "proyektor adalah alat untuk membantu menampilkan gambar, video maupun data-data lainnya dari komputer atau laptop ke sebuah layar (bisa juga ke permukaan datar seperti tembok)."+
                "Proyektor sangat bermanfaat untuk membantu seseorang dalam hal presentasi dan memaparkan penjelasan atau presentasi dalam bentuk teks, gambar, animasi, atau bahkan video, kepada audiens agar lebih mudah dimengerti."))


        data?.add(DataModel(R.drawable.robot,"-","robot", "Robot adalah seperangkat alat mekanik yang bisa melakukan tugas fisik, baik dengan pengawasan dan kontrol manusia, ataupun menggunakan program yang telah didefinisikan terlebih dahulu (kecerdasan buatan)."+
                "Istilah robot berawal bahasa Ceko “robota” yang berarti pekerja atau kuli yang tidak mengenal lelah atau bosan. Robot biasanya digunakan untuk tugas yang berat, berbahaya, pekerjaan yang berulang dan kotor."+
                "Biasanya kebanyakan robot industri digunakan dalam bidang produksi."))

        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}