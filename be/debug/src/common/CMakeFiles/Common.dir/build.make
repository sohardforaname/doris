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
include src/common/CMakeFiles/Common.dir/depend.make

# Include the progress variables for this target.
include src/common/CMakeFiles/Common.dir/progress.make

# Include the compile flags for this target's objects.
include src/common/CMakeFiles/Common.dir/flags.make

src/common/CMakeFiles/Common.dir/daemon.cpp.o: src/common/CMakeFiles/Common.dir/flags.make
src/common/CMakeFiles/Common.dir/daemon.cpp.o: ../src/common/daemon.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object src/common/CMakeFiles/Common.dir/daemon.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Common.dir/daemon.cpp.o -c /Users/mochenhui/projects/doris/be/src/common/daemon.cpp

src/common/CMakeFiles/Common.dir/daemon.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Common.dir/daemon.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/common/daemon.cpp > CMakeFiles/Common.dir/daemon.cpp.i

src/common/CMakeFiles/Common.dir/daemon.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Common.dir/daemon.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/common/daemon.cpp -o CMakeFiles/Common.dir/daemon.cpp.s

src/common/CMakeFiles/Common.dir/status.cpp.o: src/common/CMakeFiles/Common.dir/flags.make
src/common/CMakeFiles/Common.dir/status.cpp.o: ../src/common/status.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object src/common/CMakeFiles/Common.dir/status.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Common.dir/status.cpp.o -c /Users/mochenhui/projects/doris/be/src/common/status.cpp

src/common/CMakeFiles/Common.dir/status.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Common.dir/status.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/common/status.cpp > CMakeFiles/Common.dir/status.cpp.i

src/common/CMakeFiles/Common.dir/status.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Common.dir/status.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/common/status.cpp -o CMakeFiles/Common.dir/status.cpp.s

src/common/CMakeFiles/Common.dir/resource_tls.cpp.o: src/common/CMakeFiles/Common.dir/flags.make
src/common/CMakeFiles/Common.dir/resource_tls.cpp.o: ../src/common/resource_tls.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object src/common/CMakeFiles/Common.dir/resource_tls.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Common.dir/resource_tls.cpp.o -c /Users/mochenhui/projects/doris/be/src/common/resource_tls.cpp

src/common/CMakeFiles/Common.dir/resource_tls.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Common.dir/resource_tls.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/common/resource_tls.cpp > CMakeFiles/Common.dir/resource_tls.cpp.i

src/common/CMakeFiles/Common.dir/resource_tls.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Common.dir/resource_tls.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/common/resource_tls.cpp -o CMakeFiles/Common.dir/resource_tls.cpp.s

src/common/CMakeFiles/Common.dir/logconfig.cpp.o: src/common/CMakeFiles/Common.dir/flags.make
src/common/CMakeFiles/Common.dir/logconfig.cpp.o: ../src/common/logconfig.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building CXX object src/common/CMakeFiles/Common.dir/logconfig.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Common.dir/logconfig.cpp.o -c /Users/mochenhui/projects/doris/be/src/common/logconfig.cpp

src/common/CMakeFiles/Common.dir/logconfig.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Common.dir/logconfig.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/common/logconfig.cpp > CMakeFiles/Common.dir/logconfig.cpp.i

src/common/CMakeFiles/Common.dir/logconfig.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Common.dir/logconfig.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/common/logconfig.cpp -o CMakeFiles/Common.dir/logconfig.cpp.s

src/common/CMakeFiles/Common.dir/configbase.cpp.o: src/common/CMakeFiles/Common.dir/flags.make
src/common/CMakeFiles/Common.dir/configbase.cpp.o: ../src/common/configbase.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Building CXX object src/common/CMakeFiles/Common.dir/configbase.cpp.o"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Common.dir/configbase.cpp.o -c /Users/mochenhui/projects/doris/be/src/common/configbase.cpp

src/common/CMakeFiles/Common.dir/configbase.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Common.dir/configbase.cpp.i"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mochenhui/projects/doris/be/src/common/configbase.cpp > CMakeFiles/Common.dir/configbase.cpp.i

src/common/CMakeFiles/Common.dir/configbase.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Common.dir/configbase.cpp.s"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mochenhui/projects/doris/be/src/common/configbase.cpp -o CMakeFiles/Common.dir/configbase.cpp.s

# Object files for target Common
Common_OBJECTS = \
"CMakeFiles/Common.dir/daemon.cpp.o" \
"CMakeFiles/Common.dir/status.cpp.o" \
"CMakeFiles/Common.dir/resource_tls.cpp.o" \
"CMakeFiles/Common.dir/logconfig.cpp.o" \
"CMakeFiles/Common.dir/configbase.cpp.o"

# External object files for target Common
Common_EXTERNAL_OBJECTS =

src/common/libCommon.a: src/common/CMakeFiles/Common.dir/daemon.cpp.o
src/common/libCommon.a: src/common/CMakeFiles/Common.dir/status.cpp.o
src/common/libCommon.a: src/common/CMakeFiles/Common.dir/resource_tls.cpp.o
src/common/libCommon.a: src/common/CMakeFiles/Common.dir/logconfig.cpp.o
src/common/libCommon.a: src/common/CMakeFiles/Common.dir/configbase.cpp.o
src/common/libCommon.a: src/common/CMakeFiles/Common.dir/build.make
src/common/libCommon.a: src/common/CMakeFiles/Common.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/mochenhui/projects/doris/be/debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Linking CXX static library libCommon.a"
	cd /Users/mochenhui/projects/doris/be/debug/src/common && $(CMAKE_COMMAND) -P CMakeFiles/Common.dir/cmake_clean_target.cmake
	cd /Users/mochenhui/projects/doris/be/debug/src/common && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Common.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
src/common/CMakeFiles/Common.dir/build: src/common/libCommon.a

.PHONY : src/common/CMakeFiles/Common.dir/build

src/common/CMakeFiles/Common.dir/clean:
	cd /Users/mochenhui/projects/doris/be/debug/src/common && $(CMAKE_COMMAND) -P CMakeFiles/Common.dir/cmake_clean.cmake
.PHONY : src/common/CMakeFiles/Common.dir/clean

src/common/CMakeFiles/Common.dir/depend:
	cd /Users/mochenhui/projects/doris/be/debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/mochenhui/projects/doris/be /Users/mochenhui/projects/doris/be/src/common /Users/mochenhui/projects/doris/be/debug /Users/mochenhui/projects/doris/be/debug/src/common /Users/mochenhui/projects/doris/be/debug/src/common/CMakeFiles/Common.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : src/common/CMakeFiles/Common.dir/depend

