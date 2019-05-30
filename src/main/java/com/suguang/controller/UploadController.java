package com.suguang.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.suguang.domin.FileEntity;
import com.suguang.util.FileUploadUtil;
import com.suguang.util.YmStaticVariablesUtil;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/uploadflv")
public class UploadController {

	@RequestMapping(value = "/upload", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public String upload(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
			HttpServletRequest request) {
		String message = "";
		FileEntity entity = new FileEntity();
		FileUploadUtil fileUploadTool = new FileUploadUtil();
		JSONObject result = new JSONObject();
		try {
			entity = fileUploadTool.createFile(multipartFile, request);
			List list= new ArrayList();
			String path = entity.getPath();
			list.add("export_xls?file="+path);
			if (entity != null) {
               // service.saveFile(entity);
				message = "上传成功";
				result.put("errno", 0);
				result.put("data", list);  //你这里是data  看到没嗯然后呢
				result.put("msg", message);
			} else {
				message = "上传失败";
				result.put("result", message);
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toJSONString();
	}

	public static ResponseEntity<FileSystemResource> export(File file) {
		if (file == null) {
			return null;
		}
		HttpHeaders headers = new HttpHeaders();
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Content-Disposition", "attachment; filename=" + System.currentTimeMillis());
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");
		headers.add("Last-Modified", new Date().toString());
		headers.add("ETag", String.valueOf(System.currentTimeMillis()));
		return ResponseEntity.ok().headers(headers).contentLength(file.length())
				.contentType(MediaType.parseMediaType("application/octet-stream")).body(new FileSystemResource(file));

	}
	
	
	//返回服务器资源
	@RequestMapping(value = "export_xls", method = RequestMethod.GET)
	public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
		String file = request.getParameter("file");
		return export(new File(YmStaticVariablesUtil.UPLOAD_PATH+file));
	}

}