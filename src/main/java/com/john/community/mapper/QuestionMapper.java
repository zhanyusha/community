package com.john.community.mapper;

import com.john.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wuxin on 2019/6/18
 */
@Mapper
public interface QuestionMapper {
//    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) " +
//            "values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
//    void insert(Question question);
    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);
    @Select("select * from question")
    List<Question> list();

}
