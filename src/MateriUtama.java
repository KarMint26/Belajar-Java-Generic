public class MateriUtama {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
         * Java Generic
         *
         * Generic Class
         * adalah class / interface yang memiliki Parameter Type, tidak ada ketentuan dalam pembuatan
         * generic parameter type, namun biasanya kebanyakan orang menggunakan 1 karakter sebagai generic
         * parameter type.
         * Nama Generic Parameter Type yang biasa digunakan adalah :
         * E - Element (Biasa digunakan pada collection atau struktur data)
         * K - Key
         * N - Number
         * T - Type (yang sering ini yang lain tidak wajib)
         * V - Value
         * S.U.V etc. 2nd, 3rd, 4th types
         * Semua tipe bisa seperti Class, Interface, Record, Annotation. Kecuali Enum.
         *
         * Multiple Parameter Type
         * Parameter type di Generic class boleh lebih dari satu.
         * Namun harus menggunakan nama type berbeda.
         * Ini sangat berguna ketika kita ingin membaut generic parameter type yang banyak.
         *
         * Generic Method
         * Generic parameter type tidak hanya bisa digunakan pada class atau interface.
         * Kita juga bisa menggunakan generic parameter type di method.
         * Generic parameter type yang kita deklarasikan di method, hanya bisa diakses di method tersebut,
         * tidak bisa digunakan diluar method.
         * Ini cocok jika kita ingin membuat generic method, tanpa harus mengubah deklarasi class.
         *
         * INVARIANT
         * Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah Invariant.
         * Invariant artinya tidak boleh di substitusi dengan subtype (child) atau supertype(parent).
         * Artinya saat kita membuat Object Contoh <String>, maka tidak sama dengan Contoh<Object>, begitupun
         * sebaliknya, saat kita membuat object Contoh<Object>, maka tidak sama dengan contoh<String>.
         *
         * COVARIANT
         * Artinya kita bisa melakukan substitusi subtype(child) dengan supertype(parent).
         * Caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci (? extends
         * Object>.
         * Covariant adalah read-only, jadi kita tidak bisa mengubah data genericnya.
         *
         * CONTRAVARIANT
         * Artinya kita bisa melakukan substitusi supertype(parent) dengan subtype(child).
         * Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci
         * (? super SubClass).
         * Artinya saat kita membuat object Contoh<Object>,  maka bisa substitusi menjadi Contoh<? super String>.
         * Contravariant adalah bisa write and read, namun perlu berhati-hati ketika melakukan read, terutama
         * jika sampai parentnya punya banyak child.
         *
         * Bounded Type Parameter
         * Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type.
         * Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan.
         * Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau class2
         * turunannya. Secara default, constraint type untuk generic parameter type adalah object, sehingga
         * semua tipe data bisa digunakan.
         * Kita bisa menambahkan bebrapa bounded type dengan karakter dan setelah bounded type pertama.
         * Jika ingin menambahkan lagi, cukup gunakan karakter & diikuti bounded typenya lagi.
         * Ini yang disebut Multiple Bounded Type Parameter.
         *
         * WildCard
         * kadang ada kasus kita tidak peduli dengan generic parameter type pada object.
         * Misal kita hanya ingin mem-print data T, tidak peduli dengan tipe apapun.
         * Jika kita mengalami kasus seperti ini, kita bisa menggunakan wildcard.
         * Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ? .
         *
         * Type Erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada
         * saat Runtime.
         * Type Erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah
         * di compile menjadi binary file.
         * Compiler akan mengubah generic parameter type menjadi tipe Object di Java.
         * Problem Type Erasure.
         * Karena informasi generic hilang ketika sudah menjadi binary file.
         * Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak.
         *
         * Comparable
         * Sebelumnya kita sudah tahu bahwa operator perbandingan object menggunakan method equals.
         * Bagaimana dengan operator perbandingan lainnya? seperti kruang dari atau lebih dari?
         * Operator perbandingan tsb bisa kita lakukan, jika object kita mewariskan interface generic Comparable.
         * Ini banyak sekali digunakan seperti untuk proses pengurutan data misalnya.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Comparable.html
         *
         * Comparator Interface
         * Jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface Comparable.
         * Namun bagaimana jika class tersebut milik orang lain ? tidak bisa kita ubah ?
         * Maka kita bisa menggunakan interface generic yang bernama Comparator.
         * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/Comparator.html
         */
    }

}