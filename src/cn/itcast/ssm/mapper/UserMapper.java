package cn.itcast.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.itcast.ssm.po.User;
import cn.itcast.ssm.po.UserExample;

public interface UserMapper {
	
	List<User> getone(Integer[] integers);
	
    int countByExample(UserExample example);//和i会gggg

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}