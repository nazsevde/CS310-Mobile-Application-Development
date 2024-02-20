package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Province")
public class Province {
    @Id
    private String id;
    private String name;
    private String image; // image URLs for simplicity

    // Constructors, getters, and setters

    public Province() {
        // Default constructor
    }

    public Province(String name, String image) {
        this.name = name;
        this.image = image;
    }

    // Getters and setters for all fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // Method to populate provinces
    public static List<Province> populateProvinces() {
        List<Province> provinces = new ArrayList<>();

        // Assuming you have a list of province names and image URLs
        List<String> provinceNames = getProvinceNames();
        List<String> imageUrls = getImageUrls();

        for (int i = 0; i < provinceNames.size(); i++) {
            provinces.add(new Province(provinceNames.get(i), imageUrls.get(i)));
        }

        return provinces;
    }

    private static List<String> getProvinceNames() {
    List<String> names = new ArrayList<>();
    names.add("ADANA");
    names.add("ADIYAMAN");
    names.add("AFYONKARAHİSAR");
    names.add("AĞRI");
    names.add("AKSARAY");
    names.add("AMASYA");
    names.add("ANKARA");
    names.add("ANTALYA");
    names.add("ARDAHAN");
    names.add("ARTVİN");
    names.add("AYDIN");
    names.add("BALIKESİR");
    names.add("BARTIN");
    names.add("BATMAN");
    names.add("BAYBURT");
    names.add("BİLECİK");
    names.add("BİNGÖL");
    names.add("BİTLİS");
    names.add("BOLU");
    names.add("BURDUR");
    names.add("BURSA");
    names.add("ÇANAKKALE");
    names.add("ÇANKIRI");
    names.add("ÇORUM");
    names.add("DENİZLİ");
    names.add("DİYARBAKIR");
    names.add("DÜZCE");
    names.add("EDİRNE");
    names.add("ELAZIĞ");
    names.add("ERZİNCAN");
    names.add("ERZURUM");
    names.add("ESKİŞEHİR");
    names.add("GAZİANTEP");
    names.add("GİRESUN");
    names.add("GÜMÜŞHANE");
    names.add("HAKKARİ");
    names.add("HATAY");
    names.add("IĞDIR");
    names.add("ISPARTA");
    names.add("İSTANBUL");
    names.add("İZMİR");
    names.add("KAHRAMANMARAŞ");
    names.add("KARABÜK");
    names.add("KARAMAN");
    names.add("KARS");
    names.add("KASTAMONU");
    names.add("KAYSERİ");
    names.add("KIRIKKALE");
    names.add("KIRKLARELİ");
    names.add("KIRŞEHİR");
    names.add("KİLİS");
    names.add("KOCAELİ");
    names.add("KONYA");
    names.add("KÜTAHYA");
    names.add("MALATYA");
    names.add("MANİSA");
    names.add("MARDİN");
    names.add("MERSİN");
    names.add("MUĞLA");
    names.add("MUŞ");
    names.add("NEVŞEHİR");
    names.add("NİĞDE");
    names.add("ORDU");
    names.add("OSMANİYE");
    names.add("RİZE");
    names.add("SAKARYA");
    names.add("SAMSUN");
    names.add("SİİRT");
    names.add("SİNOP");
    names.add("SİVAS");
    names.add("ŞANLIURFA");
    names.add("ŞIRNAK");
    names.add("TEKİRDAĞ");
    names.add("TOKAT");
    names.add("TRABZON");
    names.add("TUNCELİ");
    names.add("UŞAK");
    names.add("VAN");
    names.add("YALOVA");
    names.add("YOZGAT");
    names.add("ZONGULDAK");

    return names;
}


