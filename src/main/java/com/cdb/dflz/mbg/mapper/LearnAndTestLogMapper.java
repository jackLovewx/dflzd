package com.cdb.dflz.mbg.mapper;

import com.cdb.dflz.mbg.model.LearnAndTestLog;
import com.cdb.dflz.mbg.model.LearnAndTestLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LearnAndTestLogMapper {
    int countByExample(LearnAndTestLogExample example);

    int deleteByExample(LearnAndTestLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(LearnAndTestLog record);

    int insertSelective(LearnAndTestLog record);

    List<LearnAndTestLog> selectByExample(LearnAndTestLogExample example);

    LearnAndTestLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LearnAndTestLog record, @Param("example") LearnAndTestLogExample example);

    int updateByExample(@Param("record") LearnAndTestLog record, @Param("example") LearnAndTestLogExample example);

    int updateByPrimaryKeySelective(LearnAndTestLog record);

    int updateByPrimaryKey(LearnAndTestLog record);
}