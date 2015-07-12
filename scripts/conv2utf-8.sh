cd C:\Users\liango\IdeaProjects\TinyWeb\JavaExample
find . -name "*.java" -exec iconv -f gbk -t UTF-8 {} -o target/{} +


for files in /mydisk/myfolder/*.xxx
do
  iconv -f ISO-8859-1 -t UTF-8 "$files" "${files%.xxx}-utf8.xxx"
done


for files in C:\Users\liango\IdeaProjects\TinyWeb\JavaExample\src\**\*.java
do
  echo "$files"
done


Linux环境下，在需要转换的目录下输入：

touch iconv.tmp && find . -iname "*.java" \
-exec iconv -f gbk -t utf-8 '{}' -o iconv.tmp \; \
-exec mv iconv.tmp '{}' \;

Windows环境下，在需要转换的目录下，执行放置iconv.exe程序，并执行如下bat脚本即可（点此下载程序包iconv(bat+exe)）：

@ECHO OFF
FOR /R %%F IN (*.java) DO (
echo %%~nxF
iconv.exe -f GBK -t UTF-8 %%F > %%F.utf8
move %%F.utf8 %%F >nul
)
PAUSE