 // Sample method to get image URLs
    private static List<String> getImageUrls() {
        // Replace this with your actual list of image URLs
        List<String> urls = new ArrayList<>();
        urls.add("https://images.app.goo.gl/j2Uk2FWBQJiYygeWA ");
        urls.add("https://images.app.goo.gl/mrXha2aCb655aUDf7 ");
        urls.add("https://images.app.goo.gl/ycXnUk22VGYPcQvS8 ");
        urls.add("https://images.app.goo.gl/QVadTbHiGMjpjbyz9 ");
        urls.add("https://images.app.goo.gl/TU4Cd3nzhmp16Xx96 ");
        urls.add("https://images.app.goo.gl/gK4FaUYtSBxiv6fbA ");
        urls.add("https://images.app.goo.gl/jhvYBbtAbsewnRaTA ");
        urls.add("https://images.app.goo.gl/wujR6yyayHNp3FsQA ");
        urls.add("https://images.app.goo.gl/c4Kg1ozRhZngf71T6 ");
        urls.add("https://images.app.goo.gl/2MhJ8qDgj9BQLUG19 ");
        urls.add("https://images.app.goo.gl/nh4mrmZXiQWiEoV66 ");
        urls.add("https://images.app.goo.gl/3FDZpPZLb35hZ41o9 ");
        urls.add("https://images.app.goo.gl/4oHbp9RTwuiezRL87 ");
        urls.add("https://images.app.goo.gl/DbTfUVDWHi5V5qmn7 ");
        urls.add("https://images.app.goo.gl/X1ofNsExainA9qmS6 ");
        urls.add("https://images.app.goo.gl/oKx8o3gSw47ezvWh8 ");
        urls.add("https://images.app.goo.gl/7oA2Dvfp8MX6N4Kw6 ");
        urls.add("https://images.app.goo.gl/wjPzPHrMoxKwdUxM6 ");
        urls.add("https://images.app.goo.gl/frD3p5RDiBc5696w5 ");
        urls.add("https://images.app.goo.gl/Dv8QX77Hz5hR6e6B9 ");
 	    urls.add("https://images.app.goo.gl/AuFjyPSYmVSxzbnX7 ");
 	    urls.add("https://images.app.goo.gl/cGMp1PwJykh6kXTw9 ");
 	    urls.add("https://images.app.goo.gl/2fuzCU5cfVDJUpSy9 ");
 	    urls.add("https://images.app.goo.gl/xUEJccMDLk23TyK56 ");
 	    urls.add("https://images.app.goo.gl/zYGzibMwtBZRqGoF6 ");
 	    urls.add("https://images.app.goo.gl/wxL9fBtMtdvJNQ9e7 ");
 	    urls.add("https://images.app.goo.gl/xh2VXN9hmNusAgEcA ");
 	    urls.add("https://images.app.goo.gl/pyxRNtFbr4GqzxVTA ");
 	    urls.add("https://images.app.goo.gl/c37F5wpKunPoGmfE6 ");
 	    urls.add("https://images.app.goo.gl/ZD4Cau3dUJvCxBF27 ");
 	    urls.add("https://images.app.goo.gl/YKxB5ktjkhWbDqgt6 ");
 	    urls.add("https://images.app.goo.gl/j6ypb3aSCdTh7wFb8 ");
 	    urls.add("https://images.app.goo.gl/Jvf6mZDg7Z5Wcnik8 ");
 	    urls.add("https://images.app.goo.gl/cQTW4cYgJ7FKaSji8 ");
 	    urls.add("https://images.app.goo.gl/YiLkPeDn4GBw1JFq6 ");
 	    urls.add("https://images.app.goo.gl/DVNVx5QfQPRXB1pG8" );
 	    urls.add("https://images.app.goo.gl/Zh1WTdUjPoXZL3wm7 ");
 	    urls.add("https://images.app.goo.gl/AJEJYwLKsMsYEyDQ9 ");
 	    urls.add("https://images.app.goo.gl/GJzUCENkk4LBUyXE8 ");
 	    urls.add("https://images.app.goo.gl/GSm1gLP3emD4egdG6 ");
        urls.add("https://images.app.goo.gl/uV7VDHvDbfmGEBV6A ");
        urls.add("https://images.app.goo.gl/PtUVXzNkTGiN7TAQ7 ");
        urls.add("https://images.app.goo.gl/gnHVRERc8P69Tetm8 ");
        urls.add("https://images.app.goo.gl/WSFCi9ua8e4wYQfk6 ");
        urls.add("https://images.app.goo.gl/4YDyFcgTiSrVKcj16 ");
        urls.add("https://images.app.goo.gl/HaLr5dfFSXuhp3qs6 ");
        urls.add("https://images.app.goo.gl/QhbJRSPQT6ZNzaA16 ");
        urls.add("https://images.app.goo.gl/KxWk9hXoiYWhWBGM9 ");
        urls.add("https://images.app.goo.gl/QtrC3TnaXWRakxzk8 ");
        urls.add("https://images.app.goo.gl/NAEMXSNNfSdK6uHz5 ");
        urls.add("https://images.app.goo.gl/nNAz7ks4y62j5GSs7 ");
        urls.add("https://images.app.goo.gl/QfehyjY9DNH5ADsJ9 ");
        urls.add("https://images.app.goo.gl/yVD6a6iLBkmZYUT57 ");
        urls.add("https://images.app.goo.gl/Hgxps9MvVCHich5T8 ");
        urls.add("https://images.app.goo.gl/deXRmTRK5ESeXcet8 ");
        urls.add("https://images.app.goo.gl/BoU9pPHUwZJEV8AT9 ");
        urls.add("https://images.app.goo.gl/k9yz5pgc37at3miz6 ");
        urls.add("https://images.app.goo.gl/TLdeV4854mJACsi1A ");
        urls.add("https://images.app.goo.gl/wuM2VLfPqYAU1aZd7 ");
        urls.add("https://images.app.goo.gl/ccbiJWP7Wk3oNA7Y9 ");
        urls.add("https://images.app.goo.gl/ezg1tE46HiUXdSu38 ");
        urls.add("https://images.app.goo.gl/ZHfdctASkD2PRBiq6 ");
        urls.add("https://images.app.goo.gl/kpU8k6JNpqRozdrR7 ");
        urls.add("https://images.app.goo.gl/D5FMSoiYvUR6Dscv6 ");
        urls.add("https://images.app.goo.gl/u7FCmGjZUq4yb7tt5 ");
        urls.add("https://images.app.goo.gl/WGSG9WRkYzGZQfMz9 ");
        urls.add("https://images.app.goo.gl/StZiVAeNoCbHLsf2A ");
        urls.add("https://images.app.goo.gl/PgsRSmW48a5JRmry6 ");
        urls.add("https://images.app.goo.gl/TkdAMdmobv374RQn6 ");
        urls.add("https://images.app.goo.gl/aeAJVrg7hbV4PxY17 ");
        urls.add("https://images.app.goo.gl/n9yytB1NVbkZERGV7 ");
        urls.add("https://images.app.goo.gl/hBg1FjUct2BWnYk37 ");
        urls.add("https://images.app.goo.gl/cuxw5ngk57mwCsNm7 ");
        urls.add("https://images.app.goo.gl/aCbKMq2HmMhSBPuE9 ");
        urls.add("https://images.app.goo.gl/D6Mx2V8cSWqdUtAr9 ");
        urls.add("https://images.app.goo.gl/HtjtoK12wk2qnFYK8 ");
        urls.add("https://images.app.goo.gl/wEhJZXtUheZqfxkk7 ");
        urls.add("https://images.app.goo.gl/nTuFKfXhmHB8qLx58 ");
        urls.add("https://images.app.goo.gl/2azmpLNQ1AnR6V5C7 ");
        urls.add("https://images.app.goo.gl/A5CMr8MwnfPy6P3e7 ");
        urls.add("https://images.app.goo.gl/N9wUEjFyZL6zkXWM8 ");
        
        return urls;

    }
}

