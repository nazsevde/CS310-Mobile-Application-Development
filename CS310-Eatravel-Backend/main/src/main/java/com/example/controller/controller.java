package com.example.controller;

import com.example.dao.FeedbackDAO;
import com.example.dao.ProvinceDAO;
import com.example.dao.RecommendationDAO;
import com.example.dao.UsersDAO;
import com.example.model.Feedback;
import com.example.model.Province;
import com.example.model.Recommendation;
import com.example.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import jakarta.annotation.PostConstruct;



//@Controller
@RestController
@RequestMapping("/name")
//@EnableMongoRepositories(basePackages = {"com.example.dao"})
public class controller {

    @Autowired
    private UsersDAO usersDAO;

    @Autowired
    private FeedbackDAO feedbackDAO;

    @Autowired
    private ProvinceDAO provinceDAO;

    @Autowired
    private RecommendationDAO recommendationDAO;
    
    private static final Logger logger = LoggerFactory.getLogger(controller.class);
    
    @PostConstruct
    public void init() {
        if (usersDAO.count() == 0) {
            Users newUser1 = new Users("ali", "sifre", "ali@gmail.com");
            usersDAO.save(newUser1);
        }

        if (provinceDAO.count() == 0) {
        	
			Province province1 = new Province("ADANA", "https://images.app.goo.gl/j2Uk2FWBQJiYygeWA ");
			provinceDAO.save(province1);
			Province province2 = new Province("ADIYAMAN", "https://images.app.goo.gl/mrXha2aCb655aUDf7 ");
			provinceDAO.save(province2);
			Province province3 = new Province("AFYONKARAHİSAR", "https://images.app.goo.gl/ycXnUk22VGYPcQvS8 ");
			provinceDAO.save(province3);
			Province province4 = new Province("AĞRI", "https://images.app.goo.gl/QVadTbHiGMjpjbyz9 ");
			provinceDAO.save(province4);
			Province province5 = new Province("AKSARAY", "https://images.app.goo.gl/TU4Cd3nzhmp16Xx96 ");
			provinceDAO.save(province5);
			Province province6 = new Province("AMASYA", "https://images.app.goo.gl/gK4FaUYtSBxiv6fbA ");
			provinceDAO.save(province6);
			Province province7 = new Province("ANKARA", "https://images.app.goo.gl/jhvYBbtAbsewnRaTA " );
			provinceDAO.save(province7);
			Province province8 = new Province("ANTALYA", "https://images.app.goo.gl/wujR6yyayHNp3FsQA ");
			provinceDAO.save(province8);
			Province province9 = new Province("ARDAHAN", "https://images.app.goo.gl/c4Kg1ozRhZngf71T6 ");
			provinceDAO.save(province9);
			Province province10 = new Province("ARTVİN", "https://images.app.goo.gl/2MhJ8qDgj9BQLUG19 ");
			provinceDAO.save(province10);
			Province province11 = new Province("AYDIN", "https://images.app.goo.gl/nh4mrmZXiQWiEoV66 ");
			provinceDAO.save(province11);
			Province province12 = new Province("BALIKESİR", "https://images.app.goo.gl/3FDZpPZLb35hZ41o9 ");
			provinceDAO.save(province12);
			Province province13 = new Province("BARTIN", "https://images.app.goo.gl/4oHbp9RTwuiezRL87 ");
			provinceDAO.save(province13);
			Province province14 = new Province("BATMAN", "https://images.app.goo.gl/DbTfUVDWHi5V5qmn7 ");
			provinceDAO.save(province14);
			Province province15 = new Province("BAYBURT", "https://images.app.goo.gl/X1ofNsExainA9qmS6 ");
			provinceDAO.save(province15);
			Province province16 = new Province("BİLECİK", "https://images.app.goo.gl/oKx8o3gSw47ezvWh8 ");
			provinceDAO.save(province16);
			Province province17 = new Province("BİNGÖL", "https://images.app.goo.gl/7oA2Dvfp8MX6N4Kw6 ");
			provinceDAO.save(province17);
			Province province18 = new Province("BİTLİS", "https://images.app.goo.gl/wjPzPHrMoxKwdUxM6 ");
			provinceDAO.save(province18);
			Province province19 = new Province("BOLU", "https://images.app.goo.gl/frD3p5RDiBc5696w5 ");
			provinceDAO.save(province19);
			Province province20 = new Province("BURDUR", "https://images.app.goo.gl/Dv8QX77Hz5hR6e6B9 ");
			provinceDAO.save(province20);
			Province province21 = new Province("BURSA", "https://images.app.goo.gl/AuFjyPSYmVSxzbnX7 ");
			provinceDAO.save(province21);
			Province province22 = new Province("ÇANAKKALE", "https://images.app.goo.gl/cGMp1PwJykh6kXTw9 ");
			provinceDAO.save(province22);
			Province province23 = new Province("ÇANKIRI", "https://images.app.goo.gl/2fuzCU5cfVDJUpSy9 ");
			provinceDAO.save(province23);
			Province province24 = new Province("ÇORUM", "https://images.app.goo.gl/xUEJccMDLk23TyK56 ");
			provinceDAO.save(province24);
			Province province25 = new Province("DENİZLİ", "https://images.app.goo.gl/zYGzibMwtBZRqGoF6 ");
			provinceDAO.save(province25);
			Province province26 = new Province("DİYARBAKIR", "https://images.app.goo.gl/wxL9fBtMtdvJNQ9e7 ");
			provinceDAO.save(province26);
			Province province27 = new Province("DÜZCE", "https://images.app.goo.gl/xh2VXN9hmNusAgEcA ");
			provinceDAO.save(province27);
			Province province28 = new Province("EDİRNE", "https://images.app.goo.gl/pyxRNtFbr4GqzxVTA ");
			provinceDAO.save(province28);
			Province province29 = new Province("ELAZIĞ", "https://images.app.goo.gl/c37F5wpKunPoGmfE6 ");
			provinceDAO.save(province29);
			Province province30 = new Province("ERZİNCAN", "https://images.app.goo.gl/ZD4Cau3dUJvCxBF27 ");
			provinceDAO.save(province30);
			Province province31 = new Province("ERZURUM", "https://images.app.goo.gl/YKxB5ktjkhWbDqgt6 ");
			provinceDAO.save(province31);
			Province province32 = new Province("ESKİŞEHİR", "https://images.app.goo.gl/j6ypb3aSCdTh7wFb8 ");
			provinceDAO.save(province32);
			Province province33 = new Province("GAZİANTEP", "https://images.app.goo.gl/Jvf6mZDg7Z5Wcnik8 ");
			provinceDAO.save(province33);
			Province province34 = new Province("GİRESUN", "https://images.app.goo.gl/cQTW4cYgJ7FKaSji8 ");
			provinceDAO.save(province34);
			Province province35 = new Province("GÜMÜŞHANE", "https://images.app.goo.gl/YiLkPeDn4GBw1JFq6 ");
			provinceDAO.save(province35);
			Province province36 = new Province("HAKKARİ", "https://images.app.goo.gl/DVNVx5QfQPRXB1pG8 ");
			provinceDAO.save(province36);
			Province province37 = new Province("HATAY", "https://images.app.goo.gl/Zh1WTdUjPoXZL3wm7 ");
			provinceDAO.save(province37);
			Province province38 = new Province("IĞDIR", "https://images.app.goo.gl/AJEJYwLKsMsYEyDQ9 ");
			provinceDAO.save(province38);
			Province province39 = new Province("ISPARTA", "https://images.app.goo.gl/GJzUCENkk4LBUyXE8 ");
			provinceDAO.save(province39);
			Province province40 = new Province("İSTANBUL", "https://images.app.goo.gl/GSm1gLP3emD4egdG6 ");
			provinceDAO.save(province40);
			Province province41 = new Province("İZMİR", "https://images.app.goo.gl/uV7VDHvDbfmGEBV6A ");
			provinceDAO.save(province41);
			Province province42 = new Province("KAHRAMANMARAŞ", "https://images.app.goo.gl/PtUVXzNkTGiN7TAQ7 ");
			provinceDAO.save(province42);
			Province province43 = new Province("KARABÜK","https://images.app.goo.gl/gnHVRERc8P69Tetm8 ");
			provinceDAO.save(province43);
			Province province44 = new Province("KARAMAN", "https://images.app.goo.gl/WSFCi9ua8e4wYQfk6 ");
			provinceDAO.save(province44);
			Province province45 = new Province("KARS","https://images.app.goo.gl/4YDyFcgTiSrVKcj16 ");
			provinceDAO.save(province45);
			Province province46 = new Province("KASTAMONU","https://images.app.goo.gl/HaLr5dfFSXuhp3qs6 ");
            provinceDAO.save(province46);
            Province province47 = new Province("KAYSERİ", "https://images.app.goo.gl/QhbJRSPQT6ZNzaA1 " );
            provinceDAO.save(province47);
            Province province48 = new Province("KIRIKKALE","https://images.app.goo.gl/KxWk9hXoiYWhWBGM9 ");
            provinceDAO.save(province48);
            Province province49 = new Province("KIRKLARELİ","https://images.app.goo.gl/QtrC3TnaXWRakxzk8 ");
            provinceDAO.save(province49);
            Province province50 = new Province("KIRŞEHİR","https://images.app.goo.gl/NAEMXSNNfSdK6uHz5 ");
            provinceDAO.save(province50);
            Province province51 = new Province("KİLİS", "https://images.app.goo.gl/nNAz7ks4y62j5GSs7 ");
            provinceDAO.save(province51);
            Province province52 = new Province("KOCAELİ","https://images.app.goo.gl/QfehyjY9DNH5ADsJ9 ");
            provinceDAO.save(province52);
            Province province53 = new Province("KONYA","https://images.app.goo.gl/yVD6a6iLBkmZYUT57 ");
            provinceDAO.save(province53);
            Province province54 = new Province("KÜTAHYA", "https://images.app.goo.gl/Hgxps9MvVCHich5T8 ");
            provinceDAO.save(province54);
            Province province55 = new Province("MALATYA", "https://images.app.goo.gl/deXRmTRK5ESeXcet8 ");
            provinceDAO.save(province55);
            Province province56 = new Province("MANİSA", "https://images.app.goo.gl/BoU9pPHUwZJEV8AT9 ");
            provinceDAO.save(province56);
            Province province57 = new Province("MARDİN","https://images.app.goo.gl/k9yz5pgc37at3miz6 ");
            provinceDAO.save(province57);
            Province province58 = new Province("MERSİN","https://images.app.goo.gl/TLdeV4854mJACsi1A ");
            provinceDAO.save(province58);
            Province province59 = new Province("MUĞLA","https://images.app.goo.gl/wuM2VLfPqYAU1aZd7 ");
            provinceDAO.save(province59);
            Province province60 = new Province("MUŞ","https://images.app.goo.gl/ccbiJWP7Wk3oNA7Y9 ");
            provinceDAO.save(province60);
            Province province61 = new Province("NEVŞEHİR","https://images.app.goo.gl/ezg1tE46HiUXdSu38 ");
            provinceDAO.save(province61);
            Province province62 = new Province("NİĞDE","https://images.app.goo.gl/ZHfdctASkD2PRBiq6 ");
            provinceDAO.save(province62);
            Province province63 = new Province("ORDU", "https://images.app.goo.gl/kpU8k6JNpqRozdrR7 ");
            provinceDAO.save(province63);
            Province province64 = new Province("OSMANİYE", "https://images.app.goo.gl/D5FMSoiYvUR6Dscv6 ");
            provinceDAO.save(province64);
            Province province65 = new Province("RİZE","https://images.app.goo.gl/u7FCmGjZUq4yb7tt5 ");
            provinceDAO.save(province65);
            Province province66 = new Province("SAKARYA","https://images.app.goo.gl/WGSG9WRkYzGZQfMz9 ");
            provinceDAO.save(province66);
            Province province67 = new Province("SAMSUN","https://images.app.goo.gl/StZiVAeNoCbHLsf2A ");
            provinceDAO.save(province67);
            Province province68 = new Province("SİİRT","https://images.app.goo.gl/PgsRSmW48a5JRmry6 ");
            provinceDAO.save(province68);
            Province province69 = new Province("SİNOP","https://images.app.goo.gl/TkdAMdmobv374RQn6 ");
            provinceDAO.save(province69);
            Province province70 = new Province("SİVAS","https://images.app.goo.gl/aeAJVrg7hbV4PxY17 ");
            provinceDAO.save(province70);
            Province province71 = new Province("ŞANLIURFA","https://images.app.goo.gl/n9yytB1NVbkZERGV7 ");
            provinceDAO.save(province71);
            Province province72 = new Province("ŞIRNAK","https://images.app.goo.gl/hBg1FjUct2BWnYk37 ");
            provinceDAO.save(province72);
            Province province73 = new Province("TEKİRDAĞ","https://images.app.goo.gl/cuxw5ngk57mwCsNm7 ");
            provinceDAO.save(province73);
            Province province74 = new Province("TOKAT","https://images.app.goo.gl/aCbKMq2HmMhSBPuE9 ");
            provinceDAO.save(province74);
            Province province75 = new Province("TRABZON", "https://images.app.goo.gl/D6Mx2V8cSWqdUtAr9 ");
            provinceDAO.save(province75);
            Province province76 = new Province("TUNCELİ","https://images.app.goo.gl/HtjtoK12wk2qnFYK8 ");
            provinceDAO.save(province76);
            Province province77 = new Province("UŞAK","https://images.app.goo.gl/wEhJZXtUheZqfxkk7 ");
            provinceDAO.save(province77);
            Province province78 = new Province("VAN","https://images.app.goo.gl/nTuFKfXhmHB8qLx58 ");
            provinceDAO.save(province78);
            Province province79 = new Province("YALOVA","https://images.app.goo.gl/2azmpLNQ1AnR6V5C7 ");
            provinceDAO.save(province79);
            Province province80 = new Province("YOZGAT", "https://images.app.goo.gl/A5CMr8MwnfPy6P3e7 ");
            provinceDAO.save(province80);
            Province province81 = new Province("ZONGULDAK","https://images.app.goo.gl/N9wUEjFyZL6zkXWM8 ");
            provinceDAO.save(province81);
            
            
            
       
       
        }
        
        Province selectedProvince = provinceDAO.findByName("ADANA");
        Users user = usersDAO.findByUsername("ali");
        
        Recommendation recommendation = new Recommendation(selectedProvince.getId());
        Feedback feedback1 = new Feedback(user.getId(), "Güzel bir yer", 5, "Lahmacun");
        Feedback feedback2 = new Feedback(user.getId(), "Lezzetli yemekler", 4, "Kebap");
        recommendation.addFeedback(feedback1);
        recommendation.addFeedback(feedback2);

        recommendationDAO.save(recommendation);
        
        
    }


