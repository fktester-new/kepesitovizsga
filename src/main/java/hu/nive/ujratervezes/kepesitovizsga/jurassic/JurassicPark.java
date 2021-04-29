package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

public List<String> checkOverpopulation(){
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select breed from dinosaur where actual > expected order by breed")
        ){
            List<String> breeds = new ArrayList<>();
            while (rs.next()) {
                String breed = rs.getString("breed");
                breeds.add(breed);
            }
            return breeds;

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not execute query", sqle);
        }
}
}
