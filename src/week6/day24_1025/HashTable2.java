package week6.day24_1025;

import java.util.HashSet;

public class HashTable2 {

    private int size = 10000;
    private int[] table = new int[size];

    public HashTable2() {
    }

    public HashTable2(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum  = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key,int value) {
        int hashCode = hash(key);
        this.table[hashCode] = value;
    }

    public int search(String key) {
        return this.table[hash(key)];
    }


    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo",
                "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim",
                "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim",
                "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim",
                "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim",
                "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark",
                "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo",
                "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong",
                "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn",
                "SoonminEom", "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon",
                "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee",
                "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang",
                "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon",
                "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo",
                "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi",
                "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable2 ht = new HashTable2();
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }

        System.out.println(ht.search("ohsukKwon"));
        System.out.println(ht.search("JiyoungAhn"));
    }
}
