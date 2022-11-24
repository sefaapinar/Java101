public class Main {
    public static void main(String[] args) {

        String str = "PATIKA";
        System.out.println(str.charAt(2)); //index numaraları ile string ifadeye geçebiliyoruz.

        System.out.println(str.codePointAt(1)); //Belirtilen indeksteki önceki karakterin Unicode'unu verir.
        System.out.println(str.compareTo("patika")); //unicodelarını karşılaştırır.

        System.out.println(str.concat(".dev")); // bir string ifadenin sonuna değer atabiliyoruz.
        System.out.println(str.contains("at")); // bir string ifadede "at" değerlerini kapsıyormu?

        System.out.println(str.endsWith("ab")); //ab ile bitmiş mi onu kontrol eder.

        System.out.println(str.equals("patika")); // bir true veya bir false döndürür.


    }
}