package com.example.projectakhir;

import java.util.ArrayList;

public class data {
    private static int[] img_data = {
            R.drawable.kotlin,
            R.drawable.cplus,
            R.drawable.js,
            R.drawable.python,
            R.drawable.ruby,
            R.drawable.vba,
            R.drawable.flutter,
            R.drawable.csharp,
            R.drawable.pascal,
            R.drawable.pphp

    };
    private static String[] text_data = {
            "Kotlin",
            "C++",
            "Java Script",
            "Python",
            "Ruby",
            "Visual Basic",
            "Fluter",
            "C#",
            "Pascal",
            "PHP"
    };
    private static String[] detail_data = {
            "Kotlin merupakan bahasa pemrograman dengan pengetikan statis dan berjalan pada Mesin Virtual Java atau JVM. Kotlin dapat juga dikompilasikan ke dalam bentuk source code JavaScript.",
            "Bahasa pemrograman C++ mulai dikembangkan pada tahun 1970. Bahasa ini merupakan turunan dari Bahasa pemrograman C. Dimana bahasa pemrograman C++ juga termasuk ke salah satu bahasa yang berorientasi objek biasanya disebut dengan Object Oriented Programming.",
            "JavaScript merupakan salah satu bahasa pemrograman populer di internet. JavaScript dapat bekerja disebagian besar browser populer yaitu : Internet Explorer, Google Chrome, Mozilla Firefox, Opera dan lainnya. Kode-kode JavaScript dapat disisipkan di dalam halaman web menggunakan tag script.",
            "Dikutip dari petanikode.com Phyton merupakan salah satu bahasa pemrograman yang paling mudah dipelajari saat ini dibandingkan dengan bahasa pemrograman lainnya.",
            "Ruby merupakan bahasa pemrograman yang dinamis, refletif, elegan, dan berbasis objek. Menurut situs ruby-lang.org ” Ruby adalah sahabat terbaik programmer “. Ruby bersifat open source, mudah dimengerti, dan produktif. Kode-kode Ruby cukup elegan, naturan, mudah dibaca dan ditulis.",
            "VBA (Visual Basic for Application) merupakan sebuah bahasa turunan dari bahasa Visual Basic yang juga dikembangkan oleh Microsoft.\n" +
                    "\n" +
                    "VBA sendiri merupakan kombinasi yang terintegrasi antara lingkungan pemrograman Visual Basic Editur dengan bahasa pemrograman Visual Basic dalam aplikasi utama Microsoft Office yang ditujukan untuk aplikasi-aplikasi tertentu.",
            "Flutter adalah sebuah framework aplikasi mobil sumber terbuka yang diciptakan oleh Google. Flutter digunakan dalam pengembangan aplikasi untuk sistem operasi Android dan iOS, serta menjadi metode utama untuk membuat aplikasi Google ",
            "C# merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework.",
            "Nama Pascal diambil dari ahli matematika Prancis abad pertengahan, Blaise Pascal. Bahasa Pemrograman Pascal dikembangkan oleh Niklaus Wirth pada tahun 1970 dan mencapai puncak kepopulerannya di pada era 1970 hingga awal 1990an (terutama dengan compiler Turbo Pascal)",
            "PHP: Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML. PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS"
    };

    static ArrayList<Leanguage> getListData() {
        ArrayList<Leanguage> leanguages = new ArrayList<>();
        for (int j = 0; j < text_data.length; j++) {
            Leanguage leanguage = new Leanguage();
            leanguage.setNama(text_data[j]);
            leanguage.setDetail(detail_data[j]);
            leanguage.setImage(img_data[j]);
            leanguages.add(leanguage);

        }
        return leanguages;
    }
}
