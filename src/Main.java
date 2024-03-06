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

        double A,B,C,D,E,F,G; // deklarasi variable
        // inisiasi variable
        A=1.0;
        B=2.0;
        // ekspresi operator
        C=A+B;
        D=A-B;
        E=A*B;
        F=A/B;
        G=A%B;

        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
        System.out.println("E="+E);
        System.out.println("F="+F);
        System.out.println("G="+G);

        /*
        OPERATOR ASSIGNMENT
        +=
        -=
        *=
        /=
        %=
        &=
        |=
        ^=
        <<=
        >>=
        >>>=

            *contoh pemakaian :
                misalkan ada value x & y
                maka untuk pemakaian operasi penjumlahan x+=y.
                arti variable tersebut sama dengan x=x+y
                begitu juga yang lainnya...
         */

        /*
        OPERATOR INCREMENT & DECREMENT
        merupakan operator untuk kenaikan & penurunan nilai.
            OPERATOR                CONTOH
            Prefix Increment ++     ++I
            Postfix Increment ++    I++
            Prefix Decrement --     --I
            Postfix Decrement --    I--
         */

        int xXxXx=10, yYyYy=10;
        System.out.println(++xXxXx);
        System.out.println(xXxXx++);
        System.out.println(xXxXx);
        System.out.println(--yYyYy);
        System.out.println(yYyYy--);
        System.out.println(yYyYy);

        /*
        OPERATOR RELASI
        merupakan operator menghasilkan nilai boolean yaitu true/false
            OPERATOR                        CONTOH
            >(lebih besar)                  if(x>y)
            <(lebih kecil)                  if(x<y)
            >=(lebih besar sama dengan)     if(x>=y)
            <=(lebih kecil sama dengan)     if(X<=y)
            ==(sama dengan)                 if(x==y)
            !=(tidak sama dengan)           if(x!=y)
         */

        /*
        OPERATOR LOGIKA
        merupakan operator untuk operasi logika yang sudah tentu menghasilkan nilai boolean yaitu true/false
            OPERATOR        CONTOH
            &&(and/dan)     (x>y && x<y)
            ||(or/atau)     (x>y || x<y)
            !(not/bukan)    if(x!y) // inisiasinya akan seperti (!(x==y));
         */
        int xXxXxX=5, yYyYyY=10;
        System.out.println(xXxXxX>yYyYyY && xXxXxX<yYyYyY);
        System.out.println(xXxXxX>yYyYyY || xXxXxX<yYyYyY);
        System.out.println(!(xXxXxX==yYyYyY));

        /*
        OPERATOR BIT
        merupakan operator untuk
        - memanipulasi data biner
        - melakukan pergeseran bit ke kanan/kiri
        - melakukan proses invers
            OPERATOR    CONTOH
            >>          (x>>y)
            <<          (x<<y)
         */
        int xXxXxXx=5, yYyYyYy=10;
        System.out.println(xXxXxXx>>yYyYyYy);
        System.out.println(xXxXxXx<<yYyYyYy);

        /*
        OPERATOR CASTING
        merupakan operator untuk mengubah tipe data lain
         */
        int a=5, b=10;
        char w=(char) a;
        char z=(char) b;
        System.out.println(a+" ini jadi data tipe char");
        System.out.println(b+" ini jadi data tipe char");

        /*
        KONVERSI DATA
         */
    }
}