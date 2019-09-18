# Lab 1 

> 本节目标：
>
> 1. 熟悉IntelliJ的使用，并用IntelliJ完成本次lab的编程任务
> 2. 学习从控制台读入数据并输出
> 3. 学习java中的加、减、乘、除、求模运算，并实现一个简单的求取数字和的程序

## 获取及提交lab

**获取**：通过 `https://github.com/Java-A-2019/lab1`，获取。

**提交**：将提交物放到自己lab1的文件夹中，将文件夹压缩，压缩文件名应为你的 `学号_姓名` （如`16302010001_陈雷远`），提交至 `FTP` 站点（`ftp://10.132.141.33`）本课程文件夹的`work_upload/lab1` 文件夹下。

**提交物**：本次lab只需提交`lab1_3.java` 

## 1.使用IntelliJ

> **IntelliJ IDEA**被认为是当前Java开发效率最快的IDE工具。它是一种商业化销售的[Java](https://zh.wikipedia.org/wiki/Java)[集成开发环境](https://zh.wikipedia.org/wiki/%E9%9B%86%E6%88%90%E5%BC%80%E5%8F%91%E7%8E%AF%E5%A2%83)（Integrated Development Environment，IDE）工具[软件](https://zh.wikipedia.org/wiki/%E8%BD%AF%E4%BB%B6)，由[捷克](https://zh.wikipedia.org/wiki/%E6%8D%B7%E5%85%8B)软件公司[JetBrains](https://zh.wikipedia.org/wiki/JetBrains%E5%85%AC%E5%8F%B8)在2001年1月时推出最初版。

开始编程之前，我们先新建一个专属这次lab的project吧✌️

1. 新建project

   可以在welcome界面单击`Create New Project`，如图![img](https://cloud.githubusercontent.com/assets/9759891/19218336/b7037080-8e29-11e6-9fb6-a3b01b150509.png)

   或者，在菜单栏中依次单击`File` -> `New` -> `Project...` ，如图

   ![img](https://cloud.githubusercontent.com/assets/9759891/19218380/e207e972-8e2a-11e6-9d25-c4d522b41192.png)

2. 弹出新建项目的窗口后，在最左一列选择Java，其它设置不用改，单击右下角的`Next`

3. 跳到下一界面后，这里可以什么都不选；

   如果勾选`Create project from template`，并选择`Java Hello World`，则最终新建的项目中，在`src`文件夹中会自动生成一个输出"Hello World"的java文件

4. 接下来是输入项目名及路径。在`Project name`中填写你想要的项目名称，如`Lab1`，下方的`Project location`中也会自动更改路径名（`Project location`其实不一定用自动生成的路径，可以单击右方的`...`进行选择）

   ![img](https://cloud.githubusercontent.com/assets/9759891/19218447/c58be774-8e2c-11e6-9265-f2d8861fde0f.png)

5. 单击右下角的Finish，则完成了新项目的建立。

6. 在当前窗口中，布局大致如下图，左边一栏是整个项目的层次结构，方便你查看需要的文件，右边则是打开的文件的详情。`Main.java`在`src`目录下，是自动生成的。

   ![img](https://cloud.githubusercontent.com/assets/9759891/19218474/9a215fdc-8e2d-11e6-869d-b3b844dbd301.png)

7. 运行这个project，可以直接单击右上角![](https://cloud.githubusercontent.com/assets/9759891/19218518/958ea0b4-8e2e-11e6-93ac-c34b8ad44cf0.png)中的绿色三角形符号，或者也可以从菜单栏中依次单击`Run` -> `Run...`

   在今后的学习中，你的项目会越来越复杂，会有很多个java文件互相配合，那么哪个文件是你整个项目的入口呢？或者说，你想要直接运行哪个java程序呢？之前在`atom`里，我们运行的是当前窗口打开的这个文件，在IntelliJ中呢？

   事实上，在java项目中，IntelliJ会自动找到所有定义了`public static void` 的` main`方法的`public class`，如Step 6中自动生成的`Main.java`中的`public class Main`。如果你的项目中恰好有多个这样的`public class`，很可能就会列出所有这些类，并让你选择运行哪一个。像Step 7中图这样，是默认运行`Main`这个类；同样的，如果你有多个符合条件可运行的类，单击图中向下的三角形，你可以选择你想运行的类。

   所以你在这个project中最直接调用的java文件不一定要叫`Main`（比如project自动生成的这个），只要你想调用的文件中有`public static void` 的` main`方法就好了。

   当然，还有一种运行指定的文件的方法，就是在左边的文件浏览一栏中，选中你想运行的文件，右键并选择`Run`。

️
8.intellj学习视频（大家有选择性的看就好）
1. https://www.bilibili.com/video/av38215742/?p=1  intellj的介绍
2. https://www.bilibili.com/video/av38215742/?p=3  intellj的安装
3. https://www.bilibili.com/video/av38215742/?p=4  intellj的配置（更改Intellj字体大小，主题风格）
4. https://www.bilibili.com/video/av38215742/?p=5  创建普通的java程序
5. https://www.bilibili.com/video/av38215742/?p=6  快捷键的使用（想写代码走捷径的同学必看）
6. https://www.bilibili.com/video/av38215742/?p=7  代码模板的使用（如果快捷键仍不满足你的同学可以看）

## 2. 控制台输入输出介绍

上节课我们利用System.out.println("Hello world")向控制台输出了Hello world。这节课我们将学习控制台输入。
lab1_1.java 是助教已经写好的代码，大家可以一边查看助教写好的代码一边看此文档进行学习。
```Scanner scanner = new Scanner(System.in); ``` 这行代码构造了一个Scanner类的对象，并且与标准输入流System.in关联（即控制台输出） 
```String str =  scanner.nextLine(); ```这行代码读入控制台输入的一整行，并将其赋值给字符串类型的str变量
```System.out.println("输入字符串为" + str);```这行代码同时输出了输入提示以及用户输入的字符串
```int number = scanner.nextInt();```这行代码读入控制台输入的一个整数，并将其赋值给整数类型的number变量
```System.out.println("输入整数为" + number);```这行代码同时输出了输入提示以及用户输入的整数

## 3. java中的加、减、乘、除、求模运算
lab1_2.java 是助教已经写好的代码，大家可以一边查看助教写好的代码一边看此文档进行学习。
在代码中，我们先是定义三个整数变量number1，number2，number3，并将他们的值分别赋为10，20，30.
接着我们输出了他们之间简单的数学运算的结果，通过对比答案，相信大家不难看出```+，-，*，/，%```五个符号的含义
（注意```/```求的是整数部分）

## 任务一

计算数字和

### 问题描述

1. 从控制台读取一个三位数（100-999）

2. 将这个整数每一位上的数字拆解出来，并求和

3. 将计算结果打印在控制台

> 例如：输入数字```332```，计算过程是```3+3+2=8```,在控制台打印```8```

### 提示
1. 使用Scanner来读取整数

2. 合理使用```%```和```/```等运算符

3. 将答案写在lab1_3.java的文件中，并最终提交此文件