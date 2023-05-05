.model small 
.data 
num1 db 14h 
num2 db 2h 
ends 
.code 
mov ax,@data 
mov ds,ax 
mov al,num1 
mov bl,num2
mul bl  
int 03h 
ends 
end
