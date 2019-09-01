package com.hhit.hhzuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class PermisFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 在进行Zuul过滤的时候可以设置其过滤执行的位置，那么此时有如下几种类型：
        // 1、pre：在请求发出之前执行过滤，如果要进行访问，肯定在请求前设置头信息
        // 2、route：在进行路由请求的时候被调用；
        // 3、post：在路由之后发送请求信息的时候被调用；
        // 4、error：出现错误之后进行调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
        // 设置优先级，数字越大优先级越低 针对多个Filter
    }

    @Override
    public boolean shouldFilter() {
        return true;
        // 该Filter是否要执行, 不通路由
    }

    @Override
    public Object run() {
//        run方法则表示过滤的具体逻辑，假设请求地址中携带了login参数的话，则认为是合法请求，
//        否则就是非法请求，如果是非法请求的话，首先设置ctx.setSendZuulResponse(false);
//        表示不对该请求进行路由，然后设置响应码和响应值。这个run方法的返回值在当前版本(Dalston.SR3)
//        中暂时没有任何意义，可以返回任意值.
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String login = request.getParameter("login");
        if (login == null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.addZuulResponseHeader("content-type","text/html;charset=utf-8");
            ctx.setResponseBody("非法访问");
        }
        return null;
    }
}