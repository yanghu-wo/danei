package cn.zzl.service;

import java.sql.SQLException;

import java.util.ArrayList;



public class book {

	public cn.zzl.javabean.book getbookInfo(String  isbn) throws SQLException {
		//在这里调用dao的方法,返回一个book实例
		
		return new cn.zzl.dao.book().getbook(isbn);
	}
	
	public String  findbookInfo() throws SQLException {
		//在这里调用dao的方法,返回一个book数组
		cn.zzl.dao.book book = new cn.zzl.dao.book();
		ArrayList<cn.zzl.javabean.book> Book =  book.findbookinfo();
		System.out.println("图书数组："+Book.toString());
		
		//System.out.println("长度："+Book.size());获取数组长度
		//文本输出
		String str = "";
		int i =0 ;
		for(cn.zzl.javabean.book bookOne :Book) {
			 cn.zzl.javabean.book book1 = book.getbook(bookOne.getIsbn());
			 if( i % 4 ==0) {
				 str += "	<div class=\"store_content\">";	 
			 }
			 
			 str += "        <div>";
			 str += "            <a href=\"detail.jsp\"><img src=\"../img/goods/"+book1.getIsbn()+"/index.jpg\" alt=\"\"/></a>";
			 str += "            <p class=\"one\">"+book1.getTitle()+"</p>";
			 str += "            <p class=\"two\">";
			 str += "                <span>";
			 str += "                    价格：<span>"+book1.getPrice()+"</span>";
			 str += "                </span>";
			 str += "            </p>";
			 str += "            <p class=\"three\">";
			 str += "                <span>";
			 str += "                出版社：<span>"+book1.getPress()+"</span>";
			 str += "                </span>";
			 str += "            </p>";
			 str += "        </div>"; 
			 
			if(i % 4 == 3 || i == Book.size()-1) {
				str +=	"	 </div>";
			}
			i++;
		}
		
		return str;
	}
}
