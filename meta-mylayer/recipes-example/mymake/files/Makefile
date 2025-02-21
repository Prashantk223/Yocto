# Compiler
CFLAGS = -g -Wall -DUSE_SYSCALL

# Source files
SRC = userprog.c function.c

# Object files
OBJ = $(SRC:.c=.o)

# Executable name
TARGET = userprog

# Default rule to build the program
all: $(TARGET)

# Linking the executable
$(TARGET): $(OBJ)
	$(CC) $(CFLAGS) -o $(TARGET) $(LDFLAGS) $(OBJ)

# Compiling source files into object files
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Clean up generated files
clean:
	rm -f $(OBJ) $(TARGET)

# Rebuild everything from scratch
rebuild: clean all
