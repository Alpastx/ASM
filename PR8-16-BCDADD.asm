.model small 
.data
num1 db 1999h
num2 db 1000h
ends 
.code
mov ax,@data
mov ds,ax
mov ax,num1
mov bx,num2
add ax,bx
daa
int 03h
ends
end
