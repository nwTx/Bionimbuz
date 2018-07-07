#!/bin/sh

# [arg1] -> ARGUMENTO 1 - DIRETORIO COM OS ARQUIVOS A CORRIGIR 
# [arg2] -> ARGUMENTO 2 - ARQUIVO .TBL DE ENTRADA
# [arg3] -> ARGUMENTO 3 - ARQUIVO .TBL DE SAIDA
# [arg4] -> ARGUMENTO 4 - DIRETORIO ONDE SEÁ INSERIDO OS ARQUIVOS CORRIGIDOS


echo $0 $*
#sleep 30


if [ -d "corrdir" ]; then
	echo "Diretorio corrdir já criado"
else
	mkdir corrdir
fi


mBgModel -p $1 $2 $3 corrdir
#mBgExec -p Kprojdir/ images.tbl corrections.tbl corrdir


