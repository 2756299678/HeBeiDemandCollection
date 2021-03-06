package Servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
 
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class CodeImgServlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    //☆1☆--相比纯java方式有变化的地方
    resp.setContentType("image/jpeg");//设置http响应头---告诉浏览器我现在发的是这个图片格式的数据，你用相应的方式来解析
 
    //定义图片的宽和高
    int w=60;
    int h=30;
 
    //声明一个RGB格式的内存中的图片
    BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics g = img.getGraphics();
 
    //把背景变白色
    g.setColor(Color.white);
    g.fillRect(0, 0, w, h);
    //设置字体
    g.setFont(new Font("aa",Font.BOLD,18));
 
    //产生并draw出4个随机数字
    Random r = new Random();
    String picnumber="";
    
    for(int i=0;i<4;i++){
      int a = r.nextInt(10);//生成0~9之间的随机整数
      picnumber=picnumber+a;
      
      int y = 15+r.nextInt(20);//产生随机的垂直位置
      //产生随机颜色
      Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
      g.setColor(c);
 
      g.drawString(""+a, i*15, y);
     
    }
    req.getSession().invalidate();
    req.getSession().setAttribute("picnumber", picnumber);
    
    //画几条干扰线
    for(int i=0;i<10;i++){
      //产生随机颜色
      Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
      g.setColor(c);
      g.drawLine(r.nextInt(60), r.nextInt(30), r.nextInt(60), r.nextInt(30));
    }
 
    g.dispose();//类似于IO中的flush(),把图形数据刷到img中
    
    //把内存图片img对象保存到一个jpg文件
    ImageIO.write(img, "JPEG", resp.getOutputStream() );//☆2☆
 
  }
}
