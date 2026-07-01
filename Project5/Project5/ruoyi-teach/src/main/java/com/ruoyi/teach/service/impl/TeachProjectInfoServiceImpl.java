package com.ruoyi.teach.service.impl;

import com.ruoyi.teach.domain.entity.TeachProjectInfo;
import com.ruoyi.teach.mapper.TeachProjectInfoMapper;
import com.ruoyi.teach.service.ITeachProjectInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeachProjectInfoServiceImpl implements ITeachProjectInfoService {

    private final TeachProjectInfoMapper teachProjectInfoMapper;

    @Override
    public List<TeachProjectInfo> selectProjectInfoList(String prjName, String prjCode, String prjStatus, Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageSize == null) {
            return Collections.emptyList();
        }
        int offset = (pageNum - 1) * pageSize;
        return teachProjectInfoMapper.selectProjectInfoList(prjName, prjCode, prjStatus, offset, pageSize);
    }

    @Override
    public long countProjectInfoList(String prjName, String prjCode, String prjStatus) {
        return teachProjectInfoMapper.countProjectInfoList(prjName, prjCode, prjStatus);
    }

    @Override
    public TeachProjectInfo selectProjectInfoById(Integer id) {
        return teachProjectInfoMapper.selectProjectInfoById(id);
    }

    @Override
    public int insertProjectInfo(TeachProjectInfo projectInfo) {
        return teachProjectInfoMapper.insertProjectInfo(projectInfo);
    }

    @Override
    public int updateProjectInfo(TeachProjectInfo projectInfo) {
        return teachProjectInfoMapper.updateProjectInfo(projectInfo);
    }

    @Override
    public int deleteProjectInfoById(Integer id) {
        return teachProjectInfoMapper.deleteProjectInfoById(id);
    }
}