package com.sise.oj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sise.oj.domain.po.UserInfoPO;
import org.springframework.stereotype.Repository;

/**
 * 用户信息Mapper
 *
 * @author CiJee
 * @version 1.0
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfoPO> {
}
