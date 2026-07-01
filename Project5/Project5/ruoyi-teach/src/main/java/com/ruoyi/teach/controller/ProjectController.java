package com.ruoyi.teach.controller;

import com.ruoyi.common.core.controller.TeachBaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.teach.domain.entity.TeachProjectInfo;
import com.ruoyi.teach.service.ITeachProjectInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/projectinfo")
public class ProjectController extends TeachBaseController {

    private final ITeachProjectInfoService teachProjectInfoService;

    @GetMapping("/list")
    public AjaxResult list(
            @RequestParam(value = "projectName", required = false) String projectName,
            @RequestParam(value = "prjCode", required = false) String prjCode,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize
    ) {
        List<TeachProjectInfo> list = teachProjectInfoService.selectProjectInfoList(projectName, prjCode, status, pageNum, pageSize);
        long total = teachProjectInfoService.countProjectInfoList(projectName, prjCode, status);
        // 返回前端需要的格式 { rows: [], total: 0 }
        return AjaxResult.success(new HashMap<String, Object>() {{
            put("rows", list);
            put("total", total);
        }});
    }

    @GetMapping("/detail")
    public AjaxResult detail(@RequestParam("id") Integer id) {
        return success(teachProjectInfoService.selectProjectInfoById(id));
    }

    @PostMapping("/add")
    public AjaxResult add(@RequestBody TeachProjectInfo projectInfo) {
        return success(teachProjectInfoService.insertProjectInfo(projectInfo));
    }

    @PostMapping("/update")
    public AjaxResult update(@RequestBody TeachProjectInfo projectInfo) {
        return success(teachProjectInfoService.updateProjectInfo(projectInfo));
    }

    @PostMapping("/delete")
    public AjaxResult delete(@RequestBody Integer id) {
        return success(teachProjectInfoService.deleteProjectInfoById(id));
    }
}