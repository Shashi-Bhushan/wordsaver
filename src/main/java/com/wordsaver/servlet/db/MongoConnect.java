package com.wordsaver.servlet.db;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.wordsaver.servlet.db.constants.DBConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private static Logger LOG = LoggerFactory.getLogger(MongoConnect.class);

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("application/json");

        JSONObject responseObject = new JSONObject();
        PrintWriter writer = response.getWriter();

        try{

            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

            // Now connect to your databases
            DB db = mongoClient.getDB("test");
            responseObject.put(DBConstants.CONNECTION, DBConstants.CONNECTION_RESPONSE.SUCCESSFUL);

            boolean auth = db.authenticate("tomcat", new char[]{'t', 'o', 'm', 'c', 'a', 't'});
            responseObject.put("Authentication " , String.valueOf(auth));

            List<String> dbs = mongoClient.getDatabaseNames();
            JSONArray dbArray = new JSONArray();
            for(String database : dbs)
            {
                dbArray.put(database);
            }

            responseObject.put("database", dbArray);

            mongoClient.close();

        }catch(Exception e){
            responseObject.put("error", e.getClass().getName() + ": " + e.getMessage() );
        }

        writer.print(responseObject.toString());
    }
}
