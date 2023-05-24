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
            
            jdbc.execute("INSERT INTO `sys`.`place_review` (`Name`, `Comment`) VALUES ('"+Username+"', '"+Userreview+"')");
            
            return"data inserted Successfully"; 
       
}