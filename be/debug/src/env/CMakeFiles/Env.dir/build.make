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
include src/env/CMakeFiles/Env.dir/depend.make

# Include the progress variables for this target.
include src/env/CMakeFiles/Env.dir/progress.make

# Include the compile flags for this target's objects.
include src/env/CMakeFiles/Env.dir/flags.make

src/env/CMakeFiles/Env.dir/env.cpp.o: src/env/CMakeFiles/Env.dir/flags.make
src/env/CMakeFiles/Env.dir/env.cpp.o: ../src/env/env.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object src/env/CMakeFiles/Env.dir/env.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Env.dir/env.cpp.o -c /Users/mochenhui/projects/doris/be/src/env/env.cpp

src/env/CMakeFiles/Env.dir/env.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Env.dir/env.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/env/env.cpp > CMakeFiles/Env.dir/env.cpp.i

src/env/CMakeFiles/Env.dir/env.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Env.dir/env.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/env/env.cpp -o CMakeFiles/Env.dir/env.cpp.s

src/env/CMakeFiles/Env.dir/env_posix.cpp.o: src/env/CMakeFiles/Env.dir/flags.make
src/env/CMakeFiles/Env.dir/env_posix.cpp.o: ../src/env/env_posix.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object src/env/CMakeFiles/Env.dir/env_posix.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Env.dir/env_posix.cpp.o -c /Users/mochenhui/projects/doris/be/src/env/env_posix.cpp

src/env/CMakeFiles/Env.dir/env_posix.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Env.dir/env_posix.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/env/env_posix.cpp > CMakeFiles/Env.dir/env_posix.cpp.i

src/env/CMakeFiles/Env.dir/env_posix.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Env.dir/env_posix.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/env/env_posix.cpp -o CMakeFiles/Env.dir/env_posix.cpp.s

src/env/CMakeFiles/Env.dir/env_util.cpp.o: src/env/CMakeFiles/Env.dir/flags.make
src/env/CMakeFiles/Env.dir/env_util.cpp.o: ../src/env/env_util.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object src/env/CMakeFiles/Env.dir/env_util.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Env.dir/env_util.cpp.o -c /Users/mochenhui/projects/doris/be/src/env/env_util.cpp

src/env/CMakeFiles/Env.dir/env_util.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Env.dir/env_util.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/env/env_util.cpp > CMakeFiles/Env.dir/env_util.cpp.i

src/env/CMakeFiles/Env.dir/env_util.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Env.dir/env_util.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/env/env_util.cpp -o CMakeFiles/Env.dir/env_util.cpp.s

# Object files for target Env
Env_OBJECTS = \
"CMakeFiles/Env.dir/env.cpp.o" \
"CMakeFiles/Env.dir/env_posix.cpp.o" \
"CMakeFiles/Env.dir/env_util.cpp.o"

# External object files for target Env
Env_EXTERNAL_OBJECTS =

src/env/libEnv.a: src/env/CMakeFiles/Env.dir/env.cpp.o
src/env/libEnv.a: src/env/CMakeFiles/Env.dir/env_posix.cpp.o
src/env/libEnv.a: src/env/CMakeFiles/Env.dir/env_util.cpp.o
src/env/libEnv.a: src/env/CMakeFiles/Env.dir/build.make
src/env/libEnv.a: src/env/CMakeFiles/Env.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Linking CXX static library libEnv.a"
	cd /Users/mochenhui/projects/doris/be/debug/src/env && $(CMAKE_COMMAND) -P CMakeFiles/Env.dir/cmake_clean_target.cmake
	cd /Users/mochenhui/projects/doris/be/debug/src/env && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Env.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
src/env/CMakeFiles/Env.dir/build: src/env/libEnv.a

.PHONY : src/env/CMakeFiles/Env.dir/build

src/env/CMakeFiles/Env.dir/clean:
	cd /Users/mochenhui/projects/doris/be/debug/src/env && $(CMAKE_COMMAND) -P CMakeFiles/Env.dir/cmake_clean.cmake
.PHONY : src/env/CMakeFiles/Env.dir/clean

src/env/CMakeFiles/Env.dir/depend:
	cd /Users/mochenhui/projects/doris/be/debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/mochenhui/projects/doris/be /Users/mochenhui/projects/doris/be/src/env /Users/mochenhui/projects/doris/be/debug /Users/mochenhui/projects/doris/be/debug/src/env /Users/mochenhui/projects/doris/be/debug/src/env/CMakeFiles/Env.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : src/env/CMakeFiles/Env.dir/depend

