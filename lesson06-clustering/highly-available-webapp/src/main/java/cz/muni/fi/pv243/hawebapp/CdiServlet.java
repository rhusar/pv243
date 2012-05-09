package cz.muni.fi.pv243.hawebapp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cz.muni.fi.pv243.hawebapp.ClusterBenchConstants;

/**
 * @author Radoslav Husar
 * @version May 2012
 */
@WebServlet(name = "CdiServlet", urlPatterns = {"/cdi"})
public class CdiServlet extends HttpServlet {

    @Inject
    private SessionScopedCdiSerialBean bean;
    private static final Logger log = Logger.getLogger(CdiServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");

        int serial = bean.getSerial();

        // Readonly?
        if (req.getParameter(ClusterBenchConstants.READONLY) != null) {
            resp.getWriter().print(bean.getSerial());
            return;
        }

        bean.setSerial(serial + 1);

        resp.getWriter().print(serial);

        // Invalidate?
        if (req.getParameter(ClusterBenchConstants.INVALIDATE) != null) {
            HttpSession session = req.getSession(true);
            log.log(Level.INFO, "Invalidating: {0}", session.getId());
            session.invalidate();
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet using CDI bean to store serial.";
    }
}
