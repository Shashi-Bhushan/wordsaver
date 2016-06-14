package com.wordsaver.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Shashi Bhushan
 *         Created on 14/6/16.
 *         For Project : WordSaver
 */
@WebServlet(
        name = "Hello World Servlet",
        description = "This is the Servlet Which Return Hello World on function call",
        urlPatterns = {"/helloWorld"}
)
public class HelloWorldServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().write("Hello World");
    }
}
