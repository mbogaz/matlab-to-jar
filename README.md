# matlab-to-jar

install "MATLAB Compiler" & "MATLAB Compiler SDK" from : MATLAB -> APPS -> Get More Apps (Search that keywords in the add-on manager and install)

open MATLAB -> APPS -> Library Compiler 

Add all your functions(.m files) from EXPORTED DUNCTIONS section

Pick "Java Package" from TYPE section 

Submit Package Button 

In the generated directory, there is an another directory named "for_redistribution_files_only", add this folder to your java appliction as library

Add MATLAB_PATH/R2020b(version)/toolbox/javabuilder/jar/javabuilder.jar to your java application as library 
