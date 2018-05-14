#!/bin/sh

# [arg1] -> ARGUMENTO 1 - ARQUIVO .TBL DE ENTRADA (GERADO PELO mOVERLAPS)
# [arg2] -> ARGUMENTO 2 - ARQUIVO .FITS DE SAIDA
# [arg3] -> ARGUMENTO 3 - DIRETORIO DOS ARQUIVOS DE SAIDA


echo $0 $*
#sleep 30


mFitExec $1 $2 diffdir
#mFitExec diffs.tbl fits.tbl diffdir