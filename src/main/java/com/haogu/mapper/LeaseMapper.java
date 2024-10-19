package com.haogu.mapper;

import com.haogu.pojo.Lease;
import com.haogu.pojo.PageVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LeaseMapper {
    @Select("select * from sys_lease")
    List<Lease> selectAll();
    int insert(Lease lease);
    int deleteById(Integer id);
    int deleteBatch(Integer[] ids);
    int update(Lease lease);
    List<Lease> selectBySearch(@Param("houseMsg") String houseMsg,
                               @Param("houseStatus") String houseStatus);
    List<Lease> selectById(Integer id);
    boolean selectByChecked(@Param("leaseId") Integer leaseId,
                            @Param("facilityId") Integer facilityId);
}




