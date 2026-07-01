package com.ruoyi.teach.mapper;

import com.ruoyi.teach.domain.entity.TeachProjectInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface TeachProjectInfoMapper {

    /**
     * 分页条件查询（offset 方式）
     * @param prjName   项目名称（模糊）
     * @param prjStatus 项目状态
     * @param offset    起始行（从0开始）
     * @param pageSize  每页条数
     * @return 项目列表
     */
    List<TeachProjectInfo> selectProjectInfoList(@Param("prjName") String prjName,
                                                 @Param("prjCode") String prjCode,
                                                 @Param("prjStatus") String prjStatus,
                                                 @Param("offset") int offset,
                                                 @Param("pageSize") int pageSize);

    /**
     * 查询符合条件的总记录数（用于前端分页组件）
     */
    long countProjectInfoList(@Param("prjName") String prjName,
                              @Param("prjCode") String prjCode,
                              @Param("prjStatus") String prjStatus);

    TeachProjectInfo selectProjectInfoById(@Param("id") Integer id);

    int insertProjectInfo(TeachProjectInfo projectInfo);

    int updateProjectInfo(TeachProjectInfo projectInfo);

    int deleteProjectInfoById(@Param("id") Integer id);
}