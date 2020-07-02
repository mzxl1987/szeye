package com.szeye.config;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.szeye.dto.Result;
import com.szeye.util.Common;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@WebFilter(urlPatterns = "/**")
public class UrlFilter implements Filter{

	//排除不拦截的url
    private static final String[] excludePathPatterns = { "/isOk", 
    		"/login", 
    		"/logout", 
    		"/test",
    		"/getDocWorksInfo"
    		};
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;

        // 获取请求url地址，不拦截excludePathPatterns中的url
        String url = req.getRequestURI();
        if (Arrays.asList(excludePathPatterns).contains(url)) {
            //放行，相当于第一种方法中LoginInterceptor返回值为true
            chain.doFilter(request, response);
            return;
        }else {

	        log.info("Filter Begin");
	        
	        //业务代码
	        HttpSession session = req.getSession();
	        String token = (String)session.getAttribute("token");
	        if("".equals(token) || null == token || !Common.token.containsKey(token)) {
	        	res.setCharacterEncoding("UTF-8");
	        	
	        	res.getWriter().write(JSONObject.toJSONString(Result.fail("token不正确")));
	        	
	        	log.info("TOKEN Error, URL : {} 没有通过拦截器",url);
	        	return;
	        }
	        
	        
	        log.info("Filter End");
        }
		
	}

}
