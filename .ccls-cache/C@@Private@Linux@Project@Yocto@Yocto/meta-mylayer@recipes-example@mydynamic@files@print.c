#include <stdio.h>
#include "mylib.h"

void print(char *string, int times)
{
    while(--times)
    {
        printf("%s", string);
    }
}