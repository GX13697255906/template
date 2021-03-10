package com.gx.transaction.service.serviceImpl;

import com.gx.transaction.TransactionApplication;
import com.gx.transaction.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author guoxun
 */
@Service
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransactionApplication.class)
public class TestServiceImpl implements TestService {

    @Test
    @Override
    @Transactional
    public void test() {
        test1();
    }

    @Override
    @Transactional
    public void test1() {


    }

}
