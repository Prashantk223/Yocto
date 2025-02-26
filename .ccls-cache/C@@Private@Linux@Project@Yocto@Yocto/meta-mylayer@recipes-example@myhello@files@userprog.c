#include <stdio.h>
#include <mylib.h>
int function(char *);
int main()
{
	function("Hello World from function\n");
	print("Hello World from static library\n", 5);
	system("lspci");
	return 0;
}