.model small 
.data
num1 db 2222h
num2 db -2222h
ends 
.code
mov ax,@data
mov ds,ax
mov ax.num1
mov bx,num2
mul bx
int 03h
ends
end
