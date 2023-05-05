.model small 
.data
num1 db 02h
num2 db 02h
ends 
.code
mov ax,@data
mov ds,ax
mov al,num1
mov bl,num2
div bl
int 03h
ends
end
