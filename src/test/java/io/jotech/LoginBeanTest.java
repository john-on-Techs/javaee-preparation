package io.jotech;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;


import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class LoginBeanTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(LoginBean.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
    @Inject
    LoginBean loginBean;

    @Test
    public void login() {
        String loginResponse = loginBean.login("John");
        Assert.assertEquals("Hello, John", loginResponse);

    }


}
