public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        // membuat variable name dengan tipe data string dan menghasilkan value "Muhammad Sahril"
        String name = "Muhammad Sahril";
        System.out.println(name);

        // membuat variable myNum dengan tipe data int(integer) dan menghasilkan value 6
        // tipe data int biasanya digunakan untuk mengisi number/nomor/angka tanpa desimal, seperti 1,2,3,4,5,...
        int myNum = 6;  // versi 1
        System.out.println(myNum);

        int myNumb; // versi 2
        myNumb = 6;
        System.out.println(myNumb);

        // mengubah value
        // bertujuan untuk mengubah value variable yang sudah ada
        int myNumbe = 6;
        myNumbe = 2; // awalnya value dari myNumbe 6, kemudian berubah menjadi 2
        System.out.println(myNumbe);

        // menetapkan suatu variable yang tidak dapat diubah lagi
        final int myNumber = 6;
        //myNumber = 6; // ini akan terjadi error karena variable final int
        System.out.println(myNumber);

        // Jenis tipe variable dan cara deklarasinya
        int myNumberr = 1; // untuk menampilkan/menyimpan angka tanpa desimal
        float myFloatNum = 2; // untuk menampilkan/menyimpan angka dengan desimal
        char myLetter = 'S'; // untuk menampilkan/menyimpan karakter tunggal
        boolean myBool = true;  // untuk menampilkan/menyimpan 2 pernyataan yaitu : true & false
        String myString = "Halo"; // untuk menampilkan/menyimpan kalimat/text


        // DISPLAY VARIABLE //
        // 1. STRING
        String myName = "Sahril";
        System.out.println("Hello " + myName);

        String firstName = "Muhammad";
        String lastName = "Sahril";
        String fullName = firstName + lastName;
        System.out.println(fullName);


        // 2. INT(Integer)
        // biasanya digunakan untuk penghitungan/manipulasi angka
        int x = 1;
        int y = 2;
        System.out.println(x + y);

        // versi 1
        int xX = 1;
        int yY = 2;
        int zZ = 3;
        System.out.println(xX + yY + zZ);

        // versi 2
        int xXx = 1, yYy = 2, zZz = 3;
        System.out.println(xXx + yYy + zZz);

        // versi lain, yaitu satu value menjadi beberapa variable
        int xXxX,yYyY,zZzZ;
        xXxX = yYyY = zZzZ = 50;
        System.out.println(xXxX + yYyY + zZzZ);



        // IDENTIFIERS //
        // semua variable harus di identik dengan masing-masing variable unik & berbeda
        // boleh nama pendek seperti x,y,z atau panjam seperti myString,myStr,myNum,myNumber (intinya bebas dalam penentuan nama)
        int minutePerHour = 60; // versi 1 (bagus, lengkap & jelas)
        int m = 60; // versi 2 (ok tapi kurang jelas untuk dimengerti)
        /* The general rules for naming variables are:
            Names can contain letters, digits, underscores, and dollar signs
            Names must begin with a letter
            Names should start with a lowercase letter, and cannot contain whitespace
            Names can also begin with $ and _ (but we will not use it in this tutorial)
            Names are case-sensitive ("myVar" and "myvar" are different variables)
            Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        */



        // JAVA NUMBER //
        /* Data types are divided into two groups:
        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
        Primitive Data Types
        A primitive data type specifies the size and type of variable values, and it has no additional methods.

                There are eight primitive data types in Java:

        Data Type	Size	    Description
        byte    	1 byte	    Stores whole numbers from -128 to 127
        short	    2 bytes 	Stores whole numbers from -32,768 to 32,767
        int     	4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	    8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	    4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	    8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	    1 bit	    Stores true or false values
        char	    2 bytes 	Stores a single character/letter or ASCII values
         */
    }
}