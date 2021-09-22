package com.ufrn;

import java.io.IOException;

import com.ufrn.dtos.PageDTO;
import com.ufrn.utils.HibernateUtil;
import com.ufrn.utils.StackOverflowUtil;

import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        StackOverflowUtil stackOverflowUtil = new StackOverflowUtil(sessionFactory);

        int pageNumber = 1;

        PageDTO page = stackOverflowUtil.sendHttpRequest(pageNumber);

        while (page.hasMore()) {
            // process data
            stackOverflowUtil.process(page);

            System.out.println("Processed page " + pageNumber);

            pageNumber++;
            page = stackOverflowUtil.sendHttpRequest(pageNumber);
        }

        sessionFactory.close();
    }
}
