package rr;

import java.util.Scanner;

public class rr{
    public static void main(String[] args) {
      try {
     Scanner zifu=new Scanner(System.in);
        String str = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯";
        int k = 0;
        char[] str1=str.toCharArray();
       for (int i = 0; i <=111; i++) {
        if(i%7==0) {
        String strarray=str.substring(i,i+7);
       
        if(i%2==0)
        System.out.print(strarray+",");
        else 
         System.out.print(strarray+"��\r\n");
        }
   
       }
       System.out.println("������һ���ַ���");
       String s=zifu.next();
       char str2=s.charAt(0);
       for(int j=0;j<=111;j++) {
        //String strarray=str.substring(j,j+1);
        if(str2==str1[j]) {
         k=k+1;
         //System.out.println(str.substring(j,j+1));
        }
       
       }	
       System.out.println(k);   
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}

	        
	        
	  

