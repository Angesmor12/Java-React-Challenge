package com.demo.security;

import com.demo.response.ServiceResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class StaticTokenFilter extends OncePerRequestFilter {

    private final ServiceResponse serviceResponse;
    private final String STATIC_TOKEN;

    @Autowired
    private StaticTokenFilter(ServiceResponse serviceResponse, @Value("${security.static.token}") String STATIC_TOKEN){
        this.serviceResponse = serviceResponse;
        this.STATIC_TOKEN = STATIC_TOKEN;
    }

    @Override
    protected void doFilterInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.FilterChain filterChain)
            throws ServletException, IOException {

        String token = request.getHeader("Token");

        if(token == null){
            token = "403";
        }
        else if(!token.equals(STATIC_TOKEN)){
            token = "403";
        }

        if (token.equals("403")) {

            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            ServiceResponse res = serviceResponse;
            res.setCode(Integer.parseInt(token));
            res.setMessage("No tiene autorización para acceder a este recurso.");
            res.setStatus("error");

            String jsonResponse = new ObjectMapper().writeValueAsString(res);
            response.getWriter().write(jsonResponse);
            return;
        }

        filterChain.doFilter(request, response);
    }

}