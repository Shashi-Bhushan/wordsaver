package com.wordsaver.servlet.db;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author Shashi Bhushan
 *         Created on 15/6/16.
 *         For Project : WordSaver
 */
@WebServlet("/mongo/word/new")
public class PostNewWordServlet extends HttpServlet {
    private static Logger LOG = LoggerFactory.getLogger(PostNewWordServlet.class);
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        JSONObject responseObject = new JSONObject();

        String word = request.getParameter("word");
        String meaning = request.getParameter("meaning");
        String example = request.getParameter("example");

        if(word.equals("")) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            responseObject.put("error", "Word Can not be left Empty.");
            response.getWriter().write(responseObject.toString());
        }else if(meaning.equals("")) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            responseObject.put("error",  "Meaning of Word Can not be left Empty.");
            response.getWriter().write(responseObject.toString());
        }else{
            responseObject.put("responseWord" , word);
            responseObject.put("responseMeaning" , meaning);
            responseObject.put("responseExample" , example);

            response.getWriter().write(responseObject.toString());
        }
    }
}
