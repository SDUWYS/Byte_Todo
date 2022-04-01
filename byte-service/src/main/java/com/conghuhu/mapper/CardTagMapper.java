package com.conghuhu.mapper;

import com.conghuhu.entity.CardTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author conghuhu
 * @since 2022-01-27
 */
@Repository
@Mapper
public interface CardTagMapper extends BaseMapper<CardTag> {

}
