package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {

    List<Test> list();
}
