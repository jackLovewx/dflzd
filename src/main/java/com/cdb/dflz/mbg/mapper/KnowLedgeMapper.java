package com.cdb.dflz.mbg.mapper;

import com.cdb.dflz.mbg.model.KnowLedge;
import com.cdb.dflz.mbg.model.KnowLedgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowLedgeMapper {
    int countByExample(KnowLedgeExample example);

    int deleteByExample(KnowLedgeExample example);

    int deleteByPrimaryKey(String id);

    int insert(KnowLedge record);

    int insertSelective(KnowLedge record);

    List<KnowLedge> selectByExample(KnowLedgeExample example);

    KnowLedge selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") KnowLedge record, @Param("example") KnowLedgeExample example);

    int updateByExample(@Param("record") KnowLedge record, @Param("example") KnowLedgeExample example);

    int updateByPrimaryKeySelective(KnowLedge record);

    int updateByPrimaryKey(KnowLedge record);
}