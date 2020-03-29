package org.yangxin.es.es.repository.es;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yangxin.es.es.entity.es.ESSysUser;

import java.util.Iterator;

/**
 * @author yangxin
 * 2020/03/28 23:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ESUserRepositoryTest {

    @Autowired
    ESUserRepository esUserRepository;

    @Test
    public void testES() {
        Iterable<ESSysUser> esSysUserIterable = esUserRepository.findAll();
        Iterator<ESSysUser> iterator = esSysUserIterable.iterator();
        ESSysUser next = iterator.next();
        log.info("next: [{}]", next);
    }
}