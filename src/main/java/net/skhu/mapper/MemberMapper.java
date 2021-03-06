package net.skhu.mapper;

import net.skhu.domain.Member;
import org.apache.ibatis.annotations.*;


@Mapper
public interface MemberMapper {


    @Select("SELECT * FROM Member WHERE studentIdx = #{studentIdx}")
    Member findById(int studentIdx);

    @Select("SELECT * FROM Member WHERE studentIdx = #{id} AND password = #{password}")
    Member findByIdAndPassword(@Param("id") final int id, @Param("password") final String password);


    @Insert("insert into Member(name, studentIdx, department, password, email, type)" +
            "values(#{name}, #{studentIdx}, #{department}, #{password}, #{email}, #{type})")
    void insertUsers(Member member);

    //학번과 이메일이 일치하는 사람이 있는지 조회
    @Select("select count(*) from Member where studentIdx = #{studentIdx} and email = #{email}")
    int findUserMatchEmail(Member user);

    //비밀번호 변경
    @Update("update Member set password = #{password} where studentIdx = #{studentIdx}")
    void updatePws(Member member);

    @Select("select count(*) from Member where studentIdx=#{studentIdx}")
    int findUser(int studentIdx);
    
    //개인정보 변경


    @Select("SELECT * FROM Member WHERE studentIdx = #{studentIdx}")
    Member findByStuId(int studentIdx);
    
    @Update("update Member set name = #{name}, department = #{department}, password = #{password}, email = #{email}"
    		+ " where studentIdx = #{studentIdx}")
    void updateInfo(Member member);
}
