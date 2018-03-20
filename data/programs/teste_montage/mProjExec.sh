#!/bin/sh

# [arg1] -> ARGUMENTO 1 - ARQUIVO .TBL DE ENTRADA
# [arg2] -> ARGUMENTO 2 - ARQUIVO .HDR A SER GERADO

echo $0 $*
#sleep 30

mkdir Kprojdir

mProjExec -p $1 $2 $3 /home/pedro/Bionimbuz/Kprojdir $4