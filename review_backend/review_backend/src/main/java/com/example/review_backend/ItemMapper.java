package com.example.review_backend;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ItemMapper implements RowMapper {
    
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException{
        Item item = new Item();
        item.setPlaceName(rs.getString("Place_name"));
        item.setPlaceLocation(rs.getString("Location"));
        item.setWorkingDays(rs.getString("Working_Days"));
        item.setAverageRating(rs.getFloat("Average_Rating"));
        item.setTicketPrice(rs.getString("Ticket_Price"));
        item.setPlaceImage(rs.getString("Image"));

        return item;
    }
}