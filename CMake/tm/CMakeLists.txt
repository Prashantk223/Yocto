cmake_minimum_required(VERSION 3.17)
Project(cmake_recipe)
add_executable(userprog userprog.c)
install(TARGETS userprog DESTINATION bin)
EXTRA_OE_CMAKE = "-DCMAKE_ISNTALL_PREFIX:/PATH=/usr"