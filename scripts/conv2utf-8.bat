rem ʹ��windows�����iconv.exe����ת���ļ�����
rem  iconv��֪���Ŀ�Դ��ƽ̨����ת���⣬iconv.exe��iconv����windows�µ������й��ߣ�
rem  iconv.exe��һ���÷���
rem  iconv.exe -f gbk -t utf-8 gbk.txt > utf-8.txt��
rem  ���� -f gbk   			ָ��ת��ǰ���ļ�������gbk��
rem       -t utf-8 			ָ��ת������ļ�������utf-8��
rem        gbk.txt 			��ת��ǰ�ļ������ƣ�
rem        > utf-8.txt  ָ����ת����������utf-8.txt�ļ��С�
rem ������Ҫת�������ļ�ʱ�����ǿ��Խ��windows�����iconv.exe��������ת����
rem �÷�:for /r  dir_name  %i in (*.txt) do iconv.exe -f GBK -t UTF-8 %i > %~ni_utf8.txt��
rem ���� dir_name                                       �Ǵ�ת���ļ��Ĵ��Ŀ¼��
rem      for /r  dir_name  %i in (*.txt) do ����        ѭ��dir_nameĿ¼�µ�����txt�ļ���
rem      iconv.exe -f GBK -t UTF-8 %i > %~ni_utf8.txt   ����ת��ÿһ��txt�ļ���
rem iconv.exe���ص�ַ��http://files.cnblogs.com/adgnat/iconv.7z

rem FOR /r "C:\Users\liango\IdeaProjects\TinyWeb\JavaExample\src" %%i IN (*.java) DO "d:\emacs\gnuwin32\GetGnuWin32\gnuwin32\bin\iconv.exe" -f gbk -t UTF-8 %%i > utf8/%%i

rem ------------------------------
rem ���ԣ� FOR /R %%F IN (*.java) DO echo %%~nxF 

rem ------------------------------
FOR /r "C:\Users\liango\IdeaProjects\TinyWeb\JavaExample\src" %%i IN (*.java) DO (
echo %%i
rem ���� %%   �ڿ���̨����һ��% ��bat��Ҫ������%%ת��
rem      %%i  iҲ����д������������ĸ
"d:\emacs\gnuwin32\GetGnuWin32\gnuwin32\bin\iconv.exe" -f GBK -t UTF-8 %%i > %%i.utf8
move %%i.utf8 %%i >nul
)

