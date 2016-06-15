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

        response.getWriter().write(new JSONObject().put("data", request.getParameter("word") + "Post method of " + this.getClass().getName() + " Called." + request.getReader().readLine()
        ).toString());

    }
}
