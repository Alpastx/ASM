LrgMac MACRO
Again:  cmp al,[bl]
Jnc skip
Mov al ,[bl]
Skip: inc bl
Loop again
Endm
.data
Nums db 44h,55h,66h,77h,88h
Count db 05h
Largest db?
.codeStart: mov ax, @data
Mov ds,ax
Mov al,00h
Mov cl, count
Mov bl,nums
LrgMacMov largest , al
Ends
End