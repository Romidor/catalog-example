package ru.ncedu.course.catalog_example.filter;

import ru.ncedu.course.catalog_example.service.JourneyBean;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

@WebFilter(urlPatterns = {"*"})
public class AccessLogFilter implements Filter {

    private final static Logger LOGGER = Logger.getLogger(AccessLogFilter.class.getName());

    @Inject
    private JourneyBean journeyBean;

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        if (request instanceof HttpServletRequest) {
            String url = ((HttpServletRequest)request).getRequestURL().toString();
            LOGGER.info("Client " + request.getRemoteAddr() + " opened " + url);
            journeyBean.addRecord("new url");
        }
        chain.doFilter(request, response);
    }
}
