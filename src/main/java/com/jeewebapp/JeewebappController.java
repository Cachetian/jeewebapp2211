package com.jeewebapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JeewebappController extends HttpServlet {
  private static final Logger LOGGER = LogManager.getLogger(JeewebappController.class);

  @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    LOGGER.info("JeewebappController.doGet -> enter doGet");
    resp.getWriter().println("hello JeewebappController");
    resp.getWriter().close();
  }
}
