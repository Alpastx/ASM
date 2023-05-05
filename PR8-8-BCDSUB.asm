.model small 
.data
num1 db 99H
num2 db 10H
ends 
.code
mov ax,@data
mov ds,ax
mov al,num1
mov bl,num2
sub al,bl
das
int 03h
ends
end
