package com.lucky.mybook.data


import com.lucky.mybook.R
import com.lucky.mybook.model.Book

object BookData {
    private val bookTitle = arrayOf(
        "Dilan 1990",
        "Dilan 1991",
        "Ancika 1995",
        "Manusia Setengah Salmon",
        "Koala Kumal",
        "Milea:Suara dari dilan",
        "Marmut Merah Jambu"
    )
    private val bookPenulis = arrayOf(
        "Pidi Baiq",
        "Pidi Baiq",
        "Pidi Baiq",
        "Raditya Dika",
        "Raditya Dika",
        "Pidi Baiq",
        "Raditya Dika"
    )
    private val tebal = arrayOf(
        "330 halaman",
        "340 halaman",
        "344 halaman",
        "264 halaman",
        "258 halaman",
        "375 halaman",
        "222 halaman"
    )

    private val tahun = arrayOf(
        "2014",
        "2015",
        "2021",
        "2011",
        "2015",
        "2016",
        "2010"
    )

    private val bookSinopsis = arrayOf(
        "menceritakan pertemuan yang dialami oleh dua remaja SMA di Bandung. Namun, perkenalan mereka pun tidak biasa dikarenakan daya tarik yang dimiliki oleh Dilan tiada duanya.Romansa berawal pada tahun 1990 ketika Milea datang ke sekolah barunya. Ia adalah seorang anak pindahan dari Jakarta ke Bandung. Lalu, perkenalan membuat mereka semakin dekat karena keunikan Dilan yang baik, pintar, bahkan romantis. Cara Dilan menggaet hati Mile tidak sama dengan teman-teman laki-laki lain.",
        "Milea pun kembali bercerita tentang kisah percintaannya dengan Dilan. Seperti orang yang baru jadian pada umumnya, Milea mengalami masa yang indah di SMA sesudah resmi jadi pacar Dilan. Ketika guyuran hujan menerpa, Dilan menggunakan motor CB dengan Milea di belakangnya. Milea dengan erat memeluk Dilan. Mereka berdua jalan-jalan menyusuri Jl. Buah Batu sembari ketawa riang, itu semua berkat Dilan yang selalu membuat hari-hari Milea bahagia.",
        "Ancika sendiri merupakan gadis remaja yang masih duduk di bangku SMA di salah satu sekolah di kota Bandung. Sementara, Dilan sendiri sedang menempuh pendidikan tinggi di Fakultas Seni Rupa, Institut Teknologi Bandung (ITB).,Dalam buku tersebut, Dilan digambarkan sebagai seorang mahasiswa yang tidak lagi sebagai panglima tempur geng motor yang disegani. Melainkan mahasiswa kreatif dan cerdas. Tetapi jati diri seorang Dilan yang lucu tidak pernah hilang dalam alur cerita novel Ancika.",
        "Manusia Setengah Salmon mengisahkan seroang pria bernama Dika (Raditya Dika), seorang penulis yang sedang berusaha move on dari mantan kekasihnya. Dika harus menghadapi berbagai masalah mulai dari dirinya yang belum bisa melupakan sang mantan hingga orang tuanya yang ingin segera pindah rumah.",
        "Koala Kumal mengisahkan kehidupan Dika, pria yang batal menikah dengan kekasihnya, Andrea. Hal ini lantaran Andrea rupanya telah memiliki pria lain yakni James. Dika pun merasa sakit hati, dan akhirnya ia sulit menulis bagian buku terakhirnya",
        "Bagian ini menceritakan sosok Milea di mata Dilan. Berawal dari harmonisnya hubungan Dilan dengan Milea, Dilan dengan keluarganya, Milea dengan keluarganya, dan antarkelurga mereka. kemudian terjadi peristiwa  yang memicu konflik yaitu kematian Akew, sahabat Dilan akibat dikeroyok orang tak dikenal. Milea berpikir bahwa itu imbas dari keikutsertaan  Dilan dkk di geng motor. Milea ingin Dilan keluar dari geng motor tersebut. Namun Dilan yang sedang dilanda kemaraharahan dan kesedihan atas kematian sahabatnya diikat dalam rasa solidaritas ingin balas dendam. Dalam keadaan bingung  dan galau Dilan butuh orang yang mengerti dirinya, tetapi Milea justru memutuskan sepihak.",
        "Marmut Merah Jambu ini berkisah tentang Dika yang menceritakan kisah cinta pertamanya ketika masa SMA, dengan perempuan bernama Ina Mangunkusumo. Selain itu dikisahkan pula saat Dika dan temannya Bertus yang membentuk grup detektif untuk memecahkan masalah teman-temannya, juga persahabatannya dengan Cindy."

    )

    private val bookThumbnail = intArrayOf(
        R.drawable.dilan,
        R.drawable.dilann,
        R.drawable.ancika,
        R.drawable.salmon,
        R.drawable.koala,
        R.drawable.milea,
        R.drawable.marmut
    )


    val listData : ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for (position in bookTitle.indices) {
                val book = Book()
                book.title = bookTitle[position]
                book.penulis = bookPenulis[position]
                book.tahun = tahun[position]
                book.tebalBuku= tebal[position]
                book.thumbnail = bookThumbnail[position]
                book.sinopsis = bookSinopsis[position]
                list.add(book)
            }
            return list
        }

}