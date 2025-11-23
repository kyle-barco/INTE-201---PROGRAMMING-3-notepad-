@echo off

:: set path for java
DOSKEY setpath=set path=%path%;C:\Program Files\Java\jdk-21\bin

:: java commands
DOSKEY j=java $*
DOSKEY jc=javac $*

:: linux commands
DOSKEY clear=cls
DOSKEY ls=dir
DOSKEY cat=type $*
DOSKEY ..=cd ..