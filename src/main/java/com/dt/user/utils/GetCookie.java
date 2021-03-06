package com.dt.user.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class GetCookie {

    /**
     * 获得cookie里面的token
     * @param request
     * @return
     */
    public static String getToken(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String token = "";
        if(cookies==null){
            return null;
        }
        for (Cookie cookie : cookies) {
            switch (cookie.getName()) {
                case "token":
                    token = cookie.getValue();
                    break;
                default:
                    break;
            }
        }
        return token;
    }

}
