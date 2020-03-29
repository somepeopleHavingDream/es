package org.yangxin.es.es.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yangxin.es.es.entity.mysql.SysUser;

/**
 * @author yangxin
 * 2020/03/28 22:53
 */
public interface SysUserRepository extends JpaRepository<SysUser, Integer> {
}
