.model small
.data
num1 db 3333h
num2 db 2222h
ends
.code
mov ax,@data
mov ds,ax
mov bx,num1
mov cx,num2
sub bx,cx
int 03h
ends
end