    @GetMapping("/user")
    public List<Users> getAllUsers() {
        return usersDAO.findAll();
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        Users user = usersDAO.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return "login-success";
        } else {
            return "login-failure";
        }
    }

    @PostMapping("/signup")
    public String signup(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        if (usersDAO.existsByUsername(username) || usersDAO.findByEmail(email) != null) {
            return "signup-failure";
        }

        Users newUser = new Users(username, password, email);
        usersDAO.save(newUser);

        return "signup-success";
    }

    @GetMapping("/give-feedback/save")
    public List<Recommendation> getAllFeedbacks() {
        return recommendationDAO.findAll();
    }

    @PostMapping("/give-feedback")
    public String submitFeedback(@RequestParam String provinceId,
                                 @RequestParam String userId,
                                 @RequestParam String foodName,
                                 @RequestParam String comment,
                                 @RequestParam int rating) {
    	
        Feedback feedback = new Feedback(userId, comment, rating, foodName);
        feedbackDAO.save(feedback);

        List<Recommendation> recommendations = recommendationDAO.findByProvinceId(provinceId);
        Recommendation recommendation = (recommendations.isEmpty()) ? new Recommendation(provinceId) : recommendations.get(0);

        recommendation.addFeedback(feedback);
        recommendationDAO.save(recommendation);
        
        return "feedback-saved";
        
    	}

}
    
