package org.yangxin.es.es.repository.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.yangxin.es.es.entity.es.ESSysUser;

/**
 * @author yangxin
 * 2020/03/28 23:43
 */
public interface ESUserRepository extends ElasticsearchRepository<ESSysUser, Integer> {
}
