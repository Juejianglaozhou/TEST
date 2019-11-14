# 计G191 2019322035 周新易
# 实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
# 实验要求
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
# 实验流程
将长恨歌转换字符串数组，运用For循环和if语句将每7个字分为一组，与2做余数判断奇偶性加，和。.输入字符转换字符数组，与长恨歌字符串数组做相等判断，统计出现次数，添加异常结构。
## 关键代码
```JAVA
 public static void main(String[] args) {
      try {
     Scanner zifu=new Scanner(System.in);
        String str = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝";
        int k = 0;
        char[] str1=str.toCharArray();
       for (int i = 0; i <=111; i++) {
        if(i%7==0) {
        String strarray=str.substring(i,i+7);
       
        if(i%2==0)
        System.out.print(strarray+",");
        else 
         System.out.print(strarray+"。\r\n");
        }
   
       }
       System.out.println("请输入一个字符：");
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
```
# 流程图
![哎呀](https://github.com/Juejianglaozhou/TEST/blob/master/流程图.png)
# 实验结果
![哎呀](https://github.com/Juejianglaozhou/TEST/blob/master/结果.png)
# 实验感想
通过本次实验，学会了字符串String及其方法的使用,掌握异常处理结构，通过这次实验，还发现自己对于JAVA语言的不足，在接下来学习JAVA语言的路上有了很大的帮助。感谢老师同学的指导！
