package com.wordsaver.servlet.db;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Shashi Bhushan
 *         Created on 14/6/16.
 *         For Project : WordSaver
 */
@WebServlet("/mongo")
public class MongoConnect extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter writer = response.getWriter();

        try{

            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

            // Now connect to your databases
            DB db = mongoClient.getDB( "test" );
            writer.println("Connect to database successfully");
            boolean auth = db.authenticate("tomcat", new char[]{'t','o','m','c','a', 't'});
            writer.println("Authentication: " + auth);

            List<String> dbs = mongoClient.getDatabaseNames();
            for(String database : dbs)
            {
                writer.println(database);
            }

            mongoClient.close();

        }catch(Exception e){
            writer.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
