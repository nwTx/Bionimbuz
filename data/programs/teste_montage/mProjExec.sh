#!/bin/sh

# [arg1] -> ARGUMENTO 1 - DIRETÓRIO DAS IMAGENS A SEREM PROJETADAS
# [arg2] -> ARGUMENTO 2 - ARQUIVO .TBL DE ENTRADA
# [arg3] -> ARGUMENTO 3 - ARQUIVO .HDR DE ENTRADA
# [arg4] -> ARGUMENTO 4 - ARQUIVO .TBL DE SAIDA

echo $0 $*
#sleep 30

mkdir Kprojdir

mProjExec -p $1 $2 $3 Kprojdir $4