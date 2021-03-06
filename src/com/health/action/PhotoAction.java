package com.health.action;

import java.io.File;
import java.io.IOException;
import java.util.List;




import com.health.pojo.Comment;
import com.health.pojo.News;
import com.health.pojo.Photo;
import com.health.service.NewsService;
import com.health.service.PhotoService;
import com.opensymphony.xwork2.*;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;


public class PhotoAction extends ActionSupport implements ModelDriven{
	private File fileTest ;
	private String fileTestFileName;
    private  PhotoService photoservice;
	private Photo photo;
	private List<Photo> listphoto;
	private NewsService newsservice;
	private News news;
	private List<News> listNews;
	private Integer nid;
	private Integer ppid;

	


	



	public Integer getPpid() {
		return ppid;
	}


	public void setPpid(Integer ppid) {
		this.ppid = ppid;
	}


	public File getFileTest() {
		return fileTest;
	}


	public void setFileTest(File fileTest) {
		this.fileTest = fileTest;
	}


	public String getFileTestFileName() {
		return fileTestFileName;
	}


	public void setFileTestFileName(String fileTestFileName) {
		this.fileTestFileName = fileTestFileName;
	}


	public PhotoService getPhotoservice() {
		return photoservice;
	}


	public void setPhotoservice(PhotoService photoservice) {
		this.photoservice = photoservice;
	}


	public Photo getPhoto() {
		return photo;
	}


	public void setPhoto(Photo photo) {
		this.photo = photo;
	}


	public List<Photo> getListphoto() {
		return listphoto;
	}


	public void setListphoto(List<Photo> listphoto) {
		this.listphoto = listphoto;
	}


	public NewsService getNewsservice() {
		return newsservice;
	}


	public void setNewsservice(NewsService newsservice) {
		this.newsservice = newsservice;
	}


	public News getNews() {
		return news;
	}


	public void setNews(News news) {
		this.news = news;
	}


	public List<News> getListNews() {
		return listNews;
	}


	public void setListNews(List<News> listNews) {
		this.listNews = listNews;
	}


	public Integer getNid() {
		return nid;
	}


	public void setNid(Integer nid) {
		this.nid = nid;
	}


	public String show(){
		this.listNews=newsservice.findById(nid);
		this.listphoto=photoservice.findByNew(listNews.get(0));		

		return SUCCESS;
        
    }
	public String delete(){
		this.listphoto=photoservice.findById(ppid);	
		photoservice.delete(listphoto.get(0));
		return SUCCESS;
        
    }
	public String upload() throws Exception{
		this.listNews=newsservice.findById(nid);
		String[] str = { ".jpg", ".jpeg", ".bmp", ".gif", ".png", "PNG", "JPG" };
        if(fileTest==null || fileTest.length()>4194304 ){  
            return INPUT;  
        }  
        for (String s : str) {  
            if (fileTestFileName.endsWith(s)) { 
            	
            	
                String realPath = ServletActionContext.getServletContext().getRealPath("/images/upload_photo");  
                File saveFile = new File(new File(realPath),fileTestFileName); 
                System.out.println(realPath+"@@@@@@@@@@");
                if(!saveFile.getParentFile().exists()){  
                    saveFile.getParentFile().mkdirs();  
                }  
                try {  
                   FileUtils.copyFile(fileTest, saveFile);
                   photo.setPname(fileTestFileName);
                   photo.setPurl("images/upload_photo/"+fileTestFileName);
                   photo.setNews(listNews.get(0));
                   photoservice.save(photo);
                } catch (IOException e) {  
                    return INPUT;  
                }  
            }
        }  
        return SUCCESS;  
		
	}
	public Object getModel() {
		// TODO Auto-generated method stub
		if (photo == null)
			photo = new Photo();
		return photo;
	}
		
}