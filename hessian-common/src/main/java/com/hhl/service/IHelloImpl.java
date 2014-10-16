package com.hhl.service;

import com.caucho.hessian.server.HessianServlet;

/**
 * Created by admin on 2014/10/16.
 */
public class IHelloImpl extends HessianServlet implements IHello {
    @Override
    public String sayHello() {
        return "Hello,I from HessianService";
    }
}
