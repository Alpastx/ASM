.model small
.data
num1 db 13
num2 db 12h
ends
.code
mov ax,@data
mov ds,ax
mov bl,num1
mov cl,num2
add bl,cl
int 03h
ends
end
