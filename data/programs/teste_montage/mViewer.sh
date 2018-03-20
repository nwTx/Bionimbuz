#!/bin/sh

# [arg1] -> ARGUMENTO 1 - ARQUIVO .FITS DE ENTRADA
# [arg2] -> ARGUMENTO 2 - DEVE SER "-ls"
# [arg3] -> ARGUMENTO 3 - DEVE SER "max"
# [arg4] -> ARGUMENTO 4 - DEVE SER "gaussian-log"
# [arg5] -> ARGUMENTO 5 - DEVE SER "-out"
# [arg6] -> ARGUMENTO 6 - ARQUIVO DE SAIDA .PNG

echo $0 $*
#sleep 30

#mViewer -ct 1 -gray m17_uncorrected.fits -1s max gaussian-log -out m17_uncorrected.png
mViewer -ct 1 -gray $1 $2 $3 $4 $5 $6