package com.example.review_backend;



import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController

@CrossOrigin(origins = "*")  
public class PlaceListController{
    
    @Autowired  
    JdbcTemplate jdbc; 
    
    @RequestMapping( path="/addReview", method = RequestMethod.POST)
    public String storeData(@RequestBody String request) throws IOException{
            ObjectMapper myMapper = new ObjectMapper();
            JsonNode extractedData = myMapper.readTree(request);
            String Username = extractedData.get("Username").asText();
            String Userreview = extractedData.get("Userreview").asText();
           
            System.out.println(Username);
            System.out.println(Userreview);
            
            // replace with your table query
            // jdbc.execute("INSERT INTO `sys`.`place_review` (`item_id`, `item_title`, `item_price`) VALUES ("+username+", "+reviewContent+", "+reviewProduct+")");
            // return"data inserted Successfully";  

            
            jdbc.execute("INSERT INTO `sys`.`place_review` (`Name`, `Comment`) VALUES ('"+Username+"', '"+Userreview+"')");
            
            return"data inserted Successfully"; 
        }
    
    
    
    // @Autowired
    // JdbcTemplate jdbc;

    // @RequestMapping("/insert")
    // public String index(){
    //     jdbc.execute("INSERT INTO `sys`.`place_details` (`Place_name`, `Location`, `Ticket_Price`, `Working_Days`, `Image`) VALUES ('place_name', 'Dubai', '15', 'Everyday', 'https://images.unsplash.com/photo-1684093026138-66f645a54e58?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=850&q=80');");
        
    //     jdbc.execute("INSERT INTO `sys`.`place_details` (`Place_name`, `Location`, `Ticket_Price`, `Working_Days`, `Image`) VALUES ('Warner Bros World', 'Abu Dhabi', '400', 'Everyday', 'https://res.cloudinary.com/thrillophilia/image/upload/c_fill,dpr_1.5,f_auto,fl_progressive.strip_profile,g_auto,h_600,q_auto,w_auto/v1/filestore/refiurvlfe7wgfh6ot7pwfqhkbkz_rt0pclc8v2biheo6fll60ff1dszw_bros.jpg');");
        
    //     jdbc.execute("INSERT INTO `sys`.`place_details` (`Place_name`, `Location`, `Ticket_Price`, `Working_Days`, `Image`) VALUES ('Yas Water World', 'Abu Dhabi', '220-270', 'Everyday', 'https://system.forevertourism.com/UploadFiles/AttractionImage/AttractionImageOriginal/Yas%20Water%20World%20Tour%2022.jpg');");

    //     jdbc.execute("INSERT INTO `sys`.`place_details` (`Place_name`, `Location`, `Ticket_Price`, `Working_Days`, `Image`) VALUES ('Ferrari World', 'Abu Dhabi', '325-937', 'Everyday', 'https://hblimg.mmtcdn.com/content/hubble/img/abu_dhabi/mmt/activities/m_Ferrari%20World-4_l_401_535.jpg');");

    //     return "Insertion successful";
    //}
}