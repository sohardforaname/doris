# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.19

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/mochenhui/projects/doris/be

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/mochenhui/projects/doris/be/debug

# Include any dependencies generated for this target.
include src/udf/CMakeFiles/DorisUdf.dir/depend.make

# Include the progress variables for this target.
include src/udf/CMakeFiles/DorisUdf.dir/progress.make

# Include the compile flags for this target's objects.
include src/udf/CMakeFiles/DorisUdf.dir/flags.make

src/udf/CMakeFiles/DorisUdf.dir/udf.cpp.o: src/udf/CMakeFiles/DorisUdf.dir/flags.make
src/udf/CMakeFiles/DorisUdf.dir/udf.cpp.o: ../src/udf/udf.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object src/udf/CMakeFiles/DorisUdf.dir/udf.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/udf && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/DorisUdf.dir/udf.cpp.o -c /Users/mochenhui/projects/doris/be/src/udf/udf.cpp

src/udf/CMakeFiles/DorisUdf.dir/udf.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DorisUdf.dir/udf.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/udf && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/udf/udf.cpp > CMakeFiles/DorisUdf.dir/udf.cpp.i

src/udf/CMakeFiles/DorisUdf.dir/udf.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DorisUdf.dir/udf.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/udf && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/udf/udf.cpp -o CMakeFiles/DorisUdf.dir/udf.cpp.s

# Object files for target DorisUdf
DorisUdf_OBJECTS = \
"CMakeFiles/DorisUdf.dir/udf.cpp.o"

# External object files for target DorisUdf
DorisUdf_EXTERNAL_OBJECTS =

src/udf/libDorisUdf.a: src/udf/CMakeFiles/DorisUdf.dir/udf.cpp.o
src/udf/libDorisUdf.a: src/udf/CMakeFiles/DorisUdf.dir/build.make
src/udf/libDorisUdf.a: src/udf/CMakeFiles/DorisUdf.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX static library libDorisUdf.a"
	cd /Users/mochenhui/projects/doris/be/debug/src/udf && $(CMAKE_COMMAND) -P CMakeFiles/DorisUdf.dir/cmake_clean_target.cmake
	cd /Users/mochenhui/projects/doris/be/debug/src/udf && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/DorisUdf.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
src/udf/CMakeFiles/DorisUdf.dir/build: src/udf/libDorisUdf.a

.PHONY : src/udf/CMakeFiles/DorisUdf.dir/build

src/udf/CMakeFiles/DorisUdf.dir/clean:
	cd /Users/mochenhui/projects/doris/be/debug/src/udf && $(CMAKE_COMMAND) -P CMakeFiles/DorisUdf.dir/cmake_clean.cmake
.PHONY : src/udf/CMakeFiles/DorisUdf.dir/clean

src/udf/CMakeFiles/DorisUdf.dir/depend:
	cd /Users/mochenhui/projects/doris/be/debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/mochenhui/projects/doris/be /Users/mochenhui/projects/doris/be/src/udf /Users/mochenhui/projects/doris/be/debug /Users/mochenhui/projects/doris/be/debug/src/udf /Users/mochenhui/projects/doris/be/debug/src/udf/CMakeFiles/DorisUdf.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : src/udf/CMakeFiles/DorisUdf.dir/depend

