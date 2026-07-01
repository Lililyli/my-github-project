package com.ruoyi.teach.service;

import com.ruoyi.teach.domain.entity.TeachProjectInfo;
import java.util.List;

public interface ITeachProjectInfoService {

    /**
     * 分页条件查询
     * @param prjName    项目名称（模糊）
     * @param prjCode    项目编号（模糊）
     * @param prjStatus  项目状态
     * @param pageNum    页码
     * @param pageSize   每页条数
     * @return 项目列表
     */
    List<TeachProjectInfo> selectProjectInfoList(String prjName, String prjCode, String prjStatus, Integer pageNum, Integer pageSize);

    /**
     * 查询符合条件的总记录数
     * @param prjName    项目名称（模糊）
     * @param prjCode    项目编号（模糊）
     * @param prjStatus  项目状态
     * @return 总记录数
     */
    long countProjectInfoList(String prjName, String prjCode, String prjStatus);

    TeachProjectInfo selectProjectInfoById(Integer id);
    int insertProjectInfo(TeachProjectInfo projectInfo);
    int updateProjectInfo(TeachProjectInfo projectInfo);
    int deleteProjectInfoById(Integer id);
}