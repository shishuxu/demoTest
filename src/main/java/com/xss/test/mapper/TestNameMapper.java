package com.xss.test.mapper;

import com.xss.test.entity.TestName;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestNameMapper {
    /**
     * 插入
     * @param testName
     * @return
     */
    int insert(TestName testName);


}
