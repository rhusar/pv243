package cz.muni.fi.pv243.hawebapp;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "HttpSessionServlet", urlPatterns = {"/session"})
public class HttpSessionServlet extends CommonHttpSessionServlet {
}
