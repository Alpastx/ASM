.model small
.data
num1 db 13h
num2 db 12h
ends
.code
mov ax,@data
mov ds,ax
mov bl,num1
mov cl,num2
sub bl,cl
int 03h
ends
end
