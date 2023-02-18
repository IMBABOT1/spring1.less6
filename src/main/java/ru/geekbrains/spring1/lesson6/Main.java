package ru.geekbrains.spring1.lesson6;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
        CustomerDao customerDao = new CustomerDaoImpl(sessionFactoryUtils);


        Product p = productDao.findById(2l);
        System.out.println(p.getCustomers());

        Customer c = customerDao.findByID(1l);
        System.out.println(c.getProducts());



    }
}
