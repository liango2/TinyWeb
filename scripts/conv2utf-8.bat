rem 使用windows命令和iconv.exe批量转换文件编码
rem  iconv是知名的开源跨平台编码转换库，iconv.exe是iconv库在windows下的命令行工具，
rem  iconv.exe的一般用法：
rem  iconv.exe -f gbk -t utf-8 gbk.txt > utf-8.txt。
rem  其中 -f gbk   			指明转换前的文件编码是gbk，
rem       -t utf-8 			指明转换后的文件编码是utf-8，
rem        gbk.txt 			是转换前文件的名称，
rem        > utf-8.txt  指明把转换结果输出到utf-8.txt文件中。
rem 当我们要转换大量文件时，我们可以结合windows命令和iconv.exe批量编码转换。
rem 用法:for /r  dir_name  %i in (*.txt) do iconv.exe -f GBK -t UTF-8 %i > %~ni_utf8.txt，
rem 其中 dir_name                                       是待转换文件的存放目录，
rem      for /r  dir_name  %i in (*.txt) do 命令        循环dir_name目录下的所有txt文件，
rem      iconv.exe -f GBK -t UTF-8 %i > %~ni_utf8.txt   用于转换每一个txt文件。
rem iconv.exe下载地址：http://files.cnblogs.com/adgnat/iconv.7z

rem FOR /r "C:\Users\liango\IdeaProjects\TinyWeb\JavaExample\src" %%i IN (*.java) DO "d:\emacs\gnuwin32\GetGnuWin32\gnuwin32\bin\iconv.exe" -f gbk -t UTF-8 %%i > utf8/%%i

rem ------------------------------
rem 测试： FOR /R %%F IN (*.java) DO echo %%~nxF 

rem ------------------------------
FOR /r "C:\Users\liango\IdeaProjects\TinyWeb\JavaExample\src" %%i IN (*.java) DO (
echo %%i
rem 其中 %%   在控制台中用一个% 在bat中要用两个%%转义
rem      %%i  i也可以写成其他任意字母
"d:\emacs\gnuwin32\GetGnuWin32\gnuwin32\bin\iconv.exe" -f GBK -t UTF-8 %%i > %%i.utf8
move %%i.utf8 %%i >nul
)

