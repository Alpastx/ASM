.model small 
.data
num1 dw 0006h
num2 db 02h
ends 
.code
mov ax,@data
mov ds,ax
mov ax,num1
mov bl,num2
div bl
int 03h
ends
end
