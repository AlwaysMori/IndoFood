package com.nanda.indofood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout = findViewById<Button>(R.id.btnAbout)

        btnAbout.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

        val makananList = createMakananList()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = MakananAdapter(makananList)
        recyclerView.adapter = adapter
    }

    private fun createMakananList(): List<Makanan> {
        return listOf(
            Makanan("Rendang", 25000, "Padang, Sumatra Barat", R.drawable.rendang,"Rendang, permata mahkota kuliner Indonesia, berasal dari masyarakat Minangkabau di Sumatera Barat. Hidangan yang dimasak perlahan ini menawarkan simfoni rasa dan tekstur, memikat para pencinta kuliner di seluruh dunia.\n" +
                    "\n" +
                    "Bintang Lapangan: Daging sapi yang empuk dimasak selama berjam-jam dalam santan yang kaya dan penuh rempah, melepaskan aroma kompleks dari cabai, serai, kunyit, jahe, dan banyak lagi. Kuncinya terletak pada proses memasak yang lambat, di mana daging berubah menjadi empuk sempurna, sementara warna merah cerah berubah menjadi cokelat tua yang mewah.\n" +
                    "\n" +
                    "Pesta untuk Indra: Gigitan pertama adalah sebuah kejutan. Kuah yang kental, dipadatkan oleh santan yang dikaramelisasi, melapisi daging empuk dalam simfoni rasa - tarian antara pedas yang membara, gurih yang dalam, dan sedikit manis. Aromanya, perpaduan rempah-rempah yang memesona, bertahan lama bahkan setelah potongan terakhir dinikmati.\n" +
                    "\n" +
                    "Lebih dari Sekedar Piring: Rendang melampaui daya tarik kulinernya. Ini adalah ikon budaya, simbol warisan Minangkabau, dan bukti kecerdikan kuliner mereka. Diturunkan dari generasi ke generasi, makanan ini memiliki tempat khusus dalam perayaan dan pesta mereka.\n" +
                    "\n" +
                    "Kesenangan Global: Ketenaran rendang melampaui tempat kelahirannya. Diakui sebagai salah satu hidangan terbaik dunia, rendang telah memikat hati (dan perut) orang-orang di seluruh dunia. Disajikan dengan nasi putih pulen, ketupat (kue beras) yang harum, atau dinikmati sendiri, rendang tetap menjadi mahakarya kuliner, bukti dari permadani rasa Indonesia yang kaya."),
            Makanan("Pempek", 15000, "Palembang, Sumatra Selatan", R.drawable.pempek,"\n" +
                    "Pempek, penganan khas Palembang Sumatera Selatan, menggoda lidah dengan teksturnya yang kenyal dan gurih. Terbuat dari perpaduan ikan giling dan sagu, pempek menawarkan cita rasa yang khas dan fleksibilitas hidangan.\n" +
                    "\n" +
                    "Mencicipi Tradisi: Proses pembuatan pempek diwariskan turun-temurun, memastikan cita rasa yang otentik. Daging ikan segar digiling halus, dicampur sagu hingga kalis, lalu dibentuk menjadi berbagai macam. Dari lenjer yang lonjong, adaan yang pipih, kapal selam yang berisi telur, hingga keriting yang bergelombang, pempek hadir dalam beragam rupa.\n" +
                    "\n" +
                    "Kekayaan Rasa: Cuko, saus pendamping pempek, adalah kunci kelezatannya. Gula merah, cabai rawit, dan cuka diaduk menjadi saus pedas dan manis yang mengimbangi gurihnya pempek. Irisan timun segar dan perasan jeruk nipis menambah kesegaran, menciptakan sensasi rasa yang kaya dan berlapis.\n" +
                    "\n" +
                    "Lebih dari Sekedar Jajanan: Pempek tak hanya memanjakan lidah, namun juga menjadi bagian penting dari budaya Palembang. Hadir di setiap perayaan dan acara, pempek menjadi simbol keramahan dan kehangatan masyarakat setempat.\n" +
                    "\n" +
                    "Menjelajah Kuliner Nusantara: Dari makanan pinggir jalan hingga hidangan restoran, pempek mudah ditemui di seluruh Indonesia. Nikmati pempek bersama orang tersayang, dan biarkan sensasi kenyal, gurih, dan pedasnya membawa Anda dalam perjalanan kuliner khas Nusantara."),
            Makanan("Sate Ayam", 13000, "Madura, Jawa Timur", R.drawable.sate,"\n" +
                    "Sate Madura, persembahan kuliner dari pulau Madura, Jawa Timur, mampu membius pencinta kuliner dengan aroma bakarannya yang menggoda dan cita rasa yang kaya.\n" +
                    "\n" +
                    "Warisan Budaya: Daging ayam yang dipotong kecil-kecil ditusuk pada tusukan sate, lalu dipanggang di atas arang panas. Proses pemanggangan ini menghasilkan aroma khas yang menggugah selera. Bumbu kacangnya yang gurih dan kental, diracik dari kacang tanah halus, bawang merah, bawang putih, cabai, dan rempah-rempah lainnya, menjadi pelengkap utama sate Madura.\n" +
                    "\n" +
                    "Sensasi yang Unik: Irisan bawang merah dan cabai rawit menambah sensasi pedas dan segar, sementara perasan jeruk nipis memberikan sentuhan keasaman yang menyeimbangi kekayaan rasa. Lontong, sejenis kue beras yang dibungkus daun pisang, menjadi teman setia sate Madura, menambah tekstur kenyal dan mengenyangkan.\n" +
                    "\n" +
                    "Lebih dari Sekedar Hidangan: Sate Madura tak hanya menggugah selera, namun juga menjadi bagian tak terpisahkan dari budaya masyarakat Madura. Sering disajikan dalam berbagai acara, sate Madura menjadi simbol kebersamaan dan keramahan. Nikmati sate Madura bersama irisan bawang merah, cabai rawit, dan perasan jeruk nipis untuk pengalaman kuliner yang tak terlupakan."),
            Makanan("Nasi Padang", 20000, "Padang, Sumatra Barat", R.drawable.naspad,"\n" +
                    "Nasi Padang, bintang dari Sumatera Barat, menggoyang lidah dengan cita rasa beragam yang disajikan dalam \"pesta mini\" di atas piring Anda. Nasi putih hangat menjadi dasar untuk pentas berbagai lauk pauk khas Minang yang memikat.\n" +
                    "\n" +
                    "Mencicipi Kekayaan Rasa: Beragam lauk pauk berjejer menggoda, dari rendang yang kaya bumbu dan pedas, ayam bakar yang gurih dengan aroma asap, hingga gulai nangka muda yang bercita rasa gurih dan sedikit manis. Telur dadar, perkedel kentang, dan sambal hijau yang pedas menjadi pelengkap yang tak terlupakan.\n" +
                    "\n" +
                    "Tradisi yang Diwariskan: Proses memasak Nasi Padang diturunkan dari generasi ke generasi, memastikan cita rasa yang otentik dan khas. Rempah-rempah yang harum, seperti cabai, lengkuas, kunyit, dan serai, dipadukan dengan santan untuk menciptakan bumbu yang kaya dan kompleks.\n" +
                    "\n" +
                    "Lebih dari Sekedar Hidangan: Nasi Padang bukan hanya sekadar makanan, tetapi juga menjadi cerminan budaya Minang yang kaya. Disajikan dalam berbagai acara, dari pertemuan keluarga hingga perayaan resmi, Nasi Padang menjadi simbol keramahan dan kebersamaan.\n" +
                    "\n" +
                    "Menikmati Kuliner Nusantara: Nasi Padang dapat dinikmati di rumah makan Padang yang tersebar luas di seluruh Indonesia, bahkan di mancanegara. Pilih lauk pauk sesuai selera Anda dan nikmatilah \"pesta mini\" rasa yang akan membuat Anda ingin kembali lagi."),
            Makanan("Gudeg", 18000, "Yogyakarta, Jawa Tengah", R.drawable.gudeg,"Gudeg, sajian istimewa dari Yogyakarta, menawarkan perpaduan rasa manis dan gurih yang unik dan tak terlupakan. Dibuat dari nangka muda yang dimasak dengan santan dan gula merah, gudeg menjadi ikon kuliner Yogyakarta yang digemari banyak orang.\n" +
                    "\n" +
                    "Cita Rasa yang Melekat: Gudeg memiliki cita rasa yang khas dan beragam. Gudeg kering menawarkan tekstur yang lebih renyah dengan rasa manis yang dominan, sedangkan gudeg basah memiliki tekstur yang lebih basah dan rasa yang lebih gurih. Disajikan dengan nasi putih, ayam opor, telur pindang, sambal krecek, dan krupuk, gudeg menjadi hidangan yang lengkap dan mengenyangkan.\n" +
                    "\n" +
                    "Lebih dari Sekedar Hidangan: Gudeg bukan hanya sekedar hidangan lezat, tetapi juga memiliki nilai budaya yang tinggi. Di Yogyakarta, gudeg sering disajikan dalam berbagai acara adat dan keagamaan. Gudeg juga menjadi simbol keramahan dan kehangatan masyarakat Yogyakarta.\n" +
                    "\n" +
                    "Menjelajahi Kuliner Yogyakarta: Gudeg mudah ditemukan di Yogyakarta, mulai dari warung makan kaki lima hingga restoran mewah. Ada berbagai jenis gudeg yang bisa dinikmati, seperti gudeg kering, gudeg basah, dan gudeg mercon yang pedas.\n" +
                    "\n" +
                    "Menikmati Kelezatan Gudeg: Bagi para pencinta kuliner, mencicipi gudeg adalah hal yang wajib dilakukan saat berkunjung ke Yogyakarta. Rasakan perpaduan rasa manis dan gurih yang unik, nikmati teksturnya yang khas, dan rasakan kehangatan budaya Yogyakarta dalam setiap suapan gudeg."),
            Makanan("Ayam Taliwang", 16000, "Lombok, Nusa Tenggara Barat", R.drawable.ayamta,"Ayam Taliwang: Sensasi Pedas Menggoda dari Lombok\n" +
                    "Ayam Taliwang, hidangan ayam bakar pedas khas Lombok, Nusa Tenggara Barat, menggoda para pecinta kuliner dengan rasa pedasnya yang unik dan aroma bakaran yang menggoda. Dibuat dari ayam kampung yang dimarinasi dengan bumbu pedas khas Lombok, hidangan ini menawarkan sensasi rasa yang tak terlupakan.\n" +
                    "\n" +
                    "Perpaduan Rasa yang Mengagumkan: Bumbu Ayam Taliwang terdiri dari cabai merah, bawang merah, bawang putih, terasi, dan rempah-rempah lain yang dihaluskan dan dipadukan dengan santan. Ayam dimarinasi dalam bumbu ini selama beberapa jam sebelum dibakar, menghasilkan rasa pedas yang meresap hingga ke dalam daging.\n" +
                    "\n" +
                    "Lebih dari Sekedar Hidangan: Ayam Taliwang bukan hanya makanan lezat, tetapi juga simbol budaya Lombok. Hidangan ini sering disajikan dalam acara adat dan keagamaan, mencerminkan tradisi dan keramahan masyarakat Lombok.\n" +
                    "\n" +
                    "Menjelajahi Cita Rasa Lombok: Mencicipi Ayam Taliwang adalah pengalaman wajib bagi para pecinta kuliner yang mengunjungi Lombok. Hidangan ini biasanya disajikan dengan nasi putih, plecing kangkung (kangkung rebus dengan bumbu pedas), dan sambal terasi.\n" +
                    "\n" +
                    "Resep Tradisional: Memasak Ayam Taliwang di rumah mungkin membutuhkan waktu dan kesabaran, tetapi hasilnya akan memuaskan. Pastikan untuk menggunakan ayam kampung dan bumbu segar untuk mendapatkan rasa yang otentik.\n" +
                    "\n" +
                    "Kelezatan yang Mendunia: Popularitas Ayam Taliwang telah melampaui Lombok. Hidangan ini dapat ditemukan di berbagai daerah di Indonesia dan bahkan di beberapa negara tetangga.\n" +
                    "\n" +
                    "Menikmati Sensasi Pedas: Bagi penyuka rasa pedas, Ayam Taliwang adalah hidangan yang wajib dicoba. Rasa pedasnya yang unik, dipadukan dengan aroma bakaran dan tekstur daging ayam yang empuk, akan memberikan pengalaman kuliner yang tak terlupakan."),
            Makanan("Papeda", 25000, "Maluku", R.drawable.papeda,"Papeda, makanan pokok masyarakat Papua, Indonesia, menawarkan pengalaman kuliner yang unik. Berbeda dengan kebanyakan sumber pati, papeda memiliki tekstur kenyal dan tebal serta rasa yang netral. Terbuat dari tepung sagu, yang diekstrak dari pohon sagu, hidangan ini menjadi bagian penting dari budaya dan pola makan masyarakat Papua.\n" +
                    "\n" +
                    "Lebih dari sekadar teksturnya yang unik, papeda memiliki makna penting dalam tradisi Papua. Papeda sering hadir di upacara dan festival, melambangkan kebersamaan dan kekompakan masyarakat. Selain itu, papeda juga merupakan sumber karbohidrat dan energi yang signifikan, menopang gaya hidup aktif masyarakat Papua.\n" +
                    "\n" +
                    "Membuat papeda melibatkan merebus air, menambahkan tepung sagu, dan mengaduk terus-menerus hingga membentuk adonan. Proses ini membutuhkan ketelitian dan kesabaran untuk mendapatkan kekentalan yang diinginkan. Hidangan tradisional ini biasanya dinikmati dengan ikan atau lauk pauk gurih lainnya karena rasa netralnya memungkinkan cita rasa dari bahan pelengkap tersebut lebih menonjol.\n" +
                    "\n" +
                    "Bagi mereka yang mencari petualangan kuliner yang tidak biasa, papeda menawarkan secuplik budaya dan masakan Papua. Teksturnya yang unik dan rasa netralnya, dipadukan dengan makna budayanya, menjadikan papeda pengalaman yang tak terlupakan."),
            Makanan("Liwetan", 12000, "Banyumas, Jawa Tengah", R.drawable.liwetan,"Liwetan Banyumas, sajian sederhana nan nikmat, menjadi kuliner khas yang tak hanya menggoyang lidah, tetapi juga merepresentasikan budaya kebersamaan masyarakat Banyumas. Disajikan di atas daun pisang, liwetan menawarkan perpaduan nasi gurih, aneka lauk pauk, dan sambal yang menggugah selera.\n" +
                    "\n" +
                    "Cita Rasa yang Melekat: Nasi yang digunakan dalam liwetan biasanya dimasak dengan santan dan rempah-rempah, menghasilkan aroma yang harum dan rasa gurih yang khas. Lauk pauk yang menyertai liwetan pun beragam, mulai dari ikan asin, tempe orek, hingga sayur labu siam. Sambal pedas menjadi pelengkap yang tak terpisahkan, menambah sensasi rasa dan nikmatnya santap bersama.\n" +
                    "\n" +
                    "Lebih dari Sekadar Hidangan: Liwetan Banyumas tak sekadar sajian untuk mengganjal perut. Menyantap liwetan bersama-sama, menggunakan tangan, dan mengambil dari wadah yang sama, melambangkan keakraban dan kebersamaan masyarakat Banyumas. Hal ini merefleksikan nilai-nilai gotong royong dan kebersatuan yang dijunjung tinggi.\n" +
                    "\n" +
                    "Menikmati Kearifan Lokal: Mencicipi liwetan Banyumas menjadi kesempatan untuk menyantap kuliner lokal dengan cita rasa otentik. Biasanya liwetan disajikan dalam berbagai acara, seperti syukuran, kenduri, atau sekedar makan bersama keluarga tercinta.\n" +
                    "\n" +
                    "Mencoba Membuat Sendiri: Walaupun terkesan sederhana, liwetan Banyumas memiliki kekhasan tersendiri. Jika tertarik, Anda dapat mencoba membuatnya sendiri di rumah. Yang terpenting adalah menggunakan bahan-bahan segar dan berkualitas, serta memasaknya dengan penuh semangat kebersamaan.\n" +
                    "\n" +
                    "Liwetan Banyumas, perpaduan cita rasa dan budaya, menawarkan pengalaman kuliner yang tak terlupakan. Jadi, tunggu apalagi? Ajak sanak saudara dan nikmati kebersamaan dengan sepiring liwetan Banyumas!"),
            Makanan("Brekecek", 15000, "Banyumas, Jawa Tengah", R.drawable.brekecek,"Brekecek Banyumas: Perpaduan Unik antara Pedas dan Gurih\n" +
                    "Brekecek Banyumas, sajian khas dari Banyumas, Jawa Tengah, menawarkan perpaduan rasa yang unik dan menggugah selera. Terbuat dari daging sapi yang dipotong tipis dan dimasak dengan bumbu santan dan rempah-rempah, brekecek mampu membuat lidah bergoyang dan meninggalkan kesan tersendiri.\n" +
                    "\n" +
                    "Perpaduan Rasa yang Istimewa: Bumbu brekecek terdiri dari cabai merah, bawang merah, bawang putih, kemiri, kencur, dan rempah-rempah lainnya yang dihaluskan, kemudian dimasak bersama santan dan daging sapi. Perpaduan santan yang gurih berpadu dengan pedasnya cabai serta aroma rempah-rempah yang harum menciptakan cita rasa yang unik dan menggugah selera.\n" +
                    "\n" +
                    "Lebih dari Sekadar Kuliner: Brekecek tak hanya memanjakan lidah, tetapi juga memiliki nilai budaya tersendiri. Biasanya disajikan dalam acara-acara tertentu seperti hajatan atau kenduri, brekecek menjadi simbol kebersamaan dan keakraban masyarakat Banyumas. Menyantap brekecek bersama-sama sambil bercengkrama semakin mempererat hubungan kekeluargaan dan kekompakan masyarakat.\n" +
                    "\n" +
                    "Mencoba Resep Tradisional: Bagi para pecinta kuliner, membuat brekecek di rumah bisa menjadi pengalaman yang menyenangkan. Meskipun proses memasaknya membutuhkan ketelitian dan kesabaran, hasil akhirnya akan memuaskan. Pastikan untuk menggunakan bahan-bahan segar dan berkualitas, serta ikuti resep tradisional untuk mendapatkan cita rasa yang otentik.\n" +
                    "\n" +
                    "Menikmati Kuliner Nusantara: Brekecek Banyumas hanyalah salah satu dari sekian banyak kuliner nusantara yang kaya cita rasa dan budaya. Dengan mencoba berbagai kuliner lokal, kita dapat semakin menghargai kekayaan dan keanekaragaman Indonesia.\n" +
                    "\n" +
                    "Jadi, jika Anda berkesempatan berkunjung ke Banyumas, jangan lewatkan kesempatan untuk mencicipi brekecek. Nikmati perpaduan rasa yang unik dan rasakan kearifan lokal yang terkandung di dalamnya."),
            Makanan("Rawon", 18000, "Surabaya, Jawa Timur", R.drawable.rawon,"Rawon, sup daging sapi kaya rempah, adalah kuliner kebanggaan Jawa Timur. Aroma khasnya yang kuat langsung menggelitik indra penciuman, menggoda untuk segera mencicipi. Kuahnya berwarna kecokelatan gelap, bukan berasal dari kecap manis melainkan dari buah kluwek, yang memberikan rasa gurih dan sedikit pahit unik.\n" +
                    "\n" +
                    "Perpaduan Rasa yang Istimewa: Bumbu rawon terdiri dari beragam rempah, seperti bawang merah, bawang putih, kemiri, kencur, lengkuas, jahe, dan cabai yang dihaluskan. Rempah-rempah tersebut kemudian dimasak bersama daging sapi yang sebelumnya telah dipotong kecil-kecil dan dibumbui.\n" +
                    "\n" +
                    "Lebih dari Sekedar Hidangan: Rawon tak hanya menggugah selera, tetapi juga memiliki makna budaya. Di beberapa daerah di Jawa Timur, rawon disajikan dalam acara-acara tertentu seperti syukuran atau hajatan. Menyantap rawon bersama keluarga atau kerabat sambil bercengkrama turut mempererat hubungan dan kebersamaan.\n" +
                    "\n" +
                    "Menikmati Sentuhan Tradisional: Rawon disajikan dengan nasi putih dan berbagai macam pelengkap. Tauge, irisan telur asin, sambal, dan kerupuk udang adalah beberapa pelengkap yang biasa menemani semangkuk rawon panas.\n" +
                    "\n" +
                    "Mencoba Memasak Sendiri: Membuat rawon di rumah mungkin membutuhkan waktu dan kesabaran, terutama untuk mengolah bumbu dan mendapatkan kematangan daging yang pas. Namun, bagi penikmat kuliner, proses memasak tersebut bisa menjadi pengalaman yang menyenangkan dan memuaskan.\n" +
                    "\n" +
                    "Sensasi Kuliner Tak Terlupakan: Keunikan rasa rawon, perpaduan gurih, sedikit pahit, dan aroma rempah yang kuat, membuat pengalaman mencicipinya tak terlupakan. Jadi, jika Anda berkesempatan berkunjung ke Jawa Timur, jangan lewatkan kesempatan untuk mencicipi rawon dan rasakan sensasi kulinernya yang khas."),
            Makanan("Pindang Serani", 13000, "Palembang, Sumatra Selatan", R.drawable.pindangserani,"Pindang serani, sup ikan tradisional khas Palembang, Sumatera Selatan, menawarkan cita rasa segar dan sedikit asam. Menggunakan ikan rebus seperti toman atau baung, pindang serani dibumbui dengan kemiri, kunyit, cabai, dan asam jawa. Sup ini biasanya disajikan dengan nasi kuning dan pelengkap lainnya seperti pindang udang dan telur pindang.\n" +
                    "\n" +
                    "Konon pindang serani berasal dari masyarakat Palembang yang tinggal di sekitar Sungai Musi. Sup ini menjadi hidangan populer saat Idul Fitri dan acara perayaan lainnya. Pindang serani juga dianggap sebagai makanan rumahan yang sering dikonsumsi saat sakit."),
            Makanan("Bebek Betutu", 14000, "Bali", R.drawable.bebekbetutu,"Bebek betutu, hidangan khas Bali yang kaya rasa, menawarkan sensasi kuliner yang tak terlupakan. Bebek yang dimarinasi dengan bumbu betutu khas Bali, terbuat dari cabai, bawang merah, bawang putih, terasi, dan rempah-rempah lainnya, menghasilkan rasa pedas, gurih, dan aroma yang harum.\n" +
                    "\n" +
                    "Proses memasaknya yang unik, dengan cara dibungkus daun pisang dan dipanggang, menghasilkan tekstur bebek yang empuk dan juicy. Bebek betutu biasanya disajikan dengan sambal matah, sambal pedas segar yang menambah kenikmatan hidangan.\n" +
                    "\n" +
                    "Bukan hanya kelezatannya, bebek betutu juga mengandung makna budaya. Hidangan ini sering disajikan dalam acara-acara adat Bali sebagai simbol kebersamaan dan kemakmuran.\n" +
                    "\n" +
                    "Mencicipi bebek betutu di Bali menjadi pengalaman kuliner yang wajib dicoba. Rasanya yang khas dan proses memasaknya yang unik menjadikan bebek betutu hidangan istimewa yang tak mudah dilupakan."),
            Makanan("Coto Makassar", 17000, "Makassar, Sulawesi Selatan", R.drawable.coto,"Coto Makassar, hidangan berkuah khas Sulawesi Selatan, terkenal dengan cita rasa gurih dan kaya rempah. Daging sapi yang direbus hingga empuk berpadu dengan kuah kental berwarna coklat kehitaman, terbuat dari kluwek, kacang tanah, dan aneka bumbu rempah.\n" +
                    "\n" +
                    "Keunikan coto Makassar terletak pada sambalnya yang khas, terbuat dari cabai rawit, bawang merah, bawang putih, dan terasi, menghasilkan rasa pedas dan asam yang menyegarkan. Coto Makassar biasanya disajikan dengan ketupat, buras, telur pindang, dan sambal.\n" +
                    "\n" +
                    "Bukan hanya kelezatannya, coto Makassar juga memiliki nilai budaya. Hidangan ini sering disajikan dalam acara-acara adat dan menjadi simbol keramahan masyarakat Sulawesi Selatan.\n" +
                    "\n" +
                    "Mencicipi coto Makassar di Makassar menjadi pengalaman kuliner yang tak boleh dilewatkan. Rasanya yang khas dan nilai budayanya yang kental menjadikan coto Makassar hidangan istimewa yang patut dicoba."),
            Makanan("Nasi Liwet", 16000, "Cirebon, Jawa Barat", R.drawable.nasiliwet,"Nasi liwet Cirebon, sajian tradisional khas Cirebon, Jawa Barat, menawarkan cita rasa gurih dan kaya rempah. Nasi yang dimasak dengan santan dan berbagai bumbu rempah, seperti bawang merah, bawang putih, lengkuas, serai, dan daun salam, menghasilkan aroma harum dan rasa yang istimewa.\n" +
                    "\n" +
                    "Nasi liwet biasanya disajikan dengan berbagai lauk pauk, seperti ayam opor, semur hati, telur balado, tempe goreng, dan sambal goreng ati. Perpaduan nasi liwet yang gurih dan lauk pauk yang beragam menghasilkan pengalaman kuliner yang tak terlupakan.\n" +
                    "\n" +
                    "Bukan hanya kelezatannya, nasi liwet Cirebon juga memiliki nilai budaya. Hidangan ini sering disajikan dalam acara-acara adat dan menjadi simbol kebersamaan masyarakat Cirebon.\n" +
                    "\n" +
                    "Mencicipi nasi liwet Cirebon di Cirebon menjadi pengalaman kuliner yang wajib dicoba. Rasanya yang khas dan nilai budayanya yang kental menjadikan nasi liwet Cirebon hidangan istimewa yang patut dicoba."),
            Makanan("Klepon", 15000, "Jawa", R.drawable.klepon,"\n" +
                    "Klepon, kudapan manis tradisional asal Jawa, menawarkan cita rasa manis dan tekstur unik yang tak terlupakan. Bola-bola kecil terbuat dari tepung beras ketan, diisi dengan gula merah cair, dan dilapisi kelapa parut ini menghadirkan sensasi manis legit di setiap gigitan.\n" +
                    "\n" +
                    "Warna hijau khas klepon berasal dari daun pandan yang dicampurkan pada adonan tepung. Klepon tak hanya lezat, tapi juga mengandung makna simbolis. Warna hijau melambangkan kesuburan, dan teksturnya yang lengket melambangkan rasa persaudaraan.\n" +
                    "\n" +
                    "Mencicipi klepon menjadi pengalaman kuliner Indonesia yang tak boleh dilewatkan. Rasanya yang manis, teksturnya yang unik, dan nilai budayanya yang kental menjadikan klepon kudapan istimewa yang patut dicoba.\n" +
                    "\n" +
                    "Klepon mudah ditemukan di berbagai daerah di Jawa, dijual oleh pedagang kaki lima, pasar tradisional, ataupun toko kue. Klepon juga sering disajikan pada acara-acara adat dan menjadi simbol kegembiraan dan kebersamaan.")
        )

    }
}

