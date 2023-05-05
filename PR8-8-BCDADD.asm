.model small 
.data
num1 db 99h
num2 db 10h
ends 
.code
mov ax,@data
mov ds,ax
mov al,num1
mov bl,num2
add al,bl
daa
int 03h
ends
end
