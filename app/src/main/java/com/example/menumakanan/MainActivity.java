package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan,  this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){

        namaMakanan.add("Pecel Lele");
        fotoMakanan.add("https://asset.kompas.com/crops/QT6V0LoKz42gr5uezLBcGZyBBLw=/0x0:1000x667/750x500/data/photo/2021/03/21/60569b33a2b3d.jpeg");
        infoMakanan.add("Pecel lele atau pecek lele di Indonesia adalah nama sebuah makanan khas Jawa yang terdiri dari ikan lele dan sambal tomat. Biasanya yang dimaksud adalah ikan lele yang digoreng kering dengan minyak lalu disajikan dengan sambal tomat dan lalapan. Lalapan biasa terdiri dari kemangi, kubis, mentimun, dan kacang panjang.");

        namaMakanan.add("Nasi goreng mercon");
        fotoMakanan.add("https://img-global.cpcdn.com/recipes/4f4a29ff03b3b7b2/680x482cq70/nasi-goreng-mercon-spesial-foto-resep-utama.webp");
        infoMakanan.add("Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.");

        namaMakanan.add("Ayam Geprek Keju");
        fotoMakanan.add("http://kbu-cdn.com/dk/wp-content/uploads/ayam-geprek-keju.jpg");
        infoMakanan.add("Ayam geprek adalah makanan ayam goreng tepung khas Indonesia yang diulek atau dilumatkan bersama sambal bajak. Kini ayam geprek telah menjadi hidangan populer yang dapat ditemukan di hampir semua kota besar di Indonesia, tetapi asal mula ayam geprek berasal dari kota Yogyakarta.");

        namaMakanan.add("Kari ayam");
        fotoMakanan.add("https://img-global.cpcdn.com/recipes/fec707d2c73e9285/680x482cq70/kari-ayam-bumbu-sederhana-foto-resep-utama.webp");
        infoMakanan.add("adalah hidangan umum di Asia Selatan, Asia Tenggara, serta di Caribbean (di mana makanan tersebut biasa disebut sebagai \"ayam kari\"). Kari ayam di Asia Selatan terdiri dari daging ayam yang direbus dalam bawang bombai dan saus yang berbahan dasar tomat, yang ditambahkan dengan jahe, bawang putih, cabai dan berbagai rempah-rempah, yang biasanya meliputi kunyit, jintan putih, ketumbar, kulit kayu manis, kapulaga seberang dan lain-lain. Di luar Asia Selatan, kari ayam biasanya dibuat dengan campuran rempah-rempah siap masak yakni bubuk kari.");

        namaMakanan.add("Tahu Bulat");
        fotoMakanan.add("https://i1.wp.com/resepkoki.id/wp-content/uploads/2016/11/Resep-Tahu-Bulat.jpg?fit=400%2C440&ssl=1");
        infoMakanan.add("Tahu bulat adalah salah satu jenis tahu yang sesuai namanya, berbentuk bulat. Saat digoreng, tahu ini akan mengembang 2 kali lipat dari ukuran asalnya. Sebab itulah ketika dimakan, tekstur luarnya kering dan hanya memiliki sedikit isi di dalamnya.\n" +
                "\n" +
                "Tahu bulat berasal dari Tasikmalaya. Tahu ini telah ditambah dengan bumbu-bumbu sehingga rasanya lebih gurih dan enak. Berawal dari bisnis rumahan yang hanya dipasarkan di lingkungan sekitar, tahu bulat kemudian semakin terkenal. Mulai dari satu orang ke orang lainnya sampai akhirnya sekarang menjadi hits di mana-mana.");

        namaMakanan.add("Salad Buah");
        fotoMakanan.add("https://asset.kompas.com/crops/_3OHLkEuiqcucp32NNy9TuYRZCw=/0x1567:1920x2847/750x500/data/photo/2020/06/07/5edc973dc17ba.jpg");
        infoMakanan.add("Salad buah adalah makanan segar yang terbuat dari berbagai macam buah enak dan segar yang dicampur dengan bahan lain seperti yogurt, mayones, dan keju. Umumnya makanan ini dijadikan sebagai hidangan penutup yang lezat, atau jadi camilan sore.");

        prosesRecyclerViewAdapter();


    }
}