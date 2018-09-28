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
    //��1��--��ȴ�java��ʽ�б仯�ĵط�
    resp.setContentType("image/jpeg");//����http��Ӧͷ---��������������ڷ��������ͼƬ��ʽ�����ݣ�������Ӧ�ķ�ʽ������
 
    //����ͼƬ�Ŀ�͸�
    int w=60;
    int h=30;
 
    //����һ��RGB��ʽ���ڴ��е�ͼƬ
    BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics g = img.getGraphics();
 
    //�ѱ������ɫ
    g.setColor(Color.white);
    g.fillRect(0, 0, w, h);
    //��������
    g.setFont(new Font("aa",Font.BOLD,18));
 
    //������draw��4���������
    Random r = new Random();
    String picnumber="";
    
    for(int i=0;i<4;i++){
      int a = r.nextInt(10);//����0~9֮����������
      picnumber=picnumber+a;
      
      int y = 15+r.nextInt(20);//��������Ĵ�ֱλ��
      //���������ɫ
      Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
      g.setColor(c);
 
      g.drawString(""+a, i*15, y);
     
    }
    req.getSession().invalidate();
    req.getSession().setAttribute("picnumber", picnumber);
    
    //������������
    for(int i=0;i<10;i++){
      //���������ɫ
      Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
      g.setColor(c);
      g.drawLine(r.nextInt(60), r.nextInt(30), r.nextInt(60), r.nextInt(30));
    }
 
    g.dispose();//������IO�е�flush(),��ͼ������ˢ��img��
    
    //���ڴ�ͼƬimg���󱣴浽һ��jpg�ļ�
    ImageIO.write(img, "JPEG", resp.getOutputStream() );//��2��
 
  }
}
